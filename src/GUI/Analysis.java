/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import static java.sql.DriverManager.println;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import pr1.FrameRunnable;
import pr1.Loadbar;
import static pr1.MongoDB.generateGraphs;
import static pr1.MongoDB.requestByTopic;

/**
 *
 * @author nikitaivancov
 */
public class Analysis extends javax.swing.JFrame {
    
    public Thread t1;
    public Thread t2;
    public static boolean flag=false;
    public JProgressBar progress;
      
     
    
    public Analysis() {
         super("JProgressBar Color Demonstration");
        initComponents();
         UIManager.put("ProgressBar.selectionForeground", Color.red);
      UIManager.put("ProgressBar.selectionBackground", Color.green);
       /* progress = new JProgressBar(50,50);
        jPanel1.add(progress);
        progress.setVisible(true);
        progress.setOpaque(true);
        progress.setVisible(true); */
        
        // UIManager.put("JProgressBar.foreground",Color.GREEN);
         Graphics2D g=null;
         progress= new JProgressBar();
         progress.setIndeterminate(true);
         progress.setSize(100,100);
         progress.setLocation(100,100);
         progress.setOpaque(true);
         progress.setUI(new MyProgressUI());
        // progress.setUI(new MyProgressUI());
       // g.setColor(progress.getForeground());
        progress.setForeground(Color.BLUE);
        progress.setIndeterminate(true);
         
         progress.setOpaque(true);
         jPanel1.add(progress);
         

    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is 
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtField = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("ANALYSIS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Please write the topic");

        txtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnGo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGo)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        NewJFrame frame=null;
        Date date = new Date();

        requestByTopic(txtField.getText(),date);
        int []neg=  generateGraphs("neg",date,txtField.getText());
        int []pos=generateGraphs("pos",date,txtField.getText());
        // new NewJFrame(pos,neg,txtField.getText(),date).setVisible(true);
        t1=new FrameRunnable(neg,pos,txtField.getText(),date,frame);

        t2=new Loadbar(progress);
        t1.start(); t2.start();
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        while(true){

        }
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldActionPerformed

    }//GEN-LAST:event_txtFieldActionPerformed

    /**G
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
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       // System.out.println("hello");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
}
