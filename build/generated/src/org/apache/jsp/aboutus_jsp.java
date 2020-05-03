package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!Doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!--css file-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/sb-admin-2.css\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/aboutus.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>About Us</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=team>\n");
      out.write("            <div class=\"container my-3 py-5 text-center\">\n");
      out.write("                <div class=\"row mb-5\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <h1>Our Team</h1>\n");
      out.write("                        <p class=\"mt-3\">It is a established fact that a reader will be\n");
      out.write("                            distracted by the readable content of a page when looking at its layouts\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <img src=\"img/LOGO.png\" alt=\"\" class=\"img-fluid rounded-circle w-50 mb-3\">\n");
      out.write("                                <h3>Arpit Katiyar</h3>\n");
      out.write("                                <h5>web developer</h5>\n");
      out.write("                                <p>lk;afsdh;ahdfk;lhdksfhoilakdfiuolaodfhaasdfh;akdshf</p>\n");
      out.write("                                <div class=\"d-flex flex-row justify-content-center\">\n");
      out.write("                                    <div class=\"p-4\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-facebook\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"p-4\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-twitter\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"p-4\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </body>\n");
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
