<%-- 
    Document   : Registar
    Created on : 10/11/2019, 11:14:53 AM
    Author     : HP
--%>
<%@page import="com.store.action.genero.RegisterAction"%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Genero"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sj:head jqueryui="true" jquerytheme="blitzer"></sj:head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <jsp:include page="../menu.html"/>
    <body>
	<h2 style="margin-left:40%;">Registar Género</h2>
        <br>
        <form action=registrarGenero method="post" style="margin: auto; width: 60%;">

            <div class="form-group">
                <div class=input-group>
                    <div class="input-group-prepend">
                        <label class="input-group-text"
                               style="">Descripción </label>
                    </div>
                    <input type="text" name="nombre"  required class="form-control" >
                </div>
            </div>
            <button  type="submit" class="btn btn-primary" style="margin-left:30%;">Registrar</button>
            <a href ="list" class="btn btn-danger" >Cancelar </a>

        </form>
    
</body>
</html>

