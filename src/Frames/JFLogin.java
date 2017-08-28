package Frames;

import Control.ArreglosModelos;
import Control.MetodosEnVentanas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Manzano
 */
public class JFLogin extends javax.swing.JFrame {

    public ArreglosModelos ModeloClase;
    public MetodosEnVentanas Metodos;

    //Objeto de Tipo Control
    public JFLogin() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        ModeloClase = new ArreglosModelos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EtiquetaUsiario = new javax.swing.JLabel();
        EtiquetaContraseña = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JPasswordField();
        JbInicio = new javax.swing.JButton();
        JbSalir = new javax.swing.JButton();
        BtLimpiar = new javax.swing.JButton();
        EtiquetaLetrero = new javax.swing.JLabel();
        Fonto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ingreso");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        EtiquetaUsiario.setText("Usuario :");
        getContentPane().add(EtiquetaUsiario);
        EtiquetaUsiario.setBounds(20, 50, 90, 14);

        EtiquetaContraseña.setText("Contraseña :");
        getContentPane().add(EtiquetaContraseña);
        EtiquetaContraseña.setBounds(20, 80, 90, 14);

        TxtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(TxtUsuario);
        TxtUsuario.setBounds(100, 40, 160, 20);

        TxtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtContraseña);
        TxtContraseña.setBounds(100, 80, 160, 20);

        JbInicio.setText("Ingresar");
        JbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbInicioActionPerformed(evt);
            }
        });
        JbInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JbInicioKeyTyped(evt);
            }
        });
        getContentPane().add(JbInicio);
        JbInicio.setBounds(50, 120, 110, 23);

        JbSalir.setText("Salir");
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(JbSalir);
        JbSalir.setBounds(230, 120, 80, 23);

        BtLimpiar.setText("Limpiar");
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtLimpiar);
        BtLimpiar.setBounds(280, 80, 80, 23);

        EtiquetaLetrero.setText("Inicio de Sesión");
        getContentPane().add(EtiquetaLetrero);
        EtiquetaLetrero.setBounds(120, 10, 180, 14);

        Fonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul.jpg"))); // NOI18N
        Fonto.setMaximumSize(new java.awt.Dimension(500, 384));
        Fonto.setMinimumSize(new java.awt.Dimension(500, 384));
        Fonto.setName(""); // NOI18N
        Fonto.setPreferredSize(new java.awt.Dimension(500, 384));
        getContentPane().add(Fonto);
        Fonto.setBounds(0, -20, 410, 230);

        jMenu1.setText("Usuarios");

        jMenuItem1.setText("Crear nuevo Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenuItem2.setText("Cerrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        // Salida
        MetodosEnVentanas Ventanas = new MetodosEnVentanas();
        Ventanas.SalidaConX();
    }//GEN-LAST:event_JbSalirActionPerformed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed
        TxtUsuario.setText("");
        TxtContraseña.setText("");
    }//GEN-LAST:event_BtLimpiarActionPerformed

    private void TxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyTyped
        ///ENTER CAMBIO de usuario a cantraseña
        char c = evt.getKeyChar();
        if (c == java.awt.event.KeyEvent.VK_ENTER) {
            TxtContraseña.requestFocus();
        }
    }//GEN-LAST:event_TxtUsuarioKeyTyped

    private void JbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbInicioActionPerformed
        //Boton Ingresar
        int n = ModeloClase.ContUser;
        boolean x = false;
        for (int i = 0; i <= n; i++) {

   System.out.println("Usuario : " + ModeloClase.ArreUser[i].getNombre_Usuario() + " Contraseña : " + ModeloClase.ArreUser[i].getContraseña());
            if (ModeloClase.ArreUser[i].getNombre_Usuario().equals(TxtUsuario.getText())
                    && ModeloClase.ArreUser[i].getContraseña().equals(TxtContraseña.getText())) {

                JFMenu Menu = new JFMenu(this);
                Menu.setVisible(true);
                this.setVisible(false);
                x = true;
                break;
            }
        }
        if (x == false) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JbInicioActionPerformed

    private void TxtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyTyped
        // Cambio de poder
        char c = evt.getKeyChar();
        if (c == java.awt.event.KeyEvent.VK_ENTER) {
            JbInicio.requestFocus();
        }
    }//GEN-LAST:event_TxtContraseñaKeyTyped

    private void JbInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JbInicioKeyTyped
        // Al dar enter entra a la ventana :
        char c = evt.getKeyChar();
        if (c == java.awt.event.KeyEvent.VK_ENTER) {
            JbInicioActionPerformed(null);
        }
    }//GEN-LAST:event_JbInicioKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Cerrar con la X
        MetodosEnVentanas Ventanas = new MetodosEnVentanas();
        Ventanas.SalidaConX();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Cerrar Programa
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFCrearUsers CU = new JFCrearUsers(this);
        CU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JLabel EtiquetaContraseña;
    private javax.swing.JLabel EtiquetaLetrero;
    private javax.swing.JLabel EtiquetaUsiario;
    private javax.swing.JLabel Fonto;
    private javax.swing.JButton JbInicio;
    private javax.swing.JButton JbSalir;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
