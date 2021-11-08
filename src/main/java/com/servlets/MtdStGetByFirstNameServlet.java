package com.servlets;

import com.database.Student;
import com.service.StudentService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(value = "/studMethod3")
public class MtdStGetByFirstNameServlet extends HttpServlet {

    @EJB
    private StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace3", true);

        String fname = request.getParameter("fname");

        Optional<Student> optionalStudent = studentService.getStudentByFirstName(fname);

        if(optionalStudent.isPresent()){
            Student s = optionalStudent.get();
            request.setAttribute("fnameStudent", s);
        }

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace3", true);

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
}
