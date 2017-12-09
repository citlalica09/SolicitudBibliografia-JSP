<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 06/12/2017
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear lista</title>
    <link href="css/materialize.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<div class="container">
    <h2>Lista</h2>
    <form method="get" action="crearLista" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Numero de solicitud</label>
                <input type="text" name="numero_solicitud" placeholder="Numero de solicitud"/>
            </div>
            <div class="col s4">
                <label>ISBN del Libro</label>
                <input type="text" name="ISBN_del_libro" placeholder="ISBN del Libro"/>
            </div>
            <div class="col s4">
                <label>Clave de la Asignatura</label>
                <input type="text" name="clave_asignatura" placeholder="Clave de la Asignatura"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>

