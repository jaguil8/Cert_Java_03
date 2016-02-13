<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Captura</title>
    </head>
    <body>
        <h1>Nuevo equipo</h1>
        <form action="agregarEquipo" method="POST">
            IdEquipo: <input type="text" name="idEquipo"><br>
            Nombre del Equipo: <input type="text" name="nombreEquipo"><br>
            Direccion Ip: <input type="text" name="ip"><br>
            Fecha de Instalacion: <input type="text" name="fechaInstalacion"><br>
            Fecha del Ultimo Cambio: <input type="text" name="fechaUltimoCambio"><br>
            <input type="submit" name="Enviar">
        </form>
    </body>
</html>
