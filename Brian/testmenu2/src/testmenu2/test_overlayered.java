/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmenu2;

/**
 *
 * @author Himkw_000
 */
public class test_overlayered extends javax.swing.JFrame {

  /**
   * Creates new form test_overlayered
   */
  public test_overlayered() {
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

    jButton2 = new javax.swing.JButton();
    jLayeredPane2 = new javax.swing.JLayeredPane();
    jButton3 = new javax.swing.JButton();
    jLayeredPane1 = new javax.swing.JLayeredPane();
    jButton1 = new javax.swing.JButton();

    jButton2.setText("jButton2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
    jLayeredPane2.setMaximumSize(new java.awt.Dimension(500, 400));
    jLayeredPane2.setMinimumSize(new java.awt.Dimension(500, 400));
    jLayeredPane2.setPreferredSize(new java.awt.Dimension(500, 400));
    jLayeredPane2.setVisible(false);

    jButton3.setText("go 1");
    jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton3MouseClicked(evt);
      }
    });

    javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
    jLayeredPane2.setLayout(jLayeredPane2Layout);
    jLayeredPane2Layout.setHorizontalGroup(
      jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
        .addContainerGap(633, Short.MAX_VALUE)
        .addComponent(jButton3)
        .addContainerGap())
    );
    jLayeredPane2Layout.setVerticalGroup(
      jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jLayeredPane2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jButton3)
        .addContainerGap(364, Short.MAX_VALUE))
    );
    jLayeredPane2.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

    jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jLayeredPane1.setMaximumSize(new java.awt.Dimension(500, 400));
    jLayeredPane1.setMinimumSize(new java.awt.Dimension(500, 400));
    jLayeredPane1.setPreferredSize(new java.awt.Dimension(500, 400));

    jButton1.setText("go 2");
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton1MouseClicked(evt);
      }
    });

    javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
    jLayeredPane1.setLayout(jLayeredPane1Layout);
    jLayeredPane1Layout.setHorizontalGroup(
      jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jLayeredPane1Layout.createSequentialGroup()
        .addContainerGap(633, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addContainerGap())
    );
    jLayeredPane1Layout.setVerticalGroup(
      jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jLayeredPane1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jButton1)
        .addContainerGap(462, Short.MAX_VALUE))
    );
    jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
//go to panel2
  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    // TODO add your handling code here:
    jLayeredPane2.setVisible(true);
    jLayeredPane1.setVisible(false);
  }//GEN-LAST:event_jButton1MouseClicked

  private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    // TODO add your handling code here:
    jLayeredPane1.setVisible(true);
    jLayeredPane2.setVisible(false);
  }//GEN-LAST:event_jButton3MouseClicked

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
      java.util.logging.Logger.getLogger(test_overlayered.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(test_overlayered.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(test_overlayered.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(test_overlayered.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new test_overlayered().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLayeredPane jLayeredPane1;
  private javax.swing.JLayeredPane jLayeredPane2;
  // End of variables declaration//GEN-END:variables
}
