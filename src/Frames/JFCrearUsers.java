package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manzano
 */
public class JFCrearUsers extends javax.swing.JFrame {

    JFLogin Login;

    public JFCrearUsers(JFLogin L) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        Login = L;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BTRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtUsuarioNuevo = new javax.swing.JTextField();
        BTAceptar = new javax.swing.JButton();
        PassNueva = new javax.swing.JPasswordField();
        PassConfirmacion = new javax.swing.JPasswordField();

        setTitle("Crear un usuario");

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        BTRegresar.setBackground(new java.awt.Color(0, 102, 153));
        BTRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BTRegresar.setBorderPainted(false);
        BTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegresarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Usuarios ");

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese nuevo usuario :");

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar contraseña");

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese nueva contraseña :");

        BTAceptar.setBackground(new java.awt.Color(0, 102, 153));
        BTAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        BTAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTRegresar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BTAceptar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(PassConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(PassNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTAceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        //Boton regres  
        JFLogin L = new JFLogin();
        L.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTRegresarActionPerformed

    private void BTAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAceptarActionPerformed
        // Boton aceptar
        String Pass1 = PassNueva.getText();
        String Pass2 = PassConfirmacion.getText();

        int U = Login.ModeloClase.ContUser;

        for (int i = 0; i < U; i++) {

            if (Pass1.equals(Pass2)) {

                System.out.println("U " + U);
                Login.ModeloClase.ArreUser[U].setNombre_Usuario(TxtUsuarioNuevo.getText());
                System.out.println("Usuario " + Login.ModeloClase.ArreUser[U].getNombre_Usuario());

                Login.ModeloClase.ArreUser[U].setContraseña(PassConfirmacion.getText());
                System.out.println("Contraseña : " + Login.ModeloClase.ArreUser[U].getContraseña());

                JOptionPane.showMessageDialog(this, "Usuario Registrado", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                Login.ModeloClase.ContUser++;

                Login.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Operación  fallida", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTAceptarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCrearUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
       //new JFCrearUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAceptar;
    private javax.swing.JButton BTRegresar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPasswordField PassConfirmacion;
    private javax.swing.JPasswordField PassNueva;
    private javax.swing.JTextField TxtUsuarioNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
