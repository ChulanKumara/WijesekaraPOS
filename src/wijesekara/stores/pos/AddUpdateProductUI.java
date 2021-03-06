/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wijesekara.stores.pos;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Chulan
 */
public class AddUpdateProductUI extends javax.swing.JFrame {

    /**
     * Creates new form AddUpdateProductUI
     */
    public AddUpdateProductUI() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        upd_prdid_txt = new javax.swing.JTextField();
        upd_prdgo_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        upd_prdbarcode_txt = new javax.swing.JTextField();
        upd_prditemnum_txt = new javax.swing.JTextField();
        upd_prddesc_txt = new javax.swing.JTextField();
        upd_prdprice_txt = new javax.swing.JTextField();
        upd_prddiscount_txt = new javax.swing.JTextField();
        upd_supname_cmb = new javax.swing.JComboBox<>();
        upd_prdavailable_spn = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        upd_prddelete_btn = new javax.swing.JButton();
        upd_prdupdate_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ins_prdbarcode_txt = new javax.swing.JTextField();
        ins_prditemnum_txt = new javax.swing.JTextField();
        ins_prddesc_txt = new javax.swing.JTextField();
        ins_prdprice_txt = new javax.swing.JTextField();
        ins_prddiscount_txt = new javax.swing.JTextField();
        ins_supname_cmb = new javax.swing.JComboBox<>();
        ins_prdadd_btn = new javax.swing.JButton();
        ins_prdavailable_spn = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add or Update Product");
        setResizable(false);

        jLabel1.setText("Update/Delete Product");

        jLabel2.setText("Product ID :");

