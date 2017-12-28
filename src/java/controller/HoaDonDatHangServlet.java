package controller;

import com.sun.javafx.util.TempState;
import dao.ChiTietHoaDonDAO;
import dao.HoaDonDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelclasses.ChiTietHoaDon;
import modelclasses.GioHang;
import modelclasses.HoaDon;
import modelclasses.Item;
import modelclasses.KhachHang;
/**
 *
 * @author CỌP
 */
public class HoaDonDatHangServlet extends HttpServlet {

    // tao 2:
    private final HoaDonDAO hoadondao = new HoaDonDAO();
    private final ChiTietHoaDonDAO chitiethoadondao = new ChiTietHoaDonDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String diachi = request.getParameter("diachi");
        String hinhthucthanhtoan = request.getParameter("thanhtoan");
        HttpSession session = request.getSession();
        GioHang giohang = (GioHang) session.getAttribute("giohang");
        KhachHang khachhang = (KhachHang) session.getAttribute("user");
        try {
            HoaDon hoadon = new HoaDon();
            hoadon.setMaKH(khachhang.getMaKH());            
            hoadon.setPhuongthucthanhToan(hinhthucthanhtoan);                        
            hoadon.setDiaChi(diachi);            
            hoadon.setTongTien(giohang.TinhTongTienTrongGioHang());
            hoadondao.insertHoaDon(hoadon);            
            // getMaDH tai hoa don len, phai get id cuoi(tu dong tang)(demo cho co la de 1 id cuoi khong trung cai tren)
            // o day to lay ngay dat: no khong bao gio trung.
            HoaDon hoadon2 = new HoaDon();
            // luc nay get du lieu bang HoaDon da vua them.(gom co ... dac biet co NgayDat)
            //Timestamp ngaydat = hoadon2.getNgayDat();
            int madh = hoadondao.getMaDHShow();
            int dem=0;
            for (Map.Entry<Long, Item> list : giohang.getGiohangItems().entrySet()) {
                chitiethoadondao.InsertChiTietHoaDon(new ChiTietHoaDon(madh,
                        list.getValue().getSanPham().getMaSP(),
                        list.getValue().getSanPham().getGia(),
                        list.getValue().getSoLuong()));
                dem++;
            }            
            giohang = new GioHang();
            session.setAttribute("giohang", giohang);
            if(dem!=0){
                 response.sendRedirect("/websiteshopcopdoan/checkoutsuccess.jsp");
            }else{
                response.sendRedirect("/websiteshopcopdoan/index.jsp");
            }
        } catch (Exception e) {
        }
        
    }

}
