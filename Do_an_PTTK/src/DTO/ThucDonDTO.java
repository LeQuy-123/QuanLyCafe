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
public class ThucDonDTO {
    int maMon;
    int maNL;
    String tenMon;
    int gia;

    public ThucDonDTO(int maNL, String tenMon, int gia) {
        this.maNL = maNL;
        this.tenMon = tenMon;
        this.gia = gia;
    }

    public ThucDonDTO(int maMon, int maNL, String tenMon, int gia) {
        this.maMon = maMon;
        this.maNL = maNL;
        this.tenMon = tenMon;
        this.gia = gia;
    }

    public ThucDonDTO() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public int getMaNL() {
        return maNL;
    }

    public void setMaNL(int maNL) {
        this.maNL = maNL;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
