<%-- 
    Document   : index
    Created on : 12-Feb-2023, 10:24:15
    Author     : hnd
--%>

<%@page import="icbt.Student"%>
<%@page import="icbt.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }

        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
        }

        tr:nth-child(even) {
          background-color: #dddddd;
        }
        </style>
    </head>
    <body>
        <h1>
            <%
            out.print(Util.getGreeting("George"));
            %>
        </h1>
        
            <%
                
            Student[] students = Util.getStudents();
            
            out.print("<table border='1'>");
            out.print("<tr><th>Student ID</th><th>First Name</th><th>Last Name</th></tr>");
            for(Student st : students) {
               out.print("<tr>");
               out.print("<td>" + st.getId()+ "</td>");
               out.print("<td>" + st.getFirstName() + "</td>");
               out.print("<td>" + st.getLastName()+ "</td>");
               out.print("</tr>");
            }
             out.print("</table>");
            
            %>
        
        
    </body>
</html>
