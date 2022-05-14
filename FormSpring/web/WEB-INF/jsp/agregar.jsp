

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        
        
        <title>Agregar Venta</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    Registrar Nueva Venta
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre Producto</label>
                        <input type="text" name="producto" class="form-control">
                        <label>Cantidad</label>
                        <input type="number" name="cantidad" class="form-control">
                        <label>Precio</label>
                        <input type="text" name="precio" class="form-control">
                        <label>Total</label>
                        <input type="text" name="total" class="form-control">
                        <br>
                        <input type="submit" value="Registrar Venta" class="btn btn-success">
                        <a href="index.htm">Regresar</a>
                        
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
