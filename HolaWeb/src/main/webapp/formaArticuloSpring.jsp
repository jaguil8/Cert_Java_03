<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>formaArticuloSpring</title>
    </head>
    <body>
        <h1>Agregar articulo(Spring)</h1>
        <sf:form action="agregarArticuloObj" method="POST" commandName="articulo">
            <sf:errors path="clave"/>
            Clave: <sf:input path="clave"/><br>
            <sf:errors path="nombre"/>
            Nombre: <sf:input path="nombre"/><br>
            Precio: <sf:input path="precioUnitario"/><br>
            Fecha Introducci&oacute;n: <sf:input path="fechaIntroduccion"/><br>
            <input type="submit" value="Enviar">
        </sf:form>
    </body>
</html>
