package dao;

import connection.DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelclasses.ChiTietHoaDon;
import modelclasses.HoaDon;
import modelclasses.KhachHang;

/**
 *
 * @author CỌP
 */
public class HoaDonDAO {

    public void insertHoaDon(HoaDon hoadon) {
        try {
            Connection connect = DBConnect.getConnection();
            String sql = "insert into DonHang(MaKH,PhuongThucThanhToan,DiaChiGiaoHang,TongTien)\n"
                    + "values(?,?,?,?)";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, hoadon.getMaKH());
            ps.setString(2, hoadon.getPhuongthucthanhToan());
            ps.setString(3, hoadon.getDiaChi());
            ps.setDouble(4, hoadon.getTongTien());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error query sql: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error common: " + ex.getMessage());
        }
    }

    // get table HoaDonDatHang:(DonHang)
    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> listhd = new ArrayList<HoaDon>();
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from DonHang";
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();            
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                hoadon.setMaDH(rs.getInt("MaDH"));
                hoadon.setMaKH(rs.getInt("MaKH"));
                hoadon.setNgayDat(rs.getTimestamp("NgayDat"));
                hoadon.setPhuongthucthanhToan(rs.getString("PhuongThucThanhToan"));
                hoadon.setDiaChi(rs.getString("DiaChiGiaoHang"));
                hoadon.setTongTien(rs.getInt("TongTien"));
                listhd.add(hoadon);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listhd;
    }
       // xem table Hóa đơn theo 1 mã khách hàng:
    public static ArrayList<HoaDon> getListHoaDonHaveCode(String makh) {
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from DonHang where MaKH='" + makh + "'";
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon cthd = new HoaDon();
                cthd.setMaDH(rs.getInt("MaDH"));
                cthd.setMaKH(rs.getInt("MaKH"));
                cthd.setMaND(rs.getInt("MaND"));
                cthd.setNgayDat(rs.getTimestamp("NgayDat"));
                cthd.setPhuongthucthanhToan(rs.getString("PhuongThucThanhToan"));
                cthd.setDiaChi(rs.getString("DiaChiGiaoHang"));
                cthd.setTrangthaigiaoHang(rs.getString("TrangThai"));
                cthd.setTongTien(rs.getInt("TongTien"));
                list.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    // xem table Hóa đơn theo 1 mã hóa đơn:
    public static ArrayList<HoaDon> getListHoaDonHaveCodeTheoMaHoaDon(String mahd) {
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from DonHang where MaDH='" + mahd + "'";
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon cthd = new HoaDon();
                cthd.setMaDH(rs.getInt("MaDH"));
                cthd.setMaKH(rs.getInt("MaKH"));
                cthd.setMaND(rs.getInt("MaND"));
                cthd.setNgayDat(rs.getTimestamp("NgayDat"));
                cthd.setPhuongthucthanhToan(rs.getString("PhuongThucThanhToan"));
                cthd.setDiaChi(rs.getString("DiaChiGiaoHang"));
                cthd.setTrangthaigiaoHang(rs.getString("TrangThai"));
                cthd.setTongTien(rs.getInt("TongTien"));
                list.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    // get MaNV
    public int getMaDHShow() {
        int madh = 0;
        try {
            Connection con = DBConnect.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT TOP 1 * FROM DonHang ORDER BY MaDH DESC";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                madh = rs.getInt("MaDH");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return madh;
    }

    public static void main(String[] args) throws SQLException {
        //(int maKH, int maND, double tongTien, String phuongthucthanhToan, String diaChi)
        //new HoaDonDAO().insertHoaDon(new HoaDon(1001, 11, 2000000, "Thanh toán khi nhận hàng", "TP Đà Nẵng2"));
//        HoaDonDAO h= new HoaDonDAO();
//        int a=h.getMaDHShow(1000);
//        System.out.println(a);
        HoaDonDAO h = new HoaDonDAO();
        ArrayList<HoaDon> list = h.getListHoaDon();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getTongTien());
        }

    }
}
