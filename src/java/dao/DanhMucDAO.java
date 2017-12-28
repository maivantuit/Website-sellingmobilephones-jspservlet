package dao;

import connection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import modelclasses.DanhMuc;

/**
 * @author CỌP
 */
public class DanhMucDAO {

    // lấy database danh mục sản phẩm:
    public ArrayList<DanhMuc> getListDanhMuc() {
        Connection connect = DBConnect.getConnection();
        String sql = "select * from DanhMucSanPham";
        ArrayList<DanhMuc> list = new ArrayList<DanhMuc>();
        try {
            PreparedStatement ps = connect.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc danhmuc = new DanhMuc();
                danhmuc.setMaDMSP(rs.getString("MaDMSP"));
                danhmuc.setTenDMSP(rs.getString("TenDMSP"));
                danhmuc.setMaNSX(rs.getString("MaNSX"));
                list.add(danhmuc);
            }
        } catch (SQLException ex) {
            System.out.println("Error SQLException: " + ex.getMessage());
        }
        return list;
       
    }

    // thêm mới một danh mục dữ liệu:
    public boolean InsertDanhMuc(DanhMuc danhmuc)  {
        try {
            Connection connect = DBConnect.getConnection();
            String sql = "insert into DanhMucSanPham(TenDMSP,MaNSX) values (?,?)";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, danhmuc.getTenDMSP());
            ps.setString(2, danhmuc.getMaNSX());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // cập nhật dữ liệu danh mục:
    public boolean UpdateDanhMuc(DanhMuc danhmuc){
        try {
            Connection connect = DBConnect.getConnection();
            String sql ="update DanhMucSanPham set TenDMSP=?, MaNSX=? where MaDMSP=?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, danhmuc.getTenDMSP());            
            ps.setString(2, danhmuc.getMaNSX());                  
            ps.setString(3, danhmuc.getMaDMSP());
            return ps.executeUpdate()==1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // xóa dữ liệu danh mục:
    public boolean  DeleteDanhMuc(String madanhmuc){
        try {
            Connection connect = DBConnect.getConnection();
            String sql ="delete DanhMucSanPham where MaDMSP=?";
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, madanhmuc);
            return ps.executeUpdate()==1;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {

        ///1.
//        DanhMucDAO dmd = new DanhMucDAO();
//        for (DanhMuc ds: dmd.getListDanhMuc()) {
//            System.out.println(ds.getMaDMSP()+ " - "+ ds.getTenDMSP());
//        }
        //DanhMucDAO dmd = new DanhMucDAO();
//        ArrayList<DanhMuc> list = dmd.getListDanhMuc();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getMaDMSP()+" - "+list.get(i).getTenDMSP());
//        }
        //2.Chèn 1 danh mục: hoặc có thể bỏ 1 vòng lặp for: chèn nhiều danh mục
        //InsertDanhMuc(DanhMuc danhmuc) // 
//        DanhMucDAO dmd = new DanhMucDAO();
//        for (int i = 0; i < 1; i++) {
//            dmd.InsertDanhMuc(new DanhMuc("DanhMucA", "NSX10"));
//        }
        /// 3. Update danh mục:
//        DanhMucDAO dmd = new DanhMucDAO();
//        dmd.UpdateDanhMuc(new DanhMuc("10013", "DanhMucAUpdate2", "NSX9"));
        ///4. Delete danhmuc:
//        DanhMucDAO dmd = new DanhMucDAO();
//        dmd.DeleteDanhMuc("10012");
    }
}
