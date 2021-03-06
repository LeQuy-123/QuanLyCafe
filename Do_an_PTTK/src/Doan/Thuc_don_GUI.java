/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doan;

import BLL.ThucDonBLL;
import DAL.ThucDonDAL;
import DTO.ThucDonDTO;
import Doan.NV_thungan;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import javax.swing.JTable;
/**
 *
 * @author MSI2
 */
public class Thuc_don_GUI extends javax.swing.JFrame {
    DefaultTableModel tableModel;

    
    public JTable getTblMenu() {
        return tblMenu;
    }

    
    public void setTblMenu(JTable tblMenu) {    
        this.tblMenu = tblMenu;
    }

    public Thuc_don_GUI() {
        initComponents();
        tableModel = (DefaultTableModel) tblMenu.getModel();
        showMenu();
        loadCombobox();
    }
    private void loadCombobox(){
        ThucDonBLL bll = new ThucDonBLL();
        ArrayList<String> list = bll.loadDataToCombobox();
        for (String item : list){
            jComboBox1.addItem(item.toString());
        }
    }
    private void showMenu(){
        
        ThucDonBLL bll = new ThucDonBLL();
        ArrayList<ThucDonDTO>  listMenu = bll.getAllThucDon();
        
        tableModel.setRowCount(0);
        
        for(ThucDonDTO s : listMenu){
            tableModel.addRow(new Object[]{s.getMaMon(), s.getTenMon(), s.getGia(),s.getMaNL()}
            );
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgnv = new javax.swing.JPanel();
        bg_thoat = new javax.swing.JPanel();
        text_trangchu7 = new javax.swing.JLabel();
        icon_trangchu7 = new javax.swing.JLabel();
        button_thoat = new javax.swing.JButton();
        bg_chuquan = new javax.swing.JPanel();
        bg_cafeomely = new javax.swing.JPanel();
        text_cafeomely = new javax.swing.JLabel();
        icon_cafe = new javax.swing.JLabel();
        icon_cafe1 = new javax.swing.JLabel();
        text_cafeomely1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        tfGia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTenMon = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThemMon = new javax.swing.JButton();
        btnXoaMon = new javax.swing.JButton();
        btnUpdateMon = new javax.swing.JButton();
        btnTraCuu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgnv.setBackground(new java.awt.Color(255, 255, 255));
        bgnv.setMaximumSize(new java.awt.Dimension(1280, 1000));
        bgnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_thoat.setBackground(new java.awt.Color(85, 65, 118));

        text_trangchu7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        text_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        text_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_trangchu7.setText("Thực đơn");

        icon_trangchu7.setBackground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_trangchu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_cutlery_26px.png"))); // NOI18N
        icon_trangchu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_trangchu7.setOpaque(true);

        button_thoat.setBackground(new java.awt.Color(255, 255, 255));
        button_thoat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_thoat.setForeground(new java.awt.Color(204, 51, 0));
        button_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_back_arrow_30px.png"))); // NOI18N
        button_thoat.setText("Thoát");
        button_thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        button_thoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_thoatLayout = new javax.swing.GroupLayout(bg_thoat);
        bg_thoat.setLayout(bg_thoatLayout);
        bg_thoatLayout.setHorizontalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addComponent(icon_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                .addComponent(button_thoat)
                .addContainerGap())
        );
        bg_thoatLayout.setVerticalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(button_thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(icon_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bgnv.add(bg_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        bg_chuquan.setBackground(new java.awt.Color(54, 33, 89));
        bg_chuquan.setToolTipText("");
        bg_chuquan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_cafeomely.setBackground(new java.awt.Color(85, 65, 118));
        bg_cafeomely.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_cafeomely.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_cafeomely.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely.setText("Đ/C: Thị trấn Phú Phong, huyện Tây Sơn, tỉnh Bình Định.");
        bg_cafeomely.add(text_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 0, 523, 56));

        icon_cafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_address_50px_1.png"))); // NOI18N
        bg_cafeomely.add(icon_cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 79, 56));

        icon_cafe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_cafe_50px.png"))); // NOI18N
        bg_cafeomely.add(icon_cafe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 79, 56));

        text_cafeomely1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        text_cafeomely1.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely1.setText("OMELY QUÁN");
        bg_cafeomely.add(text_cafeomely1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 275, 56));

