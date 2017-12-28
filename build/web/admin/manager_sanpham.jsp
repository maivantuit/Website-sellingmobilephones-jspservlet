<%-- 
    Document   : manager_sanpham
    Created on : Nov 28, 2017, 11:04:53 AM
    Author     : CỌP
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelclasses.SanPham"%>
<%@page import="dao.SanPhamDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager-sanpham</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%
            SanPhamDAO sanphamdao = new SanPhamDAO();
            ArrayList<SanPham> listsanpham = sanphamdao.getListSanPhamALL();
            
        %>
        
        
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý sản phẩm</h3>       
                    
                    <a href="insert_danhmuc.jsp">Thêm danh mục mới</a>
                    
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã danh mục</th>
                            <th class="data" >Mã sản phẩm</th>
                            <th class="data">Tên sản phẩm</th>                            
                            <th class="data">Thương hiệu</th> 
                            <th class="data">Giá(VNĐ)</th>     
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <%
                        int dem=0;
                        for (SanPham elementssanpham : listsanpham) {
                            dem++;                        
                    %>                                                                            
                        <tr class="data">
                            <td class="data" width="30px"><%= dem%></td>
                            <td class="data"><%= elementssanpham.getMaDMSP()%></td>
                            <td class="data"><%= elementssanpham.getMaSP()%></td>   
                            <td class="data"><%= elementssanpham.getTenSP()%></td> 
                            <td class="data"><%= elementssanpham.getThuongHieu()%></td> 
                            <td class="data"><%= elementssanpham.getGia()%></td> 
                            <td class="data" width="90px">
                                <center>
                                    <a href="/websiteshopcopdoan/admin/update_danhmuc.jsp?command=updateurl&MaDMSPurl=<%= elementssanpham.getMaDMSP()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                                    <a href="/websiteshopcopdoan/QuanLyDanhMucServlet?command=deleteurl&MaDMSPurl=<%= elementssanpham.getMaDMSP()%>">Xóa</a>
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
