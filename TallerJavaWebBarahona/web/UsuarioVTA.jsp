
<%@ taglib  prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-15"%>

<% 
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute ("login")==null){
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Productos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body onload="todo()">
        <div class="container">
            <div class="row">
                <div class="col-sm-14">
                    <h1 >Usuarios</h1>
                </div>
            </div>
            <div class="row">
                <div class="card col-sm-5">
                    <div class="card-body">
                        <h2 >Ingresar Usuario</h2>
                        <form action ="UsuarioCTO?menu=Usuario" method="POST">
                            <div class="form-group">
                                <label class="inp" for="txt_nombre1">Primer nombre</label>
                                <input type="hidden" value="${usuario.getId()}" name="txt_id">
                                <input type="text" class="form-control" name="txt_nombre1" required value="${usuario.getNombre1()}" placeholder="Paco">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_nombre2">Segundo nombre</label>
                                <input type="text" class="form-control" name="txt_nombre2" required value="${usuario.getNombre2()}" placeholder="Pedro">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_apellido1">Primer apellido</label>
                                <input type="text" class="form-control" name="txt_apellido1" required value="${usuario.getApellido1()}" placeholder="Rodriguez">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_apellido2">Segundo apellido</label>
                                <input type="text" class="form-control" name="txt_apellido2" required value="${usuario.getApellido2()}" placeholder="Leon">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_n_iden">Numero de identificacion</label>
                                <input type="text" class="form-control" name="txt_n_iden" required value="${usuario.getN_identificacion()}" placeholder="1111111111">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_correo">Correo</label>
                                <input type="email" class="form-control" name="txt_correo" required value="${usuario.getCorreo()}" placeholder="pacopaco@ejemplo.com">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_clave">Clave</label>
                                <input type="password" class="form-control" name="txt_clave" required value="${usuario.getClave()}">
                            </div>
                            <div class="form-group">
                                <label class="inp" for="txt_sexo">Sexo</label>
                                <input id="help1" type="text" hidden="true" class="form-control" name="txt-help1" value="${usuario.getSexo()}"> <%--este input lo utilio como ayuda para editar el combobox--%>
                                <select name="txt_sexo" class="form-control" id="sexo" required value="${usuario.getSexo()}">
                                    <option value="" hidden>Elija una opcion</option>
                                    <option value="Hombre">Hombre</option>
                                    <option value="Mujer">Mujer</option>
                                    <option value="Otro">Otro</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="txt_fecha">Fecha nacimiento</label>
                                <input type="date" class="form-control" name="txt_fecha" required value="${usuario.getFecha_nac()}">
                            </div>
                            <div class="form-group" >
                                <input id="help" type="text" hidden="true" class="form-control" name="txt-help" value="${usuario.getEstado()}"><%--este input lo utilio como ayuda para editar el combobox--%>
                                <label  for="txt_estado">Estado</label>
                                <select id="est" name="txt_estado" class="form-control" required value="${usuario.getEstado()}" >
                                    <option value="" hidden>Elija una opcion</option>
                                    <option value="Activo">Activo</option>
                                    <option value="Inactivo">Inactivo</option>
                                </select>
                            </div>
                            <div class="form-group" >
                                <input id="help" type="text" hidden="true" class="form-control" name="txt-help" value="${usuario.getEstado()}"><%--este input lo utilio como ayuda para editar el combobox--%>
                                <label  for="txt_estado">Estado</label>
                                <label  for="txt_estado">Activo</label>
                                <input type="radio" id="est1" name="txt_estado" class="form-control" required value="Activo" selected="false">
                                <label  for="txt_estado">Inactivo</label>
                                <input type="radio" id="est2" name="txt_estado" class="form-control" required value="Inactivo" selected="false">
                            </div>
                            <input type="submit" class="btn btn-success" name="accion" value="Agregar">
                            <input class="btn btn-warning" type="submit" name="accion" value="Actualizar">
                        </form>
                    </div>
                </div>

                <br>
                <div class="card col-sm-6 col-md-6 col-lg-8 col-xl-12">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre </th>
                                <th>Cedula</th>
                                <th>Correo</th>
                                <th>Nacimiento</th>
                                <th>Sexo</th>
                                <th>Estado</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="objU" items="${lista_usuarios}">
                                <tr>
                                    <td>${objU.getId()}</td>
                                    <td>${objU.getNombre1()} ${objU.getNombre2()} ${objU.getApellido1()} ${objU.getApellido2()}</td>
                                    <td>${objU.getN_identificacion()}</td>
                                    <td>${objU.getCorreo()}</td>
                                    <td>${objU.getFecha_nac()}</td>
                                    <td>${objU.getSexo()}</td>
                                    <td>${objU.getEstado()}</td>
                                    <td>
                                        <a class="btn btn-warning" href="UsuarioCTO?menu=Usuario&accion=Editar&id=${objU.getId()}">Editar</a>
                                        <a class="btn btn-danger " href="UsuarioCTO?menu=Usuario&accion=Eliminar&id=${objU.getId()}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%--Este script es para cambiar la seleccion en los combobox al editar un usuario, ya que con Java no pude realizarlo--%>
        <script>
            function todo() {
                cambiar();
                cambiar1();
                cambiar2();
            }
            function cambiar() {
                document.getElementById("est").value = document.getElementById("help").value; //toma el valor del elemento con el id combobox y lo cambia por el value del input que utilice com ayuda

            }
            function cambiar1() {
                document.getElementById("sexo").value = document.getElementById("help1").value; //toma el valor del elemento con el id combobox y lo cambia por el value del input que utilice com ayuda
            }
            function cambiar2() { //funcion para cambiar seleccion de un grupo de radio buttons
                var estado = document.getElementById("help").value;
                if (estado == document.getElementById("est1").value) {
                    document.getElementById("est1").checked = true;
                }
                if (estado == document.getElementById("est2").value) {
                    document.getElementById("est2").checked = true;
                } else {

                }
            }
        </script>                           
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>









