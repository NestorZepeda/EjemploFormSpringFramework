<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary" href="agregar.htm">Nueva Venta</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                           
                            <tr>
                                <th>ID Producto </th>
                                <th>Producto </th>
                                <th>Cantidad </th>
                                <th>Precio </th>
                                <th>Total </th>
                                <th>Acciones </th>
                            </tr>
                            
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${lista}">
                            <tr>
                                <td>${dato.id_producto}</td>
                                <td>${dato.producto}</td>
                                <td>${dato.cantidad}</td>
                                <td>${dato.precio}</td>
                                <td>${dato.total}</td>
                                <td>
                                    <a href="actualizar.htm?id=${dato.id_producto}" class="btn btn-warning">Editar</a>
                                    <a href="delete.htm?id=${dato.id_producto}" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                           </c:forEach>
                        </tbody>
                    </table>

                    
                </div>
            </div>
        </div>
    </body>
</html>
