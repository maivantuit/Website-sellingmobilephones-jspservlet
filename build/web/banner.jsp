<%-- 
    Document   : banner
    Created on : Oct 25, 2017, 9:50:06 PM
    Author     : CỌP
--%>
<%@page import="dao.DanhMucDAO"%>
<%@page import="modelclasses.DanhMuc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>banner</title>
    </head>
    <body>
        <!--jsp danh mục sản phẩm-->
        <%
            DanhMucDAO danhmucdao = new DanhMucDAO();
        %>
        <!--end jsp danh mục sản phẩm-->
        <div class="banner-mat">
            <div class="container">
                <div class="danhmucsp">
                    <div id="menu">
                        <ul>         
                            <li id="danhmucsanpham"><a href="#">DANH MỤC SẢN PHẨM</a></li>   
                                <%
                                    for (DanhMuc dm : danhmucdao.getListDanhMuc()){
                                %>
                            <li><a href="product.jsp?danhmuc=<%= dm.getMaDMSP()%>"><%= dm.getTenDMSP()%></a></li>                                    
                                <%
                                    }
                                %>
                        </ul>
                    </div>
                </div>
                <div class="banner">
                    <!-- Slideshow 4 -->
                    <div class="slider">
                        <ul class="rslides" id="slider1">
                            <li><img src="images/banner2.png" alt="">
                            </li>
                            <li><img src="images/banner1.jpg" alt="">
                            </li>                                                        
                            <li><img src="images/banner.jpg" alt="">
                            </li>
                        </ul>
                    </div>
                </div>				
                <!-- //slider-->
            </div>
        </div>
    </body>
</html>
