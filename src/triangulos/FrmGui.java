/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulos;

import java.awt.Color;

/**
 *
 * @author asus
 */
public class FrmGui extends javax.swing.JFrame {

    /**
     * Creates new form FrmGui
     */
    public FrmGui() {
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

        deslizador = new javax.swing.JSlider();
        lblValor = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(null);

        deslizador.setMajorTickSpacing(25);
        deslizador.setMaximum(250);
        deslizador.setMinimum(50);
        deslizador.setMinorTickSpacing(250);
        deslizador.setPaintLabels(true);
        deslizador.setPaintTicks(true);
        deslizador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deslizadorStateChanged(evt);
            }
        });
        getContentPane().add(deslizador);
        deslizador.setBounds(20, 13, 370, 45);
        getContentPane().add(lblValor);
        lblValor.setBounds(40, 70, 320, 40);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(panel);
        panel.setBounds(20, 120, 350, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deslizadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deslizadorStateChanged
        // TODO add your handling code here:
        lblValor.setText("El valor es : "+ deslizador.getValue());
        panel.setBackground(new Color(deslizador.getValue(),deslizador.getValue(),deslizador.getValue()));
       
    }//GEN-LAST:event_deslizadorStateChanged

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
            java.util.logging.Logger.getLogger(FrmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider deslizador;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
