
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });

                function check_username_ajax(username) {
                    $("#user-result").html('<img src="img/ajax-loader.gif" />');
                    $.post('CheckEmailServlet', {'username': username}, function (data) {
                        $("#user-result").html(data);
                    });
                }
            });
        </script>
    </head>
    <body>
        <%-- Theo thứ tự --%>
        <jsp:include page="header.jsp"></jsp:include>       
            <div class="container">
                <div class="account" id="dangkykhachhang">
                    <h2 class="account-in">Register</h2>
                    <form action="KhachHangServlet" method="POST">
                        <div>
                            <span>Họ và Tên</span>
                            <input type="text" name="hovaten">
                        </div> 
                        <div>
                            <span>Email</span>
                            <input type="text" name="email" id="email">
                            <span id="user-result"></span>                            
                        </div>
                        <div>
                            <span>Ngày sinh</span>
                            <select>
                                <option></option>
                                <option></option>
                                <option></option>
                            </select>

                            <select>
                                <option></option>
                                <option></option>
                                <option></option>
                            </select>

                            <select>
                                <option></option>
                                <option></option>
                                <option><option>
                            </select>
                        </div> 
                        <div>
                            <span>Giới tính</span>
                            <label>
                                <input type="radio"/>Nam
                            </label>
                            <label>
                                <input type="radio"/>Nữ
                            </label>
                        </div>
                        <div>
                            <span>Địa chỉ</span>
                            <input type="text" name="diachi">
                        </div>      
                         <div>
                            <span>Số điện thoại</span>
                            <input type="text" name="sodienthoai">
                        </div>  
                        <div> 
                            <span class="word">Password*</span>
                            <input type="password">
                        </div>	
                        <div> 
                            <span class="word">Nhập lại Password*</span>
                            <input type="password" name="pass">
                            <span></span>                    
                        </div>
                        <input type="hidden" value="insert" name="command">
                        <input type="submit" value="Đăng ký">   
                    </form>
                </div> 	                                
            </div>	           
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
