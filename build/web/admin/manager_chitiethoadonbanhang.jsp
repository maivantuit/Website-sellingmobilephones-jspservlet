<%-- 
    Document   : manager_sanpham
    Created on : Nov 28, 2017, 11:04:53 AM
    Author     : CỌP
--%>

<%@page import="dao.SanPhamDAO"%>
<%@page import="modelclasses.ChiTietHoaDon"%>
<%@page import="dao.ChiTietHoaDonDAO"%>
<%@page import="dao.KhachHangDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelclasses.HoaDon"%>
<%@page import="dao.HoaDonDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý chi tiết hóa đơn bán hàng</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>

        <%

            ChiTietHoaDonDAO chitiethoadondao = new ChiTietHoaDonDAO();
            String madonhang ="";
            if(request.getParameter("madh")!=null){ // từ link url
                madonhang = request.getParameter("madh");
            }      

            SanPhamDAO sanphamdao = new SanPhamDAO();
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý hóa đơn bán hàng</h3>                  
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" width="30px">Mã hóa đơn </th>
                            <th class="data">Mã Sản Phẩm</th>
                            <th class="data">Tên sản phẩm</th>
                            <th class="data">Đơn giá</th>
                            <th class="data" width="30px">Số lượng</th>                           
                            <th class="data" width="30px">Chức năng</th>    
                        </tr>
                    <%
                        int dem=0;
                        for (ChiTietHoaDon c : ChiTietHoaDonDAO.getListChiTietHoaDon(madonhang)) {
                            dem++;                        
                    %>
                    <tr class="data">
                        <td class="data" width="30px"><%= dem%></td>
                        <td class="data" width="30px"><%= c.getMaDH()%></td>
                        <td class="data"><%= c.getMaSP()%></td>                        
                        <td class="data"><%= sanphamdao.getASanPham(c.getMaSP()).getTenSP()%></td>  
                        <td class="data"><%= c.getGia()%></td>
                        <td class="data"><%= c.getSoLuong()%></td>                
                        <td class="data" width="180px">
                        <center>                          
                            <a href="#">Xác nhận</a>
                            &nbsp; | &nbsp;
                            <a href="#">Hủy</a>                            
                        </center>
                        </td>
                    </tr>  
                    <%}%>
                </table>
            </div>
            <div class="clear"></div> 

            <jsp:include page="footer.jsp"></jsp:include> 
        </div>
    </body>
</html>
