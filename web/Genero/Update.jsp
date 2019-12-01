<%-- 
    Document   : Update
    Created on : 10/11/2019, 02:31:08 AM
    Author     : HP
--%>

<%@page import="com.store.action.genero.UpdateAction"%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Genero"%>
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
   <jsp:include page="../menu.html"/>
    <body>
	<h2 style="margin-left:40%;">Actualizar Género</h2>
        <br>
	<form action=actualizar method="post" style="margin: auto; width: 60%;">
            <input type="hidden" name="id" value='<s:property value="id"/>'>
             <div class="form-group">
                <div class=input-group>
                   <div class="input-group-prepend">
                        <label class="input-group-text"
                               style="">Descripción </label>
                   </div>
               <input type="text" name="nombre" 
                value='<s:property value="nombre"/>' class="form-control">
                </div>
            </div>
		
		            
		
                    <button name="submitType" value="update" type="submit" class="btn btn-primary" style="margin-left:30%;">Actualizar</button>
                    <a href ="list" class="btn btn-danger" >Cancelar </a>
		
	</form>
	<s:if test="ctr>0">
            <div class="alert alert-success mt-3" style="width: 40%; margin: auto;">
                <span style="color: green;"><s:property value="msg" /></span>
            </div>
	</s:if>
	<s:else>
            <s:if test="msg!=null">
                <div class="alert alert-danger mt-3" style="width: 40%; margin: auto;">
                    <span style="color: red;"><s:property value="msg" /></span>
                </div>
            </s:if>
	</s:else>
</body>
</html>
