<%-- 
    Document   : home.jsp
    Created on : 12-Feb-2023, 11:55:34
    Author     : hnd
--%>

<%@page import="icbt.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
         if (!Util.authenticate(username, password)) {
             response.sendRedirect("login.jsp");
         }
        
        %>
        
        
        <h1>Hello <% 
            
            
            out.print(username);
            
            %>!</h1>
    </body>
</html>
