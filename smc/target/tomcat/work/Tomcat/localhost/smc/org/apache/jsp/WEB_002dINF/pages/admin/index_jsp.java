/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-22 05:35:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/pages/admin/./elements/menuLeft.jsp", Long.valueOf(1524373441289L));
    _jspx_dependants.put("/WEB-INF/pages/admin/./elements/footer.jsp", Long.valueOf(1524373441288L));
    _jspx_dependants.put("/WEB-INF/pages/admin/./elements/header.jsp", Long.valueOf(1524373441289L));
    _jspx_dependants.put("/WEB-INF/pages/admin/./elements/script.jsp", Long.valueOf(1524373441290L));
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("  <title>SB Admin - Start Bootstrap Template</title>\r\n");
      out.write("  <!-- Bootstrap core CSS-->\r\n");
      out.write("  <link href=\"../sources/admin/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Custom fonts for this template-->\r\n");
      out.write("  <link href=\"../sources/admin/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <!-- Page level plugin CSS-->\r\n");
      out.write("  <link href=\"../sources/admin/vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Custom styles for this template-->\r\n");
      out.write("  <link href=\"../sources/admin/css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"fixed-nav sticky-footer bg-dark\" id=\"page-top\">\r\n");
      out.write(" <!-- Navigation-->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\" id=\"mainNav\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.html\">SMC ADMIN</a>\r\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("      <ul class=\"navbar-nav navbar-sidenav\" id=\"exampleAccordion\">\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\r\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents\" data-parent=\"#exampleAccordion\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-phone\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Drashboard</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"navbar.html\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"cards.html\">News</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\r\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents\" data-parent=\"#exampleAccordion\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-home\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Store</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"navbar.html\">Add New</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"cards.html\">Update</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      \r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Charts\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-area-chart\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Charts</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Tables\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-table\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Product</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\r\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents\" data-parent=\"#exampleAccordion\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-wrench\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">User</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"navbar.html\">Navbar</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"cards.html\">Cards</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Example Pages\">\r\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseExamplePages\" data-parent=\"#exampleAccordion\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-file\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Example Pages</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseExamplePages\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"login.html\">Login Page</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"register.html\">Registration Page</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"forgot-password.html\">Forgot Password Page</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"blank.html\">Blank Page</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Menu Levels\">\r\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseMulti\" data-parent=\"#exampleAccordion\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-sitemap\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Menu Levels</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseMulti\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#\">Second Level Item</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#\">Second Level Item</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#\">Second Level Item</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a class=\"nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseMulti2\">Third Level</a>\r\n");
      out.write("              <ul class=\"sidenav-third-level collapse\" id=\"collapseMulti2\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"#\">Third Level Item</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"#\">Third Level Item</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"#\">Third Level Item</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Link\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-link\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Link</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"navbar-nav sidenav-toggler\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link text-center\" id=\"sidenavToggler\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-angle-left\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"messagesDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-envelope\"></i>\r\n");
      out.write("            <span class=\"d-lg-none\">Messages\r\n");
      out.write("              <span class=\"badge badge-pill badge-primary\">12 New</span>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"indicator text-primary d-none d-lg-block\">\r\n");
      out.write("              <i class=\"fa fa-fw fa-circle\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("            <h6 class=\"dropdown-header\">New Messages:</h6>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <strong>David Miller</strong>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <div class=\"dropdown-message small\">Hey there! This new version of SB Admin is pretty awesome! These messages clip off when they reach the end of the box so they don't overflow over to the sides!</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <strong>Jane Smith</strong>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <div class=\"dropdown-message small\">I was wondering if you could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <strong>John Doe</strong>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <div class=\"dropdown-message small\">I've sent the final files over to you for review. When you're able to sign off of them let me know and we can discuss distribution.</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item small\" href=\"#\">View all messages</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"alertsDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-bell\"></i>\r\n");
      out.write("            <span class=\"d-lg-none\">Alerts\r\n");
      out.write("              <span class=\"badge badge-pill badge-warning\">6 New</span>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"indicator text-warning d-none d-lg-block\">\r\n");
      out.write("              <i class=\"fa fa-fw fa-circle\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("            <h6 class=\"dropdown-header\">New Alerts:</h6>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <span class=\"text-success\">\r\n");
      out.write("                <strong>\r\n");
      out.write("                  <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\r\n");
      out.write("              </span>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <span class=\"text-danger\">\r\n");
      out.write("                <strong>\r\n");
      out.write("                  <i class=\"fa fa-long-arrow-down fa-fw\"></i>Status Update</strong>\r\n");
      out.write("              </span>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <span class=\"text-success\">\r\n");
      out.write("                <strong>\r\n");
      out.write("                  <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\r\n");
      out.write("              </span>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item small\" href=\"#\">View all alerts</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <form class=\"form-inline my-2 my-lg-0 mr-lg-2\">\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("              <input class=\"form-control\" type=\"text\" placeholder=\"Search for...\">\r\n");
      out.write("              <span class=\"input-group-append\">\r\n");
      out.write("                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                  <i class=\"fa fa-search\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-sign-out\"></i>Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       <div class=\"content-wrapper\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <!-- Breadcrumbs-->\r\n");
      out.write("      <ol class=\"breadcrumb\">\r\n");
      out.write("        <li class=\"breadcrumb-item\">\r\n");
      out.write("          <a href=\"index.html\">Dashboard</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"breadcrumb-item active\"></li>\r\n");
      out.write("      </ol>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12\">\r\n");
      out.write("          <h1>Blank</h1>\r\n");
      out.write("          <p>This is an example of a blank page that you can use as a starting point for creating new ones.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     </div>   \r\n");
      out.write("     ");
      out.write("<!-- /.content-wrapper-->\r\n");
      out.write("    <footer class=\"sticky-footer\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("          <small>Copyright © Your Website 2018</small>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Scroll to Top Button-->\r\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("      <i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Logout Modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("              <span aria-hidden=\"true\">×</span>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("            <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("    ");
      out.write("<!-- Bootstrap core JavaScript-->\r\n");
      out.write("    <script src=\"../sources/admin/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../sources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"../sources/admin/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("    <!-- Page level plugin JavaScript-->\r\n");
      out.write("    <script src=\"../sources/admin/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("    <script src=\"../sources/admin/vendor/datatables/jquery.dataTables.js\"></script>\r\n");
      out.write("    <script src=\"../sources/admin/vendor/datatables/dataTables.bootstrap4.js\"></script>\r\n");
      out.write("    <!-- Custom scripts for all pages-->\r\n");
      out.write("    <script src=\"../sources/admin/js/sb-admin.min.js\"></script>\r\n");
      out.write("    <!-- Custom scripts for this page-->\r\n");
      out.write("    <script src=\"../sources/admin/js/sb-admin-datatables.min.js\"></script>\r\n");
      out.write("    <script src=\"../sources/admin/js/sb-admin-charts.min.js\"></script>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
