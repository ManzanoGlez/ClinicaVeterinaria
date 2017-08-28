package Frames;

import Objetos.Factura;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Manzano
 */
public class JFFacturas extends javax.swing.JFrame {

    JFMenu Menu;

    static int ContFolio = 1085;

    public JFFacturas(JFMenu M) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        Menu = M;

        //Llenar el combox de los datos de los Clientes esto lo voy a pegar en el registro de mascota
        int n = Menu.Login.ModeloClase.ContClientes;
        for (int i = 0; i < n; i++) {
            CBXCliente_Factura.addItem(Menu.Login.ModeloClase.ArreCliente[i].getNombre());
            String NombreFactu = Menu.Login.ModeloClase.ArreCliente[i].getNombre();
            System.out.println("Nombre del cliente a facturar :" + NombreFactu);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Color = new javax.swing.JPanel();
        EtiCliente = new javax.swing.JLabel();
        CBXCliente_Factura = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Factura = new javax.swing.JTable();
        EtiFolio = new javax.swing.JLabel();
        EtiDireccion = new javax.swing.JLabel();
        EtirfceMPRESA = new javax.swing.JLabel();
        Logo = new javax.swing.JButton();
        Etisubtotal = new javax.swing.JLabel();
        EtiIva = new javax.swing.JLabel();
        EtiTotal = new javax.swing.JLabel();
        BTRegresar = new javax.swing.JButton();
        JBTFacturar = new javax.swing.JButton();
        TxtSubtotal = new javax.swing.JLabel();
        Txtiva = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JLabel();
        BTAceptar = new javax.swing.JButton();
        EtiRFC = new javax.swing.JLabel();
        TxtRFC = new javax.swing.JLabel();
        EtiTelCliente = new javax.swing.JLabel();
        TxtTelCliente = new javax.swing.JLabel();
        EtiFEcha = new javax.swing.JLabel();
        JLFecha = new javax.swing.JLabel();
        EtiTelefono1 = new javax.swing.JLabel();
        JLFolio = new javax.swing.JLabel();

        setTitle("Facturación");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Color.setBackground(new java.awt.Color(0, 102, 153));

        EtiCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiCliente.setForeground(new java.awt.Color(255, 255, 255));
        EtiCliente.setText("Cliente : ");

        CBXCliente_Factura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona un cliente" }));
        CBXCliente_Factura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBXCliente_FacturaItemStateChanged(evt);
            }
        });

        Tabla_Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mascota", "Consulta", "Vacuna", "Cirugía", "Desparasitacíon", "Estética", "Pensión (30 dias)", "Subtotal por servicios"
            }
        ));
        Tabla_Factura.setToolTipText("");
        jScrollPane1.setViewportView(Tabla_Factura);

        EtiFolio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiFolio.setForeground(new java.awt.Color(255, 255, 255));
        EtiFolio.setText("Folio :");

        EtiDireccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiDireccion.setForeground(new java.awt.Color(255, 255, 255));
        EtiDireccion.setText("Establecimiento  : Luis J. Jiménez 577, Colonia Primero de Mayo, C.P. 44979 Guadalajara, Jalisco, México ");

        EtirfceMPRESA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtirfceMPRESA.setForeground(new java.awt.Color(255, 255, 255));
        EtirfceMPRESA.setText("RFC: MELM8305281H0 ");

        Logo.setBackground(new java.awt.Color(0, 102, 153));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFactura.png"))); // NOI18N
        Logo.setBorderPainted(false);

        Etisubtotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Etisubtotal.setForeground(new java.awt.Color(255, 255, 255));
        Etisubtotal.setText("Subtotal  : ");

        EtiIva.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiIva.setForeground(new java.awt.Color(255, 255, 255));
        EtiIva.setText("IVA 16 % :");

        EtiTotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiTotal.setForeground(new java.awt.Color(255, 255, 255));
        EtiTotal.setText("Total : ");

        BTRegresar.setBackground(new java.awt.Color(0, 102, 153));
        BTRegresar.setForeground(new java.awt.Color(0, 102, 153));
        BTRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BTRegresar.setBorderPainted(false);
        BTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegresarActionPerformed(evt);
            }
        });

        JBTFacturar.setText("Facturar");
        JBTFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTFacturarActionPerformed(evt);
            }
        });

        TxtSubtotal.setBackground(new java.awt.Color(0, 102, 153));
        TxtSubtotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        TxtSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        TxtSubtotal.setText("0.00");

        Txtiva.setBackground(new java.awt.Color(0, 102, 153));
        Txtiva.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Txtiva.setForeground(new java.awt.Color(255, 255, 255));
        Txtiva.setText("0.00");

        TxtTotal.setBackground(new java.awt.Color(0, 102, 153));
        TxtTotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        TxtTotal.setForeground(new java.awt.Color(255, 255, 255));
        TxtTotal.setText("0.00");

        BTAceptar.setBackground(new java.awt.Color(0, 102, 153));
        BTAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        BTAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAceptarActionPerformed(evt);
            }
        });

        EtiRFC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiRFC.setForeground(new java.awt.Color(255, 255, 255));
        EtiRFC.setText("RFC :");

        TxtRFC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        TxtRFC.setForeground(new java.awt.Color(255, 255, 255));

        EtiTelCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiTelCliente.setForeground(new java.awt.Color(255, 255, 255));
        EtiTelCliente.setText("Telefóno :");

        TxtTelCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        TxtTelCliente.setForeground(new java.awt.Color(255, 255, 255));

        EtiFEcha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiFEcha.setForeground(new java.awt.Color(255, 255, 255));
        EtiFEcha.setText("Fecha:");

        JLFecha.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        JLFecha.setForeground(new java.awt.Color(255, 255, 255));

        EtiTelefono1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        EtiTelefono1.setForeground(new java.awt.Color(255, 255, 255));
        EtiTelefono1.setText("Telefóno: + 52 (33) 3030-0900, 01, 02, 03");

        JLFolio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        JLFolio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ColorLayout = new javax.swing.GroupLayout(Color);
        Color.setLayout(ColorLayout);
        ColorLayout.setHorizontalGroup(
            ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ColorLayout.createSequentialGroup()
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ColorLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(EtiTotal)
                                .addGap(18, 18, 18)
                                .addComponent(TxtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Etisubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ColorLayout.createSequentialGroup()
                                .addComponent(EtiIva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txtiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(731, 731, 731)
                        .addComponent(BTAceptar)
                        .addGap(91, 91, 91)
                        .addComponent(BTRegresar))
                    .addGroup(ColorLayout.createSequentialGroup()
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ColorLayout.createSequentialGroup()
                                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(EtiFolio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JLFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(EtiFEcha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(EtiCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBXCliente_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(JBTFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(EtiRFC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(EtiTelCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorLayout.createSequentialGroup()
                                        .addComponent(EtiDireccion)
                                        .addGap(28, 28, 28))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(EtiTelefono1)
                                        .addGap(18, 18, 18)
                                        .addComponent(EtirfceMPRESA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ColorLayout.setVerticalGroup(
            ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorLayout.createSequentialGroup()
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColorLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtiFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiFEcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiTelefono1)
                            .addComponent(EtirfceMPRESA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CBXCliente_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JBTFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EtiRFC)
                            .addComponent(TxtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiTelCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtTelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ColorLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTAceptar)
                                    .addComponent(BTRegresar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(ColorLayout.createSequentialGroup()
                        .addComponent(Etisubtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiIva)
                        .addGap(18, 18, 18)
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiTotal)
                            .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        // De regreso al menu
        Menu.setVisible(true);
        Menu.enable();
        this.dispose();
    }//GEN-LAST:event_BTRegresarActionPerformed

    private void BTAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAceptarActionPerformed
        // Boton aceptar
        Menu.setVisible(true);
        this.dispose();
        Menu.enable();
        ContFolio++;
        Menu.Login.ModeloClase.ContFactura++;
    }//GEN-LAST:event_BTAceptarActionPerformed

    private void JBTFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTFacturarActionPerformed
     // Se factura al cliente seleccionado

        double Suma;
        double SumaTodo = 0;
        int c = Menu.Login.ModeloClase.ContClientes;

        int numFilas = 0;
        int s = Menu.Login.ModeloClase.ContServicios;
        int F = Menu.Login.ModeloClase.ContFactura;

        int Factura = 0;

        String NombreCliente = CBXCliente_Factura.getSelectedItem().toString();

        /*Obtener folio*/
        Factura Factu = new Factura();
        String ConvFolio;
        ConvFolio = Integer.toString(ContFolio);
        Factu.setFolio(ContFolio);
        JLFolio.setText(ConvFolio);
        /*Fin de ontener Folio*/

        for (int i = 0; i < s; i++) {
            if (NombreCliente.equals(Menu.Login.ModeloClase.ArreServicio[i].getNombreServicioCliente())) {

                Factura = i;

                /*Obtener Fecha*/
                JLFecha.setText(Menu.Login.ModeloClase.ArreServicio[Factura].getFechaHistorialMascota());

                /*Obtener Telefono*/
                TxtTelCliente.setText(Menu.Login.ModeloClase.ArreCliente[Factura].getTelefono());

                Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getNombreServicioMascota(), numFilas, 0);

                if (Menu.Login.ModeloClase.ArreServicio[Factura].getServicio_Consulta() != null) {
                    Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecio_Consulta(), numFilas, 1);
                }
                if (Menu.Login.ModeloClase.ArreServicio[Factura].getServicio_Vacuna() != null) {
                    Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecio_Vacuna(), numFilas, 2);
                }
                if (Menu.Login.ModeloClase.ArreServicio[Factura].getServicio_Cirugia() != null) {
                    Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecio_Cirugia(), numFilas, 3);
                }
                if (Menu.Login.ModeloClase.ArreServicio[Factura].getServicio_Desparasitacion() != null) {
                    Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecio_Desparasitacion(), numFilas, 4);
                }
                if (Menu.Login.ModeloClase.ArreServicio[Factura].getServicio_Estetica() != null) {
                    Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecio_Estetica(), numFilas, 5);
                }
                if (Menu.Login.ModeloClase.ArreServicio[Factura].getServicio_Pension() != null) {
                    Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecio_Pension(), numFilas, 6);
                }
                Tabla_Factura.setValueAt(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecioTotal(), numFilas, 7);

                //Saca del subtotal de todos los servicios
                Suma = Menu.Login.ModeloClase.ArreServicio[Factura].getPrecioTotal();
                Menu.Login.ModeloClase.ArreFactura[F].setSubtotal(Menu.Login.ModeloClase.ArreServicio[Factura].getPrecioTotal());

                SumaTodo = SumaTodo + Suma;
                numFilas++;

                System.out.println("Suma Todo sin descuento : " + SumaTodo);
            }
        }
 // Sacar RFC
        for (int i = 0; i < s; i++) {
            if (NombreCliente.equals(Menu.Login.ModeloClase.ArreServicio[i].getNombreServicioCliente())) {
                for (int j = 0; j < c; j++) {
                    /*Obtener RFC*/
                    System.out.println(Menu.Login.ModeloClase.ArreCliente[i].getRFC());
                    TxtRFC.setText(Menu.Login.ModeloClase.ArreCliente[i].getRFC());
                }
            }
        }
        //sacar el subtotal
        TxtSubtotal.setText(String.format("%.2f", SumaTodo));

        //Sacar el iva
        double IvaFactura = SumaTodo * 0.16;
        Txtiva.setText(String.format("%.2f", IvaFactura));

        //Sacar el Total
        double Total = IvaFactura + SumaTodo;
        TxtTotal.setText(String.format("%.2f", Total));

    }//GEN-LAST:event_JBTFacturarActionPerformed

    private void CBXCliente_FacturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBXCliente_FacturaItemStateChanged
        // Limpiar Tabla despues al cambiar de cliente

        int numFilas = 0;
        int n = Menu.Login.ModeloClase.ContServicios;

        JLFolio.setText(null);
        TxtRFC.setText(null);
        TxtTelCliente.setText(null);
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            for (int i = 0; i < n; i++) {

                Tabla_Factura.setValueAt(null, numFilas, 0);
                Tabla_Factura.setValueAt(null, numFilas, 1);
                Tabla_Factura.setValueAt(null, numFilas, 2);
                Tabla_Factura.setValueAt(null, numFilas, 3);
                Tabla_Factura.setValueAt(null, numFilas, 4);
                Tabla_Factura.setValueAt(null, numFilas, 5);
                Tabla_Factura.setValueAt(null, numFilas, 6);
                Tabla_Factura.setValueAt(null, numFilas, 7);
                numFilas++;
            }
            TxtSubtotal.setText("0.00");
            Txtiva.setText("0.00");
            TxtTotal.setText("0.00");
        }
    }//GEN-LAST:event_CBXCliente_FacturaItemStateChanged

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
            java.util.logging.Logger.getLogger(JFFacturas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //    new JFFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAceptar;
    private javax.swing.JButton BTRegresar;
    private javax.swing.JComboBox CBXCliente_Factura;
    private javax.swing.JPanel Color;
    private javax.swing.JLabel EtiCliente;
    private javax.swing.JLabel EtiDireccion;
    private javax.swing.JLabel EtiFEcha;
    private javax.swing.JLabel EtiFolio;
    private javax.swing.JLabel EtiIva;
    private javax.swing.JLabel EtiRFC;
    private javax.swing.JLabel EtiTelCliente;
    private javax.swing.JLabel EtiTelefono1;
    private javax.swing.JLabel EtiTotal;
    private javax.swing.JLabel EtirfceMPRESA;
    private javax.swing.JLabel Etisubtotal;
    private javax.swing.JButton JBTFacturar;
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLFolio;
    private javax.swing.JButton Logo;
    private javax.swing.JTable Tabla_Factura;
    private javax.swing.JLabel TxtRFC;
    private javax.swing.JLabel TxtSubtotal;
    private javax.swing.JLabel TxtTelCliente;
    private javax.swing.JLabel TxtTotal;
    private javax.swing.JLabel Txtiva;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
