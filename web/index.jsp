<%-- 
    Document   : index
    Created on : 01/12/2019, 04:32:32 PM
    Author     : JD
--%>
<%@page import="com.store.action.login.Login" %>
<%@page import="com.store.bean_entity.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Ingrese sus datos para continuar</h1>
        <form action="login" method="post">
            <input type="email" name="email" placeholder="Ingrese su email" required/>
            <input type="password" name="pass" placeholder="Ingrese su contaseña" required/>
            <input type="submit" value="INGRESAR"/>
        </form>
    </body>
</html>