        bg_chuquan.add(bg_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 980, -1));

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã món", "Tên món", "Giá", "Mã nguyên liệu"
            }
        ));
        jScrollPane1.setViewportView(tblMenu);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 670, 320));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Thông tin thực đơn");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 160, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_refresh_16px.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 50, 40));

        bg_chuquan.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 690, 370));

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên món");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 21));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mã nguyên liệu");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("VNĐ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 111, 30, 30));

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_cancel_24px.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        tfGia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(tfGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Giá");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 89, 21));

        tfTenMon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(tfTenMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, 30));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        bg_chuquan.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 260));

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Chức năng");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThemMon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_add_30px.png"))); // NOI18N
        btnThemMon.setText("Thêm");
        btnThemMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        btnThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonActionPerformed(evt);
            }
        });

        btnXoaMon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/delete.png"))); // NOI18N
        btnXoaMon.setText("Xóa");
        btnXoaMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        btnXoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMonActionPerformed(evt);
            }
        });

        btnUpdateMon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdateMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/sửa .png"))); // NOI18N
        btnUpdateMon.setText("Cập nhật");
        btnUpdateMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        btnUpdateMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMonActionPerformed(evt);
            }
        });

        btnTraCuu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTraCuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_google_web_search_50px.png"))); // NOI18N
        btnTraCuu.setText("Tra cứu");
        btnTraCuu.setAlignmentY(0.0F);
        btnTraCuu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateMon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdateMon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
        );

        bg_chuquan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 600, 80));

        bgnv.add(bg_chuquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgnv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_thoatActionPerformed
        // TODO add your handling code here:
        new Chu_Quan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_thoatActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.showMenu();
        return;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        tfTenMon.setText(null);
        jComboBox1.setSelectedIndex(0);
        tfGia.setText(null);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonActionPerformed
        ThucDonBLL bll = new ThucDonBLL();
        String value = jComboBox1.getSelectedItem().toString();
        if(
        bll.addmenu(Integer.parseInt(value), tfTenMon.getText(), Integer.parseInt(tfGia.getText()))){
            JOptionPane.showMessageDialog(rootPane, "success");
            this.showMenu();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_btnThemMonActionPerformed

    private void btnXoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMonActionPerformed
        int x = tblMenu.getSelectedRow();
        String maMon = tblMenu.getValueAt(x, 0).toString();
        ThucDonBLL bll = new ThucDonBLL();
        if(bll.removeMon(maMon)){
            JOptionPane.showMessageDialog(rootPane, "success");
            new Thuc_don_GUI().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "eror");
        }
    }//GEN-LAST:event_btnXoaMonActionPerformed

    private void btnUpdateMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMonActionPerformed
        int x = tblMenu.getSelectedRow();
        java.lang.String maMon = tblMenu.getValueAt(x,0).toString();
        java.lang.String maNL = jComboBox1.getSelectedItem().toString();
        java.lang.String tenMon = tfTenMon.getText();
        String gia = tfGia.getText();
        ThucDonBLL bll = new ThucDonBLL();
        if(bll.updateMon(Integer.parseInt(maNL), tenMon, Integer.parseInt(gia), Integer.parseInt(maMon))){
            JOptionPane.showMessageDialog(rootPane, "success");
            new Thuc_don_GUI().setVisible(true);
            this.setVisible(false);
            //new Thuc_don_GUI().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "fail");
        }
    }//GEN-LAST:event_btnUpdateMonActionPerformed

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        //JOptionPane.showMessageDialog(rootPane, "aaaa");
        bienTam.a = 1;
        formSearch fs = new formSearch();
        fs.setLocationRelativeTo(null);
        fs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public void show1mon(int maMon){
        int rowCount = tblMenu.getRowCount();
        int temp = 0;
        for (int i = 0;i< rowCount;i++){
            if (String.valueOf(maMon).equals(tblMenu.getValueAt(i, 0).toString())){
                ThucDonBLL tdBLL = new ThucDonBLL();
                ThucDonDTO td = tdBLL.getThucDon(maMon);
                tableModel.setRowCount(0);
                tableModel.addRow(new Object[]{td.getMaMon(), td.getTenMon(),td.getGia(), td.getMaNL()});
                temp++;
                break;
            }
            }
        if (temp == 1){
            JOptionPane.showMessageDialog(rootPane, "Tim thanh cong");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Khong co ma mon vua tim");
        }
        }
        /*ThucDonBLL tdBLL = new ThucDonBLL();
        ThucDonDTO td = tdBLL.getThucDon(maMon);
        tableModel.setRowCount(0);
        tableModel.addRow(new Object[]{td.getMaMon(), td.getTenMon(),td.getGia(), td.getMaNL()});*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Thuc_don_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thuc_don_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thuc_don_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thuc_don_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thuc_don_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_cafeomely;
    private javax.swing.JPanel bg_chuquan;
    private javax.swing.JPanel bg_thoat;
    private javax.swing.JPanel bgnv;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnUpdateMon;
    private javax.swing.JButton btnXoaMon;
    private javax.swing.JButton button_thoat;
    private javax.swing.JLabel icon_cafe;
    private javax.swing.JLabel icon_cafe1;
    private javax.swing.JLabel icon_trangchu7;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    private javax.swing.JLabel text_cafeomely;
    private javax.swing.JLabel text_cafeomely1;
    private javax.swing.JLabel text_trangchu7;
    private javax.swing.JTextField tfGia;
    private javax.swing.JTextField tfTenMon;
    // End of variables declaration//GEN-END:variables
}
