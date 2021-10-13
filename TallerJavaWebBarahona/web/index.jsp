<%-- 
    Document   : index
    Created on : 15/06/2020, 11:57:12 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" type="image/png" href="favicon.png">
        <title>Taller Java Web Barahona</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <div class="modal-dialog text-center">
            <div class="col-lg-12">
                <div class="modal-content">
                    <div class="col-12">
                        <br>
                        <img src="imagenes/login1.png" height="100vw"/>
                    </div>
                    <form action="LoginCTO?accion=validaLogin" method="POST">
                        <div class="form-group text-center">
                            <p>
                                <strong>
                                    Bienvenidos al sistema de Login
                                </strong>
                            </p>                            
                        <div class="form-group text-center col-12">
                            <label>Usuario</label>
                            <input type="text" name="txt_usuario" placeholder="ejemplo@ejemplo.com" class="form-control" required  >
                            
                        </div>
                        <div class="form-group text-center col-12">
                            <label>Contraseña</label>
                            <input type="password" name="txt_clave" placeholder="password" class="form-control" required>                            
                        </div>
                        <input type="submit" name="btn_ingresar" value="Ingresar" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
        <a href="Principal.jsp">Pagina Principal</a>
    </body>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</html>
