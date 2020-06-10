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
public class NguyenLieuDTO {
    int maNL;
    String tenNL;
    String HSD;
    int slCon;
    String congDung;

    public NguyenLieuDTO(int maNL, String tenNL, String HSD, int slCon, String congDung) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.HSD = HSD;
        this.slCon = slCon;
        this.congDung = congDung;
    }

    public NguyenLieuDTO(String tenNL, String HSD, int slCon, String congDung) {
        this.tenNL = tenNL;
        this.HSD = HSD;
        this.slCon = slCon;
        this.congDung = congDung;
    }

    public NguyenLieuDTO() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaNL() {
        return maNL;
    }

    public void setMaNL(int maNL) {
        this.maNL = maNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    public int getSlCon() {
        return slCon;
    }

    public void setSlCon(int slCon) {
        this.slCon = slCon;
    }

    public String getCongDung() {
        return congDung;
    }

    public void setCongDung(String congDung) {
        this.congDung = congDung;
    }
    
}
