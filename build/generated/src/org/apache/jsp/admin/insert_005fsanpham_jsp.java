package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_005fsanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Manager SanPham</title>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("                             \n");
      out.write("\n");
      out.write("                <div id=\"rightContent\">\n");
      out.write("                    <h3>Form</h3>\n");
      out.write("\n");
      out.write("                    <div class=\"informasi\">\n");
      out.write("                        ini adalah notifikasi pertanda informasi\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"gagal\">\n");
      out.write("                        ini adalah notifikasi pertanda gagal\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"sukses\">\n");
      out.write("                        ini adalah notifikasi pertanda sukses\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <table width=\"95%\">\n");
      out.write("                        <tr><td width=\"125px\"><b>Input text pendek</b></td><td><input type=\"text\" class=\"pendek\"></td></tr>\n");
      out.write("                        <tr><td><b>Input text sedang</b></td><td><input type=\"text\" class=\"sedang\"></td></tr>\n");
      out.write("                        <tr><td><b>Input text panjang</b></td><td><input type=\"text\" class=\"panjang\"></td></tr>\n");
      out.write("                        <tr><td><b>Radio</b></td><td>\n");
      out.write("                                <input type=\"radio\" name=\"radio\" id=\"radio\" value=\"radio 1\">Radio 1\n");
      out.write("                                <input type=\"radio\" name=\"radio\" id=\"radio\" value=\"radio 2\">Radio 2\n");
      out.write("                            </td></tr>\n");
      out.write("                        <tr><td><b>Checkbox</b></td><td>\n");
      out.write("                                <input type=\"checkbox\" name=\"checkbox\" id=\"checkbox\" value=\"checkbox 1\">Checkbox 1<br>\n");
      out.write("                                <input type=\"checkbox\" name=\"checkbox\" id=\"checkbox\" value=\"checkbox 2\">Checkbox 2<br>\n");
      out.write("                                <input type=\"checkbox\" name=\"checkbox\" id=\"checkbox\" value=\"checkbox 3\">Checkbox 3<br>\n");
      out.write("                                <input type=\"checkbox\" name=\"checkbox\" id=\"checkbox\" value=\"checkbox 4\">Checkbox 4<br>\n");
      out.write("                            </td></tr>\n");
      out.write("                        <tr><td><b>Pilihan</b></td><td>\n");
      out.write("                                <select>\n");
      out.write("                                    <option selected>-- pilihan --</option>\n");
      out.write("                                    <option value=\"\">Pilihan</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td></tr>\n");
      out.write("                        <tr><td><b>Textarea</b></td><td><textarea></textarea></td></tr>\n");
      out.write("                        <tr><td></td><td>\n");
      out.write("                                <input type=\"button\" class=\"button\" value=\"Button\">\n");
      out.write("                                <input type=\"submit\" class=\"button\" value=\"Submit\">\n");
      out.write("                                <input type=\"reset\" class=\"button\" value=\"Reset\">\n");
      out.write("                            </td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"clear\"></div> \n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
