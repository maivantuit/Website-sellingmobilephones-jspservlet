package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelclasses.GioHang;
import modelclasses.SanPham;
import dao.SanPhamDAO;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>product</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            SanPhamDAO sanphamdao = new SanPhamDAO();
            String madanhmuc = "";
            if (request.getParameter("danhmuc") != null) {
                madanhmuc = request.getParameter("danhmuc");
            }
            GioHang giohang = (GioHang) session.getAttribute("giohang");
            if (giohang == null) {
                giohang = new GioHang();
                session.setAttribute("giohang", giohang);
            }
        
      out.write("    \n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!---->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"content-top\">                                                                    \n");
      out.write("                        <h3 class=\"future\">SẢN PHẨM THEO DANH MỤC</h3>\n");
      out.write("\n");
      out.write("                        <div id=\"site-wrapper\">\n");
      out.write("                            <ul class=\"products homepage\">\n");
      out.write("                            ");
                                for (SanPham p : SanPhamDAO.getListSanPham(Integer.parseInt(madanhmuc))) {
                            
      out.write(" \n");
      out.write("                            <li class=\"preorder\">                                \n");
      out.write("                                <span class=\"tagimg \"></span> \n");
      out.write("                                <a href=\"single.jsp?maSP=");
      out.print( p.getMaSP());
      out.write("\"> \n");
      out.write("                                    <img src=\"images/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg\" width=\" 250px\" height=\"250px\" />\n");
      out.write("                                    <div class=\"thongtinchitiet\">\n");
      out.write("                                        <h3></h3>\n");
      out.write("                                        <h4 href=\"single.jsp?maSP=");
      out.print( p.getMaSP());
      out.write("\">                                             \n");
      out.write("                                            ");
      out.print( p.getTenSP());
      out.write("\n");
      out.write("                                            Giá:");
      out.print( p.getGia());
      out.write("                                           \n");
      out.write("                                        </h4> \n");
      out.write("                                        <span class=\"textkm\">\n");
      out.write("                                            Khuyến mãi trị giá đến \n");
      out.write("                                            <strong>500.000₫</strong>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"info\">\n");
      out.write("                                        <span>Màn hình: QuadHD, 5.1'</span>\n");
      out.write("                                        <span>HĐH: Android 4.4 (KitKat)</span> \n");
      out.write("                                        <span>CPU: 4 nhân 2.7GHz</span>\n");
      out.write("                                        <span>Camera: 16M</span>\n");
      out.write("                                        <span>Dung lượng pin: 3000mAh</span>\n");
      out.write("                                    </p>                                                                           \n");
      out.write("                                </a>         \n");
      out.write("                                <div class=\"muangay\" style=\"color: blue\">\n");
      out.write("                                    <a href=\"GioHangServlet?command=plus&maSP=");
      out.print( p.getMaSP());
      out.write("\">                                        \n");
      out.write("                                    Mua Ngay                                          \n");
      out.write("                                    </a>\n");
      out.write("                                </div>  \n");
      out.write("                                <!--href=\"GioHangServlet?command=plus&maSP=\n");
      out.write("                                <= p.getMaSP()%> themdau% , xoa the a la xuat hien chu mua ngay (doan nay den cho vao gio hang)\n");
      out.write("                                -->\n");
      out.write("                            </li>\t\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!---->\n");
      out.write("                <div class=\"content-middle\">\n");
      out.write("                    <h3 class=\"future\">SẢN PHẨM MỚI</h3>\n");
      out.write("                    <div id=\"site-wrapper\">\n");
      out.write("                        <ul class=\"products homepage\">\t\t\t\n");
      out.write("                            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-middle-in\">\n");
      out.write("                        <ul id=\"flexiselDemo1\">\t\t\t\n");
      out.write("                            <li><img src=\"images/ap.png\"/></li>\n");
      out.write("                            <li><img src=\"images/ap1.png\"/></li>\n");
      out.write("                            <li><img src=\"images/ap2.png\"/></li>\n");
      out.write("                            <li><img src=\"images/ap3.png\"/></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(window).load(function () {\n");
      out.write("                                $(\"#flexiselDemo1\").flexisel({\n");
      out.write("                                    visibleItems: 4,\n");
      out.write("                                    animationSpeed: 1000,\n");
      out.write("                                    autoPlay: true,\n");
      out.write("                                    autoPlaySpeed: 3000,\n");
      out.write("                                    pauseOnHover: true,\n");
      out.write("                                    enableResponsiveBreakpoints: true,\n");
      out.write("                                    responsiveBreakpoints: {\n");
      out.write("                                        portrait: {\n");
      out.write("                                            changePoint: 480,\n");
      out.write("                                            visibleItems: 1\n");
      out.write("                                        },\n");
      out.write("                                        landscape: {\n");
      out.write("                                            changePoint: 640,\n");
      out.write("                                            visibleItems: 2\n");
      out.write("                                        },\n");
      out.write("                                        tablet: {\n");
      out.write("                                            changePoint: 768,\n");
      out.write("                                            visibleItems: 3\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!---->\n");
      out.write("                <div class=\"content-bottom\">\n");
      out.write("                    <h3 class=\"future\">SẢN PHẨM GIẢM GIÁ</h3>\n");
      out.write("                    <div class=\"content-bottom-in\">\n");
      out.write("                        <ul id=\"flexiselDemo2\">\t\t\t\n");
      out.write("                            <li><div class=\"col-md men\">\n");
      out.write("                                    <a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi4.jpg\" alt=\"\" />\n");
      out.write("                                        <div class=\"compare in-compare\">\n");
      out.write("                                            <span>Add to Compare</span>\n");
      out.write("                                            <span>Add to Whislist</span>\n");
      out.write("                                        </div></a>\n");
      out.write("                                    <div class=\"top-content bag\">\n");
      out.write("                                        <h5><a href=\"single.html\">Symbolic Bag</a></h5>\n");
      out.write("                                        <div class=\"white\">\n");
      out.write("                                            <a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>4</span><span>0</span></p>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                </div></li>\n");
      out.write("                            <li><div class=\"col-md men\">\n");
      out.write("                                    <a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi5.jpg\" alt=\"\" />\n");
      out.write("                                        <div class=\"compare in-compare\">\n");
      out.write("                                            <span>Add to Compare</span>\n");
      out.write("                                            <span>Add to Whislist</span>\n");
      out.write("                                        </div></a>\t\n");
      out.write("                                    <div class=\"top-content bag\">\n");
      out.write("                                        <h5><a href=\"single.html\">Interesting Read</a></h5>\n");
      out.write("                                        <div class=\"white\">\n");
      out.write("                                            <a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>5</span></p>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                </div></li>\n");
      out.write("                            <li><div class=\"col-md men\">\n");
      out.write("                                    <a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi6.jpg\" alt=\"\" />\n");
      out.write("                                        <div class=\"compare in-compare\">\n");
      out.write("                                            <span>Add to Compare</span>\n");
      out.write("                                            <span>Add to Whislist</span>\n");
      out.write("                                        </div></a>\t\n");
      out.write("                                    <div class=\"top-content bag\">\n");
      out.write("                                        <h5><a href=\"single.html\">The Carter</a></h5>\n");
      out.write("                                        <div class=\"white\">\n");
      out.write("                                            <a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>1</span><span>0</span></p>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                </div></li>\n");
      out.write("                            <li><div class=\"col-md men\">\n");
      out.write("                                    <a href=\"single.html\" class=\"compare-in \"><img  src=\"images/pi7.jpg\" alt=\"\" />\n");
      out.write("                                        <div class=\"compare in-compare\">\n");
      out.write("                                            <span>Add to Compare</span>\n");
      out.write("                                            <span>Add to Whislist</span>\n");
      out.write("                                        </div></a>\t\n");
      out.write("                                    <div class=\"top-content bag\">\n");
      out.write("                                        <h5><a href=\"single.html\">Onesie</a></h5>\n");
      out.write("                                        <div class=\"white\">\n");
      out.write("                                            <a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>6</span><span>0</span></p>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                </div></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(window).load(function () {\n");
      out.write("                                $(\"#flexiselDemo2\").flexisel({\n");
      out.write("                                    visibleItems: 4,\n");
      out.write("                                    animationSpeed: 1000,\n");
      out.write("                                    autoPlay: true,\n");
      out.write("                                    autoPlaySpeed: 3000,\n");
      out.write("                                    pauseOnHover: true,\n");
      out.write("                                    enableResponsiveBreakpoints: true,\n");
      out.write("                                    responsiveBreakpoints: {\n");
      out.write("                                        portrait: {\n");
      out.write("                                            changePoint: 480,\n");
      out.write("                                            visibleItems: 1\n");
      out.write("                                        },\n");
      out.write("                                        landscape: {\n");
      out.write("                                            changePoint: 640,\n");
      out.write("                                            visibleItems: 2\n");
      out.write("                                        },\n");
      out.write("                                        tablet: {\n");
      out.write("                                            changePoint: 768,\n");
      out.write("                                            visibleItems: 3\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"start\">\n");
      out.write("                    <li ><a href=\"#\"><i></i></a></li>\n");
      out.write("                    <li><span>1</span></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">2</a></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">3</a></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">4</a></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">5</a></li>\n");
      out.write("                    <li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
}
