<%-- 
    Document   : index
    Created on : 19-Feb-2023, 12:19:47
    Author     : hnd
--%>

<%@page import="icbtg.StudentService"%>
<%@page import="icbtg.StudentService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                StudentService_Service service = new StudentService_Service();
                StudentService proxy = service.getStudentServicePort();
                
                out.print(proxy.hello("John"));
            %>
        </h1>
    </body>
</html>
