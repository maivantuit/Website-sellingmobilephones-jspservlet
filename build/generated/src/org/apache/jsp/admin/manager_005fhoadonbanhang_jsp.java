package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelclasses.ChiTietHoaDon;
import dao.ChiTietHoaDonDAO;
import dao.KhachHangDao;
import java.util.ArrayList;
import modelclasses.HoaDon;
import dao.HoaDonDAO;

public final class manager_005fhoadonbanhang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản lý hóa đơn bán hàng</title>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");


            HoaDonDAO hoadondao = new HoaDonDAO();
            ArrayList<HoaDon> listhoadon = hoadondao.getListHoaDon();
            KhachHangDao khachhangdao = new KhachHangDao();
            ChiTietHoaDonDAO chitiethoadondao = new ChiTietHoaDonDAO();
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write(" \n");
      out.write("                <div id=\"rightContent\">\n");
      out.write("                    <h3>Quản lý hóa đơn bán hàng</h3>                  \n");
      out.write("                    <table class=\"data\">\n");
      out.write("                        <tr class=\"data\">\n");
      out.write("                            <th class=\"data\" width=\"30px\">STT</th>\n");
      out.write("                            <th class=\"data\" width=\"30px\">Mã hóa đơn </th>\n");
      out.write("                            <th class=\"data\">Mã khách Hàng</th>\n");
      out.write("                            <th class=\"data\">Tên khách hàng</th>\n");
      out.write("                            <th class=\"data\" width=\"30px\">Ngày đặt</th>\n");
      out.write("                            <th class=\"data\">Tổng tiền</th>\n");
      out.write("                            <th class=\"data\" width=\"75px\">Phương thức thanh toán</th>\n");
      out.write("                            <th class=\"data\" width=\"75px\">Địa chỉ giao hàng</th>\n");
      out.write("                            <th class=\"data\" width=\"75px\">Chức năng</th>\n");
      out.write("                        </tr>\n");
      out.write("                    ");

                        int dem = 0;
                        for (HoaDon elemhd : listhoadon) {
                            dem++;

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">");
      out.print( dem);
      out.write("</td>\n");
      out.write("                        <td class=\"data\" width=\"30px\">");
      out.print( elemhd.getMaDH());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print( elemhd.getMaKH());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print( khachhangdao.getAKhachHang(elemhd.getMaKH()).getTenKH());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print( elemhd.getNgayDat());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print( elemhd.getTongTien());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print( elemhd.getPhuongthucthanhToan());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print( elemhd.getDiaChi());
      out.write("</td>\n");
      out.write("                        <td class=\"data\" width=\"180px\">\n");
      out.write("                    <center>\n");
      out.write("                        ");

                            
                            for (HoaDon cthd :chitiethoadondao.getListHoaDon(String.valueOf(elemhd.getMaDH())) ) {
                        
      out.write("\n");
      out.write("                        <a href=\"/websiteshopcopdoan/admin/manager_chitiethoadonbanhang.jsp?madh=");
      out.print( cthd.getMaDH());
      out.write("\">Chi Tiết</a>&nbsp; | &nbsp;\n");
      out.write("                        ");
  }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <a href=\"#\">Xác nhận</a>\n");
      out.write("                        &nbsp; | &nbsp;\n");
      out.write("                        <a href=\"#\">Hủy</a>                            \n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>  \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div> \n");
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
