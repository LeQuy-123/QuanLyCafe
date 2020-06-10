/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import static DAL.Database.conectionJDBC;
import DTO.NhapHangDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NhapHangDAL {
    public ArrayList<NhapHangDTO> getAllNhapHang(){
        ArrayList<NhapHangDTO> listNH = new ArrayList<NhapHangDTO>();
        String sql = "select hanghoa.mahang, ngaynhap, mancc, thanhtien from hanghoa, chi_tiet_nhap where hanghoa.mahang = chi_tiet_nhap.mahang";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while (rs.next()){
                NhapHangDTO nhDTO = new NhapHangDTO();
                nhDTO.setMaHang(rs.getInt("MAHANG"));
                nhDTO.setNgayNhap(rs.getString("NGAYNHAP"));
                nhDTO.setMaNCC(rs.getInt("MANCC"));
                nhDTO.setThanhTien(rs.getFloat("THANHTIEN"));
                listNH.add(nhDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhapHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNH;
    }
    public boolean addNhapHang(){
        return true;
    }
    public NhapHangDTO get1NhapHang(int maHang){
        String sql = "select hanghoa.mahang, ngaynhap, mancc, thanhtien from hanghoa, chi_tiet_nhap where hanghoa.mahang = chi_tiet_nhap.mahang and hanghoa.mahang = '"+maHang+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        NhapHangDTO nhDTO = new NhapHangDTO();
        try {
            if (rs.next()){
                nhDTO.setMaHang(rs.getInt("MAHANG"));
                nhDTO.setNgayNhap(rs.getString("NGAYNHAP"));
                nhDTO.setMaNCC(rs.getInt("MANCC"));
                nhDTO.setThanhTien(rs.getFloat("THANHTIEN"));
            } } catch (SQLException ex) {
            Logger.getLogger(NhapHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhDTO;
    }
    public ArrayList<String> loadDataToCb(){
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select MANCC from NCC";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while (rs.next()){
                list.add(rs.getString("MANCC"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public ArrayList<String> getNhaCungCap(int maNCC){
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select TENNCC,DIACHI, SDT from NCC WHERE MANCC = '"+maNCC+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while (rs.next()){
                list.add(rs.getString("TENNCC"));
                list.add(rs.getString("DIACHI"));
                list.add(rs.getString("SDT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
