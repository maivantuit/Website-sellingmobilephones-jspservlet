<%-- 
    Document   : checkoutsuccess
    Created on : Nov 28, 2017, 7:33:13 AM
    Author     : CỌP
--%>

<%@page import="java.util.Map"%>
<%@page import="modelclasses.Item"%>
<%@page import="modelclasses.KhachHang"%>
<%@page import="modelclasses.GioHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>checkout success</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>       
        <%
            GioHang giohang = (GioHang) session.getAttribute("giohang");
            KhachHang khachhang = (KhachHang) session.getAttribute("user");
        %>
        <div style="height: 420px">
            <h3 style=" float: left">Chúc mừng bạn: <%= khachhang.getTenKH()%>  đã đặt hàng thành công</h3>       
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
