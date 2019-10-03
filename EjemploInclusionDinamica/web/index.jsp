<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Inclusi&oacute;nDin&aacute;mica</title>
        
    </head>
    <body>
        <br>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yello" />
        </jsp:include>
        <br>
        <jsp:include page="recusoPublico.jsp" /> 
    </body>
</html>
