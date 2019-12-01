<%-- 
    Document   : registro_admin
    Created on : 05/11/2019, 10:58:43 PM
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
    <STYLE type="text/css">  
        .errorMessage{color:red;}  
    </STYLE> 
    </head>
            <jsp:include page="menu.html"/>

     <body style=" background-image: url('fondo2.jpg');
           background-size: 100%;"
            >
    <!--<body style=" background-image: url('fondo2.jpg');">-->
   <br>
    <s:div cssClass="container"  >
        <s:div cssClass="row" >
            <s:div cssClass="col align-self-start" cssStyle="color:white;"></s:div>
            <s:div cssClass="col align-self-center" ><h1 style="color:white;
                text-align: center;
                   font-family: 'Anton', sans-serif;">NUEVO ADMINISTRADOR</h1>
            </s:div>
           <s:div cssClass="col align-self-end" cssStyle="color:white;"></s:div> 
        </s:div>
        <s:div cssClass="row">
                <s:div cssClass="col-3  align-self-start" cssStyle="color:white;"></s:div>
            <s:div cssClass="col-6 align-self-center" cssStyle="color:white;
                   font-family: 'Anton', sans-serif;">
                
                <s:form cssStyle="background-color: #1B2631;  padding: 50px;
                   border-radius: 10px;
                   opacity: 0.79; "
                   action="registraadmin">
                    <s:div cssClass="form-group " >
                        
                        <s:textfield label="Usuario" name="nombre" placeholder="Ingrese usuario" cssClass="form-control"
                                     required="required" >
                         
                         </s:textfield>
                        <!-- ESTO PROVIENE DEL METODO validate del action-->
                        <s:if test="getFieldErrors().get('fnombre')!=null">
                            <div class="alert alert-danger mt-3">
                              <s:property value="getFieldErrors().get('fnombre')[0]"></s:property> 
                            </div>
                         </s:if>     
                        
                   </s:div>
                    
                    <s:div cssClass="form-group">
                        <s:textfield label="Edad" name="edad"  placeholder="Ingrese Edad"  type="number" cssClass="form-control"
                         required="required"></s:textfield>
                        
                         <s:if test="getFieldErrors().get('fedad')!=null">
                              <div class="alert alert-danger mt-3">
                              <s:property value="getFieldErrors().get('fedad')[0]"></s:property> 
                              </div>
                         </s:if>  
                        
                      

                    </s:div>
                    <s:div cssClass="form-group">
                    <s:select label="Género" name="genero" cssClass="form-control"
                        headerValue="Seleccion un genero"
                        headerKey="1"
                        list="{'M','F'}"
                        required="required" >
                           
                      </s:select>
                    <s:if test="getFieldErrors().get('fgenero')!=null">
                        <div class="alert alert-danger mt-3">
                              <s:property value="getFieldErrors().get('fgenero')[0]"></s:property> 
                         </div>
                     </s:if>  
                    </s:div>
                    <s:div cssClass="form-group" >
                          <s:password name="pass"
                                      label="Contraseña"
                                      cssClass="form-control"
                            placeholder="Escriba Contraseña" 
                            required="required" >
                          </s:password>
                          <s:if test="getFieldErrors().get('fpass')!=null">
                              <div class="alert alert-danger mt-3">
                              <s:property value="getFieldErrors().get('fpass')[0]"></s:property> 
                              </div>
                          </s:if>  
                    </s:div>
                    <s:div cssClass="form-group" >
                          <s:password name="passrep"
                                      label="Repita Contraseña"
                                      cssClass="form-control"
                            placeholder="Repita Contraseña" 
                            required="required" >
                          </s:password>
                          <s:if test="getFieldErrors().get('fpassr')!=null">
                              <div class="alert alert-danger mt-3">
                              <s:property value="getFieldErrors().get('fpassr')[0]"></s:property> 
                              </div>
                              
                          </s:if>  
                          
                    </s:div>    
                    <s:div cssClass="form-group">
                        <s:submit cssClass="btn btn-primary"
                                  cssStyle="margin-right:20%;"
                                     value="REGISTRAR"
                        required="required"  ></s:submit>
                    </s:div>
            </s:form>  
            </s:div>
             <s:div cssClass="col-3 align-self-end" cssStyle="color:white;"></s:div> 

         </s:div>

     </s:div>       
    </body>   

</html>

