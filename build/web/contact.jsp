<%-- 
    Document   : contact
    Created on : Oct 26, 2017, 9:39:27 AM
    Author     : CỌP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LIỆN HỆ</title>
    </head>
    <body>
        <%-- Theo thứ tự --%>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="contact">
                    <h2 class=" contact-in">LIÊN HỆ</h2>

                    <div class="col-md-6 contact-top">
                        <h3>THÔNG TIN</h3>
                        <div class="map">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771"></iframe>
                        </div>

                        <p></p>
                        <p></p>				
                        <ul class="social ">
                            <li><span><i > </i>12 Nguyễn Hoàng - TT Cửa Việt - Gio Linh - Quảng Trị </span></li>
                            <li><span><i class="down"> </i>0977775487</span></li>
                            <li><a href="mailto:info@example.com"><i class="mes"> </i>maivantuit@gmail.com</a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 contact-top">                        
                        <div>
                            <span>Your Name </span>		
                            <input type="text" value="" >						
                        </div>
                        <div>
                            <span>Your Email </span>		
                            <input type="text" value="" >						
                        </div>
                        <div>
                            <span>Subject</span>		
                            <input type="text" value="" >	
                        </div>
                        <div>
                            <span>Your Message</span>		
                            <textarea> </textarea>	
                        </div>
                        <input type="submit" value="GỬI" >	
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
