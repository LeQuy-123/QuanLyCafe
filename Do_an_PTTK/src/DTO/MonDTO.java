/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Quy
 */
public class MonDTO {
    private String maMon;
    private String maNL;
    private String tenMon;
    private int gia;

    public MonDTO() {
    }

    public MonDTO(String maMon, String maNL, String tenMon, int gia) {
        this.maMon = maMon;
        this.maNL = maNL;
        this.tenMon = tenMon;
        this.gia = gia;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
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
