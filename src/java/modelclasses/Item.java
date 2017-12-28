package modelclasses;
/**
 *
 * @author CỌP
 */
public class Item {
    private SanPham sanPham;
    private int soLuong;

    public Item() {
    }

    public Item(SanPham sanPham, int soLuong) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
