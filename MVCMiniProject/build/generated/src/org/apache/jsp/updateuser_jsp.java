package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    <meta name=\"description\" content=\"Affordable and professional web design\">\n");
      out.write("\t  <meta name=\"keywords\" content=\"web design, affordable web design, professional web design\">\n");
      out.write("  \t<meta name=\"author\" content=\"Brad Traversy\">\n");
      out.write("    <title>Notice | Register</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div id=\"branding\">\n");
      out.write("          <h1><a href=\"testsite1.html\">ON<span class=\"highlight\">BAS</span></a></h1>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <nav>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"about1.html\">About</a></li>\n");
      out.write("            <li><a href=\"services1.html\">Services</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section id=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <article id=\"main-col\">\n");
      out.write("            <div class=\"dark\">\n");
      out.write("                <div style=\"color: #e8491d\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            <h3>UPDATE YOUR PROFILE</h3>\n");
      out.write("            <form class=\"quote\" action=\"updateServlet\" method=\"post\">        \n");
      out.write("               <div>\n");
      out.write("                <input type=\"text\" name=\"uname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              </div>  \n");
      out.write("              <div>\n");
      out.write("                <input type=\"text\" name=\"lname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              </div>     \n");
      out.write("              <div>\n");
      out.write("                <input type=\"password\" name=\"pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              </div>  \n");
      out.write("               \n");
      out.write("              <div>   \n");
      out.write("                <input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <input type=\"text\" name=\"gender\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gend}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              </div>  \n");
      out.write("              <div>\n");
      out.write("                <input type=\"text\" name=\"dept\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dep}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("              </div> \n");
      out.write("              <button class=\"button_1\" type=\"submit\">Update Profile</button>\n");
      out.write("          </form>\n");
      out.write("          </div>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("        <aside id=\"sidebar\">\n");
      out.write("         \n");
      out.write("        </aside>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"newsletter\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h1>Subscribe To Our Newsletter</h1>\n");
      out.write("        <form>\n");
      out.write("          <input type=\"email\" placeholder=\"Enter Email...\">\n");
      out.write("          <button type=\"submit\" class=\"button_1\">Subscribe</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("      <p>Acme Web Deisgn, Copyright &copy; 2017</p>\n");
      out.write("    </footer>  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<h1>Please Register</h1>\n");
      out.write("<form action=\"register\" method=\"post\">\n");
      out.write("\tEnter firstname:<input type=\"text\" name=\"uname\"><br><br>\n");
      out.write("\tEnter lastname:<input type=\"text\" name=\"lname\"><br><br>\n");
      out.write("\tEnter Password:<input type=\"password\" name=\"pass\"><br><br>\n");
      out.write("\tEnter Email:<input type=\"text\" name=\"email\"><br><br>\t\n");
      out.write("\tEnter gender:<input type=\"text\" name=\"gender\"><br><br>\n");
      out.write("\tEnter Department:<input type=\"text\" name=\"dept\"><br><br>\n");
      out.write("\t\n");
      out.write("\t<input type=\"submit\" value=\"Register\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
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