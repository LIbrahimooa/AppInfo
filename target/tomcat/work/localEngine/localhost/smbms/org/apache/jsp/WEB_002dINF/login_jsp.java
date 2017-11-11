package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>系统登录 - 超市订单管理系统</title>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t/* if(top.location!=self.location){\r\n");
      out.write("\t      top.location=self.location;\r\n");
      out.write("\t } */\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login_bg\">\r\n");
      out.write("    <section class=\"loginBox\">\r\n");
      out.write("        <header class=\"loginHeader\">\r\n");
      out.write("            <h1>超市订单管理系统</h1>\r\n");
      out.write("        </header>\r\n");
      out.write("        <section class=\"loginCont\">\r\n");
      out.write("\t        <form class=\"loginForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login.html\"  name=\"actionForm\" id=\"actionForm\"  method=\"post\" >\r\n");
      out.write("\t\t\t\t<div class=\"info\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div class=\"inputbox\">\r\n");
      out.write("                    <label for=\"user\">用户名：</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-text\" id=\"userCode\" name=\"userCode\" placeholder=\"请输入用户名\" required/>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"inputbox\">\r\n");
      out.write("                    <label for=\"mima\">密码：</label>\r\n");
      out.write("                    <input type=\"password\" id=\"userPassword\" name=\"userPassword\" placeholder=\"请输入密码\" required/>\r\n");
      out.write("                </div>\t\r\n");
      out.write("\t\t\t\t<div class=\"subBtn\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <input type=\"submit\" value=\"登录\"/>\r\n");
      out.write("                    <input type=\"reset\" value=\"重置\"/>\r\n");
      out.write("                </div>\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
