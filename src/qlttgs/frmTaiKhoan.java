/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttgs;

import dao.frmTaiKhoanDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.pNguoiDung;

/**
 *
 * @author Admin
 */
public class frmTaiKhoan extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTaiKhoan
     */
    public frmTaiKhoan() {
        initComponents();
        this.setLocation(30,0);
        this.setSize(722, 563);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Showds();
    }

    private void Showds(){
        DefaultTableModel dtmNguoiDung = (DefaultTableModel)lbTaiKhoan.getModel();
        dtmNguoiDung.setRowCount(0);
        frmTaiKhoanDAO.ShowData(dtmNguoiDung);
        lbTaiKhoan.setModel(dtmNguoiDung);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaND = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenND = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbPQ = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbTaiKhoan = new javax.swing.JTable();

        setResizable(true);
        setTitle("Tài khoản người dùng");
        setName(""); // NOI18N
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DANH SÁCH TÀI KHOẢN NGƯỜI DÙNG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 450, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tài khoản"));
        jPanel1.setLayout(null);

        jLabel2.setText("Mã người dùng:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 190, 40);
        jPanel1.add(txtMaND);
        txtMaND.setBounds(130, 40, 190, 30);

        jLabel3.setText("Tên người dùng:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 160, 30);

        txtTenND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNDActionPerformed(evt);
            }
        });
        jPanel1.add(txtTenND);
        txtTenND.setBounds(130, 90, 190, 30);

        jLabel4.setText("Mật khẩu:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 140, 30);
        jPanel1.add(txtMatKhau);
        txtMatKhau.setBounds(130, 140, 190, 30);

        jLabel5.setText("Phân quyền:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 130, 30);

        cbbPQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "ADMIN", "Học viên", "Giảng viên" }));
        jPanel1.add(cbbPQ);
        cbbPQ.setBounds(130, 190, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 340, 240);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jPanel3.setLayout(null);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem);
        btnTimKiem.setBounds(40, 80, 130, 30);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem);
        btnThem.setBounds(40, 120, 130, 30);

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        jPanel3.add(btnCapNhat);
        btnCapNhat.setBounds(190, 80, 130, 30);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel3.add(btnThoat);
        btnThoat.setBounds(110, 170, 130, 30);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa);
        btnXoa.setBounds(190, 120, 130, 30);
        jPanel3.add(txtSearch);
        txtSearch.setBounds(40, 40, 280, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(360, 60, 340, 240);

        lbTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã người dùng", "Tên người dùng", "Mật khẩu", "Phân quyền"
            }
        ));
        lbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lbTaiKhoan);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 300, 690, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here: 
        try {
            if (frmTaiKhoanDAO.KTTT(txtMaND.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Đã tồn tại tài khoản này!");
                txtMaND.setText("");
                txtMaND.requestFocus();
                return;
            }
            else
            {
                pNguoiDung nd = new pNguoiDung();
                nd.setMaND(txtMaND.getText());
                nd.setTenND(txtTenND.getText());
                nd.setMatKhau(txtMatKhau.getText());
                nd.setPhanQuyen(cbbPQ.getModel().getSelectedItem().toString());
                if (frmTaiKhoanDAO.Add(nd) == true) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công!");
                    Showds();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)lbTaiKhoan.getModel();
        dtm.setRowCount(0);
        frmTaiKhoanDAO.ShowSearch(dtm, txtSearch.getText());
        lbTaiKhoan.setModel(dtm);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        String ma = txtMaND.getText();
        pNguoiDung ng = new pNguoiDung();
        ng.setMaND(ma);
        ng.setTenND(txtTenND.getText());
        ng.setMatKhau(txtMatKhau.getText());
        ng.setPhanQuyen(cbbPQ.getModel().getSelectedItem().toString());
        if (frmTaiKhoanDAO.Update(ma, ng) == true) {
            JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
            Showds();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String ma = txtMaND.getText();
        pNguoiDung nd = new pNguoiDung();
        if (frmTaiKhoanDAO.Delete(ma) == true) {
            JOptionPane.showMessageDialog(null, "Xóa thành công!");
            Showds();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void lbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTaiKhoanMouseClicked
        // TODO add your handling code here:
        int row = lbTaiKhoan.getSelectedRow();
        txtMaND.setText(lbTaiKhoan.getValueAt(row, 0).toString());
        txtTenND.setText(lbTaiKhoan.getValueAt(row, 1).toString());
        txtMatKhau.setText(lbTaiKhoan.getValueAt(row, 2).toString());
        cbbPQ.getModel().setSelectedItem((String)lbTaiKhoan.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_lbTaiKhoanMouseClicked

    private void txtTenNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNDActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbPQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable lbTaiKhoan;
    private javax.swing.JTextField txtMaND;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenND;
    // End of variables declaration//GEN-END:variables
}
