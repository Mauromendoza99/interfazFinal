<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP que modifica a un JavaBean por Par&aacute;metros</title>
    
    </head>
    
    <body>
        <h1>JSP que modifica a un JavaBean por Par&aacute;metros</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" 
                     scope="session" />
        <jsp:setProperty name="rectangulo" property="*" />
        
        
        Se modificaron todos los atributos:
        <br>
        <br>
        
        Nuevo valor base: <%= request.getParameter("base") %>
        <br>     
     Nuevo valor altura: <%= request.getParameter("altura") %>
     <br>
     <br>
     <a href="index.jsp">Regresar al Inicio</a>
      
    </body>
</html>