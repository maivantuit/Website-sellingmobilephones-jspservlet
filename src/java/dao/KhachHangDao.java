package dao;

import connection.DBConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelclasses.HoaDon;
import modelclasses.KhachHang;

/**
 *
 * @author CỌP
 */
public class KhachHangDao {

    // kiểm tra email tồn tại chưa:
    public boolean checkEmail(String email) {

        Connection connect = DBConnect.getConnection();
        String sql = "select * from KhachHang where Email='" + email + "'"; //quan trong dau: ''
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                connect.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // phương thức thêm tài khoản
    public boolean InsertKhachHang(KhachHang kh) {
        Connection connect = DBConnect.getConnection();
        String sql = "insert into KhachHang(TenKH,MatKhau,DiaChi,Email,SDT) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setString(1, kh.getTenKH());
            ps.setString(2, kh.getMatKhau());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getEmail());
            ps.setString(5, kh.getSdt());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
        return false;
    }
    // kiểm tra đăng nhập:

    public KhachHang login(String email, String password) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from KhachHang where Email='" + email + "' and MatKhau='" + password + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));// phải get lên mới set Attribute được.
                kh.setMatKhau(rs.getString("MatKhau"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setEmail(rs.getString("Email"));
                kh.setSdt(rs.getString("SDT"));
                con.close();
                return kh;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // lay 1 khach hang table khach hang bang makh
    public KhachHang getAKhachHang(int makh) {    
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from KhachHang where MaKH=?";
            PreparedStatement ps = connect.prepareCall(sql);
            ps.setLong(1, makh);
            ResultSet rs = ps.executeQuery();            
            KhachHang kh = new KhachHang();
            while (rs.next()) {                
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setMatKhau(rs.getString("MatKhau"));
                kh.setNgaySinh(rs.getString("NgaySinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setEmail(rs.getString("Email"));
                kh.setSdt(rs.getString("SDT"));                       
            }
            return kh;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    //
    // lay table khach hang:
    public ArrayList<KhachHang> getListKhachHang() {
        ArrayList<KhachHang> listkh = new ArrayList<KhachHang>();
        try {
            Connection connect = DBConnect.getConnection();
            String sql = " select * from KhachHang";
            PreparedStatement ps = connect.prepareCall(sql);            
            ResultSet rs = ps.executeQuery();            
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setMatKhau(rs.getString("MatKhau"));
                kh.setNgaySinh(rs.getString("NgaySinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setEmail(rs.getString("Email"));
                kh.setSdt(rs.getString("SDT"));
                listkh.add(kh);                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listkh;
    }

    public static void main(String[] args) throws SQLException {
        KhachHangDao k = new KhachHangDao();
//        boolean a = k.checkEmail("vuxuanquynh@gmail.com");
//        if (a == true) {
//            System.out.println("oke");
//        } else {
//            System.out.println("not");
//        }
        //k.InsertKhachHang(new KhachHang("Mai Van Cop", "123", "Quang Tri", "maivantuit123@gmail.com ", "0977775487"));
//        ArrayList<KhachHang> list = k.getListKhachHang();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getTenKH());
//        }
            k.getAKhachHang(1000);
            

    }
}
