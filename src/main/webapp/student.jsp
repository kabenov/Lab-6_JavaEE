<%@ page import="java.time.LocalDate" %>
<%@ page import="javax.persistence.OneToMany" %>
<%@ page import="com.database.Subject" %>
<%@ page import="java.util.List" %>
<%@ page import="com.database.Student" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.10.2021
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab-6</title>
    <link rel="stylesheet" href="css/index.css">

    <style>
        button {
            padding: 0;
            border: none;
            transition: 0.5s ease;
            transition-property: color, background-color, border-color;
            cursor: pointer;
        }

        body{
            margin: 0;
        }

        .container{
            max-width: 1440px;
            margin: 0 auto;
        }

        header{
            width: 100%;
            height: 80px;
            display: flex;
            align-items: center;
            justify-content: center;
            background-color: darkviolet;
            margin-bottom: 50px;
        }

        .nav_link{
            text-decoration: none;
            margin-right: 20px;
            color: white;
        }

        .buttons{
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }

        .button{
            width: 16%;
            height: 50px;
            display: flex;
            justify-content: center;
            align-items: center;
            border-radius: 16px;
            background-color: #2f80ed;
            color: #e0e0e0;
            font-size: 16px;
            font-weight: 500;
            text-decoration: none;
        }
        .button:hover {
            color: #ffffff;
            background-color: #151f30;
        }

        .w100{
            width: 100%;
        }

        .header_st_info{
            display: flex;
            justify-content: space-around;
        }

        h3{
            width: 13%;
        }

        .student_info{
            display: flex;
            justify-content: space-around;
        }


    </style>
