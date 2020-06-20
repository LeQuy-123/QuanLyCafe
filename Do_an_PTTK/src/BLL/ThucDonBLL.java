/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.ThucDonDAL;
import DTO.ThucDonDTO;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class ThucDonBLL {
    ThucDonDAL menuDAL = new ThucDonDAL();
    public ArrayList<ThucDonDTO> getAllThucDon()
    {
        return menuDAL.getAllThucDon();
    }
    public boolean addmenu(int MANL, String TENMON, int GIA){
        return menuDAL.addMenu(MANL, TENMON, GIA);
    }
    public ArrayList<String> loadDataToCombobox(){
        return menuDAL.loadDataToCombobox();
    }
    public boolean removeMon(String MAMON){
        return removeMon(MAMON);
    }
    public boolean updateMon(int maNL, String tenMon, int Gia, int maMon){
        return menuDAL.updateMon(maNL, tenMon, Gia, maMon);
    }
    public ThucDonDTO getThucDon(int maMon){
        return menuDAL.getThucDon(maMon);
    }
}
