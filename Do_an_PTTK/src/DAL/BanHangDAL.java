/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.Database.conectionJDBC;
import DTO.CTHD_DTO;
import DTO.HoaDonDTO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI2
 */
public class BanHangDAL 
{
    public ResultSet FillComboBox_KH()
    {
        String sql = "select MAKH from KHACHHANG";
        ResultSet rs = Database.getData(conectionJDBC (),sql);
        return rs;
    }
    
    public ResultSet FillComboBox_TenMon()
    {
        String sql = "select TENMON from MON";
        ResultSet rs = Database.getData(conectionJDBC (),sql);
        return rs;
    }
    
    public ResultSet FillComboBox_MABAN()
    {
        String sql = "select MABAN from BAN";
        ResultSet rs = Database.getData(conectionJDBC (),sql);
        return rs;
    }
    
    public String LoadDonGia(String str)
    {
        String sql = "select GIA from MON where TENMON = '"+str+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while(rs.next())
            {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public String getGiamGia(String str)
    {
        String sql = "select DIEMTL from KHACHHANG where MAKH = "+ str;
        int kq = 0;
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while(rs.next())
            {
                kq = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        if(kq <= 10)
            return "0";
        else
            if(kq >= 11 && kq <= 30 )
                return "5";
            else return "10";
    }
    
    public String ThemHD(HoaDonDTO hd, CTHD_DTO cthd)
    {
        String call = "{?=call Them_Hoa_Don_Fun('"+hd.getMaKH()+"','"+hd.getMaNV()+"',"
                + "TO_DATE('"+ hd.getNgayLap() +"','dd-mm-yyyy HH24:MI'),'"+hd.getGiamGia()+"','"+cthd.getMaBan()
                +"','"+cthd.getMaMon()+"','"+cthd.getSL()+"')}";
        CallableStatement pr;
        String mahd = null;
        System.out.println(call);
        try {
            pr = conectionJDBC().prepareCall(call);
            pr.registerOutParameter(1, Types.INTEGER);
            pr.executeUpdate();
            mahd = pr.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        String kq = String.valueOf(mahd);
        return kq;
    }
    
    public String getMaMon(String TenMon) 
    {
        String sql = "select MAMON from MON where TENMON = '"+TenMon+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while(rs.next())
            {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    

}
