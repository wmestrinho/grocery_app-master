/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-01 05:14:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Bootstrap Example</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        padding-top: 40px;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("        background-color: #eee;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-signin {\n");
      out.write("        max-width: 330px;\n");
      out.write("        padding: 15px;\n");
      out.write("        margin: 0 auto;\n");
      out.write("    }\n");
      out.write("    .form-signin .form-signin-heading,\n");
      out.write("    .form-signin .checkbox {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("    .form-signin .checkbox {\n");
      out.write("        font-weight: normal;\n");
      out.write("    }\n");
      out.write("    .form-signin .form-control {\n");
      out.write("        position: relative;\n");
      out.write("        height: auto;\n");
      out.write("        -webkit-box-sizing: border-box;\n");
      out.write("        -moz-box-sizing: border-box;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        padding: 10px;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("    .form-signin .form-control:focus {\n");
      out.write("        z-index: 2;\n");
      out.write("    }\n");
      out.write("    .form-signin input[type=\"email\"] {\n");
      out.write("        margin-bottom: -1px;\n");
      out.write("        border-bottom-right-radius: 0;\n");
      out.write("        border-bottom-left-radius: 0;\n");
      out.write("    }\n");
      out.write("    .form-signin input[type=\"password\"] {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        border-top-left-radius: 0;\n");
      out.write("        border-top-right-radius: 0;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <form class=\"form-signin\" action=\"/login\" method=\"post\">\n");
      out.write("        <h2 class=\"form-signin-heading\">Please sign in</h2>\n");
      out.write("        <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\n");
      out.write("        <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" name=\"email\" required autofocus>\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required name=\"password\">\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("<script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /login.jsp(57,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${err_login_msg}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <div class=\"alert alert-warning\">\n");
        out.write("            Incorrect User and Password\n");
        out.write("        </div>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
