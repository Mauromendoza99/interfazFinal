<html>
    <head>
        <meta charset=UTF-8">
        <title>Ejemplo JavaBeans</title>
    </head>
    <body>
        <h1>Ejemplo de JavaBeans</h1>
        <a href="setterJsp.jsp">Modificar valores del JavaBean</a>
        <br>
        
        <a href="getterJsp.jsp">Leer valores del JavaBean</a>
        <br>
        <br>
        
        Formulario 1:
        <br>
        <form name="form1" action="setterParamJsp.jsp">
            Base:<input type="text" name="baseParam">
            <br>
            Altura: <input type="text" name="alturaParam" >
            <input type="submit" value="Enviar"
        </form>
        <br>
         Formulario 2:
        <br>
        <form name="form2" action="setterAllParamsJsp.jsp">
            Base:<input type="text" name="base">
            <br>
            Altura: <input type="text" value="altura">
            <input type="submit" value="Enviar">
            
        </form>
    </body>
</html>
