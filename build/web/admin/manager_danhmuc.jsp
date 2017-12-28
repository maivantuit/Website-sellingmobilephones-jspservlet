<%@page import="modelclasses.DanhMuc"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DanhMucDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý danh mục</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
        <%
            DanhMucDAO danhmucdao = new DanhMucDAO();
            ArrayList<DanhMuc> listdanhmuc = danhmucdao.getListDanhMuc();

        %>


        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include> 
                <div id="rightContent">
                    <h3>Quản lý danh mục</h3>       

                    <a href="insert_danhmuc.jsp">Thêm danh mục mới</a>

                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data" >Mã danh mục</th>
                            <th class="data">Tên danh mục</th>                            
                            <th class="data" width="90px">Chức năng</th>
                        </tr>
                    <% 
                        int dem = 0;
                        for (DanhMuc elementsdanhmuc : listdanhmuc) {
                            dem++;
                    %>                                                                            
                    <tr class="data">
                        <td class="data" width="30px"><%= dem%></td>
                        <td class="data"><%= elementsdanhmuc.getMaDMSP()%></td>
                        <td class="data"><%= elementsdanhmuc.getTenDMSP()%></td>                            
                        <td class="data" width="90px">
                    <center>
                        <a href="/websiteshopcopdoan/admin/update_danhmuc.jsp?command=updateurl&MaDMSPurl=<%= elementsdanhmuc.getMaDMSP()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                        <a href="/websiteshopcopdoan/QuanLyDanhMucServlet?command=deleteurl&MaDMSPurl=<%= elementsdanhmuc.getMaDMSP()%>">Xóa</a>
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
