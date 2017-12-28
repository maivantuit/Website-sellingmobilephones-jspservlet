package modelclasses;

/**
 *
 * @author CỌP
 */
public class SanPham {
    private int maSP;
    private String tenSP;
    private String maDMSP;
    private String thuongHieu;
    private String hinhAnh;
    private int gia;    

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, String maDMSP, String thuongHieu, String hinhAnh, int gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maDMSP = maDMSP;
        this.thuongHieu = thuongHieu;
        this.hinhAnh = hinhAnh;
        this.gia = gia;        
    }

    public int getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getMaDMSP() {
        return maDMSP;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public int getGia() {
        return gia;
    }


    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setMaDMSP(String maDMSP) {
        this.maDMSP = maDMSP;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
 
    
    

}
