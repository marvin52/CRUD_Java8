package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.home.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public final class trataform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Formulário Enviado</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script> \n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
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
      out.write("\t<script>\n");
      out.write("\t\tfunction onClickEditarUsuario(element){\n");
      out.write("\t\t\tconsole.log(element);\n");
      out.write("\t\t\tvar id =  element.getAttribute(\"data-id\");\n");
      out.write("\t\t\tvar nome = element.getAttribute(\"data-nome\");\n");
      out.write("\t\t\tvar email = element.getAttribute(\"data-email\");\n");
      out.write("\t\t\tvar nascimento = element.getAttribute(\"data-nascimento\");\n");
      out.write("\t\t\tvar sexo = element.getAttribute(\"data-sexo\");\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdocument.getElementById(\"edit_id\").value= id;\n");
      out.write("\t\t\tdocument.getElementById(\"edit_nome\").value= nome;\n");
      out.write("\t\t\tdocument.getElementById(\"edit_email\").value= email;\n");
      out.write("\t\t\tdocument.getElementById(\"edit_data_nascimento\").value= nascimento;\n");
      out.write("\t\t\tdocument.getElementById(\"edit_sexo\").value= sexo;\t\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"/\">CRUD Simples</a>\n");
      out.write("  <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navb\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("<div class=\"container container-sm\">\n");
      out.write("<h2>Usuário cadastrados</h2>\n");

HashMap<String, ArrayList<Usuario>> map = Usuario.map;
map = map == null ? new HashMap<String, ArrayList<Usuario>>() : map;

ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) map.get("listaUsuarios"); 
listaUsuarios = listaUsuarios == null ? new ArrayList<Usuario>() : listaUsuarios;

Usuario novoUsuario = new Usuario();
novoUsuario.setNome(request.getParameter("nome"));
novoUsuario.setEmail(request.getParameter("email"));
novoUsuario.setDataNascimento(request.getParameter("data_nascimento"));
novoUsuario.setSexo("Masculino");

boolean containsNome = novoUsuario.getNome() != null && !novoUsuario.getNome().isEmpty();
boolean containsEmail = novoUsuario.getEmail() != null && !novoUsuario.getEmail().isEmpty();
boolean containsDataNascimento = novoUsuario.getDataNascimento() != null && !novoUsuario.getDataNascimento().isEmpty();

if(containsNome && containsEmail && containsDataNascimento){
	listaUsuarios.add(novoUsuario);
}

map.put("listaUsuarios", listaUsuarios);


      out.write("\n");
      out.write("\n");
      out.write("<table class=\"table\">\n");
      out.write("<thead>\n");
      out.write("<tr class=\"success\">\n");
      out.write("\t<th>Nome</th>\n");
      out.write("\t<th>E-mail</th>\n");
      out.write("\t<th>Data de nascimento</th>\n");
      out.write("\t<th>Sexo</th>\n");
      out.write("\t<th>Opções</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
 for (Usuario usuario : listaUsuarios) {
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>");
      out.print(usuario.getNome());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(usuario.getEmail());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(usuario.getDataNascimento());
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(usuario.getSexo());
      out.write("</td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<div id=\"div_opcoes\" class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" title=\"Editar usuário\" onclick=\"onClickEditarUsuario(this);\" data-toggle=\"modal\" data-target=\"#myModal\" data-id=\"");
      out.print(usuario.getId());
      out.write("\" data-nome=\"");
      out.print(usuario.getNome());
      out.write("\" data-email=\"");
      out.print(usuario.getEmail());
      out.write("\"\n");
      out.write("\t\t\t\t\tdata-nascimento=\"");
      out.print(usuario.getDataNascimento() );
      out.write("\" data-sexo=\"");
      out.print(usuario.getSexo() );
      out.write("\" class=\"btn btn-link\"><i class=\"fas fa-edit\"></i></button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t\t<form action=\"excluirUsuario\">\n");
      out.write("\t\t\t\t\t\t<input name=\"idUsuario\" type=\"hidden\" value=\"");
      out.print(usuario.getId());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" title=\"Excluir usuário\" class=\"btn btn-link\"><i class=\"fas fa-times\"></i></button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
}
      out.write("\n");
      out.write("</table>\n");
      out.write("<form action=\"index.jsp\">\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-primary\">Voltar</button>\n");
      out.write("</form>\n");
      out.write(" <!-- The Modal -->\n");
      out.write("  <div class=\"modal\" id=\"myModal\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("      \n");
      out.write("        <!-- Modal Header -->\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h4 class=\"modal-title\">Editar Usuário</h4>\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Modal body -->\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <form action=\"editarUsuario\" method=\"post\">\n");
      out.write("          \t<input type=\"hidden\" id=\"edit_id\" name=\"idUsuario\">\n");
      out.write("          \t<div class=\"form-group\">\n");
      out.write("          \t\t\t<label for=\"edit_nome\">Nome:</label>\n");
      out.write("          \t\t\t<input id=\"edit_nome\" class=\"form-control\" name=\"nome\">\n");
      out.write("          \t</div>\n");
      out.write("          \t \t<div class=\"form-group\">\n");
      out.write("          \t<label for=\"edit_email\">E-mail:</label>\n");
      out.write("          \t\t\t<input id=\"edit_email\" type=\"email\" class=\"form-control\" name=\"email\">\n");
      out.write("          \t\t\t \t</div>\n");
      out.write("          \t \t<div class=\"form-group\">\n");
      out.write("          \t\t\t<label for=\"edit_data_nascimento\">Data de nascimento</label>\n");
      out.write("          \t\t\t<input id=\"edit_data_nascimento\" type=\"date\" class=\"form-control\" name=\"dataNascimento\">\n");
      out.write("          \t\t\t \t</div>\n");
      out.write("          \t \t<div class=\"form-group\">\n");
      out.write("          \t\t\t<label for=\"edit_sexo\">Sexo:</label>\n");
      out.write("          \t\t\t<input id=\"edit_sexo\" class=\"form-control\" name=\"sexo\">\n");
      out.write("          \t\t</div>\n");
      out.write("          \t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Salvar\">\n");
      out.write("          \t\t<button type=\"reset\" class=\"btn btn-danger\" data-dismiss=\"modal\">Cancelar</button>\t\n");
      out.write("          </form>\n");
      out.write("        </div>        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
