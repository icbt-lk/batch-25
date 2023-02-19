<%-- 
    Document   : login
    Created on : 12-Feb-2023, 11:52:40
    Author     : hnd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="home.jsp" method="POST">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" value=""><br>
        <label for="password">Last name:</label><br>
        <input type="password" id="password" name="password" value=""><br><br>
        <input type="submit" value="Login">
      </form> 
    </body>
</html>
