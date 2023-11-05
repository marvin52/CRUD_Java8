package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/styles.jsp");
    _jspx_dependants.add("/cabecalho.jsp");
    _jspx_dependants.add("/rodape.jsp");
  }

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
      			"errors/errorPage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Cadastro de usuários</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\t");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        background-color: #ddd;\n");
      out.write("    }\n");
      out.write("    .container-sm {\n");
      out.write("        background-color: #fff;\n");
      out.write("        margin-top: 30px;\n");
      out.write("        padding: 15px;\n");
      out.write("    }\n");
      out.write("</style>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"/\">CRUD Simples</a>\n");
      out.write("  <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navb\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\t<div class=\"container-sm pt-3 my-3 border\">\n");
      out.write("\t<h3>Cadastro de usuários</h3>\n");
      out.write("\t<form action=\"trataform.jsp\" method=\"post\">\n");
      out.write("\t\t<div class=\"form-group\" style=\"margin-bottom: 0\">\n");
      out.write("\t\t<label for=\"nome_id\">Nome:</label>\n");
      out.write("\t\t<input required id=\"nome_id\" class=\"form-control\" type=\"text\" name=\"nome\"><br>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\" style=\"margin-bottom: 0\">\n");
      out.write("\t\t<label for=\"email_id\">E-mail:</label>\n");
      out.write("\t\t<input required id=\"email_id\" class=\"form-control\" type=\"email\" name=\"email\"><br>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\" style=\"margin-bottom: 0\">\n");
      out.write("\t\t\t<label for=\"data_nascimento_id\">Data de nascimento:</label>\n");
      out.write("\t\t<input required id=\"data_nascimento_id\"  class=\"form-control\" type=\"date\" name=\"data_nascimento\" value=\"Enviar\"><br>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<input type=\"submit\" class=\"btn btn-primary\"  value=\"Enviar\">\n");
      out.write("\t\t<a href=\"trataform.jsp\"><button class=\"btn btn-primary\" style=\"float: right\" type=\"button\">Usuários cadastrados</button></a>\n");
      out.write("\t</form>\n");
      out.write("\t");
      out.write("<hr>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
