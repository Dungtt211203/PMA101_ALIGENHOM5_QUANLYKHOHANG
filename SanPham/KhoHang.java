package lam;

import java.io.Serializable;

public class KhoHang implements Serializable {

    String nhaCungCap;
    String sanPham;
    String mauSac;
    String size;

    public KhoHang() {
    }

    public KhoHang(String nhaCungCap, String sanPham, String mauSac, String size) {
        this.nhaCungCap = nhaCungCap;
        this.sanPham = sanPham;
        this.mauSac = mauSac;
        this.size = size;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
