/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

/**
 *
 * @author Diegp
 */
public class APP1 extends javax.swing.JFrame {

    /**
     * Creates new form APP1
     */
    public APP1() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnvolumencircunferencia = new javax.swing.JButton();
        btnvolumenesfera = new javax.swing.JButton();
        BTNVOLUMENCUBO = new javax.swing.JButton();
        BTNPROMEDIO = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Calcular el Area de una Figura de 4 lados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Que desea hacer?");

        btnvolumencircunferencia.setText("Calcular circuferencia de un circulo");
        btnvolumencircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolumencircunferenciaActionPerformed(evt);
            }
        });

        btnvolumenesfera.setText("Calcular Volumen de Una Esfera");
        btnvolumenesfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolumenesferaActionPerformed(evt);
            }
        });

        BTNVOLUMENCUBO.setText("Calcular volumen de un cubo");
        BTNVOLUMENCUBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVOLUMENCUBOActionPerformed(evt);
            }
        });

        BTNPROMEDIO.setText("Calcular Promedio");
        BTNPROMEDIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPROMEDIOActionPerformed(evt);
            }
        });

        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNPROMEDIO, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvolumencircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(btnvolumenesfera, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNVOLUMENCUBO, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton6)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnvolumencircunferencia)
                .addGap(18, 18, 18)
                .addComponent(btnvolumenesfera)
                .addGap(18, 18, 18)
                .addComponent(BTNVOLUMENCUBO)
                .addGap(18, 18, 18)
                .addComponent(BTNPROMEDIO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnvolumencircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolumencircunferenciaActionPerformed
        frmcirculo jframe = new frmcirculo();
            jframe.setVisible(true);
    }//GEN-LAST:event_btnvolumencircunferenciaActionPerformed

    private void btnvolumenesferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolumenesferaActionPerformed
        frmesfera jframe= new frmesfera();
        jframe.setVisible(true);
    }//GEN-LAST:event_btnvolumenesferaActionPerformed

    private void BTNVOLUMENCUBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVOLUMENCUBOActionPerformed
        Frmcubo jframe= new Frmcubo ();
        jframe.setVisible(true);
    }//GEN-LAST:event_BTNVOLUMENCUBOActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       this.setVisible(false);
    FrmMenu objeto= new FrmMenu();
    objeto.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BTNPROMEDIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPROMEDIOActionPerformed
    this.setVisible(false);
    frmpromedio objeto =new frmpromedio();
    objeto.setVisible(true);
    }//GEN-LAST:event_BTNPROMEDIOActionPerformed

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
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNPROMEDIO;
    private javax.swing.JButton BTNVOLUMENCUBO;
    private javax.swing.JButton btnvolumencircunferencia;
    private javax.swing.JButton btnvolumenesfera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
