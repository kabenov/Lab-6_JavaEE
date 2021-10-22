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

@WebServlet(value = "/subMethod1")
public class MtdSbGetAllServlet extends HttpServlet {

    @Inject
    StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Subject> subjects = studentService.getAllSubjects();

        request.setAttribute("listSubject", subjects);
        request.getRequestDispatcher("subject.jsp").forward(request, response);
    }
}
