package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class billadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/../jsp/common/head.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/../jsp/common/foot.jsp");
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>超市订单管理系统</title>\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/public.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--头部-->\r\n");
      out.write("    <header class=\"publicHeader\">\r\n");
      out.write("        <h1>超市订单管理系统</h1>\r\n");
      out.write("        <div class=\"publicHeaderR\">\r\n");
      out.write("            <p><span>下午好！</span><span style=\"color: #fff21b\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.USER_CODE.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span> , 欢迎你！</p>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login.html\">退出</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("<!--时间-->\r\n");
      out.write("    <section class=\"publicTime\">\r\n");
      out.write("        <span id=\"time\">2015年1月1日 11:11  星期一</span>\r\n");
      out.write("        <a href=\"#\">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>\r\n");
      out.write("    </section>\r\n");
      out.write(" <!--主体内容-->\r\n");
      out.write(" <section class=\"publicMian \">\r\n");
      out.write("     <div class=\"left\">\r\n");
      out.write("         <h2 class=\"leftH2\"><span class=\"span1\"></span>功能列表 <span></span></h2>\r\n");
      out.write("         <nav>\r\n");
      out.write("             <ul class=\"list\">\r\n");
      out.write("                 <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/billlist.html\">订单管理</a></li>\r\n");
      out.write("              <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/providerlist.html\">供应商管理</a></li>\r\n");
      out.write("              <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/user.html\">用户管理</a></li>\r\n");
      out.write("              <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/pwdmodify.html\">密码修改</a></li>\r\n");
      out.write("              <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login.html\">退出系统</a></li>\r\n");
      out.write("             </ul>\r\n");
      out.write("         </nav>\r\n");
      out.write("     </div>\r\n");
      out.write("     <input type=\"hidden\" id=\"path\" name=\"path\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("     <input type=\"hidden\" id=\"referer\" name=\"referer\" value=\"");
      out.print(request.getHeader("Referer"));
      out.write('"');
      out.write('/');
      out.write('>');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"right\">\r\n");
      out.write("     <div class=\"location\">\r\n");
      out.write("         <strong>你现在所在的位置是:</strong>\r\n");
      out.write("         <span>订单管理页面 >> 订单添加页面</span>\r\n");
      out.write("     </div>\r\n");
      out.write("     <div class=\"providerAdd\">\r\n");
      out.write("         <form id=\"billForm\" name=\"billForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/billAdd.html\">\r\n");
      out.write("             <!--div的class 为error是验证错误，ok是验证成功-->\r\n");
      out.write("             <input type=\"hidden\" name=\"method\" value=\"add\">\r\n");
      out.write("             <div class=\"\">\r\n");
      out.write("                 <label for=\"billCode\">订单编码：</label>\r\n");
      out.write("                 <input type=\"text\" name=\"billCode\" class=\"text\" id=\"billCode\" value=\"\"> \r\n");
      out.write("\t\t\t\t <!-- 放置提示信息 -->\r\n");
      out.write("\t\t\t\t <font color=\"red\"></font>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <label for=\"productName\">商品名称：</label>\r\n");
      out.write("                 <input type=\"text\" name=\"productName\" id=\"productName\" value=\"\"> \r\n");
      out.write("\t\t\t\t <font color=\"red\"></font>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <label for=\"productUnit\">商品单位：</label>\r\n");
      out.write("                 <input type=\"text\" name=\"productUnit\" id=\"productUnit\" value=\"\"> \r\n");
      out.write("\t\t\t\t <font color=\"red\"></font>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <label for=\"productCount\">商品数量：</label>\r\n");
      out.write("                 <input type=\"text\" name=\"productCount\" id=\"productCount\" value=\"\"> \r\n");
      out.write("\t\t\t\t <font color=\"red\"></font>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <label for=\"totalPrice\">总金额：</label>\r\n");
      out.write("                 <input type=\"text\" name=\"totalPrice\" id=\"totalPrice\" value=\"\"> \r\n");
      out.write("\t\t\t\t <font color=\"red\"></font>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <label >供应商：</label>\r\n");
      out.write("                 <select name=\"providerId\" id=\"providerId\">\r\n");
      out.write("\t\t         </select>\r\n");
      out.write("\t\t\t\t <font color=\"red\"></font>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <label >是否付款：</label>\r\n");
      out.write("                 <input type=\"radio\" name=\"isPayment\" value=\"1\" checked=\"checked\">未付款\r\n");
      out.write("\t\t\t\t <input type=\"radio\" name=\"isPayment\" value=\"2\" >已付款\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"providerAddBtn\">\r\n");
      out.write("                  <input type=\"button\" name=\"add\" id=\"add\" value=\"保存\">\r\n");
      out.write("\t\t\t\t  <input type=\"button\" id=\"back\" name=\"back\" value=\"返回\" >\r\n");
      out.write("             </div>\r\n");
      out.write("         </form>\r\n");
      out.write("     </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    版权归北大青鸟\r\n");
      out.write("</footer>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/time.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/common.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/calendar/WdatePicker.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/billadd.js\"></script>");
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
