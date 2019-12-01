<%-- 
    Document   : elinminar
    Created on : 10/11/2019, 07:33:33 PM
    Author     : HP
--%>

<%@page import="com.store.action.director.DeleteAction"%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Director"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<jsp:include page="../menu.html"/>
    <body style=" background-image: url('../eliminarusuario.jpg');
         
          ">
        <h2 style="text-align: center; color: #000209;">Eliminación de Director</h2>
        
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
        <br>
        <div Class="col" Style="color:white;
            width:40%;  margin-left:50%;">
            <s:a cssClass="btn btn-warning" action="listarDirectores" cssStyle="color:white;
                       margin-left:10px;">Regresar</s:a>
           
        </div>
    </body>
</html>
