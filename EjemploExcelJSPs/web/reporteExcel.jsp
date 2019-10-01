
<%@page import="utilerias.Conversiones, java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
String nombreArchivo="reporte.xls";
response.setHeader("Content-Disposition", "inline; filename= nombreArchivo") ;
%>
<html>
    <head>
        <title>Reporte de excel</title>
    </head>
    <body>
        <h1>Reporte de excel</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha Inicio</th>
            </tr>
            <tr>
                <td>1. Fundamentos de java</td>
                <td>Aprenderemos la sintaxis basica de java</td>
                <td><&= Conversiones.format(new Date())%></td>
            </tr>
            <tr>
                <td>2. Programacion con Java</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><&= Conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
