/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttgs;

import dao.frmCTGiaSuDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.pCTGiangVien;

/**
 *
 * @author Admin
 */
public class frmCTGiaSu extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmGiaSu
     */
    public frmCTGiaSu() {
        initComponents();
        this.setLocation(50,30);
        this.setSize(700, 470);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Showds();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSGV = new javax.swing.JTable();
        lbThongTinLopHoc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbMaGV = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        txtTenGV = new javax.swing.JTextField();
        lbTenGV = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lbGioiTinh = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        lbEmail1 = new javax.swing.JLabel();
        lbMonHoc = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        cbxTrangThai = new javax.swing.JComboBox<>();
        txtMonHoc = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        cbbGT = new javax.swing.JComboBox<>();

        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblDSGV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã GV", "Tên GV", "Ngày sinh", "Giới tính", "SĐT", "Email", "Mộn học"
            }
        ));
        tblDSGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSGVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSGV);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 670, 170);

        lbThongTinLopHoc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbThongTinLopHoc.setText("DANH SÁCH GIẢNG VIÊN");
        getContentPane().add(lbThongTinLopHoc);
        lbThongTinLopHoc.setBounds(150, 10, 320, 29);

        jPanel1.setLayout(null);

        lbMaGV.setText("Mã GV:");
        jPanel1.add(lbMaGV);
        lbMaGV.setBounds(20, 10, 70, 30);
        jPanel1.add(txtMaGV);
        txtMaGV.setBounds(90, 10, 140, 30);

        txtTenGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenGVActionPerformed(evt);
            }
        });
        jPanel1.add(txtTenGV);
        txtTenGV.setBounds(90, 50, 140, 30);

        lbTenGV.setText("Tên GV:");
        jPanel1.add(lbTenGV);
        lbTenGV.setBounds(20, 50, 70, 30);

        lbNgaySinh.setText("Ngày sinh:");
        jPanel1.add(lbNgaySinh);
        lbNgaySinh.setBounds(20, 90, 70, 30);
        jPanel1.add(txtNgaySinh);
        txtNgaySinh.setBounds(90, 90, 140, 30);

        lbGioiTinh.setText("Giới tính:");
        jPanel1.add(lbGioiTinh);
        lbGioiTinh.setBounds(20, 130, 70, 30);

        lbSDT.setText("SĐT:");
        jPanel1.add(lbSDT);
        lbSDT.setBounds(250, 10, 70, 30);
        jPanel1.add(txtSDT);
        txtSDT.setBounds(320, 10, 150, 30);
        jPanel1.add(txtEmail1);
        txtEmail1.setBounds(320, 50, 150, 30);

        lbEmail1.setText("Email:");
        jPanel1.add(lbEmail1);
        lbEmail1.setBounds(250, 50, 70, 30);

        lbMonHoc.setText("Môn học:");
        jPanel1.add(lbMonHoc);
        lbMonHoc.setBounds(250, 90, 70, 30);

        lbTrangThai.setText("Trạng thái:");
        jPanel1.add(lbTrangThai);
        lbTrangThai.setBounds(250, 120, 70, 40);

        cbxTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "Đang dạy", "Chưa mở lớp" }));
        jPanel1.add(cbxTrangThai);
        cbxTrangThai.setBounds(320, 130, 150, 30);
        jPanel1.add(txtMonHoc);
        txtMonHoc.setBounds(320, 90, 150, 30);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(500, 10, 90, 30);

        btnSua.setText("Sửa");
        jPanel1.add(btnSua);
        btnSua.setBounds(500, 50, 90, 30);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);
        btnXoa.setBounds(500, 90, 90, 30);

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        jPanel1.add(btnDong);
        btnDong.setBounds(500, 130, 90, 30);

        cbbGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "Nam", "Nữ" }));
        jPanel1.add(cbbGT);
        cbbGT.setBounds(90, 130, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 50, 600, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDSGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSGVMouseClicked
        // TODO add your handling code here:
//        int row = tblDSGV.getSelectedRow();
//        txtMa.setText((String)tblDSGV.getValueAt(row, 0));
//        txtTenGV.setText((String)tblDSGV.getValueAt(row, 1));
//        txtLoai.setText((String)tblDSGV.getValueAt(row, 2));
//        txtGioiTinh.setText((String)tblDSGV.getValueAt(row, 3) + "");
    }//GEN-LAST:event_tblDSGVMouseClicked

    private void txtTenGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenGVActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String ma = txtMaGV.getText();
        pCTGiangVien gv = new pCTGiangVien();
        gv.setMaGS(ma);
        gv.setTenGS(txtTenGV.getText());
        gv.setNgaySinh(txtNgaySinh.getText());
        gv.setDiaChi(txtEmail1.getText());
        gv.setDienThoai(txtSDT.getText());
        gv.setMonHoc(txtMonHoc.getText());
        gv.setGioiTinh(cbbGT.getModel().getSelectedItem().toString());
        if (frmCTGiaSuDAO.Add(gv) == true) {
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
                Showds();
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (frmCTGiaSuDAO.KTTT(txtMaGV.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Gia Sư này không tồn tại!");
            return;
        }
        else{
            if (frmCTGiaSuDAO.Delete(txtMaGV.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                Showds();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbGT;
    private javax.swing.JComboBox<String> cbxTrangThai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmail1;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbMaGV;
    private javax.swing.JLabel lbMonHoc;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTenGV;
    private javax.swing.JLabel lbThongTinLopHoc;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JTable tblDSGV;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtMonHoc;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenGV;
    // End of variables declaration//GEN-END:variables

    private void Showds() {
        DefaultTableModel dtmGV = (DefaultTableModel)tblDSGV.getModel();
        dtmGV.setRowCount(0);
        frmCTGiaSuDAO.ShowData(dtmGV);
        tblDSGV.setModel(dtmGV);
    }
}
