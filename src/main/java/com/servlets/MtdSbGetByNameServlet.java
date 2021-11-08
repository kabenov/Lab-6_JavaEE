package com.servlets;

import com.database.Subject;
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

@WebServlet(value = "/subMethod3")
public class MtdSbGetByNameServlet extends HttpServlet {

    @EJB
    StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace3", true);

        String name = request.getParameter("name");

        Optional<Subject> optionalSubject = studentService.getSubjectByName(name);

        if(optionalSubject.isPresent()){
            Subject s = optionalSubject.get();
            request.setAttribute("nameSubject", s);
        }

        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace3", true);

        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }
}
