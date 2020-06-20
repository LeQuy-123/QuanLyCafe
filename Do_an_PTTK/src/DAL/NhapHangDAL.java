    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import static DAL.Database.conectionJDBC;
import DTO.NhapHangDTO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        String sql = "select hanghoa.mahang, ngaynhap, mancc, manv , maCTN, soLuongNhap from hanghoa, chi_tiet_nhap where hanghoa.mahang = chi_tiet_nhap.mahang";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while (rs.next()){
                NhapHangDTO nhDTO = new NhapHangDTO();
                nhDTO.setMaHang(rs.getInt("MAHANG"));
                nhDTO.setNgayNhap(rs.getString("NGAYNHAP"));
                nhDTO.setMaNCC(rs.getInt("MANCC"));
                nhDTO.setMaNV(rs.getInt("MANV"));
                nhDTO.setMaCTN(rs.getInt("MACTN"));
                nhDTO.setSoLuongNhap(rs.getInt("soLuongNhap"));
                listNH.add(nhDTO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhapHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNH;
    }
    public NhapHangDTO get1NhapHang(int maCTN){
        String sql = "select hanghoa.mahang, ngaynhap, mancc, manv , maCTN, soLuongNhap from hanghoa, chi_tiet_nhap where hanghoa.mahang = chi_tiet_nhap.mahang and maCTN = '"+maCTN+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        NhapHangDTO nhDTO = new NhapHangDTO();
        try {
            if (rs.next()){
                nhDTO.setMaHang(rs.getInt("MAHANG"));
                nhDTO.setNgayNhap(rs.getString("NGAYNHAP"));
                nhDTO.setMaNCC(rs.getInt("MANCC"));
                nhDTO.setMaNV(rs.getInt("MANV"));
                nhDTO.setMaCTN(rs.getInt("MACTN"));
                nhDTO.setSoLuongNhap(rs.getInt("soLuongNhap"));
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
        String sql = "select trim(TENNCC) as TENNCC , trim(DIACHI) as DIACHI, SDT from NCC WHERE MANCC = '"+maNCC+"'";
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
    
    public ArrayList<String> loadDataToCbMaHang(){
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select MAHANG from HANGHOA";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while (rs.next()){
                list.add(rs.getString("MAHANG"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public boolean nhapMotDonHang(int maNV, int maHang, int soLuongNhap){
        String sql = "Insert into chi_tiet_nhap values ('"+maHang+"','"+maNV+"',to_date(sysdate,'dd-MM-yyyy'),maCTN_SEQ.nextval, '"+soLuongNhap+"')";
        try {
            Statement statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhapHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<String> getInfoHangHoa(int maHang){
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select trim(TENHANG) as TENHANG, DONVI, DONGIA from HANGHOA WHERE MAHANG = '"+maHang+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while (rs.next()){
                list.add(rs.getString("TENHANG"));
                list.add(rs.getString("DONVI"));
                list.add(rs.getString("DONGIA"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public boolean removeNH(String maCTN){
        String sql = "delete from CHI_TIET_NHAP where MACTN = '"+maCTN+"'";
        Statement statement;
        try {
            statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ThucDonDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean updateHangHoa(int maHang, int soLuong, int thanhTien){
        String sql = "Update HANGHOA set SL=SL+'"+soLuong+"', THANHTIEN = THANHTIEN + '"+thanhTien+"' where maHang='"+maHang+"'";
        Statement statement;    
        try {
            statement = conectionJDBC().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhapHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }   
    public boolean updateNH(String maCTN, String soLuongNhap, String soLuongNhapCu){
        String sql = "{call update_nh(?,?,?)}";
        try{
            CallableStatement pr = conectionJDBC().prepareCall(sql);
            pr.setString(1, soLuongNhapCu);
            pr.setString(2, soLuongNhap);
            pr.setString(3, maCTN);
            pr.executeUpdate();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
