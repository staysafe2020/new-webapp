package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar - Brand -->\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"#\">\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                    <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">Staysafe</div>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Dashboard -->\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\">\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                    <span>Parent Module</span></a>\n");
      out.write("            </li>\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("            <!-- Heading -->\n");
      out.write("            <div class=\"sidebar-heading\">\n");
      out.write("                Items\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapsePages\">\n");
      out.write("                    <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                    <span>Pages</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">Main Pages</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"user.jsp\">User Profile</a>\n");
      out.write("                        <a class=\"collapse-item active\" href=\"#\">Result</a>\n");
      out.write("                        <h6 class=\"collapse-header\">Fees Section</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"fees.jsp\">Fees</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">Attendence</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"attendence.jsp\">Attendence</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">Notice Board</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"notice.jsp\">Notice</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"aboutus.jsp\">\n");
      out.write("                    <i class=\"fas fa-code\"></i>\n");
      out.write("                    <span>About US</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!--Divider-->\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Logout\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <!-- End of Sidebar -->\n");
      out.write("        <!-- Content Wrapper -->\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!-- Topbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand active\" href=\"#\">Result</a>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Navbar -->\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - User Information -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">User Name</span>\n");
      out.write("                                <img class=\"img-profile rounded-circle\" src=\"img/LOGO.png\">\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - User Information -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"userDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"user.jsp\">\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Profile\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Logout\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("                <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                <!-- Begin Page Content -->\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <!-- Area Chart -->\n");
      out.write("                        <div class=\"col-xl-8 col-lg-7\">\n");
      out.write("                            <div class=\"card shadow mb-4\">\n");
      out.write("                                <!-- Card Header - Dropdown -->\n");
      out.write("                                <div\n");
      out.write("                                    class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                    <h6 class=\"m-0 font-weight-bold text-primary\">Growth</h6>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Card Body -->\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"chart-area\">\n");
      out.write("                                        <canvas id=\"myAreaChart\"></canvas>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Pie Chart -->\n");
      out.write("                        <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("                            <div class=\"card shadow mb-4\">\n");
      out.write("                                <!-- Card Header - Dropdown -->\n");
      out.write("                                <div\n");
      out.write("                                    class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                    <h6 class=\"m-0 font-weight-bold text-primary\">Assesment</h6>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Card Body -->\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"chart-pie pt-4 pb-2\">\n");
      out.write("                                        <canvas id=\"myPieChart\"></canvas>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mt-4 text-center small\">\n");
      out.write("                                        <span class=\"mr-2\">\n");
      out.write("                                            <i class=\"fas fa-circle text-primary\"></i> Teachers\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"mr-2\">\n");
      out.write("                                            <i class=\"fas fa-circle text-success\"></i> Social\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"mr-2\">\n");
      out.write("                                            <i class=\"fas fa-circle text-info\"></i> Practicle\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--row content-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"card shadow\">\n");
      out.write("                                <div\n");
      out.write("                                    class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                    <h6 class=\"m-0 font-weight-bold text-primary\">Result Section</h6>\n");
      out.write("                                </div>\n");
      out.write("                                <!--card Body-->\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                    <!-- Page Heading -->\n");
      out.write("                                    <div class=\"justify-content-between mb-4\">\n");
      out.write("                                        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"><i\n");
      out.write("                                                class=\"fas fa-download fa-sm text-white-50\"></i> Download Report</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr class=\"sidebar-divider my-0\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"sticky-footer bg-white shadow\" style=\"margin-top: 50px;\">\n");
      out.write("                    <div class=\"container my-auto\">\n");
      out.write("                        <div class=\"copyright text-right my-auto\">\n");
      out.write("                            ©\n");
      out.write("                            <script>\n");
      out.write("                                document.write(new Date().getFullYear())\n");
      out.write("                            </script>\n");
      out.write("                            <a href=\"#\">StaySafe</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- End of Footer -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Scroll to Top Button-->\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Logout Modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("            aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"login.jsp\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level plugins -->\n");
      out.write("        <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level custom scripts -->\n");
      out.write("        <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"js/demo/chart-pie-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>");
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
