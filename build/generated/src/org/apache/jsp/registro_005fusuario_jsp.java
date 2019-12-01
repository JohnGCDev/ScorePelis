package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_required_placeholder_name_label_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_type_required_placeholder_name_label_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_password_required_placeholder_name_label_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssStyle_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_required_cssStyle_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_cssStyle_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_required_name_list_label_headerValue_headerKey_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_div_cssStyle_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_required_placeholder_name_label_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_type_required_placeholder_name_label_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_password_required_placeholder_name_label_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_cssStyle_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_required_cssStyle_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_cssStyle_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_required_name_list_label_headerValue_headerKey_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_div_cssStyle_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_required_placeholder_name_label_cssClass.release();
    _jspx_tagPool_s_textfield_type_required_placeholder_name_label_cssClass_nobody.release();
    _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.release();
    _jspx_tagPool_s_div_cssStyle_cssClass_nobody.release();
    _jspx_tagPool_s_submit_value_required_cssStyle_cssClass_nobody.release();
    _jspx_tagPool_s_div_cssClass.release();
    _jspx_tagPool_s_form_cssStyle_action.release();
    _jspx_tagPool_s_select_required_name_list_label_headerValue_headerKey_cssClass.release();
    _jspx_tagPool_s_div_cssStyle_cssClass.release();
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <STYLE type=\"text/css\">  \n");
      out.write("        .errorMessage{color:red;}  \n");
      out.write("    </STYLE> \n");
      out.write("    </head>\n");
      out.write("     <body style=\" background-image: url('fondo2.jpg');\n");
      out.write("           background-size: 100%;\"\n");
      out.write("            >\n");
      out.write("    <!--<body style=\" background-image: url('fondo2.jpg');\">-->\n");
      out.write("    ");
      if (_jspx_meth_s_div_0(_jspx_page_context))
        return;
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("    </body>   \n");
      out.write("    \n");
      out.write("         ");
      out.write("\n");
      out.write("         \n");
      out.write("    \n");
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

  private boolean _jspx_meth_s_div_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_0 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_0.setPageContext(_jspx_page_context);
    _jspx_th_s_div_0.setParent(null);
    _jspx_th_s_div_0.setCssClass("container");
    _jspx_th_s_div_0.setCssStyle("margin-top:5%;");
    int _jspx_eval_s_div_0 = _jspx_th_s_div_0.doStartTag();
    if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_s_div_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_s_div_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("       \n");
        out.write("      \n");
        out.write("     ");
        int evalDoAfterBody = _jspx_th_s_div_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_0);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_0);
    return false;
  }

  private boolean _jspx_meth_s_div_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_1 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_1.setPageContext(_jspx_page_context);
    _jspx_th_s_div_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_1.setCssClass("row");
    _jspx_th_s_div_1.setCssStyle("margin-top:5%");
    int _jspx_eval_s_div_1 = _jspx_th_s_div_1.doStartTag();
    if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           ");
        if (_jspx_meth_s_div_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_1, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_div_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_1);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_1);
    return false;
  }

  private boolean _jspx_meth_s_div_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_2 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_2.setPageContext(_jspx_page_context);
    _jspx_th_s_div_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_1);
    _jspx_th_s_div_2.setCssClass("col align-self-start");
    _jspx_th_s_div_2.setCssStyle("color:white;");
    int _jspx_eval_s_div_2 = _jspx_th_s_div_2.doStartTag();
    if (_jspx_th_s_div_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_2);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_2);
    return false;
  }

  private boolean _jspx_meth_s_div_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_3 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_3.setPageContext(_jspx_page_context);
    _jspx_th_s_div_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_1);
    _jspx_th_s_div_3.setCssClass("col align-self-center");
    _jspx_th_s_div_3.setCssStyle("margin-top:5%;");
    int _jspx_eval_s_div_3 = _jspx_th_s_div_3.doStartTag();
    if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_3.doInitBody();
      }
      do {
        out.write("<h1 style=\"color:white;\n");
        out.write("                   font-family: 'Anton', sans-serif;\">NUEVO USUARIO</h1>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_3);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_3);
    return false;
  }

  private boolean _jspx_meth_s_div_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_4 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_4.setPageContext(_jspx_page_context);
    _jspx_th_s_div_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_1);
    _jspx_th_s_div_4.setCssClass("col align-self-end");
    _jspx_th_s_div_4.setCssStyle("color:white;");
    int _jspx_eval_s_div_4 = _jspx_th_s_div_4.doStartTag();
    if (_jspx_th_s_div_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_4);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_4);
    return false;
  }

  private boolean _jspx_meth_s_div_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_5 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_5.setPageContext(_jspx_page_context);
    _jspx_th_s_div_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_0);
    _jspx_th_s_div_5.setCssClass("row");
    int _jspx_eval_s_div_5 = _jspx_th_s_div_5.doStartTag();
    if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_s_div_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_div_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("             ");
        if (_jspx_meth_s_div_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_5, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_s_div_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_5);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_5);
    return false;
  }

  private boolean _jspx_meth_s_div_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_6 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_6.setPageContext(_jspx_page_context);
    _jspx_th_s_div_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_div_6.setCssClass("col-3  align-self-start");
    _jspx_th_s_div_6.setCssStyle("color:white;");
    int _jspx_eval_s_div_6 = _jspx_th_s_div_6.doStartTag();
    if (_jspx_th_s_div_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_6);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_6);
    return false;
  }

  private boolean _jspx_meth_s_div_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_7 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_7.setPageContext(_jspx_page_context);
    _jspx_th_s_div_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_div_7.setCssClass("col-6 align-self-center");
    _jspx_th_s_div_7.setCssStyle("color:white;\n                   font-family: 'Anton', sans-serif;");
    int _jspx_eval_s_div_7 = _jspx_th_s_div_7.doStartTag();
    if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_7.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                \n");
        out.write("                ");
        if (_jspx_meth_s_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_7, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_div_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_7);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass.reuse(_jspx_th_s_div_7);
    return false;
  }

  private boolean _jspx_meth_s_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_cssStyle_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_7);
    _jspx_th_s_form_0.setCssStyle("background-color: #1B2631;  padding: 50px;\n                   border-radius: 10px;\n                   opacity: 0.79; ");
    _jspx_th_s_form_0.setAction("registrausuario");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    \n");
        out.write("                    ");
        if (_jspx_meth_s_div_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_div_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                    ");
        if (_jspx_meth_s_div_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                \n");
        out.write("              \n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_cssStyle_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_cssStyle_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_div_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_8 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_8.setPageContext(_jspx_page_context);
    _jspx_th_s_div_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_8.setCssClass("form-group ");
    int _jspx_eval_s_div_8 = _jspx_th_s_div_8.doStartTag();
    if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_8.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        \n");
        out.write("                        ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <!-- ESTO PROVIENE DEL METODO validate del action-->\n");
        out.write("                        ");
        if (_jspx_meth_s_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_8, _jspx_page_context))
          return true;
        out.write("     \n");
        out.write("                        \n");
        out.write("                   ");
        int evalDoAfterBody = _jspx_th_s_div_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_8);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_8);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_required_placeholder_name_label_cssClass.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_8);
    _jspx_th_s_textfield_0.setLabel("Usuario");
    _jspx_th_s_textfield_0.setName("nombre");
    _jspx_th_s_textfield_0.setDynamicAttribute(null, "placeholder", new String("Ingrese usuario"));
    _jspx_th_s_textfield_0.setCssClass("form-control");
    _jspx_th_s_textfield_0.setRequired("required");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_eval_s_textfield_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_textfield_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_textfield_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_textfield_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                         \n");
        out.write("                         ");
        int evalDoAfterBody = _jspx_th_s_textfield_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_textfield_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_required_placeholder_name_label_cssClass.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_required_placeholder_name_label_cssClass.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_8);
    _jspx_th_s_if_0.setTest("getFieldErrors().get('fnombre')!=null");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            <div class=\"alert alert-danger mt-3\">\n");
        out.write("                              ");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                            </div>\n");
        out.write("                         ");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_property_0.setValue("getFieldErrors().get('fnombre')[0]");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_div_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_9 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_9.setPageContext(_jspx_page_context);
    _jspx_th_s_div_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_9.setCssClass("form-group");
    int _jspx_eval_s_div_9 = _jspx_th_s_div_9.doStartTag();
    if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_9.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        \n");
        out.write("                         ");
        if (_jspx_meth_s_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_9, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                        \n");
        out.write("                      \n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_9);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_9);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_type_required_placeholder_name_label_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_textfield_1.setLabel("Edad");
    _jspx_th_s_textfield_1.setName("edad");
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "placeholder", new String("Ingrese Edad"));
    _jspx_th_s_textfield_1.setDynamicAttribute(null, "type", new String("number"));
    _jspx_th_s_textfield_1.setCssClass("form-control");
    _jspx_th_s_textfield_1.setRequired("required");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_type_required_placeholder_name_label_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_type_required_placeholder_name_label_cssClass_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_1 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_1.setPageContext(_jspx_page_context);
    _jspx_th_s_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_9);
    _jspx_th_s_if_1.setTest("getFieldErrors().get('fedad')!=null");
    int _jspx_eval_s_if_1 = _jspx_th_s_if_1.doStartTag();
    if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                              <div class=\"alert alert-danger mt-3\">\n");
        out.write("                              ");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_1, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                              </div>\n");
        out.write("                         ");
        int evalDoAfterBody = _jspx_th_s_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_1);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_1);
    _jspx_th_s_property_1.setValue("getFieldErrors().get('fedad')[0]");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_div_10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_10 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_10.setPageContext(_jspx_page_context);
    _jspx_th_s_div_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_10.setCssClass("form-group");
    int _jspx_eval_s_div_10 = _jspx_th_s_div_10.doStartTag();
    if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_10, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_10);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_10);
    return false;
  }

  private boolean _jspx_meth_s_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_required_name_list_label_headerValue_headerKey_cssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_10);
    _jspx_th_s_select_0.setLabel("Género");
    _jspx_th_s_select_0.setName("genero");
    _jspx_th_s_select_0.setCssClass("form-control");
    _jspx_th_s_select_0.setHeaderValue("Seleccion un genero");
    _jspx_th_s_select_0.setHeaderKey("1");
    _jspx_th_s_select_0.setList("{'M','F'}");
    _jspx_th_s_select_0.setRequired("required");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_eval_s_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_select_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                           \n");
        out.write("                      ");
        int evalDoAfterBody = _jspx_th_s_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_required_name_list_label_headerValue_headerKey_cssClass.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_required_name_list_label_headerValue_headerKey_cssClass.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_2 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_2.setPageContext(_jspx_page_context);
    _jspx_th_s_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_10);
    _jspx_th_s_if_2.setTest("getFieldErrors().get('fgenero')!=null");
    int _jspx_eval_s_if_2 = _jspx_th_s_if_2.doStartTag();
    if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <div class=\"alert alert-danger mt-3\">\n");
        out.write("                              ");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_2, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                         </div>\n");
        out.write("                     ");
        int evalDoAfterBody = _jspx_th_s_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_2);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_2);
    _jspx_th_s_property_2.setValue("getFieldErrors().get('fgenero')[0]");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_div_11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_11 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_11.setPageContext(_jspx_page_context);
    _jspx_th_s_div_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_11.setCssClass("form-group");
    int _jspx_eval_s_div_11 = _jspx_th_s_div_11.doStartTag();
    if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                          ");
        if (_jspx_meth_s_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                          ");
        if (_jspx_meth_s_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_11, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_11);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_11);
    return false;
  }

  private boolean _jspx_meth_s_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_0 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_0.setPageContext(_jspx_page_context);
    _jspx_th_s_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_11);
    _jspx_th_s_password_0.setName("pass");
    _jspx_th_s_password_0.setLabel("Contraseña");
    _jspx_th_s_password_0.setCssClass("form-control");
    _jspx_th_s_password_0.setDynamicAttribute(null, "placeholder", new String("Escriba Contraseña"));
    _jspx_th_s_password_0.setRequired("required");
    int _jspx_eval_s_password_0 = _jspx_th_s_password_0.doStartTag();
    if (_jspx_eval_s_password_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_password_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_password_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_password_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_s_password_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_password_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.reuse(_jspx_th_s_password_0);
      return true;
    }
    _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.reuse(_jspx_th_s_password_0);
    return false;
  }

  private boolean _jspx_meth_s_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_3 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_3.setPageContext(_jspx_page_context);
    _jspx_th_s_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_11);
    _jspx_th_s_if_3.setTest("getFieldErrors().get('fpass')!=null");
    int _jspx_eval_s_if_3 = _jspx_th_s_if_3.doStartTag();
    if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                              <div class=\"alert alert-danger mt-3\">\n");
        out.write("                              ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_3, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                              </div>\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_s_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_3);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_3);
    _jspx_th_s_property_3.setValue("getFieldErrors().get('fpass')[0]");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_div_12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_12 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_12.setPageContext(_jspx_page_context);
    _jspx_th_s_div_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_12.setCssClass("form-group");
    int _jspx_eval_s_div_12 = _jspx_th_s_div_12.doStartTag();
    if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_12.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                          ");
        if (_jspx_meth_s_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                          ");
        if (_jspx_meth_s_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_12, _jspx_page_context))
          return true;
        out.write("  \n");
        out.write("                          \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_12);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_12);
    return false;
  }

  private boolean _jspx_meth_s_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:password
    org.apache.struts2.views.jsp.ui.PasswordTag _jspx_th_s_password_1 = (org.apache.struts2.views.jsp.ui.PasswordTag) _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.get(org.apache.struts2.views.jsp.ui.PasswordTag.class);
    _jspx_th_s_password_1.setPageContext(_jspx_page_context);
    _jspx_th_s_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_12);
    _jspx_th_s_password_1.setName("passrep");
    _jspx_th_s_password_1.setLabel("Repita Contraseña");
    _jspx_th_s_password_1.setCssClass("form-control");
    _jspx_th_s_password_1.setDynamicAttribute(null, "placeholder", new String("Repita Contraseña"));
    _jspx_th_s_password_1.setRequired("required");
    int _jspx_eval_s_password_1 = _jspx_th_s_password_1.doStartTag();
    if (_jspx_eval_s_password_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_password_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_password_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_password_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_s_password_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_password_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.reuse(_jspx_th_s_password_1);
      return true;
    }
    _jspx_tagPool_s_password_required_placeholder_name_label_cssClass.reuse(_jspx_th_s_password_1);
    return false;
  }

  private boolean _jspx_meth_s_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_4 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_4.setPageContext(_jspx_page_context);
    _jspx_th_s_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_12);
    _jspx_th_s_if_4.setTest("getFieldErrors().get('fpassr')!=null");
    int _jspx_eval_s_if_4 = _jspx_th_s_if_4.doStartTag();
    if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                              <div class=\"alert alert-danger mt-3\">\n");
        out.write("                              ");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_4, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                              </div>\n");
        out.write("                              \n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_s_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_4);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_4);
    _jspx_th_s_property_4.setValue("getFieldErrors().get('fpassr')[0]");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_div_13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_13 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssClass.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_13.setPageContext(_jspx_page_context);
    _jspx_th_s_div_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_div_13.setCssClass("form-group");
    int _jspx_eval_s_div_13 = _jspx_th_s_div_13.doStartTag();
    if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_div_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_div_13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_div_13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_div_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_div_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_div_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_13);
      return true;
    }
    _jspx_tagPool_s_div_cssClass.reuse(_jspx_th_s_div_13);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_required_cssStyle_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_13);
    _jspx_th_s_submit_0.setCssClass("btn btn-primary");
    _jspx_th_s_submit_0.setCssStyle("margin-right:20%;");
    _jspx_th_s_submit_0.setValue("REGISTRAR");
    _jspx_th_s_submit_0.setRequired("required");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_required_cssStyle_cssClass_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_required_cssStyle_cssClass_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_div_14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_div_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:div
    org.apache.struts2.views.jsp.ui.DivTag _jspx_th_s_div_14 = (org.apache.struts2.views.jsp.ui.DivTag) _jspx_tagPool_s_div_cssStyle_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.DivTag.class);
    _jspx_th_s_div_14.setPageContext(_jspx_page_context);
    _jspx_th_s_div_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_div_5);
    _jspx_th_s_div_14.setCssClass("col-3 align-self-end");
    _jspx_th_s_div_14.setCssStyle("color:white;");
    int _jspx_eval_s_div_14 = _jspx_th_s_div_14.doStartTag();
    if (_jspx_th_s_div_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_14);
      return true;
    }
    _jspx_tagPool_s_div_cssStyle_cssClass_nobody.reuse(_jspx_th_s_div_14);
    return false;
  }
}
