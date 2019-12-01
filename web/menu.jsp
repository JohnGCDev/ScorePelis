<%-- 
    Document   : menu
    Created on : 04/11/2019, 10:39:18 AM
    Author     : Estilos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </head>
    <body>
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
                   <a href="#" style="color: white;">Registro</a>
               </li>
               <li class="nav-item active">
                   <a href="#" style="color: white;">Género</a>
               </li>
             </ul>
                  <a href="registro_usuario.jsp" class="btn btn-danger">Salir</a>
          </div>
       </nav>
    </body>
</html>
