/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author R-one
 */
public class BranchInfoFrame extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statement = null;
    private Database db;
    
     
    public BranchInfoFrame() {
        initComponents();
         db = new Database();
        conn = db.CreateDBConnection();
    }
 private void clear()
 {
     txt_branchcode.setText("");
     txt_branchname.setText("");
     txt_address.setText("");
     txt_phone.setText("");
     txt_fax.setText("");
     txt_email.setText("");
     txt_division.setText("");
     txt_district.setText("");
     
     
 }
 private void Update_table()
    {
        try{
        String sql = "select * from branch_info";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        branch_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_division = new javax.swing.JTextField();
        txt_branchname = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmd_savebranch = new javax.swing.JButton();
        txt_fax = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_district = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_branchcode = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmd_update = new javax.swing.JButton();
        cmd_delete = new javax.swing.JButton();
        cmd_print_branches = new javax.swing.JButton();
        cmd_back = new javax.swing.JButton();
        branch_code_combo = new javax.swing.JComboBox();
        division_combo = new javax.swing.JComboBox();
        districk_combo = new javax.swing.JComboBox();
        cmd_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        branch_table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel9.setText("District:");

        jLabel3.setText("Branch Name:");

        jLabel5.setText("Phone:");

        cmd_savebranch.setText("Save");
        cmd_savebranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_savebranchActionPerformed(evt);
            }
        });

        jButton1.setText("Show Branch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Fax:");

        jLabel4.setText("Address:");

        jLabel7.setText("Email:");

        jLabel8.setText("Division:");

        jLabel2.setText("Branch Code:");

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_print_branches.setText("Print ");
        cmd_print_branches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_print_branchesActionPerformed(evt);
            }
        });

        cmd_back.setText("<< Back");
        cmd_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_backActionPerformed(evt);
            }
        });

        branch_code_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        branch_code_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branch_code_comboActionPerformed(evt);
            }
        });

        division_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dhaka", "Chittagong", "Rajshahi", "Khulna", "Barisal", "Sylhet", "Rangpur" }));

        districk_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_branchname)
                            .addComponent(txt_address)
                            .addComponent(txt_phone)
                            .addComponent(txt_fax)
                            .addComponent(txt_email)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_branchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(branch_code_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_district, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txt_division, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(division_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(districk_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(cmd_back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cmd_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmd_savebranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmd_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmd_update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(cmd_print_branches, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_branchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_branchcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(branch_code_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(division_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(districk_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_savebranch)
                    .addComponent(jButton1)
                    .addComponent(cmd_clear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_update)
                    .addComponent(cmd_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_print_branches)
                    .addComponent(cmd_back))
                .addContainerGap())
        );

        branch_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        branch_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branch_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(branch_table);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Show Branch Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("FUJI LAB ALL BRANCH INFORMATION");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypkg/Fuji_logo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1169, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_savebranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_savebranchActionPerformed
        // TODO add your handling code here:
        
        String b_code = txt_branchcode.getText();
        String b_name = txt_branchname.getText();
        String b_address = txt_address.getText();
        String b_phone = txt_phone.getText();
        String b_email = txt_email.getText();
        String b_division = txt_division.getText();
        String b_district = txt_district.getText();
        
        if(b_code.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Branch code can not be empty");
        }
        else if(b_name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Branch Name can not be empty");
        }
        else if(b_address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Branch Address can not be empty");
        }
        else if(b_phone.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Phone number can not be empty");
        }
        else if(b_email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Email can not be empty");
        }
        else if(b_division.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Division can not be empty");
        }
        else if(b_district.equals(""))
        {
            JOptionPane.showMessageDialog(null, "District can not be empty");
        }
        else
        {
        try
        {
        String sql = "insert into branch_info (branch_code, branch_name, address, phone, fax , email, division, district) values(?,?,?,?,?,?,?,? )";
        pst = conn.prepareStatement(sql);
        
        pst.setString(1,txt_branchcode.getText());
        pst.setString(2,txt_branchname.getText());
        pst.setString(3,txt_address.getText());
        pst.setString(4,txt_phone.getText());
        pst.setString(5,txt_fax.getText());
        pst.setString(6,txt_email.getText());
        pst.setString(7,txt_division.getText());
        pst.setString(8,txt_district.getText());
        
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Saved Branch");
        
        clear();
        
        
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }//GEN-LAST:event_cmd_savebranchActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Update_table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmd_print_branchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_print_branchesActionPerformed
        // TODO add your handling code here:
        
         MessageFormat header = new MessageFormat("All Branch Information");
         MessageFormat footer = new MessageFormat("page{0,number,integer}");
        
        try
        {
            branch_table.print(JTable.PrintMode.NORMAL, header, footer);
            
        }catch(java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n ", e.getMessage());
        }
        
    }//GEN-LAST:event_cmd_print_branchesActionPerformed

    private void cmd_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_backActionPerformed
        // TODO add your handling code here:
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        
    }//GEN-LAST:event_cmd_backActionPerformed

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
        
         try
        {
            String sql = "delete from branch_info where branch_code = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_branchcode.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            clear();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void branch_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branch_tableMouseClicked
        // TODO add your handling code here:
        try
        {
            int row = branch_table.getSelectedRow();
            String table_click = (branch_table.getModel().getValueAt(row, 0).toString());
            String sql = "select * from  branch_info where branch_code = '"+table_click+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String add1 = rs.getString("branch_code");
                txt_branchcode.setText(add1);
                
                String add2 = rs.getString("branch_name");
                txt_branchname.setText(add2);
                
                String add3 = rs.getString("address");
                txt_address.setText(add3);
                
                String add4 = rs.getString("phone");
                txt_phone.setText(add4);
                
                String add5 = rs.getString("fax");
                txt_fax.setText(add5);
                
                String add6 = rs.getString("email");
                txt_email.setText(add6);
                
                String add7 = rs.getString("division");
                txt_division.setText(add7);
                
                String add8 = rs.getString("district");
                txt_district.setText(add8);
                
                
                
                
            }
            
        }catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_branch_tableMouseClicked

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
         try
        {
        String b_code = txt_branchcode.getText();
        String b_name = txt_branchname.getText();
        String b_address = txt_address.getText();
        String phone = txt_phone.getText();
        String fax = txt_fax.getText();
        String email = txt_email.getText();
        String division = txt_division.getText();
        String district = txt_district.getText();
        
        
        
         //Update query 
            String sql = "update  branch_info set branch_name = '"+b_name+"', address = '"+b_address+"', phone= '"+phone+"', fax = '"+fax+"', email = '"+email+"', division = '"+division+"', district = '"+district+"' where branch_code = '"+b_code+"' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
            clear();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void branch_code_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branch_code_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branch_code_comboActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cmd_clearActionPerformed

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
            java.util.logging.Logger.getLogger(BranchInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BranchInfoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox branch_code_combo;
    private javax.swing.JTable branch_table;
    private javax.swing.JButton cmd_back;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_print_branches;
    private javax.swing.JButton cmd_savebranch;
    private javax.swing.JButton cmd_update;
    private javax.swing.JComboBox districk_combo;
    private javax.swing.JComboBox division_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_branchcode;
    private javax.swing.JTextField txt_branchname;
    private javax.swing.JTextField txt_district;
    private javax.swing.JTextField txt_division;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fax;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
