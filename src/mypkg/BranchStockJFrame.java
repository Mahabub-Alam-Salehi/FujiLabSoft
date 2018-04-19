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
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author R-one
 */
public class BranchStockJFrame extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statement = null;
    private Database db;

    public BranchStockJFrame() {
        initComponents();
        db = new Database();
        conn = db.CreateDBConnection();
    }
    
    
     private void Update_table()
    {
        try{
        String sql = "select * from branch_stock";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        branch_stock_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
     
     private void clear()
     {
         txt_p_id.setText("");
         txt_product_code.setText("");
         txt_opening_stock.setText("");
         txt_branch_code.setText("");
         txt_branch_name.setText("");
         txt_date.getDateFormatString();
         txt_description.setText("");
         txt_challan_no.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        cmd_show_stock = new javax.swing.JButton();
        cmd_save_stock = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_product_code = new javax.swing.JTextField();
        txt_branch_code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_description = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_opening_stock = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        cmd_print = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        cmd_delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_p_id = new javax.swing.JTextField();
        txt_challan_no = new javax.swing.JTextField();
        cmd_back = new javax.swing.JButton();
        txt_product_id_combo = new javax.swing.JComboBox();
        txt_product_code_combo = new javax.swing.JComboBox();
        txt_branch_code_combo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txt_branch_name = new javax.swing.JTextField();
        cmd_search_stock = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        branch_stock_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Branch Stock Information");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch Stock Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel3.setText("Opening Srock:");

        cmd_show_stock.setText("Show");
        cmd_show_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_show_stockActionPerformed(evt);
            }
        });

        cmd_save_stock.setText("Save Stock");
        cmd_save_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_save_stockActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Id:");

        jLabel5.setText("Product Code:");

        jLabel4.setText("Branch Code:");

        jLabel6.setText("Date:");

        txt_date.setDateFormatString("yyyy-MM-dd");

        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
            }
        });

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

        jLabel8.setText("Description:");

        jLabel9.setText("Challan No:");

        cmd_back.setText("<< Back");
        cmd_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_backActionPerformed(evt);
            }
        });

        txt_product_id_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_product_code_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_branch_code_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Branch Name:");

        cmd_search_stock.setText("Search Stock");
        cmd_search_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_search_stockActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(cmd_search_stock))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmd_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmd_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmd_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmd_print, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmd_update, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmd_save_stock)
                                .addGap(18, 18, 18)
                                .addComponent(cmd_show_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_description)
                            .addComponent(txt_opening_stock)
                            .addComponent(txt_challan_no)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_product_code, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(txt_p_id, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_product_id_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_product_code_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_branch_code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_branch_code_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_branch_name))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_product_id_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_product_code_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_opening_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_branch_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_branch_code_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_branch_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_challan_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_save_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd_show_stock)
                    .addComponent(cmd_search_stock))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_print)
                    .addComponent(cmd_update)
                    .addComponent(cmd_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_delete)
                    .addComponent(cmd_back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        branch_stock_table.setModel(new javax.swing.table.DefaultTableModel(
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
        branch_stock_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branch_stock_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(branch_stock_table);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypkg/Fuji_logo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_save_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_save_stockActionPerformed
        // TODO add your handling code here:
        
        String pro_id = txt_p_id.getText();
        String pro_code = txt_product_code.getText();
        String op_stock = txt_opening_stock.getText();
        String b_code = txt_branch_code.getText();
        String b_name = txt_branch_name.getText();
        String date = txt_date.getDateFormatString();
        String des = txt_description.getText();
        String challan_no = txt_challan_no.getText();
        
        if(pro_id.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Product Id can not be Empty");
        }
        else if(pro_code.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Product Code can not be Empty");
        }
        else if(op_stock.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Opening Stock can not be Empty");
        }
        else if(b_code.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Branch Code can not be Empty");
        }
        else if(b_name.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Branch Name can not be Empty");
        }
        else if(date.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Date can not be Empty");
        }
        else if(des.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Description can not be Empty");
        }
        else if(challan_no.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Challan no can not be Empty");
        }
        else
        {
            try
            {
                //insert query
                String sql = "insert into branch_stock(p_id, Product_code, opening_stock, branch_code, branch_name, date, description,  challan_no) values(?,?,?,?,?,?,?,?) ";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_p_id.getText());
                pst.setString(2, txt_product_code.getText());
                pst.setString(3, txt_opening_stock.getText());
                pst.setString(4, txt_branch_code.getText());
                pst.setString(5, txt_branch_name.getText());
                pst.setString(6, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                pst.setString(7, txt_description.getText());
                pst.setString(8, txt_challan_no.getText());
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Save Stock");
                clear();
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            Update_table();
        }
    }//GEN-LAST:event_cmd_save_stockActionPerformed

    private void cmd_show_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_show_stockActionPerformed
        // TODO add your handling code here:
        Update_table();
    }//GEN-LAST:event_cmd_show_stockActionPerformed

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
        // TODO add your handling code here:
        
         MessageFormat header = new MessageFormat("Branch Stock Information");
         MessageFormat footer = new MessageFormat("page{0,number,integer}");
        
        try
        {
            branch_stock_table.print(JTable.PrintMode.NORMAL, header, footer);
            
        }catch(java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print %s%n ", e.getMessage());
        }
        
    }//GEN-LAST:event_cmd_printActionPerformed

    private void cmd_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_backActionPerformed
        // TODO add your handling code here:
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        
    }//GEN-LAST:event_cmd_backActionPerformed

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
         try
        {
            //delete query
            String sql = "delete from branch_stock where p_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_p_id.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            clear();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void branch_stock_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branch_stock_tableMouseClicked
        // TODO add your handling code here:
         try
        {
            int row = branch_stock_table.getSelectedRow();
            String table_click = (branch_stock_table.getModel().getValueAt(row, 0).toString());
            String sql = "select * from   branch_stock where p_id = '"+table_click+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String add1 = rs.getString("p_id");
                txt_p_id.setText(add1);
                
                String add2 = rs.getString("product_code");
                txt_product_code.setText(add2);
                
                String add3 = rs.getString("opening_stock");
                txt_opening_stock.setText(add3);
                
                String add4 = rs.getString("branch_code");
                txt_branch_code.setText(add4);
                
                String add5 = rs.getString("branch_name");
                txt_branch_name.setText(add5);
                
                String add6 = rs.getString("date");
                txt_date.setDateFormatString(add6);
                
                String add7 = rs.getString("description");
                txt_description.setText(add7);
                
                String add8 = rs.getString("challan_no");
                txt_challan_no.setText(add8);
                
                
            }
            
        }catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }//GEN-LAST:event_branch_stock_tableMouseClicked

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
        try
        {
        String pro_id = txt_p_id.getText();
        String pro_code = txt_product_code.getText();
        String op_stock = txt_opening_stock.getText();
        String b_code = txt_branch_code.getText();
        String b_name = txt_branch_name.getText();
        String date = txt_date.getDateFormatString();
        String des = txt_description.getText();
        String challan_no = txt_challan_no.getText();
        
        //update query
        String sql = "update branch_stock set product_code = '"+pro_code+"', opening_stock = '"+op_stock+"', branch_code = '"+b_code+"',branch_name = '"+b_name+"', date = '"+date+"', description = '"+des+"', challan_no = '"+challan_no+"' where p_id = '"+pro_id+"'";
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

    private void cmd_search_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_search_stockActionPerformed
        // TODO add your handling code here:
        BranchWiseStockJFrame bws = new BranchWiseStockJFrame();
        bws.setVisible(true);
        
    }//GEN-LAST:event_cmd_search_stockActionPerformed

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
            java.util.logging.Logger.getLogger(BranchStockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchStockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchStockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchStockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BranchStockJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable branch_stock_table;
    private javax.swing.JButton cmd_back;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_print;
    private javax.swing.JButton cmd_save_stock;
    private javax.swing.JButton cmd_search_stock;
    private javax.swing.JButton cmd_show_stock;
    private javax.swing.JButton cmd_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txt_branch_code;
    private javax.swing.JComboBox txt_branch_code_combo;
    private javax.swing.JTextField txt_branch_name;
    private javax.swing.JTextField txt_challan_no;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_opening_stock;
    private javax.swing.JTextField txt_p_id;
    private javax.swing.JTextField txt_product_code;
    private javax.swing.JComboBox txt_product_code_combo;
    private javax.swing.JComboBox txt_product_id_combo;
    // End of variables declaration//GEN-END:variables
}