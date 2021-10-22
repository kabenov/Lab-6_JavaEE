package com.servlets;

import com.database.Subject;
import com.service.StudentService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(value = "/subMethod2")
public class MtdSbGetByIdServlet extends HttpServlet {

    @Inject
    StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace2", true);

        String id = request.getParameter("id");

        Optional<Subject> optionalSubject = studentService.getSubjectById(Integer.parseInt(id));

        if(optionalSubject.isPresent()){
            Subject s = optionalSubject.get();
            request.setAttribute("idSubject", s);
        }

        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace2", true);

        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }
}
