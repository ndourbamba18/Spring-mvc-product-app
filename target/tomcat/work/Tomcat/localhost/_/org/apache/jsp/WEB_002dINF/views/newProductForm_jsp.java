/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-11 14:32:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newProductForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navBar.jsp.jspf", Long.valueOf(1631318975611L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jsp.jspf", Long.valueOf(1631319468900L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jsp.jspf", Long.valueOf(1631285594837L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>SarayaTech | The Solution</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- LINK Bootdey -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@2.0.7/css/boxicons.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css\" integrity=\"sha256-2XFplPlrFClt0bIdPgpz8H7ojnk10H69xRqd9+uTShA=\" crossorigin=\"anonymous\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS LINK -->\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"/WEB-INF/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!--  \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write("        body {\r\n");
      out.write("            color: #566787;\r\n");
      out.write("            background: #f5f5f5;\r\n");
      out.write("            font-family: 'Varela Round', sans-serif;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("    <a class=\"navbar-brand d-inline-flex align-items-center\" href=\"/home\">\r\n");
      out.write("       <i class=\"fas fa-code d-inline-flex mr-2 avatar32 bg-info-dark shadow-sm text-primary-light rounded-circle align-items-center justify-content-center fs-1x\"></i> \r\n");
      out.write("       <span class=\"text-white fs-1x font500\">Product Management System</span> \r\n");
      out.write("    </a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor02\" aria-controls=\"navbarColor02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("       <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor02\">\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("             <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/home\" class=\"nav-link\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/about\" class=\"nav-link\">About Us <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/contact\" class=\"nav-link\">Contact Us <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("            <input type=\"search\" name=\"key\" id=\"searchName\" class=\"form-control mr-sm-2\" placeholder=\"Search products...\" required>\r\n");
      out.write("        </form>\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"/new-product\" class=\"nav-link\">Add New Product <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a href=\"\" class=\"nav-link\">Log Out <span class=\"sr-only\"></span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  body {\r\n");
      out.write("         color: #566787;\r\n");
      out.write("         background: #f5f5f5;\r\n");
      out.write("         font-family: 'Varela Round', sans-serif;\r\n");
      out.write("         font-size: 13px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("  .error \r\n");
      out.write("    {\r\n");
      out.write("        color: #ff0000;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("        <div class=\"mt-4\" align=\"center\">\r\n");
      out.write("          <h4>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"rows\">\r\n");
      out.write("          <div class=\"col-md-8 m-auto\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                 <form action=\"/save-product\" method=\"post\" >\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"name\" class=\"label-control\">PRODUCT NAME</label>\r\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ product.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" placeholder=\"Enter product name here\" required=\"required\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"price\" class=\"label-control\">PRODUCT PRICE</label>\r\n");
      out.write("                      <input type=\"text\" id=\"price\" name=\"price\" class=\"form-control\" placeholder=\"Enter product price here\" required=\"required\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"isStock\" class=\"label-control\">IS STOCK</label>\r\n");
      out.write("                        <input type=\"checkbox\" id=\"isStock\" name=\"isStock\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"description\" class=\"label-control\">PRODUCT DESCRIPTION</label>\r\n");
      out.write("                        <textarea name=\"description\" id=\"description\" rows=\"3\" class=\"form-control\" placeholder=\"Enter your description here\" cols=\"\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                       <label for=\"madeIn\" class=\"label-control\">MADE IN</label>\r\n");
      out.write("                       <input type=\"text\" id=\"madeIn\" name=\"madeIn\" class=\"form-control\" placeholder=\"Exemple : Senegal\" required=\"required\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                       <label for=\"brand\" class=\"label-control\">BRAND</label>\r\n");
      out.write("                       <input type=\"text\" id=\"brand\" name=\"brand\" class=\"form-control\" placeholder=\"brand ......\" required=\"required\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"imageUrl\" class=\"label-control\">IMAGE URL</label>\r\n");
      out.write("                        <input type=\"text\" id=\"imageUrl\" name=\"imageUrl\" class=\"form-control\" placeholder=\"https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg\" required=\"required\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-success\">SAVE PRODUCT</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER HERE -->\r\n");
      out.write("<div class=\"container mt-5 mb-5\">\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("<footer class=\"bg-light text-center text-lg-start mt-4\">\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("  <div class=\"container p-4\">\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase\">Footer text</h5>\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis\r\n");
      out.write("          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae\r\n");
      out.write("          aliquam voluptatem veniam, est atque cumque eum delectus sint!\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase\">Footer text</h5>\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis\r\n");
      out.write("          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae\r\n");
      out.write("          aliquam voluptatem veniam, est atque cumque eum delectus sint!\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\r\n");
      out.write("    ?? 2021 Copyright:\r\n");
      out.write("    <a class=\"text-dark\" href=\"https://www.linkedin.com/in/bamba-ndour-a46a8420a\">BAMBA NDOUR</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/newProductForm.jsp(23,14) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("lbl.page");
    // /WEB-INF/views/newProductForm.jsp(23,14) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setText("Add New Product");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }
}
