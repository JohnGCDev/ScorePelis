<%-- 
    Document   : listado_usuarios.jsp
    Created on : 04/11/2019, 09:55:56 AM
    Author     : Estilos
--%>

<%@page import="com.store.action.MetodosAction"%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sj:head jqueryui="true" jquerytheme="blitzer"></sj:head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
   <jsp:include page="menu.html"/>
    <body style=" background-image: url('listado.jpg');
           background-size: 100%;">
              <div id="tab2" class="widget-body">
                  <br>
            <table align="center" class="table table-striped table-bordered no-margin"
                   style="color: black;
                   background-color: #D1D1D1; opacity: 0.8;">
                <th colspan="10" style="text-align: center;"><h1>Listado de Usuarios</h1></th>
                <tr>
                  <td align="center" style="color: #113CEC;"><b>Usuario</b></td>
                    <td align="center" style="color: #113CEC;"><b>Edad</b></td>
                    <td align="center" style="color: #113CEC;"><b>Genero</b></td>
                    <td align="center" style="color: #113CEC;"><b>Descripcion</b></td> 
                    <td align="center" style="color: #113CEC;"><b>Opciones</b></td>  
                </tr>
             
            <s:iterator value="listarUsuarios">
               
                <tr>
                 
                    <td align="center" ><b><s:property value="nombre"></s:property></b></td>
                    <td align="center"><b><s:property value="edad"></s:property></b></td>
                    <td align="center"><b><s:property value="genero"></s:property></b></td>
                    <td align="center"><b><s:property value="descripcion"></s:property></b></td>
                    <td align='center' style=' width: 20%;'>
                    <a href="obtener_usuario.action?submitType=obtenerusuario&id=<s:property value="id"/>"
                     class="btn btn-info btn-xs">
                     <span> <img src='editar.png' style='height: 29px;'></span>
                    </a>
                     <a href="delete.action?submitType=delete&id=<s:property value="id"/>"
                        class="btn btn-danger btn-xs">
                     <span> <img src="eliminar.png" style='height: 29px;'></span>
                    </a> 
                    </td>
                </tr>
               
            </s:iterator>
               
           
       
            </table>
        </div>
    </body>
</html>
