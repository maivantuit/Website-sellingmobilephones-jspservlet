<%-- 
    Document   : product
    Created on : Oct 26, 2017, 9:35:18 AM
    Author     : CỌP
--%>

<%@page import="modelclasses.GioHang"%>
<%@page import="modelclasses.SanPham"%>
<%@page import="dao.SanPhamDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>product</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <!--theme-style-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <!--//fonts-->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function () {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>
        <%
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
        %>    

        <%-- Theo thứ tự --%>
        <jsp:include page="header.jsp"></jsp:include>
            <!---->
            <div class="container">
                <div class="content">
                    <div class="content-top">                                                                    
                        <h3 class="future">SẢN PHẨM THEO DANH MỤC</h3>

                        <div id="site-wrapper">
                            <ul class="products homepage">
                            <%                                for (SanPham p : SanPhamDAO.getListSanPham(Integer.parseInt(madanhmuc))) {
                            %> 
                            <li class="preorder">                                
                                <span class="tagimg "></span> 
                                <a href="single.jsp?maSP=<%= p.getMaSP()%>"> 
                                    <img src="images/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg" width=" 250px" height="250px" /><!-- có thể get thuộc tính hình ảnh tại đây.-->
                                    <div class="thongtinchitiet">
                                        <h3></h3>
                                        <h4 href="single.jsp?maSP=<%= p.getMaSP()%>">                                             
                                            <%= p.getTenSP()%>
                                            Giá:<%= p.getGia()%>                                           
                                        </h4> 
                                        <span class="textkm">
                                            Khuyến mãi trị giá đến 
                                            <strong>500.000₫</strong>
                                        </span>
                                    </div>
                                    <p class="info">
                                        <span>Màn hình: QuadHD, 5.1'</span>
                                        <span>HĐH: Android 4.4 (KitKat)</span> 
                                        <span>CPU: 4 nhân 2.7GHz</span>
                                        <span>Camera: 16M</span>
                                        <span>Dung lượng pin: 3000mAh</span>
                                    </p>                                                                           
                                </a>         
                                <div class="muangay" style="color: blue">
                                    <a href="GioHangServlet?command=plus&maSP=<%= p.getMaSP()%>">                                        
                                    Đặt hàng                                
                                    </a>
                                </div>  
                                <!--href="GioHangServlet?command=plus&maSP=
                                <= p.getMaSP()%> themdau% , xoa the a la xuat hien chu mua ngay (doan nay den cho vao gio hang)
                                -->
                            </li>	
                            <%
                                }
                            %>
                        </ul>
                    </div>



                </div>
                <!---->
                <div class="content-middle">
                    <h3 class="future">SẢN PHẨM MỚI</h3>
                    <div id="site-wrapper">
                        <ul class="products homepage">			
                            <%-- Comment 
                            <li class="preorder"><span class="tagimg "></span> <a
                                    href="detail.jsp?ma_san_pham="> 
                                    <img src="images/samsung-galaxy-s6-edge-64gb-200x200.jpg" width=" 250px" height="250px" />
                                    <div class="thongtinchitiet">
                                        <h3>Galaxy S6 Edge 64GB</h3>
                                        <h4>
                                            Giá:
                                            18.490.000 VNĐ
                                        </h4> 
                                        <span class="textkm">Khuyến mãi trị giá đến 
                                            <strong>500.000₫</strong>
                                        </span>
                                    </div>
                                    <p class="info">
                                        <span>Màn hình: QuadHD, 5.1'</span>
                                        <span>HĐH: Android 4.4 (KitKat)</span> 
                                        <span>CPU: 4 nhân 2.7GHz</span>
                                        <span>Camera: 16M</span>
                                        <span>Dung lượng pin: 3000mAh</span>
                                    </p>
                                    <div class="muangay">Mua Ngay</div>
                                </a></li>
                            --%>


                        </ul>
                    </div>
                    <div class="content-middle-in">
                        <ul id="flexiselDemo1">			
                            <li><img src="images/ap.png"/></li>
                            <li><img src="images/ap1.png"/></li>
                            <li><img src="images/ap2.png"/></li>
                            <li><img src="images/ap3.png"/></li>

                        </ul>
                        <script type="text/javascript">
                            $(window).load(function () {
                                $("#flexiselDemo1").flexisel({
                                    visibleItems: 4,
                                    animationSpeed: 1000,
                                    autoPlay: true,
                                    autoPlaySpeed: 3000,
                                    pauseOnHover: true,
                                    enableResponsiveBreakpoints: true,
                                    responsiveBreakpoints: {
                                        portrait: {
                                            changePoint: 480,
                                            visibleItems: 1
                                        },
                                        landscape: {
                                            changePoint: 640,
                                            visibleItems: 2
                                        },
                                        tablet: {
                                            changePoint: 768,
                                            visibleItems: 3
                                        }
                                    }
                                });

                            });
                        </script>
                        <script type="text/javascript" src="js/jquery.flexisel.js"></script>

                    </div>
                </div>
                <!---->
                <div class="content-bottom">
                    <h3 class="future">SẢN PHẨM GIẢM GIÁ</h3>
                    <div class="content-bottom-in">
                        <ul id="flexiselDemo2">			
                            <li><div class="col-md men">
                                    <a href="single.html" class="compare-in "><img  src="images/pi4.jpg" alt="" />
                                        <div class="compare in-compare">
                                            <span>Add to Compare</span>
                                            <span>Add to Whislist</span>
                                        </div></a>
                                    <div class="top-content bag">
                                        <h5><a href="single.html">Symbolic Bag</a></h5>
                                        <div class="white">
                                            <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                            <p class="dollar"><span class="in-dollar">$</span><span>4</span><span>0</span></p>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>							
                                </div></li>
                            <li><div class="col-md men">
                                    <a href="single.html" class="compare-in "><img  src="images/pi5.jpg" alt="" />
                                        <div class="compare in-compare">
                                            <span>Add to Compare</span>
                                            <span>Add to Whislist</span>
                                        </div></a>	
                                    <div class="top-content bag">
                                        <h5><a href="single.html">Interesting Read</a></h5>
                                        <div class="white">
                                            <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                            <p class="dollar"><span class="in-dollar">$</span><span>2</span><span>5</span></p>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>							
                                </div></li>
                            <li><div class="col-md men">
                                    <a href="single.html" class="compare-in "><img  src="images/pi6.jpg" alt="" />
                                        <div class="compare in-compare">
                                            <span>Add to Compare</span>
                                            <span>Add to Whislist</span>
                                        </div></a>	
                                    <div class="top-content bag">
                                        <h5><a href="single.html">The Carter</a></h5>
                                        <div class="white">
                                            <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                            <p class="dollar"><span class="in-dollar">$</span><span>1</span><span>0</span></p>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>							
                                </div></li>
                            <li><div class="col-md men">
                                    <a href="single.html" class="compare-in "><img  src="images/pi7.jpg" alt="" />
                                        <div class="compare in-compare">
                                            <span>Add to Compare</span>
                                            <span>Add to Whislist</span>
                                        </div></a>	
                                    <div class="top-content bag">
                                        <h5><a href="single.html">Onesie</a></h5>
                                        <div class="white">
                                            <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                            <p class="dollar"><span class="in-dollar">$</span><span>6</span><span>0</span></p>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>							
                                </div></li>

                        </ul>
                        <script type="text/javascript">
                            $(window).load(function () {
                                $("#flexiselDemo2").flexisel({
                                    visibleItems: 4,
                                    animationSpeed: 1000,
                                    autoPlay: true,
                                    autoPlaySpeed: 3000,
                                    pauseOnHover: true,
                                    enableResponsiveBreakpoints: true,
                                    responsiveBreakpoints: {
                                        portrait: {
                                            changePoint: 480,
                                            visibleItems: 1
                                        },
                                        landscape: {
                                            changePoint: 640,
                                            visibleItems: 2
                                        },
                                        tablet: {
                                            changePoint: 768,
                                            visibleItems: 3
                                        }
                                    }
                                });

                            });
                        </script>
                    </div>
                </div>
                <ul class="start">
                    <li ><a href="#"><i></i></a></li>
                    <li><span>1</span></li>
                    <li class="arrow"><a href="#">2</a></li>
                    <li class="arrow"><a href="#">3</a></li>
                    <li class="arrow"><a href="#">4</a></li>
                    <li class="arrow"><a href="#">5</a></li>
                    <li ><a href="#"><i  class="next"> </i></a></li>
                </ul>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
