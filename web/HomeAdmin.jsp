<%-- 
    Document   : MATAME
    Created on : 01/12/2019, 06:22:28 PM
    Author     : A
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Bienvenido <s:property value="rol"/> </h1>
        <s:property value="nombres"/>
    </body>
</html>
