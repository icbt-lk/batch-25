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
        <script
			  src="https://code.jquery.com/jquery-3.6.3.min.js"
			  integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
			  crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.2/css/jquery.dataTables.css">
  
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.13.2/js/jquery.dataTables.js"></script>
    </head>
    <body>
        <h1>
            <%
               String firstName = request.getParameter("firstname");
                if (firstName != null) {
                    out.print(Util.getGreeting(firstName));
                }
                
            
            %>
        </h1>
        
            <%
                
            Student[] students = Util.getStudents();
            
            out.print("<table id='example' class='display' style='width:100%'>");
            out.print("<thead><tr><th>Student ID</th><th>First Name</th><th>Last Name</th></tr></thead>");
            out.print("<tbody>");
            for(Student st : students) {
               out.print("<tr>");
               out.print("<td>" + st.getId()+ "</td>");
               out.print("<td>" + st.getFirstName() + "</td>");
               out.print("<td>" + st.getLastName()+ "</td>");
               out.print("</tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
            
            %>
        
            <script>
                $(document).ready(function () {
                    $('#example').DataTable();
                });
            </script>
        
    </body>
</html>
