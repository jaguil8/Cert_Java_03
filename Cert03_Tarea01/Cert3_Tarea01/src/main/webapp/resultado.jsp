<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarea 01 Resultado</title>
    </head>
    <body>
        <h1>${mensaje}</h1>
        
        Equipo agregado:
        <ul>
            <li>${equipoRed.idEquipo}</li>
            <li>${equipoRed.nombreEquipo}</li>
            <li>${equipoRed.ip}</li>
            <li>${equipoRed.fechaInstalacion}</li>
            <li>${equipoRed.fechaUltimoCambio}</li>
        </ul>
    </body>
</html>
