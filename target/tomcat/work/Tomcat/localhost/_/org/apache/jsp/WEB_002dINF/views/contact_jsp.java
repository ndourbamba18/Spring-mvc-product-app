/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-12 10:47:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navBar.jsp.jspf", Long.valueOf(1631443615389L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jsp.jspf", Long.valueOf(1631319468900L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jsp.jspf", Long.valueOf(1631285594837L));
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
      out.write("                <span class=\"nav-link\">Hi, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"sr-only\"></span></span>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    background:#eee;\r\n");
      out.write("    margin-top:0px;\r\n");
      out.write("}\r\n");
      out.write("/*------- portfolio -------*/\r\n");
      out.write(".project {\r\n");
      out.write("  margin: 15px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-gutter .project {\r\n");
      out.write("  margin: 0 !important;\r\n");
      out.write("  padding: 0 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".has-spacer {\r\n");
      out.write("  margin-left: 30px;\r\n");
      out.write("  margin-right: 30px;\r\n");
      out.write("  margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".has-spacer-extra-space {\r\n");
      out.write("  margin-left: 30px;\r\n");
      out.write("  margin-right: 30px;\r\n");
      out.write("  margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".has-side-spacer {\r\n");
      out.write("  margin-left: 30px;\r\n");
      out.write("  margin-right: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-title {\r\n");
      out.write("  font-size: 1.25rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-skill {\r\n");
      out.write("  font-size: 0.9rem;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("  letter-spacing: 0.06rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-info-box {\r\n");
      out.write("  margin: 15px 0;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  padding: 30px 40px;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-info-box p {\r\n");
      out.write("  margin-bottom: 15px;\r\n");
      out.write("  padding-bottom: 15px;\r\n");
      out.write("  border-bottom: 1px solid #d5dadb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-info-box p:last-child {\r\n");
      out.write("  margin-bottom: 0;\r\n");
      out.write("  padding-bottom: 0;\r\n");
      out.write("  border-bottom: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*--- default effect ---*/\r\n");
      out.write(".hovereffect {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  float: left;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  z-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect .overlay {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("  background-color: rgba(0, 0, 0, 0.25);\r\n");
      out.write("  -webkit-transition: all .3s ease-in-out;\r\n");
      out.write("  transition: all .3s ease-in-out;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".primary-dark .hovereffect .overlay {\r\n");
      out.write("  background-color: rgba(215, 48, 39, 0.95);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white .hovereffect .overlay {\r\n");
      out.write("  background-color: rgba(255, 255, 255, 0.75);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dark-overlay .hovereffect .overlay {\r\n");
      out.write("  background-color: rgba(0, 0, 0, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect img {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  -webkit-transition: all .3s linear;\r\n");
      out.write("  transition: all .3s linear;\r\n");
      out.write("  border: 10px solid #fff;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-image-border .hovereffect img {\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-image-border.no-gutter .hovereffect img, .no-image-border.no-gutter .hovereffect .overlay {\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect:hover img {\r\n");
      out.write("  -webkit-transform: rotate(-7deg) scale(1.33);\r\n");
      out.write("  -ms-transform: rotate(-7deg) scale(1.33);\r\n");
      out.write("  transform: rotate(-7deg) scale(1.33);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .project-title-wrapper {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 45%;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  margin-top: -32px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  -webkit-transition: all .5s ease-in-out;\r\n");
      out.write("  transition: all .5s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project:hover .hovereffect-title .project-title-wrapper {\r\n");
      out.write("  top: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .project-title {\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  background: transparent;\r\n");
      out.write("  margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white .hovereffect-title .project-title {\r\n");
      out.write("  color: #171819;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title p {\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  background: transparent;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white .hovereffect-title p {\r\n");
      out.write("  color: #686c6d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .hover-icons {\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  background: transparent;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 10%;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  -webkit-transition: all .3s ease-in-out;\r\n");
      out.write("  transition: all .3s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project:hover .hovereffect-title .hover-icons {\r\n");
      out.write("  bottom: 15%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .hover-icons a {\r\n");
      out.write("  color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white .hovereffect-title .hover-icons a {\r\n");
      out.write("  color: #171819;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title.project-icons {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  bottom: -10px;\r\n");
      out.write("  -webkit-transition: all .5s ease-in-out;\r\n");
      out.write("  transition: all .5s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project:hover .hovereffect-title.project-icons {\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title.project-icons a {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  font-size: 11px;\r\n");
      out.write("  line-height: 40px;\r\n");
      out.write("  width: 45px;\r\n");
      out.write("  height: 38px;\r\n");
      out.write("  background: #8e9294;\r\n");
      out.write("  opacity: 0.75;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title.project-icons a i {\r\n");
      out.write("  margin-right: -2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title.project-icons a:first-child {\r\n");
      out.write("  background-color: #7c8284;\r\n");
      out.write("  margin-right: -4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-icons a:hover, .project-icons a:first-child:hover {\r\n");
      out.write("  background-color: #505254 !important;\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title.project-icons .hover-icons {\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  margin-top: 0;\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title.project-icons a:hover {\r\n");
      out.write("  background: #931c19;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".primary-dark .project-icons a {\r\n");
      out.write("  color: #d73027;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".primary-dark .project-icons a:hover {\r\n");
      out.write("  background-color: #efefef;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".primary-dark .project-icons a:hover {\r\n");
      out.write("  color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".primary-dark .hovereffect-title.project-icons .hover-icons {\r\n");
      out.write("  color: #d73027;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white .hovereffect-title .hover-icons {\r\n");
      out.write("  color: #171819;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white .hovereffect-title.project-icons .hover-icons {\r\n");
      out.write("  color: #171819;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .hover-icons a {\r\n");
      out.write("  opacity: 0.7;\r\n");
      out.write("  margin: 0 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .hover-icons a {\r\n");
      out.write("  opacity: 0.7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect-title .hover-icons a:hover {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hovereffect:hover .overlay {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("  filter: alpha(opacity=100);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boxed-portfolio .card {\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.025), 0 1px 4px rgba(0, 0, 0, 0.05) !important;\r\n");
      out.write("  box-shadow: 0 1px 4px rgba(0, 0, 0, 0.025), 0 1px 4px rgba(0, 0, 0, 0.05) !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boxed-portfolio .hovereffect img, .boxed-portfolio .hovereffect .overlay {\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-bottom-left-radius: 0;\r\n");
      out.write("  border-bottom-right-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boxed-portfolio .card-body {\r\n");
      out.write("  padding: 25px 30px;\r\n");
      out.write("  border-top: 1px solid #efefef;\r\n");
      out.write("}\r\n");
      out.write(".font-size-16, .fs-16 {\r\n");
      out.write("    font-size: 16px !important;\r\n");
      out.write("}\r\n");
      out.write(".font-weight-700, .fw-bold, .fw-500 {\r\n");
      out.write("    font-weight: 700 !important;\r\n");
      out.write("}\r\n");
      out.write(".card-title {\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write(".title-link, .title-link:focus {\r\n");
      out.write("    color: #171819;\r\n");
      out.write("}\r\n");
      out.write(".boxed-portfolio .card {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.025), 0 1px 4px rgba(0, 0, 0, 0.05) !important;\r\n");
      out.write("    box-shadow: 0 1px 4px rgba(0, 0, 0, 0.025), 0 1px 4px rgba(0, 0, 0, 0.05) !important;\r\n");
      out.write("}\r\n");
      out.write(".mb-0 {\r\n");
      out.write("    margin-bottom: 0 !important;\r\n");
      out.write("}\r\n");
      out.write(".card {\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write(".mt-5 {\r\n");
      out.write("    margin-top: 5px !important;\r\n");
      out.write("}\r\n");
      out.write(".mb-0 {\r\n");
      out.write("    margin-bottom: 0 !important;\r\n");
      out.write("}\r\n");
      out.write("p {\r\n");
      out.write("    font-family: \"Barlow\", sans-serif !important;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    color: #686c6d;\r\n");
      out.write("    letter-spacing: 0.03rem;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"rows mt-4\">\r\n");
      out.write("   <h2>Contact Page</h2>\r\n");
      out.write("    <div class=\"jumbotron mt-5 mb-5\">\r\n");
      out.write("      <h4 class=\"mt-2 mb-4\">Contact Us</h4>\r\n");
      out.write("      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero cum reiciendis vitae. Voluptatum, fugiat, corrupti mollitia unde\r\n");
      out.write("        quasi officia repudiandae consequatur corporis placeat eum, sed quibusdam delectus ullam tempora voluptates.</p>\r\n");
      out.write("      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero cum reiciendis vitae. Voluptatum, fugiat, corrupti mollitia unde\r\n");
      out.write("           quasi officia repudiandae consequatur corporis placeat eum, sed quibusdam delectus ullam tempora voluptates.</p>\r\n");
      out.write("      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero cum reiciendis vitae. Voluptatum, fugiat, corrupti mollitia unde quasi\r\n");
      out.write("                  officia repudiandae consequatur corporis placeat eum, sed quibusdam delectus ullam tempora voluptates.</p>\r\n");
      out.write("      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero cum reiciendis vitae. Voluptatum, fugiat, corrupti mollitia unde\r\n");
      out.write("       quasi officia repudiandae consequatur corporis placeat eum, sed quibusdam delectus ullam tempora voluptates.</p>\r\n");
      out.write("      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero cum reiciendis vitae. Voluptatum, fugiat, corrupti mollitia unde quasi officia repudiandae consequatur corporis placeat eum, sed quibusdam delectus ullam tempora voluptates.</p>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr> \r\n");
      out.write("</div>\r\n");
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
}
