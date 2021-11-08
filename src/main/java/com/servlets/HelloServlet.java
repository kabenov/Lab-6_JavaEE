package com.servlets;

import com.database.Student;
import com.service.StudentService;

import java.io.*;
import java.util.Optional;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @EJB
    private StudentService studentService;

    public void init() {
        message = "Hello World!";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Optional<Student> optionalStudent = studentService.getStudentByLastName("Dias");
        String firstName = "undefined";
        String lastName = "undefined";
        String city = "undefined";
        Double gpa = 0.0;
        if(optionalStudent.isPresent()){
            Student s = optionalStudent.get();
            firstName = s.getFirstName();
            lastName = s.getLastName();
            city = s.getCity();
            gpa = s.getGpa();
        }

        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.printf("<h1>First name: %s </h1>", firstName);
        writer.printf("<h1>Last name: %s </h1>", lastName);
        writer.printf("<h1>City %s </h1>", city);
        writer.printf("<h1>GPA: %s </h1>", gpa);


        writer.flush();
        writer.close();
    }

    public void destroy() {
    }
}