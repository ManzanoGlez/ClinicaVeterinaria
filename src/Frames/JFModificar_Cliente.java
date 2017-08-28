package Frames;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Manzano
 */
public class JFModificar_Cliente extends javax.swing.JFrame {

    JFMenu Menu;

    public JFModificar_Cliente(JFMenu m) {
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());

        initComponents();
        Menu = m;

        //Llenar el combox de los datos de los Clientes esto lo voy a pegar en el registro de mascota
        int n = Menu.Login.ModeloClase.ContClientes;
        for (int i = 0; i < n; i++) {
            BOXClienteModicar.addItem(Menu.Login.ModeloClase.ArreCliente[i].getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Etiqueta = new javax.swing.JLabel();
        BOXClienteModicar = new javax.swing.JComboBox();
        TxtTelefono = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtRfc = new javax.swing.JTextField();
        EtiNombre = new javax.swing.JLabel();
        EtiTelefono = new javax.swing.JLabel();
        EtiApellido = new javax.swing.JLabel();
        EtiEmail = new javax.swing.JLabel();
        EtiDireccion = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        EtiRFC = new javax.swing.JLabel();
        BTRegresar = new javax.swing.JButton();
        BTRegistro = new javax.swing.JButton();
        DateRegistroCliente = new com.toedter.calendar.JDateChooser();
        EtiNombre1 = new javax.swing.JLabel();

        setTitle("Modificar cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));
        Fondo.setPreferredSize(new java.awt.Dimension(450, 447));

        Etiqueta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta.setText("Modificar Cliente");

        BOXClienteModicar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre del Cliente a modificar" }));
        BOXClienteModicar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BOXClienteModicarItemStateChanged(evt);
            }
        });

        EtiNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiNombre.setForeground(new java.awt.Color(255, 255, 255));
        EtiNombre.setText("Nombre :");

        EtiTelefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiTelefono.setForeground(new java.awt.Color(255, 255, 255));
        EtiTelefono.setText("Telefono :");

        EtiApellido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiApellido.setForeground(new java.awt.Color(255, 255, 255));
        EtiApellido.setText("Apellido :");

        EtiEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiEmail.setForeground(new java.awt.Color(255, 255, 255));
        EtiEmail.setText("E-mail :");

        EtiDireccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiDireccion.setForeground(new java.awt.Color(255, 255, 255));
        EtiDireccion.setText("Dirección :");

        EtiRFC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiRFC.setForeground(new java.awt.Color(255, 255, 255));
        EtiRFC.setText("RFC : ");

