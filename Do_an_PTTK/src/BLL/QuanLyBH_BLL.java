/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.BanHangDAL;
import DAL.MonDAL;
import DAL.NguyenLieuDAL;
import DTO.CTHD_DTO;
import DTO.HoaDonDTO;
import DTO.MonDTO;
import DTO.NguyenLieuDTO;
import java.sql.ResultSet;

/**
 *
 * @author MSI2
 */
public class QuanLyBH_BLL 
{
    MonDAL monDAL = new MonDAL();
    BanHangDAL ql = new BanHangDAL();
    NguyenLieuDAL nlDAL = new NguyenLieuDAL();
    public ResultSet Check(String str)
    {
        if(str.equals("MaKH"))
            return ql.FillComboBox_KH();
        else 
        {
                if(str.equals("MaBan"))
                    return ql.FillComboBox_MABAN();
                else return ql.FillComboBox_TenMon();
        }
 
    }
    
    public String LoadDonGia(String tenmon)
    {
        return ql.LoadDonGia(tenmon);
    }
    
    public String getGiamGia(String str)
    {
        return ql.getGiamGia(str);
    }
    
    public String getMaMon(String TenMon)
    {
        return ql.getMaMon(TenMon);
    }

    
    public String ThemHD(HoaDonDTO hd, CTHD_DTO cthd)
    {
        int soLuongDat = Integer.parseInt(cthd.getSL());
        int soLuong = 0;
        String maMon = cthd.getMaMon();
        String maNL = monDAL.getMaNguyenLieu(maMon);
        NguyenLieuDTO nl = nlDAL.getNguyenLieu(Integer.parseInt(maNL));
        System.out.println(nl.getSlCon());
//        System.out.println(maNL);
//        System.out.println(soLuongDat);
        if(nl.getSlCon() >= soLuongDat){
            soLuong = nl.getSlCon() - soLuongDat;
            System.out.println(soLuong);
            nlDAL.truNguyenLieu(maNL, soLuong);
            return ql.ThemHD(hd,cthd);
        } else {
            return null;
        }
    }
}
