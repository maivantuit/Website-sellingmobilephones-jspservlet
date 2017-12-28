package controller;

import dao.KhachHangDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelclasses.KhachHang;
import tools.MD5;

/**
 *
 * @author CỌP
 */
public class KhachHangServlet extends HttpServlet {

    KhachHangDao khachhangdao = new KhachHangDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // bien comand de phan biejt giua cac xu ly:
        String command = request.getParameter("command");
        KhachHang kh = new KhachHang();
        HttpSession session = request.getSession();
        String url = "";
        switch (command) {//String tenKH, String matKhau, String diaChi, String email, String sdt
            case "insert"://(TenKH,MatKhau,NgaySinh,DiaChi,Email,SDT)                
                kh.setTenKH(request.getParameter("hovaten"));
                kh.setMatKhau(request.getParameter(MD5.encrytion("pass")));
                kh.setDiaChi(request.getParameter("diachi"));
                kh.setEmail(request.getParameter("email"));
                kh.setSdt(request.getParameter("sodienthoai"));
                khachhangdao.InsertKhachHang(kh);
                session.setAttribute("user", kh);//user tự đặt tại đây, tiếp tục tại header
                url = "/index.jsp";
                break;
            case "login":
                kh = khachhangdao.login(request.getParameter("email"), MD5.encrytion(request.getParameter("pass")));
                if (kh != null) {
                    session.setAttribute("user", kh);//user tự đặt tại đây, tiếp tục tại header
                    url = "/index.jsp";
                }else{
                    request.setAttribute("error", "Error email or password!");
                    url = "/login.jsp";
                }
                break;
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

}
