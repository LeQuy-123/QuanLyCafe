/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author MSI2
 */
public class HoaDonDTO {
    private String MaNV;
    private String MaKH;
    private String NgayLap;
    private String ThanhTien;
    private String GiamGia;

    public HoaDonDTO(String MaNV, String MaKH, String NgayLap, String ThanhTien, String GiamGia) 
    {
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.NgayLap = NgayLap;
        this.ThanhTien = ThanhTien;
        this.GiamGia = GiamGia;
    }

    public HoaDonDTO() 
    {
        this.MaNV = "0";
        this.MaKH = "0";
        this.NgayLap = "0";
        this.ThanhTien = "0";
        this.GiamGia = "0";
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public String getThanhTien() {
        return ThanhTien;
    }

    public String getGiamGia() {
        return GiamGia;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public void setThanhTien(String ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public void setGiamGia(String GiamGia) {
        this.GiamGia = GiamGia;
    }
    
    

    
}
