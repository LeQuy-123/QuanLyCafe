/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NguyenLieuDAL;
import DTO.NguyenLieuDTO;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class NguyenLieuBLL {
    NguyenLieuDAL nlDAL = new NguyenLieuDAL();
    public ArrayList<NguyenLieuDTO> getAllNguyenLieu()
    {
        return nlDAL.getAllNguyenLieu();
    }
    public boolean addNguyenLieu(String tenNL, String HSD, int slCon, String congDung){
        return nlDAL.addNguyenLieu(tenNL, HSD, slCon, congDung);
    }
    public boolean removeNL(String maNL){
        return removeNL(maNL);
    }
    /*public boolean updateNL(int maNL, String tenMon, int Gia, int maMon){
        return menuDAL.updateMon(maNL, tenMon, Gia, maMon);
    }*/
    public NguyenLieuDTO getNL(int maNL){
        return nlDAL.getNguyenLieu(maNL);
    }
    public boolean updateNguyenLieu(int maNL, String tenNL, String hsd, int slCon, String congDung ){
        return nlDAL.updateNguyenLieu(maNL, tenNL, hsd, slCon, congDung);
    }
}
