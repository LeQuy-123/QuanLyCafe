/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhapHangDAL;
import DTO.NhapHangDTO;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class NhapHangBLL {
    NhapHangDAL dal = new NhapHangDAL();
    public ArrayList<NhapHangDTO> getAllNhapHang(){
        return dal.getAllNhapHang();
    }
    public NhapHangDTO get1NhapHang(int maHang){
        return dal.get1NhapHang(maHang);
    }
    public ArrayList<String> loadDataToCB(){
        return dal.loadDataToCb();
    }
    public ArrayList<String> getNCC(int maNCC){
        return dal.getNhaCungCap(maNCC);
    }
}
