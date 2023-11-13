/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlda;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String ma;
    private String ten;
    private String soDienThoai;
    private String email;
    private String gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String soDienThoai, String email, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
