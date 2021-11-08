package com.servlets;

import com.database.Student;
import com.repository.StudentRepository;
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

@WebServlet(value = "/studMethod2")
public class MtdStGetByLastNameServlet extends HttpServlet {

    @EJB
    private StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace2", true);

        String lname = request.getParameter("lname");

        Optional<Student> optionalStudent = studentService.getStudentByLastName(lname);

        if(optionalStudent.isPresent()){
            Student s = optionalStudent.get();
            request.setAttribute("lnameStudent", s);
        }

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace2", true);

        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
}
