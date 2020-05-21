package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Welcome</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"img/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"container-login100\">\n");
      out.write("\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30\">\n");
      out.write("\t\t\t<form class=\"login100-form validate-form\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <img src=\"img/logo2.jpg\" width=\"120px\" height=\"120px\" style=\"margin-top: -50px; border-radius: 60px;\">\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("\t\t\t\t<span class=\"login100-form-title p-b-37\">\n");
      out.write("\t\t\t\t\tForgot Password\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("                            <div class=\"wrap-input100 validate-input m-b-20\" data-validate=\"Enter ID\">\n");
      out.write("                                    <input class=\"input100\" type=\"text\" name=\"UserID\" placeholder=\"Enter Your ID\">\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container-login100-form-btn\">\n");
      out.write("                                    <a class=\"login100-form-btn\" href=\"showpass.jsp\" style=\"text-decoration: none;\">\n");
      out.write("\t\t\t\t\t\tSend\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                \n");
      out.write("                            <div style=\"margin-top: 20px;\">\n");
      out.write("                                <hr class=\"sidebar-divider my-0\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\" style=\"margin-top: 10px;\">\n");
      out.write("                                <div class=\"text-left\" >\n");
      out.write("                                    <a href=\"login.jsp\" class=\"txt2 hov1\">\n");
      out.write("\t\t\t\t\t\tSignIn\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <div class=\"text-right\" style=\"margin-left: 200px;\" >\n");
      out.write("                                    <a href=\"aboutus.jsp\" class=\"txt2 hov1\">\n");
      out.write("\t\t\t\t\t\tAbout Us\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\n");
      out.write("\t\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
