<%@page import="com.store.bean_entity.Categoria"%>
<%@page import="sun.security.util.Cache.EqualByteArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <sj:head jqueryui="true" jquerytheme="blitzer"></sj:head>
        <link href="Bootstrap/icomoon/style.css" rel="stylesheet">
        <link href="Bootstrap/css/main.css" rel="stylesheet">
    </head>
    <body>
        <header>
            <a href="#" class="logo">
                <img src="Bootstrap/img/logo.png" alt="Logo"/>
            </a>
        </header>
        <div class="container-fluid">
          <div class="dashboard-container">
            <div class="top-nav">
              <ul>
              <s:iterator value="listarPaginas">
                <li>
                    <sj:menuItem  title="%{Titulo}" href="%{Url}"></sj:menuItem>
                </li>
                </s:iterator>
              </ul>
              <div class="clearfix">
              </div>
            </div>
          </div>
        </div>
        <s:actionmessage theme="bootstrap" ></s:actionmessage>
        <s:actionerror theme="bootstrap"></s:actionerror>
        <s:fielderror theme="bootstrap" ></s:fielderror>
        
        <s:form action="buscaProdPorNombreXML" class="form-search">
            <s:textfield name="cad" required="true" cssClass="input-medium search-query" ></s:textfield>
            <s:submit value="Buscar" ></s:submit>
        </s:form>
        <%------------------------- TABLED PANEL------------------------------%>
        <sj:tabbedpanel id="PanelTab" selectedTab="0">
        <sj:tab label="Ingresar Producto" target="tab1" ></sj:tab>
        <sj:tab label="Listado Producto Activos" target="tab2"></sj:tab>
        <sj:tab label="Actualizar Producto" target="tab3"></sj:tab>
        <sj:tab label="Listado Producto Inactivos" target="tab4"></sj:tab>
        <%--------------------------- INGRESO---------------------------------%>
        <div id="tab1">
        <s:form action="addProductoXML" method="post" enctype="multipart/form-data"
                theme="bootstrap" cssClass="form-horizontal" loadMinimumCount="3">
            <sj:autocompleter label="Categoria: "
                              name="idCat"
                              list="categorias"
                              listKey="idCategoria"
                              listValue="nomCategoria" 
                              parentTheme="bootstrap"
                              tooltip="Tooltip for Autocompleter"/>
            <s:textfield name="nomPro" label="Nombre Producto" tooltip="Ingrese su nombre"/>
            <sj:spinner name="sto" label="Stock"  readonly="false" max="100" min="0" tooltip="Ingresar una cantidad" />
            <s:textfield name="pre" label="Precio"/>
            <s:textfield name="est" label="Estado" />
            <sj:datepicker name="fec" label="fecha INgreso"  displayFormat="dd/mm/yy"></sj:datepicker>
            
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            
            <s:submit cssClass="btn-success" value=" Ingresar "></s:submit>
            <s:reset cssClass="btn-danger" value=" Cancelar " ></s:reset>
        </s:form>
        </div>
        <%--------------------------- LISTADO---------------------------------%>
        
        <div id="tab2" class="widget-body">
            <table align="center" class="table table-striped table-bordered no-margin">
                <th colspan="10">Poductos Activos</th>
                <tr>
                    <td align="center">Codigo Interno</td>
                    <td align="center">Categoria</td>
                    <td align="center">Nombre</td>
                    <td align="center">Stock</td>
                    <td align="center">Precio</td>
                    <td align="center">Fecha Caduca</td>
                </tr>
            <s:iterator value="listarProductos">
                
                <tr class="">
                    <td align="center"><s:property value="idProducto"></s:property></td>
                    <td align="center"><s:property value="Categoria.nomCategoria"></s:property></td>
                    <td align="center"><s:property value="nombre"></s:property></td>
                    <td align="center"><s:property value="stock"></s:property></td>
                    <td align="center"><s:property value="precio"></s:property></td>
                    <td align="center"><s:property value="fechaCaduca"></s:property></td>
                    <td>
                    <s:url id="url" action="buscaProdPorIDXML">
                        <s:param name="idPro">
                            <s:property value="idProducto"></s:property>
                        </s:param>
                    </s:url>
                    <s:a href="%{url}" cssClass="fs1" aria-hidden="true" data-icon="" >Actualizar</s:a>
                    
                    </td>
                    <td>
                    <s:url id="url2" action="eliminaProductoXML">
                        <s:param name="idPro">
                            <s:property value="idProducto"></s:property>
                        </s:param>
                    </s:url>
                        <s:a href="%{url2}" cssClass="delete-row"  data-original-title="Delete">
                                <i class="icon-trash"></i>
                        </s:a>
                    </td>
                </tr>
            </s:iterator>
            </table>
        </div>
        <%------------------------- Actualizacion-----------------------------%>
        <div id="tab3">
        <s:form action="actualizarProductoXML">
            <sj:textfield name="idPro" label="Codigo Producto" readonly="true"  value="%{Producto.idProducto}"></sj:textfield>
            <s:textfield name="idCat" label="Codigo Categoria" readonly="true"value="%{Producto.categoria.idCategoria}"></s:textfield>
            <s:textfield name="nomPro" label="Nombre Producto" value="%{Producto.nombre}"></s:textfield>
            <sj:spinner name="sto" label="Stock" value="%{Producto.stock}"></sj:spinner >
            <s:textfield name="pre" label="Precio" value="%{Producto.precio}"></s:textfield>
            
            <sj:datepicker value="%{Producto.fechaCaduca}" name="fec" label="fecha INgreso"  displayFormat="dd/mm/yy"></sj:datepicker>
            <s:textfield name="est" label="Estado" value="%{Producto.estado}"></s:textfield>
            <s:submit value="Actualizar"></s:submit>
        </s:form>
        </div>
        <%--------------------------- LISTAR INACTIVOS---------------------------------%>
        <div id="tab4" >
            <table align="center" class="table">
                <th colspan="10">Poductos Inactivos</th>
                <tr>
                    <td align="center">Codigo Interno</td>
                    <td align="center">Categoria</td>
                    <td align="center">Nombre</td>
                    <td align="center">Stock</td>
                    <td align="center">Precio</td>
                    <td align="center">Fecha Caduca</td>
                </tr>
            <s:iterator value="listaProductoBaja">
                <tr class="error">
                    <td align="center"><s:property value="idProducto"></s:property></td>
                    <td align="center"><s:property value="Categoria.nomCategoria"></s:property></td>
                    <td align="center"><s:property value="nombre"></s:property></td>
                    <td align="center"><s:property value="stock"></s:property></td>
                    <td align="center"><s:property value="precio"></s:property></td>
                    <td align="center"><s:property value="fechaCaduca"></s:property></td>
                    <td>
                    <s:url id="url" action="buscaProdPorIDXML">
                        <s:param name="idPro">
                            <s:property value="idProducto"></s:property>
                        </s:param>
                    </s:url>
                    <s:a href="%{url}" cssClass="fs1" aria-hidden="true" data-icon="" >Actualizar</s:a>
                    
                    </td>
                </tr>
            </s:iterator>
            </table>
        </div>
        </sj:tabbedpanel>
    </body>
</html>
