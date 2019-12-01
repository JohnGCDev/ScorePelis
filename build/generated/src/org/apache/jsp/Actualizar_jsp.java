package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Actualizar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar Usuarios</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("\t<h2>Edición de Usuarios</h2>\n");
      out.write("\t<form action=updatedetails method=\"post\">\n");
      out.write("\t\t<pre>\n");
      out.write("<b>Name:         </b><input type=\"text\" name=\"nombre\" value='<s:property value=\"nombre\"/>'>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("<b>Email:        </b><input type=\"input\"  name=\"edad\" value='<s:property value=\"edad\"/>'>\n");
      out.write("\t\t            \n");
      out.write("\t\t\n");
      out.write("<b>Password:     </b><input type=\"text\" name=\"genero\" value='<s:property value=\"genero\"/>'>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("<b>Designation:  </b><input type=\"text\" name=\"descripcion\" value='<s:property value=\"descripcion\"/>'>\n");
      out.write("\t\t\n");
      out.write("\t\t<button name=\"submitType\" value=\"update\" type=\"submit\">Update</button>\n");
      out.write("\t\t</pre>\n");
      out.write("\t</form>\n");
      out.write("\t<s:if test=\"ctr>0\">\n");
      out.write("\t\t<span style=\"color: red;\"><s:property value=\"msg\" /></span>\n");
      out.write("\t</s:if>\n");
      out.write("\t<s:else>\n");
      out.write("\t\t<span style=\"color: red;\"><s:property value=\"msg\" /></span>\n");
      out.write("\t</s:else>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
