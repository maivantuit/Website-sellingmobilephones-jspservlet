package modelclasses;

/**
 *
 * @author CỌP
 */
public class DanhMuc {

    private String MaDMSP;
    private String TenDMSP;
    private String MaNSX;

    public DanhMuc() {
    }
     public DanhMuc(String MaDMSP) {
        this.MaDMSP = MaDMSP;        
    }

    public DanhMuc(String TenDMSP, String MaNSX) {
        this.TenDMSP = TenDMSP;
        this.MaNSX = MaNSX;
    }

    public DanhMuc(String MaDMSP, String TenDMSP, String MaNSX) {
        this.MaDMSP = MaDMSP;
        this.TenDMSP = TenDMSP;
        this.MaNSX = MaNSX;

    }

    public String getMaDMSP() {
        return MaDMSP;
    }

    public String getTenDMSP() {
        return TenDMSP;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaDMSP(String MaDMSP) {
        this.MaDMSP = MaDMSP;
    }

    public void setTenDMSP(String TenDMSP) {
        this.TenDMSP = TenDMSP;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

}
