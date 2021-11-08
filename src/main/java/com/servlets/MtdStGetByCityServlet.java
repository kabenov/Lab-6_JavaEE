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
import java.util.List;
import java.util.Optional;

@WebServlet(value="/studMethod5")
public class MtdStGetByCityServlet extends HttpServlet {

    @EJB
    private StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace5", true);

        String city = request.getParameter("city");

        Optional<List<Student>> optionalStudent = studentService.getStudentByCity(city);

        if(optionalStudent.isPresent()){
            List<Student> s = optionalStudent.get();
            request.setAttribute("cityStudent", s);
        }

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace5", true);

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
}
