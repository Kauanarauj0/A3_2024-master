package interfaces;
import java.awt.*;
import javax.swing.border.*;
import dao.UsuarioDao;
import jdk.jshell.execution.Util;

import javax.swing.*;

public class TelaApresentacao extends JFrame {

    public TelaApresentacao() {initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Kauan Araujo
    private void initComponents() {
        btnLogin = new JButton();
        btnVisitante = new JButton();
        btnCadastro = new JButton();
        jLabel2 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- btnLogin ----
        btnLogin.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        btnLogin.setForeground(new Color(0x6e5454));
        btnLogin.setText("Login");
        btnLogin.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogin.addActionListener(e -> btnLoginActionPerformed(e));
        contentPane.add(btnLogin);
        btnLogin.setBounds(480, 270, 130, 50);

        //---- btnVisitante ----
        btnVisitante.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        btnVisitante.setForeground(new Color(0x6e5454));
        btnVisitante.setText("Visitante");
        btnVisitante.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        btnVisitante.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnVisitante.addActionListener(e -> btnVisitanteActionPerformed(e));
        contentPane.add(btnVisitante);
        btnVisitante.setBounds(630, 270, 180, 50);

        //---- btnCadastro ----
        btnCadastro.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        btnCadastro.setForeground(new Color(0x6e5454));
        btnCadastro.setText("Cadastre-se");
        btnCadastro.addActionListener(e -> btnCadastroActionPerformed(e));
        contentPane.add(btnCadastro);
        btnCadastro.setBounds(520, 340, 230, 50);

        //---- jLabel2 ----
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/interfaces/FotoInicio.png")));
        contentPane.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisitanteActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro tc = new TelaCadastro();
        tc.setVisible(true);
                
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaApresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kauan Araujo
    private JButton btnLogin;
    private JButton btnVisitante;
    private JButton btnCadastro;
    private JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}