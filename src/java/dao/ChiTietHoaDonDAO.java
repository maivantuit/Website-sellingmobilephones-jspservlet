package dao;

import connection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelclasses.ChiTietHoaDon;
import modelclasses.DanhMuc;
import modelclasses.HoaDon;
import modelclasses.KhachHang;
import modelclasses.SanPham;

/**
 *
 * @author CỌP
 */
public class ChiTietHoaDonDAO {

    // thêm vào table chi tiết hóa đơn:
    public void InsertChiTietHoaDon(ChiTietHoaDon chitiethoadon) {
        try {
            Connection connect = DBConnect.getConnection();
            String sql = "insert into ChiTietDonHang(MaDH,MaSP,DonGia,SoLuong) values (?,?,?,?)";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setInt(1, chitiethoadon.getMaDH());
            ps.setInt(2, chitiethoadon.getMaSP());
            ps.setInt(3, chitiethoadon.getGia());
            ps.setInt(4, chitiethoadon.getSoLuong());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error query sql: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error common: " + ex.getMessage());
        }
    }
    // xem table hóa đơn theo 1 mã đơn hàng:
    public static ArrayList<HoaDon> getListHoaDon(String mahd) {
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from ChiTietDonHang where MaDH='" + mahd + "'";
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HoaDon cthd = new HoaDon();
                cthd.setMaDH(rs.getInt("MaDH"));               
                list.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    // xem table chi tiết hóa đơn theo 1 mã đơn hàng:
    public static ArrayList<ChiTietHoaDon> getListChiTietHoaDon(String mahd) {
        ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from ChiTietDonHang where MaDH='" + mahd + "'";
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaDH(rs.getInt("MaDH"));                
                cthd.setMaSP(rs.getInt("MaSP"));
                cthd.setGia(rs.getInt("DonGia"));
                cthd.setSoLuong(rs.getInt("SoLuong"));
                list.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    // get table ChiTietDonHang:
    public ArrayList<ChiTietHoaDon> getListChiTietHoaDonCaTable() {
        Connection connect = DBConnect.getConnection();
        String sql = "select * from ChiTietDonHang";
        ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon chitiethoadon = new ChiTietHoaDon();
                chitiethoadon.setMaDH(rs.getInt("MaDH"));
                chitiethoadon.setMaSP(rs.getInt("MaSP"));
                chitiethoadon.setGia(rs.getInt("DonGia"));
                chitiethoadon.setSoLuong(rs.getInt("SoLuong"));
                list.add(chitiethoadon);
            }
        } catch (SQLException ex) {
            System.out.println("Error SQLException: " + ex.getMessage());
        }
        return list;

    }

    public static void main(String[] args) throws SQLException {
        //new ChiTietHoaDonDAO().InsertChiTietHoaDon(new ChiTietHoaDon(103, 2, 99000000, 1));
        new ChiTietHoaDonDAO().getListChiTietHoaDon("108");
        ArrayList<ChiTietHoaDon> list = new ChiTietHoaDonDAO().getListChiTietHoaDonCaTable();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getMaSP());
        }
    }
}
