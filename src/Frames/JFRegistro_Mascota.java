package Frames;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Manzano
 */
public class JFRegistro_Mascota extends javax.swing.JFrame {

    /*Metodo para obtener la fecha */
    SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }

    JFMenu menu;

    public JFRegistro_Mascota(JFMenu m) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        menu = m;
        //Llenar el combox de los datos de los Clientes esto lo voy a pegar en el registro de mascota
        int n = menu.Login.ModeloClase.ContClientes;

        for (int i = 0; i < n; i++) {
            CBXNombreCliente.addItem(menu.Login.ModeloClase.ArreCliente[i].getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexoMascota = new javax.swing.ButtonGroup();
        Fondo = new javax.swing.JPanel();
        EtiqueteNombreDueño = new javax.swing.JLabel();
        EtiquetaNombreMascota = new javax.swing.JLabel();
        EtiquetaEspecie = new javax.swing.JLabel();
        EtiquetaRaza = new javax.swing.JLabel();
        EtiquetaEdad = new javax.swing.JLabel();
        TxtNombreMascota = new javax.swing.JTextField();
        TxtEspecie = new javax.swing.JTextField();
        TxtRaza = new javax.swing.JTextField();
        TxtEdad = new javax.swing.JTextField();
        BTCancelar = new javax.swing.JButton();
        BTRegistro = new javax.swing.JButton();
        CBXNombreCliente = new javax.swing.JComboBox();
        Titulo = new javax.swing.JLabel();
        ChekMasculino = new javax.swing.JCheckBox();
        Chekfemenino = new javax.swing.JCheckBox();
        EtiquetaSexo = new javax.swing.JLabel();

        setTitle("Registro de Mascota");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        EtiqueteNombreDueño.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiqueteNombreDueño.setForeground(new java.awt.Color(255, 255, 255));
        EtiqueteNombreDueño.setText("Nombre del Dueño:");

        EtiquetaNombreMascota.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiquetaNombreMascota.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaNombreMascota.setText("Nombre : ");

        EtiquetaEspecie.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiquetaEspecie.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaEspecie.setText("Especie :");

        EtiquetaRaza.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiquetaRaza.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaRaza.setText("Raza :");

        EtiquetaEdad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiquetaEdad.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaEdad.setText("Edad : ");

        TxtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEspecieActionPerformed(evt);
            }
        });

        BTCancelar.setBackground(new java.awt.Color(0, 102, 153));
        BTCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BTCancelar.setBorderPainted(false);
        BTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCancelarActionPerformed(evt);
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

        CBXNombreCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoge a un cliente" }));
        CBXNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXNombreClienteActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Registro mascota");

        ChekMasculino.setBackground(new java.awt.Color(0, 102, 153));
        GrupoSexoMascota.add(ChekMasculino);
        ChekMasculino.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ChekMasculino.setForeground(new java.awt.Color(255, 255, 255));
        ChekMasculino.setText("Macho");

        Chekfemenino.setBackground(new java.awt.Color(0, 102, 153));
        GrupoSexoMascota.add(Chekfemenino);
        Chekfemenino.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Chekfemenino.setForeground(new java.awt.Color(255, 255, 255));
        Chekfemenino.setText("Hembra");

        EtiquetaSexo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiquetaSexo.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaSexo.setText("Sexo : ");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(BTRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTCancelar)
                .addGap(31, 31, 31))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(EtiqueteNombreDueño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBXNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Titulo)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiquetaRaza)
                                    .addComponent(EtiquetaEspecie)
                                    .addComponent(EtiquetaNombreMascota)
                                    .addComponent(EtiquetaEdad))
                                .addGap(24, 24, 24)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtRaza)
                                    .addComponent(TxtEspecie)
                                    .addComponent(TxtNombreMascota)
                                    .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(EtiquetaSexo)
                                .addGap(40, 40, 40)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Chekfemenino)
                                    .addComponent(ChekMasculino))))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTCancelar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Titulo)
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiqueteNombreDueño)
                            .addComponent(CBXNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaNombreMascota))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiquetaEspecie)
                            .addComponent(TxtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaRaza))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaEdad))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChekMasculino)
                            .addComponent(EtiquetaSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addComponent(BTRegistro))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(Chekfemenino)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCancelarActionPerformed
        // Botton cancelar registro de mascota
        menu.enable();
        this.setVisible(false);
    }//GEN-LAST:event_BTCancelarActionPerformed

    private void CBXNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXNombreClienteActionPerformed

    private void TxtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEspecieActionPerformed
    }//GEN-LAST:event_TxtEspecieActionPerformed
    private void BTRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistroActionPerformed
        // Bt para registrar a la mascota 
        // Se crea una variable para el indentificar el objeto seleccionado en el combobox
        String NombreCliente = CBXNombreCliente.getSelectedItem().toString();
        int numMascota = 0;
        int n = menu.Login.ModeloClase.ContMascotas;

        if (n < menu.Login.ModeloClase.Tam) {

            //Contador de numero de mascotas
            int c = menu.Login.ModeloClase.ContClientes;
            for (int i = 0; i < c; i++) {
                if (menu.Login.ModeloClase.ArreCliente[i].getNombre().equals(NombreCliente)) {
                    numMascota = menu.Login.ModeloClase.ArreCliente[i].getNum_Mascotas();
                    menu.Login.ModeloClase.ArreCliente[i].setNum_Mascotas(numMascota + 1);
                    System.out.println("Num mascotas : " + menu.Login.ModeloClase.ArreCliente[i].getNum_Mascotas());
                }
            }

            //Elige al cliente que deceas asignar 
            //Guada el nombre del cliente aqui se hace la relación
            if (c == 0) {
                JOptionPane.showMessageDialog(this, "No puedes Modificar mascotas si no tienes clientes registrados", "No tienes clientes registrados", JOptionPane.WARNING_MESSAGE);
            } else {

                boolean ComprobarCliente = true;
                for (int i = 0; i < c; i++) {
                    //el nombre que se selecciono el el combox lo busca en el arreglo usuarios
                    if (menu.Login.ModeloClase.ArreCliente[i].getNombre().equals(NombreCliente)) {
                        menu.Login.ModeloClase.ArreMascota[n].AsignaUsuario(menu.Login.ModeloClase.ArreCliente[i]);
                    }
                }

                //Guarda el nombre de la mascota ,Especie,Raza,Edad
                menu.Login.ModeloClase.ArreMascota[n].setNombre_Mascota(TxtNombreMascota.getText());
                boolean Name = false;
                if (!"".equals(TxtNombreMascota.getText())) {
                    Name = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Nombre  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                menu.Login.ModeloClase.ArreMascota[n].setEspecie(TxtEspecie.getText());
                boolean Esp = false;
                if (!"".equals(TxtEspecie.getText())) {
                    Esp = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Especie  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }

                menu.Login.ModeloClase.ArreMascota[n].setRaza(TxtRaza.getText());
                boolean Raz = false;
                if (!"".equals(TxtRaza.getText())) {
                    Raz = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Raza  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }

                menu.Login.ModeloClase.ArreMascota[n].setEdad_Mascota(TxtEdad.getText());
                boolean Eda = false;
                if (!"".equals(TxtEdad.getText())) {
                    Eda = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Edad  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                //Guardar el sexo
                boolean Sex = false;
                if (ChekMasculino.isSelected()) {
                    menu.Login.ModeloClase.ArreMascota[n].setSexo("Macho");
                    Sex = true;
                }
                if (Chekfemenino.isSelected()) {
                    menu.Login.ModeloClase.ArreMascota[n].setSexo("Hembra");
                    Sex = true;
                }

                if (Name == true && Esp == true && Raz == true && Eda == true && ComprobarCliente == true && Sex == true) {
                    JOptionPane.showMessageDialog(this, "Mascota registrada correctamente", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);

                    menu.Login.ModeloClase.ContMascotas++;

                    menu.enable();
                    this.setVisible(false);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "El Almacenamiento esta lleno ", "Sistema Saturado", JOptionPane.WARNING_MESSAGE);
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
        menu.enable();
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
            java.util.logging.Logger.getLogger(JFRegistro_Mascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new JFRegistro_Mascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCancelar;
    private javax.swing.JButton BTRegistro;
    private javax.swing.JComboBox CBXNombreCliente;
    private javax.swing.JCheckBox ChekMasculino;
    private javax.swing.JCheckBox Chekfemenino;
    private javax.swing.JLabel EtiquetaEdad;
    private javax.swing.JLabel EtiquetaEspecie;
    private javax.swing.JLabel EtiquetaNombreMascota;
    private javax.swing.JLabel EtiquetaRaza;
    private javax.swing.JLabel EtiquetaSexo;
    private javax.swing.JLabel EtiqueteNombreDueño;
    private javax.swing.JPanel Fondo;
    private javax.swing.ButtonGroup GrupoSexoMascota;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtEspecie;
    private javax.swing.JTextField TxtNombreMascota;
    private javax.swing.JTextField TxtRaza;
    // End of variables declaration//GEN-END:variables
}
