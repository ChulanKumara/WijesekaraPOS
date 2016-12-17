/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wijesekara.stores.pos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Samintha
 */
public class LoginWindow extends javax.swing.JFrame {

    /**
     * Creates new form LoginWindow
     */
    JFileChooser fr = new JFileChooser();
    FileSystemView fw = fr.getFileSystemView();
    Base64Converter base64 = new Base64Converter();
    ConfigureDBWindow config_window;
    
    public static String userName;

    public LoginWindow() {
        initComponents();

        //this belowe code working if config file in user documents not exists.
        File file = new File("config.dat");
        File file_in_library_ms_dir = new File(fw.getDefaultDirectory() + "\\WPOS\\config.dat");
        File library_ms_dir = new File(fw.getDefaultDirectory() + "\\WPOS");
        if (!library_ms_dir.exists() | !file_in_library_ms_dir.exists()) {
            try {
                library_ms_dir.mkdir();
            } catch (SecurityException ex) {
                JOptionPane.showMessageDialog(null, "Cannot create a folder in your document, because of security of your system");
            }

            try {

                FileOutputStream writeStream = new FileOutputStream(file, false); // true to append
                PrintWriter pw = new PrintWriter(writeStream);
                pw.println("");
                pw.println("root");
                pw.println("");
                pw.println("localhost:3306");
                pw.println("wijesekarapos");
                pw.flush();
                pw.close();

                base64.encode_to_base64(); //convert temporary file to Base64
                file.delete(); //delete temporary created file
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error writting to config file!");
            }
        } else {
            String username_db = "", password_db = "";

            String line, mysql_uname = "root", mysql_pass = "", mysql_server = "localhost:3306", mysql_db = "wijesekarapos";

            try {
                base64.decode_from_base64();
                File temp_config = new File(fw.getDefaultDirectory() + "\\WPOS\\config_temp.dat");
                FileReader fr = new FileReader(temp_config);

                BufferedReader br = null;
                if (temp_config.exists()) {
                    br = new BufferedReader(fr);
                }

                while ((line = br.readLine()) != null) {
                    mysql_uname = br.readLine();
                    mysql_pass = br.readLine();
                    mysql_server = br.readLine();
                    mysql_db = br.readLine();
                }
                //fetching details from the config file
                fr.close();
                br.close();
                temp_config.delete();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error reading the config file!");
            }

            MySqlDBConnect dbconclass = new MySqlDBConnect();
            dbconclass.getDBFromFile(mysql_server, mysql_db, mysql_uname, mysql_pass);
        }

        view_config_window();
    }

    public void view_config_window() {
        config_window = new ConfigureDBWindow();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernamelog_txt = new javax.swing.JTextField();
        usernamepasslog_txt = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        configdbBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel2.setText("Password");

        login_btn.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        login_btn.setText("LOGIN");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel3.setText("Wijesekara Stores");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setText("POS");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        jLabel5.setText("Copyright © 2106 All Rights Reserved.");

        configdbBtn.setText("Config DB");
        configdbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configdbBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(configdbBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernamelog_txt)
                                    .addComponent(usernamepasslog_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernamelog_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernamepasslog_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(configdbBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configdbBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configdbBtnActionPerformed
        ConfigureDBWindow configdb = new ConfigureDBWindow();
        configdb.pack();
        configdb.setLocationRelativeTo(null);
        configdb.setVisible(true);
    }//GEN-LAST:event_configdbBtnActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        MySqlDBConnect newdb = new MySqlDBConnect();
        newdb.connectDB();
        
        //set static user name for the this session
        userName = usernamelog_txt.getText().trim();

        if (usernamelog_txt.getText().trim().equals("") | usernamepasslog_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill the Required Fields!");
        } else {
            String usernamelog = usernamelog_txt.getText().trim();
            MD5Converter md5cnvtr = new MD5Converter();
            String usernamepasslog = md5cnvtr.md5(usernamepasslog_txt.getText());

            if (newdb.loginUser(usernamelog, usernamepasslog)) {
                MainClassUI run_main_window = new MainClassUI();
                run_main_window.pack();
                run_main_window.setLocationRelativeTo(null);
                run_main_window.setVisible(true);
                newdb.closeConnection();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username/Password Incorrect!");
                newdb.closeConnection();
            }
        }
    }//GEN-LAST:event_login_btnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });

//        MainClassUI mainwindow = new MainClassUI();
//        mainwindow.pack();
//        mainwindow.setLocationRelativeTo(null);
//        mainwindow.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configdbBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JTextField usernamelog_txt;
    private javax.swing.JPasswordField usernamepasslog_txt;
    // End of variables declaration//GEN-END:variables
}