package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- //Almicke Navarro\n");
      out.write("//CST323\n");
      out.write("//January 17, 2021\n");
      out.write("//I used source from the following website:https://startbootstrap.com/theme/creative --> \n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- CSS Stylesheet -->\n");
      out.write("        <link href=\"resources/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light fixed-top py-3\" id=\"mainNav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Karaoke Machine</a>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto my-2 my-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"home\">Home</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"songList\">Song List</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"requestASong\">Request a Song</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Masthead-->\n");
      out.write("        <header class=\"masthead\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-center justify-content-center text-center\">\n");
      out.write("                    <div class=\"col-lg-10 align-self-end\">\n");
      out.write("                        <h1 class=\"text-uppercase text-white font-weight-bold\">Welcome to Karaoke Machine!</h1>\n");
      out.write("                        <hr class=\"divider my-4\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8 align-self-baseline\">\n");
      out.write("                        <p class=\"text-white-75 font-weight-light mb-5\">Sing to your heart's desire!</p>\n");
      out.write("                        <a class=\"btn btn-primary btn-xl js-scroll-trigger\" href=\"songList\">View Song List</a>\n");
      out.write("                        <a class=\"btn btn-primary btn-xl js-scroll-trigger\" href=\"requestASong\">Request a Song</a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"bg-light py-5\">\n");
      out.write("            <div class=\"container\"><div class=\"small text-center text-muted\">By Almicke Navarro</div></div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
