<%-- 
    Document   : Actualizar
    Created on : 04/11/2019, 10:36:23 PM
    Author     : Estilos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuarios</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a class="navbar-brand" href="#"><p class="font-italic">Pelis Scoring</p></a>
           <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span> </button>
         
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mr-auto"> 
               <li class="nav-item active">
                   <a href="#" style="color: white;">Inicio</a>
               </li>
               <li class="nav-item active">
                   <s:a action="listado" cssStyle="color:white;
                       margin-left:10px;">Listado</s:a>
               </li>
                <li class="nav-item active">
                   <a href="registro_admin.jsp" style="color: white; margin-left:10px;">Registro</a>
               </li>
             </ul>
                  <a href="registro_usuario.jsp" class="btn btn-danger">Salir</a>
          </div>
       </nav>
   <body style=" background-image: url('edicion.jpg');
          ">
      
       <br><br><br>
       <h2 style="text-align: center; color: #000209;">Edición de Usuarios</h2>
       
        <form action=update method="post" style="margin: auto; width: 60%;">
            <div class="form-group">
             <!-- ESTE INPUT LO OCULTO PARA OBTENER LA PROPIEDAD id PARA ACTUALIZAR
             Y ESTO FORMA LO PASO AL UPDATEACTION el id-->
            <input type="hidden" name="id" value='<s:property value="id"/>'>
            </div>
            <div class="form-group">
                <div class=input-group>
                   <div class="input-group-prepend">
                        <label class="input-group-text"
                               style="">Nombre: </label>
                   </div>
               <input type="text" name="nombre" 
                value='<s:property value="nombre"/>' class="form-control">
                </div>
            </div>
            
            <div class="form-group">
                <div class=input-group>
                    <div class="input-group-prepend">
                        <label class="input-group-text"
                               style="">Edad   :</label> 
                    </div>
                 <input type="input"  name="edad" value='<s:property value="edad"/>'
                                            class="form-control">
                </div>
               
            </div>
            <div class="form-group">
                <div class=input-group>
                    <div class="input-group-prepend">
                      <label class="input-group-text"
                             style="">Género</label>
                    </div>
                      <input type="text" name="genero" value='<s:property value="genero"/>'
                                                  class="form-control">
                  </div>
               

            </div>
            <div class="form-group">
                <div class=input-group>
                    <div class="input-group-prepend">
                          <label class="input-group-text"
                                 style="">Descripción:</label>   
                    </div>
                        <input type="text" name="descripcion" value='<s:property value="descripcion"/>'
                                                  class="form-control" >
                  </div>
                
            </div>
            
                     <button class="btn btn-danger" style="margin-left:30%;"
                    name="submitType" value="update" type="submit">Actualizar</button>
	</form>
	<s:if test="msg!=null">
            <div class="alert alert-danger mt-3" style="width: 40%; margin: auto;">
                <span style="color: green;"><s:property value="msg" /></span>
            </div>
	</s:if>
        
	
</body>
</html>
