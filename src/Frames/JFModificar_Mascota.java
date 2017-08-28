package Frames;

import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manzano
 */
public class JFModificar_Mascota extends javax.swing.JFrame {

    JFMenu Menu;

    public JFModificar_Mascota(JFMenu m) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());

        Menu = m;
        //Llenar el combox de los datos de los Clientes esto lo voy a pegar en el registro de mascota
        int n = Menu.Login.ModeloClase.ContClientes;

        for (int i = 0; i < n; i++) {
            BOXNombreCliente.addItem(Menu.Login.ModeloClase.ArreCliente[i].getNombre());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_SexoMascota = new javax.swing.ButtonGroup();
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
        BOXNombreCliente = new javax.swing.JComboBox();
        Titulo = new javax.swing.JLabel();
        EtiMascota = new javax.swing.JLabel();
        BOXMascota = new javax.swing.JComboBox();
        BTCargar = new javax.swing.JButton();
        EtiquetaSexo = new javax.swing.JLabel();
        Chekfemenino = new javax.swing.JCheckBox();
        ChekMasculino = new javax.swing.JCheckBox();

        setTitle("Modificación de Mascota");
        setResizable(false);

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

        BOXNombreCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoge a un cliente" }));
        BOXNombreCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BOXNombreClienteItemStateChanged(evt);
            }
        });
        BOXNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXNombreClienteActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Modificación Mascota");

        EtiMascota.setBackground(new java.awt.Color(0, 102, 153));
        EtiMascota.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiMascota.setForeground(new java.awt.Color(255, 255, 255));
        EtiMascota.setText("Mascota :");

        BOXMascota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccióna una mascota :" }));
        BOXMascota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BOXMascotaItemStateChanged(evt);
            }
        });
        BOXMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXMascotaActionPerformed(evt);
            }
        });

        BTCargar.setText("Cargar");
        BTCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCargarActionPerformed(evt);
            }
        });

        EtiquetaSexo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        EtiquetaSexo.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaSexo.setText("Sexo : ");

        Chekfemenino.setBackground(new java.awt.Color(0, 102, 153));
        Grupo_SexoMascota.add(Chekfemenino);
        Chekfemenino.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Chekfemenino.setForeground(new java.awt.Color(255, 255, 255));
        Chekfemenino.setText("Hembra");

        ChekMasculino.setBackground(new java.awt.Color(0, 102, 153));
        Grupo_SexoMascota.add(ChekMasculino);
        ChekMasculino.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ChekMasculino.setForeground(new java.awt.Color(255, 255, 255));
        ChekMasculino.setText("Macho");
        ChekMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChekMasculinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BTRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTCancelar)
                .addGap(38, 38, 38))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Titulo))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EtiqueteNombreDueño)
                                    .addComponent(EtiMascota))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(BOXMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTCargar))
                                    .addComponent(BOXNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChekMasculino)
                                    .addComponent(Chekfemenino)))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
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
                                    .addComponent(EtiquetaSexo))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Titulo)
                .addGap(30, 30, 30)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiqueteNombreDueño)
                    .addComponent(BOXNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiMascota)
                    .addComponent(BOXMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTCargar))
                .addGap(18, 18, 18)
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
                .addComponent(Chekfemenino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTRegistro)
                    .addComponent(BTCancelar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar() {

        TxtNombreMascota.setText("");
        TxtEspecie.setText("");
        TxtRaza.setText("");
        ChekMasculino.setSelected(false);
        Chekfemenino.setSelected(false);
        TxtEdad.setText("");

    }

    private void TxtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEspecieActionPerformed

    }//GEN-LAST:event_TxtEspecieActionPerformed

    private void BTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCancelarActionPerformed
        // Botton cancelar registro de mascota
        Menu.enable();
        this.setVisible(false);
    }//GEN-LAST:event_BTCancelarActionPerformed

    private void BTRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistroActionPerformed
        // Bt para registrar a la mascota

        // Se crea una variable para el indentificar el objeto seleccionado en el combobox
        String NombreCliente = BOXNombreCliente.getSelectedItem().toString();
        String NombreMascota = BOXMascota.getSelectedItem().toString();
        int Seleccion = 0;

        int n = Menu.Login.ModeloClase.ContMascotas;
        if (n < Menu.Login.ModeloClase.Tam) {

            //Contador de num mascotas
            int c = Menu.Login.ModeloClase.ContClientes;
            for (int i = 0; i < c; i++) {
                if (Menu.Login.ModeloClase.ArreCliente[i].getNombre().equals(NombreCliente)) {
                    int numMascota = Menu.Login.ModeloClase.ArreCliente[i].getNum_Mascotas();
                    Menu.Login.ModeloClase.ArreCliente[i].setNum_Mascotas(numMascota + 1);
                    System.out.println("Num mascotas : " + Menu.Login.ModeloClase.ArreCliente[i].getNum_Mascotas());
                }
            }

            //Elige al cliente que deceas asignar 
            //Guada el nombre del cliente aqui se hace la relación
            if (c == 0) {

                JOptionPane.showMessageDialog(this, "No puedes registrar mascotas si no tienes clientes registrados", "No tienes clientes registrados", JOptionPane.WARNING_MESSAGE);

            } else {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        //el nombre que se selecciono el el combox lo busca en el arreglo usuarios
                        if (Menu.Login.ModeloClase.ArreMascota[i].getNombreCliente().equals(NombreCliente) && Menu.Login.ModeloClase.ArreMascota[j].getNombre_Mascota().equals(NombreMascota)) {
                            Seleccion = j;
                        }
                    }
                }

                //Guarda el nombre de la mascota ,Especie,Raza,Edad
                Menu.Login.ModeloClase.ArreMascota[Seleccion].setNombre_Mascota(TxtNombreMascota.getText());
                boolean Name = false;
                if (!"".equals(TxtNombreMascota.getText())) {
                    Name = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Nombre  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                Menu.Login.ModeloClase.ArreMascota[Seleccion].setEspecie(TxtEspecie.getText());
                boolean Esp = false;
                if (!"".equals(TxtEspecie.getText())) {
                    Esp = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Especie  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }

                Menu.Login.ModeloClase.ArreMascota[Seleccion].setRaza(TxtRaza.getText());
                boolean Raz = false;
                if (!"".equals(TxtRaza.getText())) {
                    Raz = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Raza  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }

                Menu.Login.ModeloClase.ArreMascota[Seleccion].setEdad_Mascota(TxtEdad.getText());
                boolean Eda = false;
                if (!"".equals(TxtEdad.getText())) {
                    Eda = true;
                } else {

                    JOptionPane.showMessageDialog(this, "El campo : Edad  esta vacio ", "Error", JOptionPane.WARNING_MESSAGE);
                }
                //Guardar el sexo

                boolean Sex = false;
                if (ChekMasculino.isSelected()) {
                    Menu.Login.ModeloClase.ArreMascota[Seleccion].setSexo("Macho");
                    Sex = true;
                }
                if (Chekfemenino.isSelected()) {
                    Menu.Login.ModeloClase.ArreMascota[Seleccion].setSexo("Hembra");
                    Sex = true;
                }

                //Validacion Final
                if (Name == true && Esp == true && Raz == true && Eda == true && Sex == true) {
                    JOptionPane.showMessageDialog(this, "Mascota modificada correctamente", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);

                    JFImprimir_Mascotas IM = new JFImprimir_Mascotas(Menu);
                    IM.setVisible(true);
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

    private void BOXNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOXNombreClienteActionPerformed

    private void BOXNombreClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BOXNombreClienteItemStateChanged
        //lIMPAR DATOS 

        Limpiar();

        // Evento cuando cambio de cliente
        int n = Menu.Login.ModeloClase.ContMascotas;
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            BOXMascota.removeAllItems();
        }

        String NombreCliente = BOXNombreCliente.getSelectedItem().toString();

        for (int i = 0; i < n; i++) {

            if (Menu.Login.ModeloClase.ArreMascota[i].getNombreCliente().equals(NombreCliente)) {
                BOXMascota.addItem(Menu.Login.ModeloClase.ArreMascota[i].getNombre_Mascota());

            }
        }

        Limpiar();


    }//GEN-LAST:event_BOXNombreClienteItemStateChanged

    private void BOXMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXMascotaActionPerformed

    }//GEN-LAST:event_BOXMascotaActionPerformed

    private void BTCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCargarActionPerformed
        // TODO add your handling code here:

        Limpiar();

        int m = Menu.Login.ModeloClase.ContMascotas;

        String ModificarCliente = BOXNombreCliente.getSelectedItem().toString();
        String ModificarMascota = BOXMascota.getSelectedItem().toString();

        int Seleccion;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                if (ModificarCliente.equals(Menu.Login.ModeloClase.ArreMascota[i].getNombreCliente()) && ModificarMascota.equals(Menu.Login.ModeloClase.ArreMascota[j].getNombre_Mascota())) {

                    Seleccion = j;

                    TxtNombreMascota.setText(Menu.Login.ModeloClase.ArreMascota[Seleccion].getNombre_Mascota());
                    TxtEspecie.setText(Menu.Login.ModeloClase.ArreMascota[Seleccion].getEspecie());
                    TxtRaza.setText(Menu.Login.ModeloClase.ArreMascota[Seleccion].getRaza());

                    if ("Masculino".equals(Menu.Login.ModeloClase.ArreMascota[Seleccion].getSexo())) {
                        ChekMasculino.setSelected(true);
                    } else {
                        ChekMasculino.setSelected(false);
                    }

                    if ("Hembra".equals(Menu.Login.ModeloClase.ArreMascota[Seleccion].getSexo())) {
                        Chekfemenino.setSelected(true);
                    } else {
                        Chekfemenino.setSelected(false);
                    }

                    TxtEdad.setText(Menu.Login.ModeloClase.ArreMascota[Seleccion].getEdad_Mascota());
                }
            }

        }


    }//GEN-LAST:event_BTCargarActionPerformed

    private void ChekMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChekMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChekMasculinoActionPerformed


    private void BOXMascotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BOXMascotaItemStateChanged
        // limpia al cambiar de mascota
        Limpiar();
    }//GEN-LAST:event_BOXMascotaItemStateChanged

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFModificar_Mascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //     new JFModificar_Mascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BOXMascota;
    private javax.swing.JComboBox BOXNombreCliente;
    private javax.swing.JButton BTCancelar;
    private javax.swing.JButton BTCargar;
    private javax.swing.JButton BTRegistro;
    private javax.swing.JCheckBox ChekMasculino;
    private javax.swing.JCheckBox Chekfemenino;
    private javax.swing.JLabel EtiMascota;
    private javax.swing.JLabel EtiquetaEdad;
    private javax.swing.JLabel EtiquetaEspecie;
    private javax.swing.JLabel EtiquetaNombreMascota;
    private javax.swing.JLabel EtiquetaRaza;
    private javax.swing.JLabel EtiquetaSexo;
    private javax.swing.JLabel EtiqueteNombreDueño;
    private javax.swing.JPanel Fondo;
    private javax.swing.ButtonGroup Grupo_SexoMascota;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtEspecie;
    private javax.swing.JTextField TxtNombreMascota;
    private javax.swing.JTextField TxtRaza;
    // End of variables declaration//GEN-END:variables
}
