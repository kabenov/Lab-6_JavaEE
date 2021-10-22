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
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet(value = "/studMethod1")
public class MtdStGetAllServlet extends HttpServlet {

    @Inject
    private StudentService studentService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = studentService.getAllStudents();

        request.setAttribute("listStudents", students);
        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
}
