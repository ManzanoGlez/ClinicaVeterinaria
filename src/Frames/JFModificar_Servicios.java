package Frames;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Manzano
 */
public class JFModificar_Servicios extends javax.swing.JFrame {

    JFMenu Menu;

    public JFModificar_Servicios(JFMenu m) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());

        Menu = m;

        //Llenar el combox de los datos de los Clientes esto lo voy a pegar en el registro de mascota
        int n = Menu.Login.ModeloClase.ContClientes;
        for (int i = 0; i < n; i++) {
            BOXCliente.addItem(Menu.Login.ModeloClase.ArreCliente[i].getNombre());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BOXCliente = new javax.swing.JComboBox();
        EtiTitulo = new javax.swing.JLabel();
        EtiCliente = new javax.swing.JLabel();
        JBTRegresar = new javax.swing.JButton();
        EtiMascota = new javax.swing.JLabel();
        BOXMascota = new javax.swing.JComboBox();
        JCBConsulta = new javax.swing.JCheckBox();
        JCBVacuna = new javax.swing.JCheckBox();
        JCBCirugia = new javax.swing.JCheckBox();
        JCBEstetica = new javax.swing.JCheckBox();
        JCBPension = new javax.swing.JCheckBox();
        JBAceptar = new javax.swing.JButton();
        BTInfoConsulta = new javax.swing.JButton();
        BTInfoCirujia = new javax.swing.JButton();
        BTInfoEstetica = new javax.swing.JButton();
        BTInfoPension = new javax.swing.JButton();
        BTInfoVacuna = new javax.swing.JButton();
        JCBDesparasitar = new javax.swing.JCheckBox();
        BTInfoDesparasitar = new javax.swing.JButton();
        EtiServicios = new javax.swing.JLabel();
        EtiServicios1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        FechaServicio = new com.toedter.calendar.JDateChooser();
        EtiServicios2 = new javax.swing.JLabel();

        setTitle("Modificar Servicio");

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        BOXCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccióna a un cliente:" }));
        BOXCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BOXClienteItemStateChanged(evt);
            }
        });

        EtiTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiTitulo.setForeground(new java.awt.Color(255, 255, 255));
        EtiTitulo.setText("Modificación de Servicio");

        EtiCliente.setBackground(new java.awt.Color(0, 102, 153));
        EtiCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        EtiCliente.setForeground(new java.awt.Color(255, 255, 255));
        EtiCliente.setText("Cliente :");

        JBTRegresar.setBackground(new java.awt.Color(0, 102, 153));
        JBTRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        JBTRegresar.setBorderPainted(false);
        JBTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTRegresarActionPerformed(evt);
            }
        });

        EtiMascota.setBackground(new java.awt.Color(0, 102, 153));
        EtiMascota.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        EtiMascota.setForeground(new java.awt.Color(255, 255, 255));
        EtiMascota.setText("Mascota :");

        BOXMascota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccióna una mascota :" }));
        BOXMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXMascotaActionPerformed(evt);
            }
        });

        JCBConsulta.setBackground(new java.awt.Color(0, 102, 153));
        JCBConsulta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        JCBConsulta.setForeground(new java.awt.Color(255, 255, 255));
        JCBConsulta.setText("Consulta");

        JCBVacuna.setBackground(new java.awt.Color(0, 102, 153));
        JCBVacuna.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        JCBVacuna.setForeground(new java.awt.Color(255, 255, 255));
        JCBVacuna.setText("Vacuna");

        JCBCirugia.setBackground(new java.awt.Color(0, 102, 153));
        JCBCirugia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        JCBCirugia.setForeground(new java.awt.Color(255, 255, 255));
        JCBCirugia.setText("Cirugia");

        JCBEstetica.setBackground(new java.awt.Color(0, 102, 153));
        JCBEstetica.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        JCBEstetica.setForeground(new java.awt.Color(255, 255, 255));
        JCBEstetica.setText("Estetica");

        JCBPension.setBackground(new java.awt.Color(0, 102, 153));
        JCBPension.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        JCBPension.setForeground(new java.awt.Color(255, 255, 255));
        JCBPension.setText("Pensión (30 dias )");
        JCBPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBPensionActionPerformed(evt);
            }
        });

        JBAceptar.setBackground(new java.awt.Color(0, 102, 153));
        JBAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        JBAceptar.setBorderPainted(false);
        JBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAceptarActionPerformed(evt);
            }
        });

        BTInfoConsulta.setBackground(new java.awt.Color(0, 102, 153));
        BTInfoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        BTInfoConsulta.setBorderPainted(false);
        BTInfoConsulta.setContentAreaFilled(false);
        BTInfoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoConsultaActionPerformed(evt);
            }
        });

        BTInfoCirujia.setBackground(new java.awt.Color(0, 102, 153));
        BTInfoCirujia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        BTInfoCirujia.setBorderPainted(false);
        BTInfoCirujia.setContentAreaFilled(false);
        BTInfoCirujia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoCirujiaActionPerformed(evt);
            }
        });

        BTInfoEstetica.setBackground(new java.awt.Color(0, 102, 153));
        BTInfoEstetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        BTInfoEstetica.setBorderPainted(false);
        BTInfoEstetica.setContentAreaFilled(false);
        BTInfoEstetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoEsteticaActionPerformed(evt);
            }
        });

        BTInfoPension.setBackground(new java.awt.Color(0, 102, 153));
        BTInfoPension.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        BTInfoPension.setBorderPainted(false);
        BTInfoPension.setContentAreaFilled(false);
        BTInfoPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoPensionActionPerformed(evt);
            }
        });

        BTInfoVacuna.setBackground(new java.awt.Color(0, 102, 153));
        BTInfoVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        BTInfoVacuna.setBorderPainted(false);
        BTInfoVacuna.setContentAreaFilled(false);
        BTInfoVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoVacunaActionPerformed(evt);
            }
        });

        JCBDesparasitar.setBackground(new java.awt.Color(0, 102, 153));
        JCBDesparasitar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        JCBDesparasitar.setForeground(new java.awt.Color(255, 255, 255));
        JCBDesparasitar.setText("Desparasitación");

        BTInfoDesparasitar.setBackground(new java.awt.Color(0, 102, 153));
        BTInfoDesparasitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        BTInfoDesparasitar.setBorderPainted(false);
        BTInfoDesparasitar.setContentAreaFilled(false);
        BTInfoDesparasitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInfoDesparasitarActionPerformed(evt);
            }
        });

        EtiServicios.setBackground(new java.awt.Color(0, 102, 153));
        EtiServicios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        EtiServicios.setForeground(new java.awt.Color(255, 255, 255));
        EtiServicios.setText("Servicios :");

        EtiServicios1.setBackground(new java.awt.Color(0, 102, 153));
        EtiServicios1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        EtiServicios1.setForeground(new java.awt.Color(255, 255, 255));
        EtiServicios1.setText("Descripción del servicio :");

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        EtiServicios2.setBackground(new java.awt.Color(0, 102, 153));
        EtiServicios2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        EtiServicios2.setForeground(new java.awt.Color(255, 255, 255));
        EtiServicios2.setText("Fecha :");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(EtiTitulo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiServicios1)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(JBAceptar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBTRegresar)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addGap(0, 37, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(EtiCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BOXCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(EtiServicios)
                                .addGap(6, 6, 6)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(JCBDesparasitar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTInfoDesparasitar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(JCBCirugia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTInfoCirujia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCBVacuna)
                                            .addComponent(JCBConsulta))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTInfoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTInfoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(JCBEstetica)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTInfoEstetica, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(JCBPension)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTInfoPension, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiMascota)
                                    .addComponent(EtiServicios2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(FechaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(BOXMascota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(95, 95, 95))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(EtiTitulo)
                .addGap(22, 22, 22)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiCliente)
                            .addComponent(BOXCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiMascota)
                            .addComponent(BOXMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(FechaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EtiServicios2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EtiServicios)
                        .addComponent(JCBConsulta))
                    .addComponent(BTInfoConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBVacuna)
                    .addComponent(BTInfoVacuna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTInfoCirujia)
                    .addComponent(JCBCirugia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JCBDesparasitar)
                    .addComponent(BTInfoDesparasitar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBEstetica)
                    .addComponent(BTInfoEstetica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBPension)
                    .addComponent(BTInfoPension))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(EtiServicios1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(JBAceptar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBTRegresar)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*Metodo para obtener la fecha */
    SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }

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

    public void Limpiar() {

        FechaServicio.setDate(null);
        JCBConsulta.setSelected(false);
        JCBVacuna.setSelected(false);
        JCBCirugia.setSelected(false);
        JCBDesparasitar.setSelected(false);
        JCBEstetica.setSelected(false);
        JCBPension.setSelected(false);
        TxtDescripcion.setText("");

    }

    private void BOXClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BOXClienteItemStateChanged
        // Evento cuando cambio de cliente
        /*Limpia las moscotas al cambiar de cliente y carga las del cliente seleccionado*/

        int n = Menu.Login.ModeloClase.ContMascotas;
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            BOXMascota.removeAllItems();
        }
        for (int i = 0; i < n; i++) {
            String NombreCliente = BOXCliente.getSelectedItem().toString();
            if (Menu.Login.ModeloClase.ArreMascota[i].getNombreCliente().equals(NombreCliente)) {
                BOXMascota.addItem(Menu.Login.ModeloClase.ArreMascota[i].getNombre_Mascota());
            }
        }
    }//GEN-LAST:event_BOXClienteItemStateChanged

    private void JBTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTRegresarActionPerformed
        //Regreso al menu sin guardar
        Menu.enable();
        this.setVisible(false);
    }//GEN-LAST:event_JBTRegresarActionPerformed

    private void BOXMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOXMascotaActionPerformed

    private void JBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAceptarActionPerformed
        // Registrar Servicio

        int n = Menu.Login.ModeloClase.ContServicios;
        if (n < Menu.Login.ModeloClase.Tam) {

            String NombreCliente = BOXCliente.getSelectedItem().toString();
            String NombreMascota = BOXMascota.getSelectedItem().toString();
            int Seleccion = 0;

            if (n < Menu.Login.ModeloClase.Tam) {

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        //el nombre que se selecciono el el combox lo busca en el arreglo usuarios
                        if (Menu.Login.ModeloClase.ArreMascota[i].getNombreCliente().equals(NombreCliente) && Menu.Login.ModeloClase.ArreMascota[j].getNombre_Mascota().equals(NombreMascota)) {
                            Seleccion = j;
                        }
                    }
                }

                //Guarda la fecha
                Menu.Login.ModeloClase.ArreServicio[Seleccion].setFechaHistorialMascota(getFecha(FechaServicio));
                boolean FechaRe = true;
                if (this.getFecha(FechaServicio) == null) {
                    FechaRe = false;
                    JOptionPane.showMessageDialog(this, "Debes selecciónar una Fecha para continuar", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }

                //guarda LOS SERVICIOS
                double SumaTotal = 0;

                if (JCBConsulta.isSelected()) {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Consulta("Consulta");
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecio_Consulta(300.00);
                    SumaTotal = SumaTotal + 300.00;

                } else {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Consulta(null);
                }
                if (JCBVacuna.isSelected()) {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Vacuna("Vacunas");
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecio_Vacuna(250.00);
                    SumaTotal = SumaTotal + 250.00;
                } else {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Vacuna(null);
                }
                if (JCBCirugia.isSelected()) {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Cirugia("Cirugía");
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecio_Cirugia(1999.00);
                    SumaTotal = SumaTotal + 1999.00;
                } else {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Cirugia(null);
                }
                if (JCBDesparasitar.isSelected()) {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Desparasitacion("Desparasitación");
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecio_Desparasitacion(250.00);
                    SumaTotal = SumaTotal + 250.00;
                } else {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Desparasitacion(null);
                }
                if (JCBEstetica.isSelected()) {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Estetica("Estética");
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecio_Estetica(200.00);
                    SumaTotal = SumaTotal + 200.00;
                } else {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Estetica(null);
                }
                if (JCBPension.isSelected()) {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Pension("Pensión (30 días)");
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecio_Pension(4500.00);
                    SumaTotal = SumaTotal + 4500;
                } else {
                    Menu.Login.ModeloClase.ArreServicio[Seleccion].setServicio_Pension(null);
                }

                //Guardar descripción
                boolean Describir = true;

                String Describe = TxtDescripcion.getText();

                Menu.Login.ModeloClase.ArreServicio[Seleccion].setDescripcion(Describe);
                if (TxtDescripcion.getText() == null) {
                    Describir = false;
                    JOptionPane.showMessageDialog(this, "Debes colocar una breve descripción del servicio");
                }

                //Validar 
                if (FechaRe == true && Describir == true) {

                    if (Menu.Login.ModeloClase.ArreServicio[Seleccion].getServicio_Consulta() == null
                            && Menu.Login.ModeloClase.ArreServicio[Seleccion].getServicio_Vacuna() == null
                            && Menu.Login.ModeloClase.ArreServicio[Seleccion].getServicio_Cirugia() == null
                            && Menu.Login.ModeloClase.ArreServicio[Seleccion].getServicio_Desparasitacion() == null
                            && Menu.Login.ModeloClase.ArreServicio[Seleccion].getServicio_Estetica() == null
                            && Menu.Login.ModeloClase.ArreServicio[Seleccion].getServicio_Pension() == null) {

                        JOptionPane.showMessageDialog(this, "Debes seleccionar almenos 1 servicio", "Requisito", JOptionPane.WARNING_MESSAGE);

                    } else {

                        Menu.Login.ModeloClase.ArreServicio[Seleccion].setPrecioTotal(SumaTotal);
                        System.out.println("La suma de todos los servicios es : " + SumaTotal);

                        //aviso
                        JOptionPane.showMessageDialog(this, "Servicio registrado");

                        System.out.println("Contador de servicio : " + Menu.Login.ModeloClase.ContServicios);
                        System.out.println("ID Servicio : " + Menu.Login.ModeloClase.AsignaIDServicio);
                    JFImprimir_Mascotas IM = new JFImprimir_Mascotas(Menu);
                    IM.setVisible(true);
                    this.setVisible(false);

                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "El Almacenamiento esta lleno ", "Sistema Saturado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_JBAceptarActionPerformed

    private void BTInfoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoConsultaActionPerformed
        // Info Consulta
        JFServicio_Consulta SC = new JFServicio_Consulta();
        SC.setVisible(true);
    }//GEN-LAST:event_BTInfoConsultaActionPerformed

    private void BTInfoCirujiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoCirujiaActionPerformed
        //info cirujia
        JFServicio_Cirujia SC = new JFServicio_Cirujia();
        SC.setVisible(true);
    }//GEN-LAST:event_BTInfoCirujiaActionPerformed

    private void BTInfoEsteticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoEsteticaActionPerformed
        // Info Estetica
        JFServicio_Estetica SE = new JFServicio_Estetica();
        SE.setVisible(true);
    }//GEN-LAST:event_BTInfoEsteticaActionPerformed

    private void BTInfoPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoPensionActionPerformed
        // Info Pension
        JFServicio_Pension SP = new JFServicio_Pension();
        SP.setVisible(true);
    }//GEN-LAST:event_BTInfoPensionActionPerformed

    private void BTInfoVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoVacunaActionPerformed
        // Info Vacuna
        JFServicio_Vacunas SI = new JFServicio_Vacunas();
        SI.setVisible(true);
    }//GEN-LAST:event_BTInfoVacunaActionPerformed

    private void BTInfoDesparasitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInfoDesparasitarActionPerformed
        //Info Desparasitacion
        JFServicio_Despararasitar SD = new JFServicio_Despararasitar();
        SD.setVisible(true);
    }//GEN-LAST:event_BTInfoDesparasitarActionPerformed

    private void JCBPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBPensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBPensionActionPerformed

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
            java.util.logging.Logger.getLogger(JFModificar_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFModificar_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFModificar_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFModificar_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new JFModificar_Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BOXCliente;
    private javax.swing.JComboBox BOXMascota;
    private javax.swing.JButton BTInfoCirujia;
    private javax.swing.JButton BTInfoConsulta;
    private javax.swing.JButton BTInfoDesparasitar;
    private javax.swing.JButton BTInfoEstetica;
    private javax.swing.JButton BTInfoPension;
    private javax.swing.JButton BTInfoVacuna;
    private javax.swing.JLabel EtiCliente;
    private javax.swing.JLabel EtiMascota;
    private javax.swing.JLabel EtiServicios;
    private javax.swing.JLabel EtiServicios1;
    private javax.swing.JLabel EtiServicios2;
    private javax.swing.JLabel EtiTitulo;
    private com.toedter.calendar.JDateChooser FechaServicio;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton JBAceptar;
    private javax.swing.JButton JBTRegresar;
    private javax.swing.JCheckBox JCBCirugia;
    private javax.swing.JCheckBox JCBConsulta;
    private javax.swing.JCheckBox JCBDesparasitar;
    private javax.swing.JCheckBox JCBEstetica;
    private javax.swing.JCheckBox JCBPension;
    private javax.swing.JCheckBox JCBVacuna;
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
