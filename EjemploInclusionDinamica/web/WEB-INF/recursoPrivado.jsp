<%
    String colorFondo = request.getParameter("colorFondo");
    if (colorFondo == null || colorFondo.trim().equals("")){
        colorFondo= "white"; //valorpor default
    }
    %>
    <body bgcolor="<%=colorFondo%>">
    Deslpiegue del contenido desde un JSP privado en WEB-INF
    </body>