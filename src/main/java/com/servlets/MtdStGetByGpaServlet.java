package com.servlets;

import com.database.Student;
import com.service.StudentService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(value="/studMethod4")
public class MtdStGetByGpaServlet extends HttpServlet {

    @Inject
    private StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace4", true);

        String gpa = request.getParameter("gpa");

        Optional<List<Student>> optionalStudent = studentService.getStudentByGpa(Double.parseDouble(gpa));

        if(optionalStudent.isPresent()){
            List<Student> s = optionalStudent.get();
            request.setAttribute("gpaStudent", s);
        }

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace4", true);

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
}
