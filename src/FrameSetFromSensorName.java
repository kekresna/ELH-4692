
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kresn
 */
public class FrameSetFromSensorName extends javax.swing.JFrame {

    /**
     * Creates new form FrameMainMenu
     */
    
    public FrameSetFromSensorName() throws InterruptedException {
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

        btnShowTemperature4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnShowFromAAAA = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnShowFromCCCC = new javax.swing.JButton();
        btnShowFromDADE = new javax.swing.JButton();
        btnShowFromDAD3 = new javax.swing.JButton();
        btnShowCAC2 = new javax.swing.JButton();
        btnShowFromBAB1 = new javax.swing.JButton();
        btnShowFromCACA = new javax.swing.JButton();
        btnShowFromEEEE = new javax.swing.JButton();
        btnShowFromBABE = new javax.swing.JButton();

        btnShowTemperature4.setText("AAAA");
        btnShowTemperature4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTemperature4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELH - 4692");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Visualisasi Data");
        jLabel2.setEnabled(false);

        jLabel1.setText("Alvin Kresna - 2013730031");
        jLabel1.setEnabled(false);

        btnShowFromAAAA.setText("AAAA");
        btnShowFromAAAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromAAAAActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnShowFromCCCC.setText("CCCC");
        btnShowFromCCCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromCCCCActionPerformed(evt);
            }
        });

        btnShowFromDADE.setText("DADE");
        btnShowFromDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromDADEActionPerformed(evt);
            }
        });

        btnShowFromDAD3.setText("DAD3");
        btnShowFromDAD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromDAD3ActionPerformed(evt);
            }
        });

        btnShowCAC2.setText("CAC2");
        btnShowCAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCAC2ActionPerformed(evt);
            }
        });

        btnShowFromBAB1.setText("BAB1");
        btnShowFromBAB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromBAB1ActionPerformed(evt);
            }
        });

        btnShowFromCACA.setText("CACA");
        btnShowFromCACA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromCACAActionPerformed(evt);
            }
        });

        btnShowFromEEEE.setText("EEEE");
        btnShowFromEEEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromEEEEActionPerformed(evt);
            }
        });

        btnShowFromBABE.setText("BABE");
        btnShowFromBABE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromBABEActionPerformed(evt);
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
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShowFromDAD3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowCAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowFromBAB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShowFromAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowFromCCCC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowFromDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShowFromCACA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowFromEEEE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowFromBABE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowFromAAAA)
                    .addComponent(btnShowFromCCCC)
                    .addComponent(btnShowFromDADE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowFromDAD3)
                    .addComponent(btnShowCAC2)
                    .addComponent(btnShowFromBAB1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowFromCACA)
                    .addComponent(btnShowFromEEEE)
                    .addComponent(btnShowFromBABE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowFromAAAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromAAAAActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromAAAA.getText());
            show.setTitle(btnShowFromAAAA.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromAAAAActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        try {
            FrameMainMenu main = new FrameMainMenu();
            main.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnShowFromCCCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromCCCCActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromCCCC.getText());
            show.setTitle(btnShowFromCCCC.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromCCCCActionPerformed

    private void btnShowFromDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromDADEActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromDADE.getText());
            show.setTitle(btnShowFromDADE.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromDADEActionPerformed

    private void btnShowFromDAD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromDAD3ActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromDAD3.getText());
            show.setTitle(btnShowFromDAD3.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromDAD3ActionPerformed

    private void btnShowTemperature4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTemperature4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowTemperature4ActionPerformed

    private void btnShowCAC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCAC2ActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowCAC2.getText());
            show.setTitle(btnShowCAC2.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowCAC2ActionPerformed

    private void btnShowFromBAB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromBAB1ActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromBAB1.getText());
            show.setTitle(btnShowFromBAB1.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromBAB1ActionPerformed

    private void btnShowFromCACAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromCACAActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromCACA.getText());
            show.setTitle(btnShowFromCACA.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromCACAActionPerformed

    private void btnShowFromEEEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromEEEEActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromEEEE.getText());
            show.setTitle(btnShowFromEEEE.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromEEEEActionPerformed

    private void btnShowFromBABEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromBABEActionPerformed
        this.dispose();
        try {
            ShowFromSensor show = new ShowFromSensor();
            show.setTitleOnFrame("Sensor : " + btnShowFromBABE.getText());
            show.setTitle(btnShowFromBABE.getText());
            show.runVisualization();
        } catch (InterruptedException ex) {
            Logger.getLogger(FrameSetFromSensorName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowFromBABEActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrameMainMenu().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrameCategory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnShowCAC2;
    private javax.swing.JButton btnShowFromAAAA;
    private javax.swing.JButton btnShowFromBAB1;
    private javax.swing.JButton btnShowFromBABE;
    private javax.swing.JButton btnShowFromCACA;
    private javax.swing.JButton btnShowFromCCCC;
    private javax.swing.JButton btnShowFromDAD3;
    private javax.swing.JButton btnShowFromDADE;
    private javax.swing.JButton btnShowFromEEEE;
    private javax.swing.JButton btnShowTemperature4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