        upd_prdgo_btn.setText("GO");
        upd_prdgo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_prdgo_btnActionPerformed(evt);
            }
        });

        jLabel3.setText("Barcode :");

        jLabel4.setText("Item Number :");

        jLabel5.setText("Description :");

        jLabel6.setText("Price :");

        jLabel7.setText("Discount :");

        jLabel8.setText("Supplier Name :");

        jLabel9.setText("Available Items :");

        upd_prdprice_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upd_prdprice_txtKeyTyped(evt);
            }
        });

        upd_prddiscount_txt.setText("0");
        upd_prddiscount_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upd_prddiscount_txtKeyTyped(evt);
            }
        });

        upd_supname_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        upd_prdavailable_spn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        upd_prddelete_btn.setText("Delete Product");
        upd_prddelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_prddelete_btnActionPerformed(evt);
            }
        });

        upd_prdupdate_btn.setText("Update Product");
        upd_prdupdate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_prdupdate_btnActionPerformed(evt);
            }
        });

        jLabel10.setText("Insert a Product");

        jLabel11.setText("Barcode :");

        jLabel12.setText("Item Number :");

        jLabel13.setText("Description");

        jLabel14.setText("Price :");

        jLabel15.setText("Discount :");

        jLabel16.setText("Supplier Name :");

        jLabel17.setText("Available Items :");

        ins_prdprice_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ins_prdprice_txtKeyTyped(evt);
            }
        });

        ins_prddiscount_txt.setText("0");
        ins_prddiscount_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ins_prddiscount_txtKeyTyped(evt);
            }
        });

        ins_supname_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ins_prdadd_btn.setText("Add Product");
        ins_prdadd_btn.setMaximumSize(new java.awt.Dimension(118, 32));
        ins_prdadd_btn.setMinimumSize(new java.awt.Dimension(118, 32));
        ins_prdadd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_prdadd_btnActionPerformed(evt);
            }
        });

        ins_prdavailable_spn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                        .addComponent(upd_prddelete_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(upd_prdupdate_btn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(upd_prdid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(upd_prdgo_btn))
                                            .addComponent(upd_prdbarcode_txt)
                                            .addComponent(upd_prditemnum_txt)
                                            .addComponent(upd_prddesc_txt)
                                            .addComponent(upd_prdprice_txt)
                                            .addComponent(upd_supname_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(upd_prddiscount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(upd_prdavailable_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ins_prdbarcode_txt)
                                    .addComponent(ins_prditemnum_txt)
                                    .addComponent(ins_prddesc_txt)
                                    .addComponent(ins_prdprice_txt)
                                    .addComponent(ins_prddiscount_txt)
                                    .addComponent(ins_supname_cmb, 0, 175, Short.MAX_VALUE)
                                    .addComponent(ins_prdavailable_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ins_prdadd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prdid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upd_prdgo_btn)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prdbarcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prditemnum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prddesc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prdprice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prddiscount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_supname_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prdavailable_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upd_prdupdate_btn)
                    .addComponent(upd_prddelete_btn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ins_prdbarcode_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ins_prditemnum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ins_prddesc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ins_prdprice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ins_prddiscount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(ins_supname_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ins_prdavailable_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ins_prdadd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upd_prdupdate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_prdupdate_btnActionPerformed
        //updating a product
        Product prd = new Product();
        prd.connectDB();
        if (upd_prdid_txt.getText().trim().equals("") || upd_prdbarcode_txt.getText().trim().equals("") || upd_prditemnum_txt.getText().trim().equals("") || upd_prdprice_txt.getText().trim().equals("") || upd_prddiscount_txt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill Required Fields!");
        } else {
            prd.updateProduct(Integer.parseInt(upd_prdid_txt.getText().trim()), upd_prdbarcode_txt.getText().trim(), upd_prditemnum_txt.getText().trim(), upd_prddesc_txt.getText().trim(), Float.parseFloat(upd_prdprice_txt.getText().trim()), Integer.parseInt(upd_prddiscount_txt.getText().trim()), upd_supname_cmb.getSelectedItem().toString(), (Integer) upd_prdavailable_spn.getValue());
            upd_prdid_txt.setText("");
            upd_prdbarcode_txt.setText("");
            upd_prditemnum_txt.setText("");
            upd_prddesc_txt.setText("");
            upd_prdprice_txt.setText("");
            upd_prddiscount_txt.setText("");
            upd_prdavailable_spn.setValue(0);
        }
        prd.closeConnection();
    }//GEN-LAST:event_upd_prdupdate_btnActionPerformed

    private void upd_prdgo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_prdgo_btnActionPerformed
        Product prdct = new Product();
        prdct.connectDB();
        List list = prdct.getProductDetails(upd_prdid_txt.getText());
        if (!list.isEmpty()) {
            upd_prdbarcode_txt.setText((String) list.get(0));
            upd_prditemnum_txt.setText((String) list.get(1));
            upd_prddesc_txt.setText((String) list.get(2));
            upd_prdprice_txt.setText((String) list.get(3));
            upd_prddiscount_txt.setText((String) list.get(4));
            upd_prdavailable_spn.setValue((Integer) list.get(5));
        } else {
            JOptionPane.showMessageDialog(null, "Product ID not valid!");
        }
        //set supplier name 
        String supplierName_DB = prdct.getSupplierName(upd_prdid_txt.getText());

        int size = upd_supname_cmb.getItemCount();
        for (int i = 0; i < size; i++) {
            String item = upd_supname_cmb.getItemAt(i);
            if (item.equals(supplierName_DB)) {
                upd_supname_cmb.setSelectedIndex(i);
            }
        }

        prdct.closeConnection();
    }//GEN-LAST:event_upd_prdgo_btnActionPerformed

    private void ins_prdadd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_prdadd_btnActionPerformed
        // insert product
        Product prd = new Product();
        prd.connectDB();
        if (ins_prdbarcode_txt.getText().trim().equals("") || ins_prditemnum_txt.getText().trim().equals("") || ins_prddesc_txt.getText().trim().equals("") || ins_prdprice_txt.getText().trim().equals("") || ins_prddiscount_txt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill Required Fields!");
        } else {
            prd.insertProduct(ins_prdbarcode_txt.getText().trim(), ins_prditemnum_txt.getText().trim(), ins_prddesc_txt.getText().trim(), Float.parseFloat(ins_prdprice_txt.getText().trim()), Integer.parseInt(ins_prddiscount_txt.getText().trim()), ins_supname_cmb.getSelectedItem().toString(), (Integer) ins_prdavailable_spn.getValue());
            ins_prdbarcode_txt.setText("");
            ins_prditemnum_txt.setText("");
            ins_prddesc_txt.setText("");
            ins_prdprice_txt.setText("");
            ins_prddiscount_txt.setText("");
            ins_prdavailable_spn.setValue(0);
        }
        prd.closeConnection();
    }//GEN-LAST:event_ins_prdadd_btnActionPerformed

    private void upd_prddelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_prddelete_btnActionPerformed
        // delete product
        Product prd = new Product();
        prd.connectDB();
        if (upd_prdid_txt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill Required Fields!");
        } else {
            int reply = JOptionPane.showConfirmDialog(null,
                    "Are you sure want to delete this product?", "Quit", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                prd.deleteProduct(Integer.parseInt(upd_prdid_txt.getText().trim()));
                upd_prdid_txt.setText("");
                upd_prdbarcode_txt.setText("");
                upd_prditemnum_txt.setText("");
                upd_prddesc_txt.setText("");
                upd_prdprice_txt.setText("");
                upd_prddiscount_txt.setText("");
                upd_prdavailable_spn.setValue(0);
            }
        }
        prd.closeConnection();
    }//GEN-LAST:event_upd_prddelete_btnActionPerformed

    private void upd_prdprice_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upd_prdprice_txtKeyTyped
        if (upd_prdprice_txt.getText().contains(".")) {
            char c = evt.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                evt.consume();
            }
        } else if (upd_prdprice_txt.getText().trim().equals("")) {
            char c = evt.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                evt.consume();
            }
        } else {
            char c = evt.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE)
                    || (c == '.'))) {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_upd_prdprice_txtKeyTyped

    private void ins_prdprice_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ins_prdprice_txtKeyTyped
        if (ins_prdprice_txt.getText().contains(".")) {
            char c = evt.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                evt.consume();
            }
        } else if (ins_prdprice_txt.getText().trim().equals("")) {
            char c = evt.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                evt.consume();
            }
        } else {
            char c = evt.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE)
                    || (c == '.'))) {
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_ins_prdprice_txtKeyTyped

    private void upd_prddiscount_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upd_prddiscount_txtKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            
                getToolkit().beep();
                evt.consume();
        }
    }//GEN-LAST:event_upd_prddiscount_txtKeyTyped

    private void ins_prddiscount_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ins_prddiscount_txtKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            
                getToolkit().beep();
                evt.consume();
        }
    }//GEN-LAST:event_ins_prddiscount_txtKeyTyped

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
            java.util.logging.Logger.getLogger(AddUpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUpdateProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUpdateProductUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ins_prdadd_btn;
    private javax.swing.JSpinner ins_prdavailable_spn;
    private javax.swing.JTextField ins_prdbarcode_txt;
    private javax.swing.JTextField ins_prddesc_txt;
    private javax.swing.JTextField ins_prddiscount_txt;
    private javax.swing.JTextField ins_prditemnum_txt;
    private javax.swing.JTextField ins_prdprice_txt;
    public javax.swing.JComboBox<String> ins_supname_cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner upd_prdavailable_spn;
    private javax.swing.JTextField upd_prdbarcode_txt;
    private javax.swing.JButton upd_prddelete_btn;
    private javax.swing.JTextField upd_prddesc_txt;
    private javax.swing.JTextField upd_prddiscount_txt;
    private javax.swing.JButton upd_prdgo_btn;
    private javax.swing.JTextField upd_prdid_txt;
    private javax.swing.JTextField upd_prditemnum_txt;
    private javax.swing.JTextField upd_prdprice_txt;
    private javax.swing.JButton upd_prdupdate_btn;
    public javax.swing.JComboBox<String> upd_supname_cmb;
    // End of variables declaration//GEN-END:variables
}
