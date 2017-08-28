package Frames;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Manzano
 */
public class JFRegistro_Cliente extends javax.swing.JFrame {

    JFMenu Menu;

    public JFRegistro_Cliente(JFMenu m) {
        initComponents();
        Menu = m;
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        DateRegistroCliente = new com.toedter.calendar.JDateChooser();
        EtiFecha = new javax.swing.JLabel();
        EtiNombre = new javax.swing.JLabel();
        EtiApellido = new javax.swing.JLabel();
        EtiTelefono = new javax.swing.JLabel();
        EtiDireccion = new javax.swing.JLabel();
        EtiEmail = new javax.swing.JLabel();
        EtiRFC = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtRfc = new javax.swing.JTextField();
        JBRegistrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();

        setTitle("Registro Cliente Nuevo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        EtiFecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiFecha.setForeground(new java.awt.Color(255, 255, 255));
        EtiFecha.setText("Ingresa la fecha del registro :");

        EtiNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiNombre.setForeground(new java.awt.Color(255, 255, 255));
        EtiNombre.setText("Nombre :");

        EtiApellido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiApellido.setForeground(new java.awt.Color(255, 255, 255));
        EtiApellido.setText("Apellido : ");

        EtiTelefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiTelefono.setForeground(new java.awt.Color(255, 255, 255));
        EtiTelefono.setText("Telefono : ");

        EtiDireccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiDireccion.setForeground(new java.awt.Color(255, 255, 255));
        EtiDireccion.setText("Dirección :");

        EtiEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiEmail.setForeground(new java.awt.Color(255, 255, 255));
        EtiEmail.setText("E-mail :");

        EtiRFC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiRFC.setForeground(new java.awt.Color(255, 255, 255));
        EtiRFC.setText("RFC : ");

        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });

