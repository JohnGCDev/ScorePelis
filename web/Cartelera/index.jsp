<%-- 
    Document   : index
    Created on : 01/12/2019, 04:22:14 PM
    Author     : Estilos
--%>

<%@page import="com.store.action.cartelera.ListAction "%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Cartelera"%>
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
            <style>
            table, td, th {border: 1px solid black;}
            table {border-collapse: collapse;}
            th {height: 30px;}
            .button-update {background-color: #008CBA;color: white;}
            .button-delete {background-color: red;color: white;}
            </style>
        </head>
        <jsp:include page="../menu.html"/>
        <body >
            <div style="margin-top: 40px;margin: auto; width: 60%;" >
                <h2 style="margin-left:40%;">Lista de Cartelera</h2>
                <a href="#">
                            <!-- ../Cine/registrar.jsp -->


                    <button class="btn btn-primary">Nueva Cartelera</button>
                </a>
                <br>  <br>

            <s:if test="noData==true">
                <table class="table table-striped">
                    <thead>
                        <tr style="background-color: #E0E0E1;">
                           
                            <th>Película</th>
                            <th>Género</th>
                            <th>Cine</th>
                            <th>Dirección</th>
                            <th>Ciudad</th>
                            <th>Horario</th>
                            <th>Opciones</th>
                        </tr>
                    </thead>
                    <s:iterator value="beanList">
                        <tr>
                            
                            <td><s:property value="nombre" /></td>
                            <td><s:property value="genero" /></td>
                            <td><s:property value="cine" /></td>
                            <td><s:property value="direccioncine" /></td>
                            <td><s:property value="ciudad" /></td>
                            <td><s:property value="carHorario" /></td>
                            <td>
                                <a href="actualizarCartelera.action?submitType=updatedata&id=<s:property value="idCartelera"/>">
                                    <button class="btn btn-primary button-update">Actualizar</button>
                                </a>
                                <a href="eliminarCartelera.action?id=<s:property value="idCartelera"/>">
                                    <button class="btn btn-danger button-delete">Eliminar</button>
                                </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <div style="color: red;">
                    <s:property  value="noData" />
                    
                    No existen Cartelera registrada</div>
            </s:else>
        </div>
    </body>
</html>

