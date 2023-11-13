package qlda;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhanVien_Service {

    ArrayList<NhanVien> ListNV = new ArrayList<>();

    public ArrayList<NhanVien> fakeData() {
        ListNV.add(new NhanVien("NV01", "Nguyễn VĂn A", "0993424", "anv@gmail.com", "Nam"));
        ListNV.add(new NhanVien("NV02", "Nguyễn Thị B", "0935674", "bnt@gmail.com", "Nữ"));
        ListNV.add(new NhanVien("NV03", "Nguyễn VĂn C", "023456434", "cnv@gmail.com", "Nam"));
        ListNV.add(new NhanVien("NV04", "Nguyễn Thu D", "0865434565", "dnt@gmail.com", "Nữ"));
        ListNV.add(new NhanVien("NV05", "Nguyễn VĂn E", "02376464643", "env@gmail.com", "Nam"));
        return ListNV;
    }

    public String addNV(NhanVien nv) {
        return (nv != null && ListNV.add(nv) ? "Thêm thành công" : "Thêm thất bại");
    }

    public String deleteNV(int vitri) {
        return (ListNV.remove(vitri) != null ? "Xóa thành công" : "Xóa thất bại");
    }

    public String updateNV(int vitri, NhanVien nv) {
        if (nv != null) {
            ListNV.set(vitri, nv);
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }

    }

}
