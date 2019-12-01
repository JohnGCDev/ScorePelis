<%-- 
    Document   : editar
    Created on : 10/11/2019, 07:45:36 PM
    Author     : HP
--%>


<%@page import="com.store.action.pelicula.UpdateAction"%>
<%@page import="java.util.List"%>
<%@page import="com.store.bean_entity.Pelicula"%>
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
	<h2 style="margin-left:40%;">Actualizar Película</h2>
        <br>
        <form action=actualizarCine method="post"  autocomplete="off" style="margin: auto; width: 60%;">
            <input type="hidden" name="id" value='<s:property value="id"/>'>
             <div class="form-group">
                <div class=input-group>
                   <div class="input-group-prepend">
                        <label class="input-group-text"
                               style="">Nombre </label>
                   </div>
               <input type="text" name="nombre" required
                value='<s:property value="nombre"/>' class="form-control">
                </div>
            </div>
             <div class="form-group">
                <div class=input-group>
                    <div class="input-group-prepend">
                        <label class="input-group-text"
                               style="">Pais </label>
                    </div>
                    <input type="text" name="pais" required
                           value='<s:property value="pais"/>' class="form-control">
                </div>
            </div>
             <div class="form-group">
               <div class=input-group>
                   <div class="input-group-prepend">
                       <label class="input-group-text"
                              style="">Imagen </label>
                   </div>
                   <input type="file" name="imagen" required
                          value='<s:property value="imagen"/>' class="form-control">
               </div>
           </div>
	     <div class="form-group">
               <div class=input-group>
                   <div class="input-group-prepend">
                       <label class="input-group-text"
                              style="">Sinopsis </label>
                   </div>
                   <textarea type="text" name="sinopsis" rows="10" required
                              class="form-control">
                       <s:property value="sinopsis"/>
                   </textarea>
               </div>
           </div>
             <div class="form-group">
               <div class=input-group>
                   <div class="input-group-prepend">
                       <label class="input-group-text"
                              style="">Puntuacion </label>
                   </div>
                   <input type="number"  name="puntuacion" required
                           value='<s:property value="puntuacion"/>'   class="form-control"/>
               </div>
           </div>         
             <div class="form-group">
               <div class=input-group>
                   <div class="input-group-prepend">
                       <label class="input-group-text"
                              style="">Fecha de Estreno Cine </label>
                   </div>
                   <input type="date"  name="fechaCine" required
                           value='<s:property value="fechaCine"/>'   class="form-control"/>
               </div>
           </div>
             <div class="form-group">
               <div class=input-group>
                   <div class="input-group-prepend">
                       <label class="input-group-text"
                              style="">Fecha de Estreno DVD </label>
                   </div>
                   <input type="date"  name="fechaDvd" required
                           value='<s:property value="fechaDvd"/>'   class="form-control"/>
               </div>
           </div>
	     <div class="form-group">
               <div class=input-group>
                   <div class="input-group-prepend">
                       <label class="input-group-text"
                              style="">Precio DVD </label>
                   </div>
                   <input type="number" step="any"  name="precioDvd" required
                           value='<s:property value="precioDvd"/>'   class="form-control"/>
               </div>
           </div>	
                    <button name="submitType" value="update" type="submit" class="btn btn-primary" style="margin-left:30%;">Actualizar</button>
                    <a href ="listarPeliculas" class="btn btn-danger" >Cancelar </a>
		
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



