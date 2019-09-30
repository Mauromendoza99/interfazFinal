<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fondo = request.getParameter("colorFondo");
    if (fondo==null || fondo.trim().equals("")){
    fondo="white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio de color de fondo</title>
    </head>
    <body bgcolor="<%=fondo%>" >
        <h1>Fondo de color aplicado: <%= fondo%></h1>
        <br>
        <a href="index.html">Regresar al Index</a>
    </body>
</html>
