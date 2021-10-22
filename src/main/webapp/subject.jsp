<%@ page import="com.database.Subject" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.10.2021
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab-6</title>
    <link rel="stylesheet" href="css/index.css">
</head>
<body>

    <header>
        <h2><a class="nav_link" href="/student">Student</a></h2>
        <h2><a class="nav_link" href="/subject">Subject</a></h2>
    </header>

    <div class="container">
        <h2>Subject methods</h2>

        <div class="buttons">
            <a class="button" href="/subMethod1">Get All Subjects</a>

            <a class="button" href="/subMethod2">Get Subject By Id</a>

            <a class="button" href="/subMethod3">Get Subject By Name</a>

            <a class="button" href="/subMethod4">Get Subject By Year</a>
        </div>
        <hr>

        <%-------------------Get All Subjects-----------------%>

        <%
            if(request.getAttribute("listSubject") != null){
                List<Subject> subjects = (List<Subject>) request.getAttribute("listSubject");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Name</h3>
            <h3>Year</h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <%
            for(Subject s : subjects){
        %>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getName()%></h3>
            <h3><%=s.getYear()%></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <%
                }
            }
        %>


        <%----------------Get Subject By Id---------------%>
        <%
            if(request.getAttribute("inputPlace2") != null){
        %>

        <form action="/subMethod2" method="post">
            <input class="inputPlace" type="text" name="id" placeholder="Id" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("idSubject") != null){
                Subject s = (Subject) request.getAttribute("idSubject");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Name</h3>
            <h3>Year</h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getName()%></h3>
            <h3><%=s.getYear()%></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <%
            }
        %>

        <%----------------Get Subject By Name---------------%>
        <%
            if(request.getAttribute("inputPlace3") != null){
        %>

        <form action="/subMethod3" method="post">
            <input class="inputPlace" type="text" name="name" placeholder="Enter Name" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("nameSubject") != null){
                Subject s = (Subject) request.getAttribute("nameSubject");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Name</h3>
            <h3>Year</h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getName()%></h3>
            <h3><%=s.getYear()%></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <%
            }
        %>


        <%-------------------Get Subject By Year------------------%>
        <%
            if(request.getAttribute("inputPlace4") != null){
        %>

        <form action="/subMethod4" method="post">
            <input class="inputPlace" type="text" name="year" placeholder="Enter Year" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("yearSubject") != null){
                List<Subject> subjects = (List<Subject>) request.getAttribute("yearSubject");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Name</h3>
            <h3>Year</h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <%
            for(Subject s : subjects){
        %>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getName()%></h3>
            <h3><%=s.getYear()%></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
            <h3></h3>
        </div>
        <hr>

        <%
                }
            }
        %>

    </div>
</body>
</html>
