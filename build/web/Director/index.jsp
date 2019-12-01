<%-- 
    Document   : index
    Created on : 10/11/2019, 07:14:44 PM
    Author     : HP
--%>

<%@page import="com.store.action.director.ListAction"%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Director"%>
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
                <h2 style="margin-left:40%;">Lista de Directores</h2>
                <a href="../Director/registrar.jsp">



                    <button class="btn btn-primary">Nuevo Director</button>
                </a>
                <br>  <br>

            <s:if test="noData==true">
                <table class="table table-striped">
                    <thead>
                        <tr style="background-color: #E0E0E1;">
                            <th>Código</th>
                            <th>Nombre</th>
                            <th>Nacionalidad</th>
                            <th>Opciones</th>
                        </tr>
                    </thead>
                    <s:iterator value="beanList">
                        <tr>
                            <td><s:property value="id" /></td>
                            <td><s:property value="nombre" /></td>
                            <td><s:property value="nacionalidad" /></td>
                            <td>
                                <a href="actualizarDirector.action?submitType=updatedata&id=<s:property value="id"/>">
                                    <button class="btn btn-primary button-update">Actualizar</button>
                                </a>
                                <a href="eliminarDirector.action?id=<s:property value="id"/>">
                                    <button class="btn btn-danger button-delete">Eliminar</button>
                                </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </s:if>
            <s:else>
                <div style="color: red;">No existen Directores registrados</div>
            </s:else>
        </div>
    </body>
</html>

