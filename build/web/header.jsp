<%-- 
    Document   : header
    Created on : Oct 25, 2017, 9:34:31 PM
    Author     : CỌP
--%>

<%@page import="dao.HoaDonDAO"%>
<%@page import="modelclasses.HoaDon"%>
<%@page import="modelclasses.Item"%>
<%@page import="java.util.Map"%>
<%@page import="modelclasses.GioHang"%>
<%@page import="modelclasses.KhachHang"%>
<%@page import="modelclasses.DanhMuc"%>
<%@page import="dao.DanhMucDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header</title>
    </head>
    <body>
        <!--jsp danh mục sản phẩm-->
        <%
            DanhMucDAO danhmucdao = new DanhMucDAO();
            KhachHang kh = null;
            if (session.getAttribute("user") != null) {
                kh = (KhachHang) session.getAttribute("user");
            }
            GioHang giohang = (GioHang) session.getAttribute("giohang"); // get tu cho no set
            if (giohang == null) {
                giohang = new GioHang();
                session.setAttribute("giohang", giohang);
            }
        %>
        <!--end jsp danh mục sản phẩm-->
        <!--header-->
        <div class="header">
            <div class="header-top">
                <div class="container">	
                    <div class="header-top-in">			
                        <div class="logo">
                            <a href="index.jsp"><img src="images/logo2.png" alt=" " ></a>
                        </div>
                        <div class="header-in">
                            <ul class="icon1 sub-icon1">                                                              
                                <% if (kh != null) {%>
                                <li ><a href="#" > <%= "Chào bạn: " + kh.getTenKH()%></a></li>
                                <li ><a href="logout.jsp" > Đăng xuất</a></li>
                                <li >

                                    <a href="/websiteshopcopdoan/checkdonhang.jsp?makh2=<%= kh.getMaKH()%>">Kiểm tra đơn hàng</a>&nbsp; | &nbsp;

                                </li>
                                <%}%>
                                <li ><a href="login.jsp" > Đăng nhập</a></li>
                                <li ><a href="register.jsp" > Đăng ký</a></li>



                                <li>
                                    <div class="cart">
                                        <a href="#" class="cart-in"> </a>
                                        <span> <%= giohang.DemKichThuocGioHang()%></span>
                                    </div>
                                    <ul class="sub-icon1 list">
                                        <h3>Số loại sản phẩm: <%= giohang.DemKichThuocGioHang()%></h3>
                                        <div class="shopping_cart">
                                            <% for (Map.Entry<Long, Item> list : giohang.getGiohangItems().entrySet()) {%>                                                                                                                                                   
                                            <div class="cart_box">
                                                <div class="message">
                                                    <div class="alert-close"> <a href="GioHangServlet?command=remove&maSP=<%= list.getValue().getSanPham().getMaSP()%>"></a></div> 
                                                    <div class="list_img">
                                                        <img src="images/iphone-6-plus-64gb128gb-nowatermark-190x190.jpg" class="img-responsive" alt=""></div> <!--ve anh y', ta co the dung <= list.getValue().getSanPham().getHinhAnh()%>-->
                                                    <div class="list_desc">
                                                        <h4>
                                                            <a><%= list.getValue().getSanPham().getTenSP()%></a>
                                                        </h4>
                                                        x<%= list.getValue().getSoLuong()%>
                                                        <span class="actual">
                                                            <%= list.getValue().getSanPham().getGia()%> VNĐ
                                                        </span>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>                                              
                                            <%}%>
                                        </div>
                                        <div class="total">
                                            <div class="total_left">TỔNG GIỎ HÀNG : </div>
                                            <div class="total_right"><%= giohang.TinhTongTienTrongGioHang()%> VNĐ</div>
                                            <div class="clearfix"> </div>
                                        </div>
                                        <div class="login_buttons">
                                            <div class="check_button"><a href="checkout.jsp">Đặt hàng</a></div>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="clearfix"></div>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
            <div class="header-bottom">
                <div class="container">
                    <div class="h_menu4">
                        <a class="toggleMenu" href="#">Menu</a>
                        <ul class="nav">
                            <li class="active"><a href="index.jsp"><i> </i>TRANG CHỦ</a></li>                            					
                            <li><a href="#" >LINK KIỆN</a></li>            
                            <li><a href="#" >TIN TỨC</a></li>						  				 
                            <li><a href="#" >KHUYẾN MÃI</a></li>
                            <li><a href="#" >Phones & PDAs </a></li>    
                            <li><a href="#" >CÔNG NGHỆ </a></li> 
                            <li><a href="contact.jsp" >LIÊN HỆ </a></li>                               
                            <li><a href="#" >  TRỢ GIÚP </a></li>
                        </ul>
                        <script type="text/javascript" src="js/nav.js"></script>
                    </div>
                </div>
            </div>
            <div class="header-bottom-in">
                <div class="container">
                    <div class="header-bottom-on">
                        <p class="wel"><a href="#">Chào bạn, bạn có thể đăng nhập hoặc tạo tài khoản.</a></p>
                        <div class="header-can">
                            <ul class="social-in">
                                <li><a href="#"><i> </i></a></li>
                                <li><a href="#"><i class="facebook"> </i></a></li>
                                <li><a href="#"><i class="twitter"> </i></a></li>					
                                <li><a href="#"><i class="skype"> </i></a></li>
                            </ul>	
                            <div class="down-top">		
                                <select class="in-drop">
                                    <option value="VND" class="in-of">VND</option>
                                    <option value="Euro" class="in-of">Euro</option>
                                    <option value="Yen" class="in-of">Yen</option>
                                </select>
                            </div>
                            <div class="search">
                                <form>
                                    <input type="text" value="Tìm kiếm" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                this.value = '';
                                            }" >
                                    <input type="submit" value="">
                                </form>
                            </div>

                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
