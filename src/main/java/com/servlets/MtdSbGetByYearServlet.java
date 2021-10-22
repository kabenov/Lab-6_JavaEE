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
import java.util.List;
import java.util.Optional;

@WebServlet(value = "/subMethod4")
public class MtdSbGetByYearServlet extends HttpServlet {

    @Inject
    StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace4", true);

        String year = request.getParameter("year");

        List<Subject> optionalSubject = studentService.getSubjectByYear(Integer.parseInt(year));

        request.setAttribute("yearSubject", optionalSubject);

        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("inputPlace4", true);

        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }
}
