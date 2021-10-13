
<%@page import="modelo.dto.UsuarioDTO"%>
<%@ taglib  prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-15"%>

<% 
    HttpSession sesion = request.getSession();
    UsuarioDTO usuRegis= (UsuarioDTO) sesion.getAttribute("login");
    if(sesion.getAttribute ("login")==null){
        response.sendRedirect("index.jsp");
    }else{
      
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Productos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <h1 >Productos</h1>
                </div>
            </div>
            <div class="row">
                <div class="card col-sm-4">
                    <div class="card-body">
                        <h2 class="inp">Ingresar Producto</h2>
                        <form action ="ProductoCTO?menu=Producto" method="POST">
                            <div class="form-group">
                                <label class="inp" for="txt_nombre_pro">Nombre Producto</label>
                                <input type="hidden" value="${producto.getId_p()}" name="txt_id_pro">
                                <input type="text" class="form-control" name="txt_nombre_pro" required value="${producto.getNombre_p()}">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_descripcion_pro">Descripcion Producto</label>
                                <input type="text" class="form-control" name="txt_descripcion_pro" required value="${producto.getDescripcion_p()}">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_unidades_pro">Unidades Producto</label>
                                <input type="text" class="form-control" name="txt_unidades_pro" required value="${producto.getUnidades_p()}">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_valor_pro">Valor Producto</label>
                                <input type="text" class="form-control" name="txt_valor_pro" required value="${producto.getValor_p()}">
                            </div>
                            <c:if test="${producto.getValor_p()== null}">
                            <input type="submit" class="btn btn-success" name="accion" value="Agregar">
                            </c:if>
                            <c:if test="${producto.getValor_p()!= null}">
                            <input class="btn btn-warning" type="submit" name="accion" value="Actualizar">
                            </c:if>
                        </form>
                    </div>
                </div>

                <div class="card col-sm-6 col-md-6 col-lg-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>N° Id</th>
                                <th>Nombre </th>
                                <th>Descripcion</th>
                                <th>Unidades</th>
                                <th>Valor</th>     
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="objP" items="${lista_productos}">
                                <tr>
                                    <td>${objP.getId_p()}</td>
                                    <td>${objP.getNombre_p()}</td>
                                    <td>${objP.getDescripcion_p()}</td>
                                    <td>${objP.getUnidades_p()}</td>
                                    <td>${objP.getValor_p()}</td>
                                    <td>
                                        <a class="btn btn-warning" href="ProductoCTO?menu=Producto&accion=Editar&id=${objP.getId_p()}">Editar</a>
                                        <a class="btn btn-danger " href="ProductoCTO?menu=Producto&accion=Eliminar&id=${objP.getId_p()}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
<% 
    }
%>