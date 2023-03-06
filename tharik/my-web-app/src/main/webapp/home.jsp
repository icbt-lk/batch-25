<%-- 
    Document   : home.jsp
    Created on : 12-Feb-2023, 11:55:34
    Author     : hnd
--%>

<%@page import="java.util.UUID"%>
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
            boolean validLogin = false;
            Cookie[] cookies =request.getCookies();
            
            for(Cookie cookie : cookies) {
                if (cookie.getName().equals("session-id")) {
                    String sesId = cookie.getValue();
                    
                    Object sessionVal = session.getAttribute(sesId);
                    if (sessionVal == null) {
                        break;
                    } 
                    
                    username = sessionVal.toString();
                    if (username != null) {
                        validLogin = true;
                        break;
                    }
    
                }
            }
            
            if (!validLogin) {
                response.sendRedirect("login.jsp");
            }
         } else {
             //Create Session and Cookie
             String sessionId = UUID.randomUUID().toString().replace("-", "");
             Cookie cookie = new Cookie("session-id", sessionId);
             session.setAttribute(sessionId, username);
             response.addCookie(cookie);
         }
        
        %>
        
        
        <h1>Hello <% 
            
            
            out.print(username);
            
            %>!</h1>
    </body>
</html>
