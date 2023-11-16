package lam;

import java.util.ArrayList;

public class KhoHangService {

    ArrayList<KhoHang> ListKH = new ArrayList<>();

    public ArrayList<KhoHang> fakeData() {
        ListKH.add(new KhoHang("Trung Quốc","Áo Ngắn","Đen","X"));
        ListKH.add(new KhoHang("Thái Lan","Áo Lót","Trắng","S"));
        ListKH.add(new KhoHang("Việt Nam","Áo Dài","Vàng","XL"));
        ListKH.add(new KhoHang(" Lào","Áo Ba","Đen","X"));
        ListKH.add(new KhoHang("Trung Quốc","Áo Cà Sa","Đen","XXL"));
        return ListKH;
    }

    public String addKH(KhoHang kh) {
    return (kh != null && ListKH.add(kh)?"Thêm thành công": "Them thất bại");
    }
    public String deleteKH(int vitri){
    return(ListKH.remove(vitri)!= null ?"Xóa thành công":"Xóa thất bại" );
    }
    public String updateKH(int vitri ,KhoHang kh){
    if(kh!= null){
    ListKH.set(vitri, kh);
    return "Sửa thành công";
    }else{
    return "Sửa thất bại";}
    
    }
}
