<%-- 
    Document   : Detail
    Created on : Nov 23, 2017, 10:34:34 PM
    Author     : CỌP
--%>

<%@page import="modelclasses.SanPham"%>
<%@page import="dao.SanPhamDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>single-detail</title>
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
            SanPham sanpham = new SanPham();
            String masp = "";
            if(request.getParameter("maSP")!=null){ // String: lay tu url.
                masp = request.getParameter("maSP");
                sanpham = sanphamdao.getSanPham(Long.parseLong(masp));
            }
        %>
        <%-- Theo thứ tự --%>
        <jsp:include page="header.jsp"></jsp:include>

            <!---->
            <div class="container">
                <div class="single">
                    <div class="col-md-9 top-in-single">
                        <div class="col-md-5 single-top">	
                            <ul id="etalage">
                                <li>
                                    <a href="optionallink.html">
                                        <img class="etalage_thumb_image img-responsive" src="images/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg" alt="" >									
                                    </a>
                                </li>							
                            </ul>

                        </div>	
                        <div class="col-md-7 single-top-in">
                            <div class="single-para">
                                <h4><%= sanpham.getTenSP()%></h4>
                                <div class="para-grid">
                                    <span  class="add-to">Giá: <%= sanpham.getGia()%></span>
                                    <div class="check_button"><a href="GioHangServlet?command=plus&maSP=<%= sanpham.getMaSP()%>"> Đặt hàng</a></div 				
                                    <div class="clearfix"></div>
                                </div>
                                    <h2 style="font-size: 16px"><a>Bảo hành: 12 Months</a></h2 
                                    <h2 style="font-size: 16px"><a>Hoặc mua trả góp 0% bằng thẻ tín dụng chỉ từ 1.402.167 VND/tháng</a></h2>
                                <div class="available">
                                    <h2>Hiển thị bảng chi tiết sản phẩm</h2>
                                </div>
                                <p>Mô tả sản phẩm.</p>                             
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                        <div class="content-top-in">                            
                            <h2>show các sản phẩm khác</h2>
                            <div class="clearfix"></div>
                        </div>
                         <div class="content-top-in">                            
                            <h2>show bình luận về sản phẩm</h2>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="single-bottom">
                            <h4>Danh mục tiêu biểu</h4>
                            <ul>
                                <li><a href="#"><i> </i>Iphone</a></li>
                                <li><a href="#"><i> </i>Sam Sung</a></li>
                                <li><a href="#"><i> </i>HTC</a></li>                                
                            </ul>
                        </div>
                        <div class="single-bottom">
                            <h4>Sản phẩm bán chạy</h4>
                            <ul>
                                <li><a href="#"><i> </i>Apple iPhone 8 64GB (Vàng) - Hàng nhập khẩu  </a></li>
                                <li><a href="#"><i> </i>Samsung Galaxy J7 Pro 2017 32GB Ram 3GB (Bạc Xanh) </a></li>
                                <li><a href="#"><i> </i> Apple iPhone 8 Plus 64GB (Xám) </a></li>
                                <li><a href="#"><i> </i>Apple iPhone 8 64GB (Vàng) - Hàng nhập khẩu  </a></li>                                
                            </ul>
                        </div>
                        <div class="single-bottom">
                            <h4>Sản phẩm mới</h4>
                            <div class="product">
                                <img class="img-responsive fashion" src="images/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg" alt="">
                                <div class="grid-product">
                                    <a href="#" class="elit">Apple iPhone 8 64GB (Vàng) - Hàng nhập khẩu </a>
                                    <span class="price price-in"><small>$500.00</small> $400.00</span>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                            <div class="product">
                                <img class="img-responsive fashion" src="images/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg" alt="">
                                <div class="grid-product">
                                    <a href="#" class="elit">Apple iPhone 8 64GB (Vàng) - Hàng nhập khẩu </a>
                                    <span class="price price-in"><small>$500.00</small> $400.00</span>
                                </div>
                                <div class="clearfix"> </div>
                            </div>                           
                        </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <!---->

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
