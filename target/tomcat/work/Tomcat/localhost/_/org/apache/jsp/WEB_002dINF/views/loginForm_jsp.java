/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-11 01:54:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/../common/header.jsp.jspf", Long.valueOf(1631319468900L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("\r\n");
      out.write("     color: #566787;\r\n");
      out.write("     background: #f5f5f5;\r\n");
      out.write("     font-family: 'Varela Round', sans-serif;\r\n");
      out.write("     font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"rows mt-5\">\r\n");
      out.write("\t\t   <div align=\"center\" class=\"mt-4\">\r\n");
      out.write("\t\t     <h1>Log In Now</h1>\r\n");
      out.write("\t\t   </div> \r\n");
      out.write("\t\t   <h4 align=\"center\" style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ errorMessage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4> \r\n");
      out.write("\t\t   <div class=\"col-md-6 m-auto\">\r\n");
      out.write("\t\t       <div class=\"card mt-5\">\r\n");
      out.write("\t\t          <div class=\"card-body\">\r\n");
      out.write("\t\t             <form action=\"/save-login\" method=\"post\">\r\n");
      out.write("\t\t                <div class=\"form-group\">\r\n");
      out.write("\t\t                   <label for=\"username\">Username</label>\r\n");
      out.write("\t\t                   <input type=\"text\" id=\"username\" name=\"username\" class=\"form-control\" required=\"required\" autofocus=\"autofocus\">\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"form-group\">\r\n");
      out.write("\t\t                   <label for=\"password\">Password</label>\r\n");
      out.write("\t\t                   <input type=\"password\" id=\"password\" name=\"password\" class=\"form-control\" required=\"required\">\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"form-group\">\r\n");
      out.write("\t\t                   <button type=\"submit\" class=\"btn btn-success\">Log In</button>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t             </form>\r\n");
      out.write("\t\t          </div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
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
}
