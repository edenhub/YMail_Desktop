/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pri.adam.ymail.client.desktop.frame;

/**
 *
 * @author adam
 */
public class YMail_Main extends javax.swing.JFrame {

    /**
     * Creates new form YMail_Main
     */
    public YMail_Main() {
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

        jPanel1 = new javax.swing.JPanel();
        YMail_MenuBar = new javax.swing.JMenuBar();
        YMail_Menu_File = new javax.swing.JMenu();
        YMail_MenuItem_Login = new javax.swing.JMenuItem();
        YMail_MenuItem_Quit = new javax.swing.JMenuItem();
        YMail_Menu_Edit = new javax.swing.JMenu();
        YMail_Menu_Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YMail");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        YMail_Menu_File.setText("文件");

        YMail_MenuItem_Login.setText("登陆");
        YMail_Menu_File.add(YMail_MenuItem_Login);

        YMail_MenuItem_Quit.setText("退出");
        YMail_MenuItem_Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YMail_MenuItem_QuitActionPerformed(evt);
            }
        });
        YMail_Menu_File.add(YMail_MenuItem_Quit);

        YMail_MenuBar.add(YMail_Menu_File);

        YMail_Menu_Edit.setText("编辑");
        YMail_MenuBar.add(YMail_Menu_Edit);

        YMail_Menu_Help.setText("帮助");
        YMail_MenuBar.add(YMail_Menu_Help);

        setJMenuBar(YMail_MenuBar);

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
                .addGap(0, 406, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YMail_MenuItem_QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YMail_MenuItem_QuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YMail_MenuItem_QuitActionPerformed

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
            java.util.logging.Logger.getLogger(YMail_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YMail_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YMail_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YMail_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YMail_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar YMail_MenuBar;
    private javax.swing.JMenuItem YMail_MenuItem_Login;
    private javax.swing.JMenuItem YMail_MenuItem_Quit;
    private javax.swing.JMenu YMail_Menu_Edit;
    private javax.swing.JMenu YMail_Menu_File;
    private javax.swing.JMenu YMail_Menu_Help;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
