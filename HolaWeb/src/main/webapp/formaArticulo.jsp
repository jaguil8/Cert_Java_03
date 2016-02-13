<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Captura</title>
    </head>
    <body>
        <h1>Nuevo articulo</h1>
        <form action="agregarArticulo" method="POST">
            Clave: <input type="text" name="clave"><br>
            Nombre: <input type="text" name="nombre"><br>
            Precio: <input type="text" name="precio"><br>
            Fecha: <input type="text" name="fechaIntroduccion"><br>
            <input type="submit" name="Enviar">
        </form>
    </body>
</html>
