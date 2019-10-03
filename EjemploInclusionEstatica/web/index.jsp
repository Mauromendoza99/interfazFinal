<html>
    <head>
        <title>Ejemplo Inclusion Estatica</title>
        <script type="text/JavaScript" src="recursos/funciones.js"></script>
        <link href="recursos/estilos.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <h1>Inclusi&oacute;n de archivos estaticos</h1>
        
        <br>
        <span class="noticias" align="left">
            <a href="javascript:desplegar ('noticias');">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/noticias.gif">
            </a>
        </span>
        <span id="noticias" class="ocultal_menu">
            <ul>
                <li><%@include file="pages/noticia1.html"%>%></li>
                <li><%@include file="pages/noticia2.html"%>%></li>
            </ul>
        </span>
            <br>
                   <span class="videos" align="left">
            <a href="javascript:desplegar ('videos');">
                <img border="0" src="http://icursos.net/cursos/ServletsJSPs/Leccion14/videos.gif">
            </a>
        </span>
        <span id="videos" class="ocultal_menu">
            <ul>
                <li><%@include file="pages/video1.html"%>%></li>
              
            </ul>
        </span>
    </body>
</html>
