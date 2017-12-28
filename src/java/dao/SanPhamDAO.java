package dao;
import connection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelclasses.KhachHang;
import modelclasses.SanPham;

/**
 *
 * @author CỌP
 */
public class SanPhamDAO {
    
    // lấy danh sách sản phẩm:
    public static ArrayList<SanPham> getListSanPhamALL() {
        Connection connect = DBConnect.getConnection();
        String sql = "select * from SanPham";
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanpham = new SanPham();
                sanpham.setMaSP(rs.getInt("MaSP"));
                sanpham.setTenSP(rs.getString("TenSP"));
                sanpham.setMaDMSP(rs.getString("MaDMSP"));
                sanpham.setThuongHieu(rs.getString("ThuongHieu"));
                sanpham.setHinhAnh(rs.getString("HinhAnh"));
                sanpham.setGia(rs.getInt("Gia"));                
                list.add(sanpham);
            }
        } catch (SQLException ex) {
            System.out.println("Error SQLException: " + ex.getMessage());
        }
        return list;
    }
    // lấy danh sách sản phẩm:
    public static ArrayList<SanPham> getListSanPham(int madanhmuc) {
        Connection connect = DBConnect.getConnection();
        String sql = "select * from SanPham where MaDMSP='" + madanhmuc + "'";
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanpham = new SanPham();
                sanpham.setMaSP(rs.getInt("MaSP"));
                sanpham.setTenSP(rs.getString("TenSP"));
                sanpham.setMaDMSP(rs.getString("MaDMSP"));
                sanpham.setThuongHieu(rs.getString("ThuongHieu"));
                sanpham.setHinhAnh(rs.getString("HinhAnh"));
                sanpham.setGia(rs.getInt("Gia"));                
                list.add(sanpham);
            }
        } catch (SQLException ex) {
            System.out.println("Error SQLException: " + ex.getMessage());
        }
        return list;
    }

    // hiển thị thông tin sản phẩm: (thong tin co ban cua 1 san pham)
    public SanPham getSanPham(long masp) throws SQLException {
        Connection connect = DBConnect.getConnection();
        String sql = "select * from SanPham where MaSP='" + masp + "'";
        PreparedStatement ps = connect.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        SanPham sanpham = new SanPham();
        while (rs.next()) {
            sanpham.setMaSP(rs.getInt("MaSP"));
            sanpham.setTenSP(rs.getString("TenSP"));
            sanpham.setThuongHieu(rs.getString("ThuongHieu"));
            sanpham.setHinhAnh(rs.getString("HinhAnh"));
            sanpham.setGia(rs.getInt("Gia"));            
        }
        return sanpham;
    }

    // hiển thị chi tiết sản phẩm:(1 san pham co nhieu thong tin chi tiet) , co the mot so thong tin lien quan den gio hang nen tu tu. show, show = table
    public SanPham getChiTietSanPham(long masp) throws SQLException {
        Connection connect = DBConnect.getConnection();
        String sql = "select * from ChiTietSanPham where MaSP='" + masp + "'";
        PreparedStatement ps = connect.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        SanPham sanpham = new SanPham();
        while (rs.next()) {
            sanpham.setMaSP(rs.getInt("MaSP"));
            // tiep tuc cac cau hinh.
        }
        return sanpham;
    }
     // lay 1 khach hang table khach hang bang makh
    public SanPham getASanPham(int masp) {    
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from SanPham where MaSP=?";
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setLong(1, masp);
            ResultSet rs = ps.executeQuery();            
            SanPham sp = new SanPham();
            while (rs.next()) {                
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setThuongHieu(rs.getString("ThuongHieu"));
                sp.setGia(rs.getInt("Gia"));
                sp.setHinhAnh(rs.getString("HinhAnh"));                                    
            }
            return sp;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        SanPhamDAO sanphamdao = new SanPhamDAO();
        ArrayList<SanPham> list = sanphamdao.getListSanPham(10000);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getMaSP() + " - " + list.get(i).getTenSP());
        }
        for (SanPham item : list) {
            System.out.println(item.getMaSP() + " - " + item.getTenSP() + "- " + item.getGia());
        }
        //
        System.out.println("hien thi thong tin san pham: " + sanphamdao.getSanPham(1).getMaSP());
    }
}
