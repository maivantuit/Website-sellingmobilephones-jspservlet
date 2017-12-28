<%-- 
    Document   : checkoutsuccess
    Created on : Nov 28, 2017, 7:33:13 AM
    Author     : CỌP
--%>

<%@page import="modelclasses.HoaDon"%>
<%@page import="dao.KhachHangDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.HoaDonDAO"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="dao.ChiTietHoaDonDAO"%>
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
        <%
            KhachHang khachhang = (KhachHang) session.getAttribute("user");
            if (khachhang == null) { // chưa login, thì chuyển đến trang login mới đặt hàng được
                response.sendRedirect("/websiteshopcopdoan/login.jsp");
            }
            HoaDonDAO hoadondao = new HoaDonDAO();
            // lấy mã đh từ url, checkdonhang.jsp(kiểm tra đơn hàng)
            String makh2 = "";
            if (request.getParameter("makh2") != null) { // từ link url
                makh2 = request.getParameter("makh2");
            }

            ArrayList<HoaDon> listhoadon = HoaDonDAO.getListHoaDonHaveCode(makh2);
            KhachHangDao khachhangdao = new KhachHangDao();
            ChiTietHoaDonDAO chitiethoadondao = new ChiTietHoaDonDAO();
        %>

        <%-- Theo thứ tự --%>
        <jsp:include page="header.jsp"></jsp:include>        
            <div class="account">
                <h2 class="account-in">Chi tiết đơn hàng #</h2>
                <form action="HoaDonDatHangServlet" method="POST">                                   

                    <div id="thongtinkhachhangkhidathang">
                        <legend>Thông tin đơn hàng đã đặt của <%if (session.getAttribute("user") != null) {%><%= khachhang.getTenKH()%><%}%></legend>   
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã đơn hàng</th> <!--thêm link-->
                            <th class="data">Ngày mua</th>                            
                            <th class="data">Tổng tiền</th>  
                            <th class="data">Trạng thái đơn hàng</th>                               
                        </tr>
                        <%
                            int dem = 0;
                            for (HoaDon elemhd : listhoadon) {
                                dem++;
                        %>                                                                      
                        <tr class="data">
                            <td class="data" width="30px"><%= dem%></td>
                            <td class="data">
                                <%

                                    for (HoaDon cthd : chitiethoadondao.getListHoaDon(String.valueOf(elemhd.getMaDH()))) {
                                    %>
                                    <a href="/websiteshopcopdoan/checkdonhangdetail.jsp?madh3=<%= cthd.getMaDH()%>"><%= elemhd.getMaDH()%></a>
                                <%  }
                        %>  
                            </td>       
                        <td class="data"><%= elemhd.getNgayDat()%></td>
                        <td class="data"><%= elemhd.getTongTien()%></td>                            
                        <td class="data"><%= elemhd.getTrangthaigiaoHang()%></td>  
                                              
                        </tr>     
                        <%}%>
                    </table>
                </div>                                  
            </form>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
