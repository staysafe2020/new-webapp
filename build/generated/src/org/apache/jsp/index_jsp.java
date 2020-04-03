package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Staysafe</title>\n");
      out.write("        <!--this is the link for tab bar icon-->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"Untitled design.png\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css\">\n");
      out.write("\n");
      out.write("        <!--google font for highlight-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Amaranth|Bowlby+One+SC|Coda+Caption:800&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--this is the file of internal css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\">\n");
      out.write("\n");
      out.write("        <script src=\"index.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sidenav\">\n");
      out.write("            <div class=\"login-main-text\">\n");
      out.write("                <h2 id=\"wel\">Welcome</h2>\n");
      out.write("                <h2 id=\"to\">To</h2>\n");
      out.write("                <h2 id=\"stay\">Staysafe</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"col-md-6 \">\n");
      out.write("                <div class=\"card shadow\" style=\"border-radius: 15px; background-color: #000; margin-top: 200px;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <!--<img src=\"IMG-20200325-WA0034.jpg\" class=\"rounded-circle shadow\" width=\"150px\" height=\"150px\" alt=\"logo\">-->\n");
      out.write("                        <div class=\"login-form\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label style=\"color: #FFF;\">Email</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control shadow\" placeholder=\"User Name\" style=\"border-radius: 10px;\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label style=\"color: #FFF;\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control shadow\" placeholder=\"Password\" style=\"border-radius: 10px;\">\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-light btn-block shadow\" onclick=\"redi();\" style=\"border-radius: 10px;\">Login</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