        BTRegresar.setBackground(new java.awt.Color(0, 102, 153));
        BTRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BTRegresar.setBorderPainted(false);
        BTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegresarActionPerformed(evt);
            }
        });

        BTRegistro.setBackground(new java.awt.Color(0, 102, 153));
        BTRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        BTRegistro.setBorderPainted(false);
        BTRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegistroActionPerformed(evt);
            }
        });
        BTRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BTRegistroKeyTyped(evt);
            }
        });

        EtiNombre1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiNombre1.setForeground(new java.awt.Color(255, 255, 255));
        EtiNombre1.setText("Fecha :");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BTRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTRegresar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(EtiDireccion)
                                        .addComponent(EtiEmail))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EtiTelefono)
                                        .addComponent(EtiApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(EtiNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(EtiRFC, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(EtiNombre1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Etiqueta)
                    .addComponent(BOXClienteModicar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Etiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOXClienteModicar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiNombre1))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiApellido)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(36, 36, 36)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTRegistro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*Metodo para obtener la fecha o get */
    SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    /*Metodo Setteo*/
    public java.util.Date StringADate(String Fecha) {
        SimpleDateFormat FormatoTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date FechaE = null;
        try {

            FechaE = FormatoTexto.parse(Fecha);
            return FechaE;
        } catch (ParseException ex) {
            return null;
        }

    }


    private void BOXClienteModicarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BOXClienteModicarItemStateChanged
        // Cuando cambia el item cambia los datos guardados

        TxtNombre.setText(null);
        TxtApellido.setText(null);
        TxtTelefono.setText(null);
        TxtDireccion.setText(null);
        TxtEmail.setText(null);
        TxtRfc.setText(null);

        int c = Menu.Login.ModeloClase.ContClientes;

        String Modificar = BOXClienteModicar.getSelectedItem().toString();
        int Seleccion;
        for (int i = 0; i < c; i++) {

            if (Modificar.equals(Menu.Login.ModeloClase.ArreCliente[i].getNombre())) {
                Seleccion = i;

                DateRegistroCliente.setDate(StringADate(Menu.Login.ModeloClase.ArreCliente[Seleccion].getFechaRegistro()));
               
                TxtNombre.setText(Menu.Login.ModeloClase.ArreCliente[Seleccion].getNombre());
                TxtApellido.setText(Menu.Login.ModeloClase.ArreCliente[Seleccion].getApellido());
                TxtTelefono.setText(Menu.Login.ModeloClase.ArreCliente[Seleccion].getTelefono());
                TxtDireccion.setText(Menu.Login.ModeloClase.ArreCliente[Seleccion].getDireccion());
                TxtEmail.setText(Menu.Login.ModeloClase.ArreCliente[Seleccion].getCorreo_Electronico());
                TxtRfc.setText(Menu.Login.ModeloClase.ArreCliente[Seleccion].getRFC());

            }
        }

    }//GEN-LAST:event_BOXClienteModicarItemStateChanged

    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        //Boton regresar
        Menu.enable();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTRegresarActionPerformed

    private void BTRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistroActionPerformed
        // Bt para registrar a la mascota

        // Se crea una variable para el indentificar el objeto seleccionado en el combobox
        int c = Menu.Login.ModeloClase.ContClientes;
        String Modificar = BOXClienteModicar.getSelectedItem().toString();
        int Seleccion;
        for (int i = 0; i < c; i++) {

            if (Modificar.equals(Menu.Login.ModeloClase.ArreCliente[i].getNombre())) {
                Seleccion = i;

                //Guarda la fecha
                Menu.Login.ModeloClase.ArreCliente[Seleccion].setFechaRegistro(getFecha(DateRegistroCliente));
                boolean FechaRe = true;
                if (this.getFecha(DateRegistroCliente) == null) {
                    FechaRe = false;
                    JOptionPane.showMessageDialog(this, "Debes selecciónar una Fecha para continuar", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }

                //Guarda el nombre,Apellido,Telefono,Direccion
                Menu.Login.ModeloClase.ArreCliente[Seleccion].setNombre(TxtNombre.getText());
                boolean Name = false;
                if (!"".equals(TxtNombre.getText())) {
                    Name = true;
                } else {
                    JOptionPane.showMessageDialog(this, "El campo : Nombre esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                Menu.Login.ModeloClase.ArreCliente[Seleccion].setApellido(TxtApellido.getText());
                boolean LastName = false;
                if (!"".equals(TxtApellido.getText())) {
                    LastName = true;
                } else {
                    JOptionPane.showMessageDialog(this, "El campo : Apeliido esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                Menu.Login.ModeloClase.ArreCliente[Seleccion].setTelefono(TxtTelefono.getText());
                boolean tel = false;
                if (!"".equals(TxtTelefono.getText())) {
                    tel = true;
                } else {
                    JOptionPane.showMessageDialog(this, "El campo : telefóno esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                Menu.Login.ModeloClase.ArreCliente[Seleccion].setDireccion(TxtDireccion.getText());
                boolean Dir = false;
                if (!"".equals(TxtDireccion.getText())) {
                    Dir = true;
                } else {
                    JOptionPane.showMessageDialog(this, "El campo : Dirección esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                Menu.Login.ModeloClase.ArreCliente[Seleccion].setCorreo_Electronico(TxtEmail.getText());
                boolean Email = false;
                if (!"".equals(TxtEmail.getText())) {
                    Email = true;
                } else {
                    JOptionPane.showMessageDialog(this, "El campo : E-mail esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }

                Menu.Login.ModeloClase.ArreCliente[Seleccion].setRFC(TxtRfc.getText());
                boolean brfc = false;
                if (!"".equals(TxtRfc.getText())) {
                    brfc = true;
                } else {
                    JOptionPane.showMessageDialog(this, "El campo : RFC esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }

                if (FechaRe == true && Name == true && LastName == true && tel == true && Dir == true && Email == true && brfc == true) {
                    JOptionPane.showMessageDialog(this, "Cliente Modificado correctamente", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);

                    JFImprimir_Clientes IC = new JFImprimir_Clientes(Menu);
                    IC.setVisible(true);
                    this.setVisible(false);

                }

            } 
        }


    }//GEN-LAST:event_BTRegistroActionPerformed


    private void BTRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BTRegistroKeyTyped
        //AL dar enter en el botton registrar lo toma como click
        char c = evt.getKeyChar();
        if (c == java.awt.event.KeyEvent.VK_ENTER) {
            BTRegistroActionPerformed(null);
        }
    }//GEN-LAST:event_BTRegistroKeyTyped

    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        // TODO add your handling code here:
        Menu.enable();
    }//GEN-LAST:event_Desbloquea

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFModificar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //     new JFModificar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BOXClienteModicar;
    private javax.swing.JButton BTRegistro;
    private javax.swing.JButton BTRegresar;
    private com.toedter.calendar.JDateChooser DateRegistroCliente;
    private javax.swing.JLabel EtiApellido;
    private javax.swing.JLabel EtiDireccion;
    private javax.swing.JLabel EtiEmail;
    private javax.swing.JLabel EtiNombre;
    private javax.swing.JLabel EtiNombre1;
    private javax.swing.JLabel EtiRFC;
    private javax.swing.JLabel EtiTelefono;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtRfc;
    private javax.swing.JTextField TxtTelefono;
    // End of variables declaration//GEN-END:variables
}
