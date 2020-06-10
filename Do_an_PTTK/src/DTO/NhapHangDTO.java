/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author User
 */
public class NhapHangDTO {
    int maNV, maHang;
    int maNCC, sdt;
    String diaChi, tenHang;
    String donVi,ngayNhap;
    int soLuong;
    float donGia;
    float thanhTien;

    public NhapHangDTO() {
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public NhapHangDTO(int maHang, int maNCC, String ngayNhap, float thanhTien) {
        this.maHang = maHang;
        this.maNCC = maNCC;
        this.ngayNhap = ngayNhap;
        this.thanhTien = thanhTien;
    }

    public NhapHangDTO(int maNV, int maHang, int maNCC, int sdt, String diaChi, String tenHang, String donVi, String ngayNhap, int soLuong, float donGia, float thanhTien) {
        this.maNV = maNV;
        this.maHang = maHang;
        this.maNCC = maNCC;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }


    
}