        JBRegistrar.setBackground(new java.awt.Color(0, 102, 153));
        JBRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        JBRegistrar.setBorderPainted(false);
        JBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegistrarActionPerformed(evt);
            }
        });
        JBRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBRegistrarKeyTyped(evt);
            }
        });

        JBCancelar.setBackground(new java.awt.Color(0, 102, 153));
        JBCancelar.setForeground(new java.awt.Color(0, 102, 153));
        JBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        JBCancelar.setBorderPainted(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        JBCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBCancelarKeyTyped(evt);
            }
        });

        Etiqueta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta.setText("Registro Cliente");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EtiDireccion)
                                    .addComponent(EtiEmail)
                                    .addComponent(EtiTelefono)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EtiNombre)
                                .addComponent(EtiApellido))
                            .addComponent(EtiRFC, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(EtiFecha)
                        .addGap(28, 28, 28)
                        .addComponent(DateRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(JBRegistrar)
                        .addGap(190, 190, 190)
                        .addComponent(JBCancelar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Etiqueta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Etiqueta)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiFecha))
                .addGap(22, 22, 22)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiApellido)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiTelefono)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiDireccion))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiEmail)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiRFC))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCancelar)
                    .addComponent(JBRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // Botton cancelar registro de cliente
      
        Menu.enable();
        this.setVisible(false);

    }//GEN-LAST:event_JBCancelarActionPerformed

    /*Metodo para obtener la fecha */
    SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");
    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }


    private void JBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegistrarActionPerformed
        // Registro de Cliente :
        
        int NumMascota=0;
        int n = Menu.Login.ModeloClase.ContClientes;
        if (n < Menu.Login.ModeloClase.Tam) {

            //Guarda la fecha
            Menu.Login.ModeloClase.ArreCliente[n].setFechaRegistro(getFecha(DateRegistroCliente));
            boolean FechaRe = true;
            if (this.getFecha(DateRegistroCliente) == null) {
                FechaRe = false;
                JOptionPane.showMessageDialog(this, "Debes selecciónar una Fecha para continuar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

            //Guarda el nombre,Apellido,Telefono,Direccion
            Menu.Login.ModeloClase.ArreCliente[n].setNombre(TxtNombre.getText());
            boolean Name = false;
            if (!"".equals(TxtNombre.getText())) {
                Name = true;
            } else {

                JOptionPane.showMessageDialog(this, "El campo : Nombre esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
            }
            Menu.Login.ModeloClase.ArreCliente[n].setApellido(TxtApellido.getText());
            boolean LastName = false;
            if (!"".equals(TxtApellido.getText())) {
                LastName = true;
            } else {

                JOptionPane.showMessageDialog(this, "El campo : Apeliido esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
            }
            Menu.Login.ModeloClase.ArreCliente[n].setTelefono(TxtTelefono.getText());
            boolean tel = false;
            if (!"".equals(TxtTelefono.getText())) {
                tel = true;
            } else {
                JOptionPane.showMessageDialog(this, "El campo : telefóno esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
            }
            Menu.Login.ModeloClase.ArreCliente[n].setDireccion(TxtDireccion.getText());
            boolean Dir = false;
            if (!"".equals(TxtDireccion.getText())) {
                Dir = true;
            } else {
                JOptionPane.showMessageDialog(this, "El campo : Dirección esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
            }
            Menu.Login.ModeloClase.ArreCliente[n].setCorreo_Electronico(TxtEmail.getText());
            boolean Email = false;
            if (!"".equals(TxtEmail.getText())) {
                Email = true;
            } else {
                JOptionPane.showMessageDialog(this, "El campo : E-mail esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
            }

            Menu.Login.ModeloClase.ArreCliente[n].setRFC(TxtRfc.getText());
            boolean brfc = false;
            if (!"".equals(TxtRfc.getText())) {
                brfc = true;
            } else {
                JOptionPane.showMessageDialog(this, "El campo : RFC esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
            }

            if (FechaRe == true && Name == true && LastName == true && tel == true && Dir == true && Email == true && brfc == true) {

                JOptionPane.showMessageDialog(this, "Cliente registrado correctamente", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                Menu.Login.ModeloClase.ArreCliente[n].setNum_Mascotas(NumMascota);
                Menu.Login.ModeloClase.ContClientes++;
                Menu.enable();
                this.setVisible(false);

            }
        } else {
            JOptionPane.showMessageDialog(this, "El Almacenamiento esta lleno ", "Sistema Saturado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_JBRegistrarActionPerformed

    private void JBRegistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBRegistrarKeyTyped
        //AL dar enter en el botton registrar lo toma como click
        char c = evt.getKeyChar();
        if (c == java.awt.event.KeyEvent.VK_ENTER) {
            JBRegistrarActionPerformed(null);
        }
    }//GEN-LAST:event_JBRegistrarKeyTyped

    private void JBCancelarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBCancelarKeyTyped
        // Al dar enter en el boton regresar lo toma como click
        char c = evt.getKeyChar();
        if (c == java.awt.event.KeyEvent.VK_ENTER) {
            JBCancelarActionPerformed(null);

        }
    }//GEN-LAST:event_JBCancelarKeyTyped

    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        // TODO add your handling code here:
        Menu.enable();
    }//GEN-LAST:event_Desbloquea

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
   
        
             char c = evt.getKeyChar();
        int tam = TxtTelefono.getText().length();

        if (tam >= 10) {

            getToolkit().beep();// emite un sonido
            evt.consume(); //La tecla desaparece o no se imprime en pantalla 
            JOptionPane.showMessageDialog(this, "Ingrese solo 10 digitos");
        }

        if (Character.isLetter(c)) {
            getToolkit().beep();// emite un sonido
            evt.consume(); //La tecla desaparece o no se imprime en pantalla 
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
        }
        
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegistro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                //  new JFRegistro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateRegistroCliente;
    private javax.swing.JLabel EtiApellido;
    private javax.swing.JLabel EtiDireccion;
    private javax.swing.JLabel EtiEmail;
    private javax.swing.JLabel EtiFecha;
    private javax.swing.JLabel EtiNombre;
    private javax.swing.JLabel EtiRFC;
    private javax.swing.JLabel EtiTelefono;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBRegistrar;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtRfc;
    private javax.swing.JTextField TxtTelefono;
    // End of variables declaration//GEN-END:variables
}
