package modelclasses;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CỌP
 */
public class GioHang {
    private HashMap<Long, Item> giohangItems; // kieu int khong duoc

    public GioHang() {
        giohangItems = new HashMap<>();
    }
   

    public HashMap<Long, Item> getGiohangItems() {
        return giohangItems;
    }

    public void setGiohangItems(HashMap<Long, Item> giohangItems) {
        this.giohangItems = giohangItems;
    }
    // them 1 san pham vao gio hang: theo 1 key va item(SanPham,SoLuong):
    public void ThemSanPham(Long key, Item item){
        boolean check = giohangItems.containsKey(key); // kiem tra trong gio hang co san pham theo key nay khong?
        if(check==true){
            int soluong_cu = item.getSoLuong();
            item.setSoLuong(soluong_cu+1);
            giohangItems.put(key, item);
        }else{
            giohangItems.put(key, item);
        }
    }
        // bớt 1 san pham vao gio hang: theo 1 key va item(SanPham,SoLuong):
    public void BotSanPham(Long key, Item item){
        boolean check = giohangItems.containsKey(key); // kiem tra trong gio hang co san pham theo key nay khong?
        if(check==true){
            int soluong_cu = item.getSoLuong();
            item.setSoLuong(soluong_cu-1);
            giohangItems.put(key, item);
        }else{
            giohangItems.put(key, item);
        }
    }
    // Khi xoa 1 san pham,tinh lai so luong san pham trong gio hang:
    public void TinhLaiSoLuongSanPhamTrongGioHang(Long key, Item item){
        boolean check = giohangItems.containsKey(key);
        if(check==true){
            int soluong_cu = item.getSoLuong();
            if(soluong_cu <=1){
                giohangItems.remove(key);
            }else{
                item.setSoLuong(soluong_cu -1);
                giohangItems.put(key, item);
            }
        }
    }
    // Xoa san pham trong gio hang:
    public void XoaSanPhamTrongGioHang(Long key){ //remove
        boolean check = giohangItems.containsKey(key);
        if(check){
            giohangItems.remove(key);
        }
    }
    // dem kich co cua gio hang:
    public int DemKichThuocGioHang(){// count item        
        return giohangItems.size();
    }
    // tinh tong tien trong gio: (gia1*soluong1)+(gia2*soluong2)+...+(giaN*soluongN)
    public int TinhTongTienTrongGioHang(){//sumToTalGioHang
        int sum = 0;
        for(Map.Entry<Long,Item> list : giohangItems.entrySet()){
            sum+=(list.getValue().getSanPham().getGia())*(list.getValue().getSoLuong());
        }
        return sum;
    }
}
