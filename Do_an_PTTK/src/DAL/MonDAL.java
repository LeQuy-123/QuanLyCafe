/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.Database.conectionJDBC;
import DTO.MonDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quy
 */
public class MonDAL {
    public String getMaNguyenLieu (String maMon){
        String mon = null;
        String sql = "select MANL from MON where MAMON = '"+maMon+"'";
        ResultSet rs = Database.getData(conectionJDBC(), sql);
        try {
            while(rs.next())
            {
                mon = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanHangDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return mon;   
    }
}
