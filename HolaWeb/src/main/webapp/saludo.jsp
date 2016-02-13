<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesion 1 Saludo</title>
    </head>
    <body>
        <h1>${mensaje}</h1>
        
        Art&iacute;culo:
        <ul>
            <li>${articulo.clave}</li>
            <li>${articulo.nombre}</li>
            <li>${articulo.precioUnitario}</li>
            <li>${articulo.fechaIntroduccion}</li>
        </ul>
    </body>
</html>
