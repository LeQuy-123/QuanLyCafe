/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doan;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DateFormat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;

/**
 *
 * @author MSI2
 */
public class test {
    public static void main(String[] args) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");  
//        LocalDateTime now = LocalDateTime.now(); 
//        String time = dtf.format(now);
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        String s = sdf.format(new Date());

        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        String time = dateFormat.format(cal.getTime()).toUpperCase();
        System.out.println(time.toUpperCase());
        
    }
    
}
