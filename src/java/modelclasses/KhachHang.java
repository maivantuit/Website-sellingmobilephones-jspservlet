package modelclasses;

import java.sql.Date;

/**
 *
 * @author CỌP
 */
public class KhachHang {

    private int maKH;
    private String tenKH;    
    private String matKhau;
    private String ngaySinh;
    private String diaChi;
    private String email;
    private String sdt;

    public KhachHang() {
    }

    public KhachHang(String tenKH, String matKhau, String diaChi, String email, String sdt) {
        this.tenKH = tenKH;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
    }

    public KhachHang(int maKH, String tenKH, String matKhau, String diaChi, String email, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.matKhau = matKhau;

        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
    }

    public KhachHang(int maKH, String tenKH, String matKhau, String ngaySinh, String diaChi, String email, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.matKhau = matKhau;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
    
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}
