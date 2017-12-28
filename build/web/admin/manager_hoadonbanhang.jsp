<%-- 
    Document   : manager_sanpham
    Created on : Nov 28, 2017, 11:04:53 AM
    Author     : CỌP
--%>

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
        <title>Quản lý hóa đơn bán hàng</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>

        <%
            HoaDonDAO hoadondao = new HoaDonDAO();
            ArrayList<HoaDon> listhoadon = hoadondao.getListHoaDon();
            KhachHangDao khachhangdao = new KhachHangDao();
            ChiTietHoaDonDAO chitiethoadondao = new ChiTietHoaDonDAO();
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
                            <th class="data">Mã khách Hàng</th>
                            <th class="data">Tên khách hàng</th>
                            <th class="data" width="30px">Ngày đặt</th>
                            <th class="data">Tổng tiền</th>
                            <th class="data" width="75px">Phương thức thanh toán</th>
                            <th class="data" width="75px">Địa chỉ giao hàng</th>
                            <th class="data" width="75px">Chức năng</th>
                        </tr>
                    <%
                        int dem = 0;
                        for (HoaDon elemhd : listhoadon) {
                            dem++;

                    %>


                    <tr class="data">
                        <td class="data" width="30px"><%= dem%></td>
                        <td class="data" width="30px"><%= elemhd.getMaDH()%></td>
                        <td class="data"><%= elemhd.getMaKH()%></td>
                        <td class="data"><%= khachhangdao.getAKhachHang(elemhd.getMaKH()).getTenKH()%></td>
                        <td class="data"><%= elemhd.getNgayDat()%></td>
                        <td class="data"><%= elemhd.getTongTien()%></td>
                        <td class="data"><%= elemhd.getPhuongthucthanhToan()%></td>
                        <td class="data"><%= elemhd.getDiaChi()%></td>
                        <td class="data" width="180px">
                    <center>
                        <%
                            
                            for (HoaDon cthd :chitiethoadondao.getListHoaDon(String.valueOf(elemhd.getMaDH())) ) {
                        %>
                        <a href="/websiteshopcopdoan/admin/manager_chitiethoadonbanhang.jsp?madh=<%= cthd.getMaDH()%>">Chi Tiết</a>&nbsp; | &nbsp;
                        <%  }
                        %>
                        
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