</head>
<body>

    <header>
        <h2><a class="nav_link" href="/student">Student</a></h2>
        <h2><a class="nav_link" href="/subject">Subject</a></h2>
    </header>

    <div class="container">
        <h2>Student methods</h2>

        <div class="buttons">
            <a class="button" href="/studMethod1">Get All Students</a>

            <a class="button" href="/studMethod2">Get Student By Last Name</a>

            <a class="button" href="/studMethod3">Get Student By First Name</a>

            <a class="button" href="/studMethod4">Get Student By Gpa</a>

            <a class="button" href="/studMethod5">Get Student By City</a>

            <a class="button" href="/studMethod6">Get Students By Subject</a>
        </div>
        <hr>

        <%-------------------Get All Students-----------------%>

        <%
            if(request.getAttribute("listStudents") != null){
                List<Student> students = (List<Student>) request.getAttribute("listStudents");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Last name</h3>
            <h3>First name</h3>
            <h3>Last submission date</h3>
            <h3>Gpa</h3>
            <h3>City</h3>
            <h3>Is have scholarship</h3>
            <h3></h3>
        </div>
        <hr>

        <%
                for(Student s : students){
        %>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getLastName()%></h3>
            <h3><%=s.getFirstName()%></h3>
            <h3><%=s.getLastSubmissionDate()%></h3>
            <h3><%=s.getGpa()%></h3>
            <h3><%=s.getCity()%></h3>
            <h3><%=s.getHaveScholarship()%></h3>
            <h3><a href="#" class="button w100">Subjects</a></h3>
        </div>
        <hr>

        <%
                }
            }
        %>


        <%----------------Get Student By Last Name---------------%>
        <%
            if(request.getAttribute("inputPlace2") != null){
        %>

        <form action="/studMethod2" method="post">
            <input class="inputPlace" type="text" name="lname" placeholder="Last Name" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("lnameStudent") != null){
                Student s = (Student) request.getAttribute("lnameStudent");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Last name</h3>
            <h3>First name</h3>
            <h3>Last submission date</h3>
            <h3>Gpa</h3>
            <h3>City</h3>
            <h3>Is have scholarship</h3>
            <h3></h3>
        </div>
        <hr>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getLastName()%></h3>
            <h3><%=s.getFirstName()%></h3>
            <h3><%=s.getLastSubmissionDate()%></h3>
            <h3><%=s.getGpa()%></h3>
            <h3><%=s.getCity()%></h3>
            <h3><%=s.getHaveScholarship()%></h3>
            <h3><a href="#" class="button w100">Subjects</a></h3>
        </div>
        <hr>

        <%
            }
        %>

        <%----------------Get Student By First Name---------------%>
        <%
            if(request.getAttribute("inputPlace3") != null){
        %>

        <form action="/studMethod3" method="post">
            <input class="inputPlace" type="text" name="fname" placeholder="First Name" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("fnameStudent") != null){
                Student s = (Student) request.getAttribute("fnameStudent");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Last name</h3>
            <h3>First name</h3>
            <h3>Last submission date</h3>
            <h3>Gpa</h3>
            <h3>City</h3>
            <h3>Is have scholarship</h3>
            <h3></h3>
        </div>
        <hr>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getLastName()%></h3>
            <h3><%=s.getFirstName()%></h3>
            <h3><%=s.getLastSubmissionDate()%></h3>
            <h3><%=s.getGpa()%></h3>
            <h3><%=s.getCity()%></h3>
            <h3><%=s.getHaveScholarship()%></h3>
            <h3><a href="#" class="button w100">Subjects</a></h3>
        </div>
        <hr>

        <%
            }
        %>


        <%-------------------Get Student By Gpa------------------%>
        <%
            if(request.getAttribute("inputPlace4") != null){
        %>

        <form action="/studMethod4" method="post">
            <input class="inputPlace" type="text" name="gpa" placeholder="Enter Gpa" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("gpaStudent") != null){
                List<Student> students = (List<Student>) request.getAttribute("gpaStudent");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Last name</h3>
            <h3>First name</h3>
            <h3>Last submission date</h3>
            <h3>Gpa</h3>
            <h3>City</h3>
            <h3>Is have scholarship</h3>
            <h3></h3>
        </div>
        <hr>

        <%
            for(Student s : students){
        %>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getLastName()%></h3>
            <h3><%=s.getFirstName()%></h3>
            <h3><%=s.getLastSubmissionDate()%></h3>
            <h3><%=s.getGpa()%></h3>
            <h3><%=s.getCity()%></h3>
            <h3><%=s.getHaveScholarship()%></h3>
            <h3><a href="#" class="button w100">Subjects</a></h3>
        </div>
        <hr>

        <%
                }
            }
        %>


        <%-------------------Get Student By City------------------%>
        <%
            if(request.getAttribute("inputPlace5") != null){
        %>

        <form action="/studMethod5" method="post">
            <input class="inputPlace" type="text" name="city" placeholder="Enter City" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("cityStudent") != null){
                List<Student> students = (List<Student>) request.getAttribute("cityStudent");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Last name</h3>
            <h3>First name</h3>
            <h3>Last submission date</h3>
            <h3>Gpa</h3>
            <h3>City</h3>
            <h3>Is have scholarship</h3>
            <h3></h3>
        </div>
        <hr>

        <%
            for(Student s : students){
        %>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getLastName()%></h3>
            <h3><%=s.getFirstName()%></h3>
            <h3><%=s.getLastSubmissionDate()%></h3>
            <h3><%=s.getGpa()%></h3>
            <h3><%=s.getCity()%></h3>
            <h3><%=s.getHaveScholarship()%></h3>
            <h3><a href="#" class="button w100">Subjects</a></h3>
        </div>
        <hr>

        <%
                }
            }
        %>


        <%-------------------Get Students By Subject------------------%>
        <%
            if(request.getAttribute("inputPlace6") != null){
        %>

        <form action="/studMethod6" method="post">
            <input class="inputPlace6" type="text" name="subject" placeholder="Enter Subject" required>

            <input class="submitButtonInput" type="submit" value="Submit">
        </form>
        <hr>

        <%
            }
            if(request.getAttribute("subjectStudent") != null){
                List<Student> students = (List<Student>) request.getAttribute("subjectStudent");
        %>

        <div class="header_st_info">
            <h3>Id</h3>
            <h3>Last name</h3>
            <h3>First name</h3>
            <h3>Last submission date</h3>
            <h3>Gpa</h3>
            <h3>City</h3>
            <h3>Is have scholarship</h3>
            <h3></h3>
        </div>
        <hr>

        <%
            for(Student s : students){
        %>

        <div class="student_info">
            <h3><%=s.getId()%></h3>
            <h3><%=s.getLastName()%></h3>
            <h3><%=s.getFirstName()%></h3>
            <h3><%=s.getLastSubmissionDate()%></h3>
            <h3><%=s.getGpa()%></h3>
            <h3><%=s.getCity()%></h3>
            <h3><%=s.getHaveScholarship()%></h3>
            <h3><a href="#" class="button w100">Subjects</a></h3>
        </div>
        <hr>

        <%
                }
            }
        %>

    </div>
</body>
</html>
