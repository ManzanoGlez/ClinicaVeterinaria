package Frames;

import Control.MetodosEnVentanas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Manzano
 */
public class JFMenu extends javax.swing.JFrame {

    JFLogin Login = new JFLogin();

    public JFMenu(JFLogin L) {
        initComponents();
        Login = L;
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        this.setExtendedState(JFMenu.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        ColorBajo = new javax.swing.JPanel();
        BTRegistrarCliente = new javax.swing.JButton();
        BTRegistrarMascota = new javax.swing.JButton();
        BTRegistrarServicio = new javax.swing.JButton();
        BTVerClientes = new javax.swing.JButton();
        BTVerMascotas = new javax.swing.JButton();
        BTVerServicios = new javax.swing.JButton();
        BTFactura2 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        BTVerServicios1 = new javax.swing.JButton();
        BTServisiosRegistrados1 = new javax.swing.JButton();
        BTCerrarSesion = new javax.swing.JButton();
        JMenuBarra = new javax.swing.JMenuBar();
        JMClientes = new javax.swing.JMenu();
        JSMRegistroCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JSMImprimirCliente = new javax.swing.JMenuItem();
        JMMascotas = new javax.swing.JMenu();
        JSMRegistroMascota = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        JSMImprimirMascota = new javax.swing.JMenuItem();
        JMServicios = new javax.swing.JMenu();
        JSMRegistroServicios = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        JSMimprimirServicios = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        JSMDescripcionServicio = new javax.swing.JMenuItem();
        JMFacturar = new javax.swing.JMenu();
        JSMFacturas = new javax.swing.JMenuItem();
        JMReportes = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        JMSistema = new javax.swing.JMenu();
        JSMCerrarSesion = new javax.swing.JMenuItem();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        ColorBajo.setBackground(new java.awt.Color(0, 153, 153));
        ColorBajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTRegistrarCliente.setBackground(new java.awt.Color(0, 153, 153));
        BTRegistrarCliente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BTRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarCliente.png"))); // NOI18N
        BTRegistrarCliente.setText("Registrar a un Cliente");
        BTRegistrarCliente.setToolTipText("");
        BTRegistrarCliente.setBorder(null);
        BTRegistrarCliente.setBorderPainted(false);
        BTRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegistrarClienteActionPerformed(evt);
            }
        });
        ColorBajo.add(BTRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        BTRegistrarMascota.setBackground(new java.awt.Color(0, 153, 153));
        BTRegistrarMascota.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTRegistrarMascota.setForeground(new java.awt.Color(255, 255, 255));
        BTRegistrarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistroPerro.png"))); // NOI18N
        BTRegistrarMascota.setText("Registrar a una Mascota");
        BTRegistrarMascota.setToolTipText("");
        BTRegistrarMascota.setBorder(null);
        BTRegistrarMascota.setBorderPainted(false);
        BTRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegistrarMascotaActionPerformed(evt);
            }
        });
        ColorBajo.add(BTRegistrarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        BTRegistrarServicio.setBackground(new java.awt.Color(0, 153, 153));
        BTRegistrarServicio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTRegistrarServicio.setForeground(new java.awt.Color(255, 255, 255));
        BTRegistrarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistroServicio.png"))); // NOI18N
        BTRegistrarServicio.setText("Registrar un Servicio");
        BTRegistrarServicio.setToolTipText("");
        BTRegistrarServicio.setBorder(null);
        BTRegistrarServicio.setBorderPainted(false);
        BTRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegistrarServicioActionPerformed(evt);
            }
        });
        ColorBajo.add(BTRegistrarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, -1, -1));

        BTVerClientes.setBackground(new java.awt.Color(0, 153, 153));
        BTVerClientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        BTVerClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImprimirCliente.png"))); // NOI18N
        BTVerClientes.setText("Ver Clientes registrados");
        BTVerClientes.setToolTipText("");
        BTVerClientes.setBorder(null);
        BTVerClientes.setBorderPainted(false);
        BTVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVerClientesActionPerformed(evt);
            }
        });
        ColorBajo.add(BTVerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        BTVerMascotas.setBackground(new java.awt.Color(0, 153, 153));
        BTVerMascotas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTVerMascotas.setForeground(new java.awt.Color(255, 255, 255));
        BTVerMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImprimirMascotas.png"))); // NOI18N
        BTVerMascotas.setText("Ver Mascotas registradas");
        BTVerMascotas.setToolTipText("");
        BTVerMascotas.setBorder(null);
        BTVerMascotas.setBorderPainted(false);
        BTVerMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVerMascotasActionPerformed(evt);
            }
        });
        ColorBajo.add(BTVerMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, -1, -1));

        BTVerServicios.setBackground(new java.awt.Color(0, 153, 153));
        BTVerServicios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTVerServicios.setForeground(new java.awt.Color(255, 255, 255));
        BTVerServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HistorialMascota.png"))); // NOI18N
        BTVerServicios.setText("Historial de Mascotas");
        BTVerServicios.setToolTipText("");
        BTVerServicios.setBorder(null);
        BTVerServicios.setBorderPainted(false);
        BTVerServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVerServiciosActionPerformed(evt);
            }
        });
        ColorBajo.add(BTVerServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, -1, -1));

        BTFactura2.setBackground(new java.awt.Color(0, 153, 153));
        BTFactura2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTFactura2.setForeground(new java.awt.Color(255, 255, 255));
        BTFactura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FacturaGrande.png"))); // NOI18N
        BTFactura2.setText("Facturar");
        BTFactura2.setToolTipText("");
        BTFactura2.setBorder(null);
        BTFactura2.setBorderPainted(false);
        BTFactura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTFactura2ActionPerformed(evt);
            }
        });
        ColorBajo.add(BTFactura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, -1, -1));

        Logo.setBackground(new java.awt.Color(0, 153, 153));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoParaMenu.png"))); // NOI18N
        ColorBajo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 340, 310));

        BTVerServicios1.setBackground(new java.awt.Color(0, 153, 153));
        BTVerServicios1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTVerServicios1.setForeground(new java.awt.Color(255, 255, 255));
        BTVerServicios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImprimirServicios.png"))); // NOI18N
        BTVerServicios1.setText("Ver Servicios asignados");
        BTVerServicios1.setToolTipText("");
        BTVerServicios1.setBorder(null);
        BTVerServicios1.setBorderPainted(false);
        BTVerServicios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVerServicios1ActionPerformed(evt);
            }
        });
        ColorBajo.add(BTVerServicios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, -1, -1));

        BTServisiosRegistrados1.setBackground(new java.awt.Color(0, 153, 153));
        BTServisiosRegistrados1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTServisiosRegistrados1.setForeground(new java.awt.Color(255, 255, 255));
        BTServisiosRegistrados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ServisiosRegistrados.png"))); // NOI18N
        BTServisiosRegistrados1.setText("Servicios Disponibles");
        BTServisiosRegistrados1.setToolTipText("");
        BTServisiosRegistrados1.setBorder(null);
        BTServisiosRegistrados1.setBorderPainted(false);
        BTServisiosRegistrados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTServisiosRegistrados1ActionPerformed(evt);
            }
        });
        ColorBajo.add(BTServisiosRegistrados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        BTCerrarSesion.setBackground(new java.awt.Color(0, 102, 153));
        BTCerrarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        BTCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloquear.png"))); // NOI18N
        BTCerrarSesion.setText("Cerrar Sesión");
        BTCerrarSesion.setToolTipText("");
        BTCerrarSesion.setBorder(null);
        BTCerrarSesion.setBorderPainted(false);
        BTCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ColorBajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTCerrarSesion)
                .addGap(39, 39, 39))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(ColorBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTCerrarSesion)
                .addGap(43, 43, 43))
        );

        JMClientes.setText("Clientes");

        JSMRegistroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        JSMRegistroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        JSMRegistroCliente.setText("Registrar cliente");
        JSMRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMRegistroClienteActionPerformed(evt);
            }
        });
        JMClientes.add(JSMRegistroCliente);
        JMClientes.add(jSeparator1);

        JSMImprimirCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        JSMImprimirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        JSMImprimirCliente.setText("Imprimir datos clientes");
        JSMImprimirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMImprimirClienteActionPerformed(evt);
            }
        });
        JMClientes.add(JSMImprimirCliente);

        JMenuBarra.add(JMClientes);

        JMMascotas.setText("Mascotas");

        JSMRegistroMascota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JSMRegistroMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        JSMRegistroMascota.setText("Registrar mascota");
        JSMRegistroMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMRegistroMascotaActionPerformed(evt);
            }
        });
        JMMascotas.add(JSMRegistroMascota);
        JMMascotas.add(jSeparator5);

        JSMImprimirMascota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JSMImprimirMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        JSMImprimirMascota.setText("Imprimir datos mascotas");
        JSMImprimirMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMImprimirMascotaActionPerformed(evt);
            }
        });
        JMMascotas.add(JSMImprimirMascota);

        JMenuBarra.add(JMMascotas);

        JMServicios.setText("Servicios");

        JSMRegistroServicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JSMRegistroServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        JSMRegistroServicios.setText("Registro de Servicios");
        JSMRegistroServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMRegistroServiciosActionPerformed(evt);
            }
        });
        JMServicios.add(JSMRegistroServicios);
        JMServicios.add(jSeparator8);

        JSMimprimirServicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JSMimprimirServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        JSMimprimirServicios.setText("Imprimir Servicios Registrados");
        JSMimprimirServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMimprimirServiciosActionPerformed(evt);
            }
        });
        JMServicios.add(JSMimprimirServicios);
        JMServicios.add(jSeparator9);

        JSMDescripcionServicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JSMDescripcionServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Informes.png"))); // NOI18N
        JSMDescripcionServicio.setText("Descripción servicios");
        JSMDescripcionServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMDescripcionServicioActionPerformed(evt);
            }
        });
        JMServicios.add(JSMDescripcionServicio);

        JMenuBarra.add(JMServicios);

        JMFacturar.setText("Facturar");

        JSMFacturas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        JSMFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Factura.png"))); // NOI18N
        JSMFacturas.setText("Iniciar Factura");
        JSMFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMFacturasActionPerformed(evt);
            }
        });
        JMFacturar.add(JSMFacturas);

        JMenuBarra.add(JMFacturar);

        JMReportes.setText("Reportes");
        JMReportes.add(jSeparator7);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReporteServisios.png"))); // NOI18N
        jMenuItem2.setText("Historial Mascotas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMReportes.add(jMenuItem2);

        JMenuBarra.add(JMReportes);

        JMSistema.setText("Sistema");

        JSMCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JSMCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar sesion.png"))); // NOI18N
        JSMCerrarSesion.setText("Cerrar sesión");
        JSMCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSMCerrarSesionActionPerformed(evt);
            }
        });
        JMSistema.add(JSMCerrarSesion);

        JMenuBarra.add(JMSistema);

        setJMenuBar(JMenuBarra);

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Cerrar LA Ventana con la X
        MetodosEnVentanas Ventanas = new MetodosEnVentanas();
        Ventanas.SalidaConX();
    }//GEN-LAST:event_formWindowClosing

    private void JSMCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMCerrarSesionActionPerformed
        // Cerrar Sesion
        int salidaX = JOptionPane.showConfirmDialog(null, "¿Estas Seguro de cerrar sesión ?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        if (salidaX == JOptionPane.YES_OPTION) {
            JFLogin L = new JFLogin();
            this.setVisible(false);
            this.dispose();
            L.setVisible(true);
        } else {
            /*Vacio para regresar*/
        }
    }//GEN-LAST:event_JSMCerrarSesionActionPerformed

    private void JSMDescripcionServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMDescripcionServicioActionPerformed
        // Barra de herramientas a  Menu Servicios
        JFServicios Servicios = new JFServicios();
        Servicios.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMDescripcionServicioActionPerformed

    private void JSMRegistroMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMRegistroMascotaActionPerformed
        //Registro de Mascotas
        JFRegistro_Mascota RM = new JFRegistro_Mascota(this);
        RM.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMRegistroMascotaActionPerformed

    private void JSMImprimirMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMImprimirMascotaActionPerformed
        // Imprimir Datos Mascotas
        JFImprimir_Mascotas IM = new JFImprimir_Mascotas(this);
        IM.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMImprimirMascotaActionPerformed

    private void JSMFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMFacturasActionPerformed
        // Facturacion 
        JFFacturas F = new JFFacturas(this);
        F.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMFacturasActionPerformed

    private void JSMRegistroServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMRegistroServiciosActionPerformed
        // Registro Servicios
        JFRegistro_Servicio RS = new JFRegistro_Servicio(this);
        RS.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMRegistroServiciosActionPerformed

    private void JSMImprimirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMImprimirClienteActionPerformed
        //Imprimir datos del cliente
        JFImprimir_Clientes IC = new JFImprimir_Clientes(this);
        IC.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMImprimirClienteActionPerformed

    private void JSMRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMRegistroClienteActionPerformed
        // Registro a Cliente
        JFRegistro_Cliente RC = new JFRegistro_Cliente(this);
        RC.setVisible(true);
        this.disable();
    }//GEN-LAST:event_JSMRegistroClienteActionPerformed

    private void JSMimprimirServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSMimprimirServiciosActionPerformed
        //Imprimir Servicios
        JFImprimir_Servicios IS = new JFImprimir_Servicios(this);
        IS.setVisible(true);
    }//GEN-LAST:event_JSMimprimirServiciosActionPerformed

    private void BTCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCerrarSesionActionPerformed
        // Salir por Boton Grande
        // Cerrar Sesion
        int salidaX = JOptionPane.showConfirmDialog(null, "¿Estas Seguro de cerrar sesión ?", "Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        if (salidaX == JOptionPane.YES_OPTION) {
            JFLogin L = new JFLogin();
            this.setVisible(false);
            this.dispose();
            L.setVisible(true);
        } else {
            /*Vacio para regresar*/
        }

    }//GEN-LAST:event_BTCerrarSesionActionPerformed

    private void BTFactura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTFactura2ActionPerformed
        // Facturar por Boton Grande
        // Facturacion 
        JFFacturas F = new JFFacturas(this);
        F.setVisible(true);
        this.disable();

    }//GEN-LAST:event_BTFactura2ActionPerformed

    private void BTRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistrarClienteActionPerformed
        // Registro a Cliente por Botton Grande
        // Registro a Cliente
        JFRegistro_Cliente RC = new JFRegistro_Cliente(this);
        RC.setVisible(true);
        this.disable();
    }//GEN-LAST:event_BTRegistrarClienteActionPerformed

    private void BTRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistrarMascotaActionPerformed
        // BTGrande Registro MAscota
        //Registro de Mascotas
        if (Login.ModeloClase.ContClientes == 0) {
            JOptionPane.showMessageDialog(this, "Primero debes registrar a un cliente.");
        } else {
            JFRegistro_Mascota RM = new JFRegistro_Mascota(this);
            RM.setVisible(true);
            this.disable();
        }
    }//GEN-LAST:event_BTRegistrarMascotaActionPerformed

    private void BTRegistrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistrarServicioActionPerformed
        // BT Grande Registrar Servicio
        // Registro Servicios
        if (Login.ModeloClase.ContClientes == 0) {
            JOptionPane.showMessageDialog(this, "Primero debes registrar a una mascota y a un cliente.");
        } else {
            JFRegistro_Servicio RS = new JFRegistro_Servicio(this);
            RS.setVisible(true);
            this.disable();

        }


    }//GEN-LAST:event_BTRegistrarServicioActionPerformed

    private void BTVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVerClientesActionPerformed
        // BT Grande  ver clientes registrados
        //Imprimir datos del cliente
        JFImprimir_Clientes IC = new JFImprimir_Clientes(this);
        IC.setVisible(true);
        this.disable();
    }//GEN-LAST:event_BTVerClientesActionPerformed

    private void BTVerMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVerMascotasActionPerformed
        // Bt Grande Mascotas Registradas
        // Imprimir Datos Mascotas
        JFImprimir_Mascotas IM = new JFImprimir_Mascotas(this);
        IM.setVisible(true);
        this.disable();
    }//GEN-LAST:event_BTVerMascotasActionPerformed

    private void BTVerServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVerServiciosActionPerformed
//Bt Historial de Mascotas
        JFHistorialMascota HM = new JFHistorialMascota(this);
        HM.setVisible(true);
        this.disable();
    }//GEN-LAST:event_BTVerServiciosActionPerformed

    private void BTVerServicios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVerServicios1ActionPerformed
        // BT Grande Ver Servicios Asignados
        JFImprimir_Servicios IS = new JFImprimir_Servicios(this);
        IS.setVisible(true);
        this.disable();
    }//GEN-LAST:event_BTVerServicios1ActionPerformed

    private void BTServisiosRegistrados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTServisiosRegistrados1ActionPerformed
        // TODO add your handling code here:
       JFServicios S = new JFServicios();
       S.setVisible(true);
        
    }//GEN-LAST:event_BTServisiosRegistrados1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCerrarSesion;
    private javax.swing.JButton BTFactura2;
    private javax.swing.JButton BTRegistrarCliente;
    private javax.swing.JButton BTRegistrarMascota;
    private javax.swing.JButton BTRegistrarServicio;
    private javax.swing.JButton BTServisiosRegistrados1;
    private javax.swing.JButton BTVerClientes;
    private javax.swing.JButton BTVerMascotas;
    private javax.swing.JButton BTVerServicios;
    private javax.swing.JButton BTVerServicios1;
    private javax.swing.JPanel ColorBajo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JMenu JMClientes;
    private javax.swing.JMenu JMFacturar;
    private javax.swing.JMenu JMMascotas;
    private javax.swing.JMenu JMReportes;
    private javax.swing.JMenu JMServicios;
    private javax.swing.JMenu JMSistema;
    private javax.swing.JMenuBar JMenuBarra;
    private javax.swing.JMenuItem JSMCerrarSesion;
    private javax.swing.JMenuItem JSMDescripcionServicio;
    private javax.swing.JMenuItem JSMFacturas;
    private javax.swing.JMenuItem JSMImprimirCliente;
    private javax.swing.JMenuItem JSMImprimirMascota;
    private javax.swing.JMenuItem JSMRegistroCliente;
    private javax.swing.JMenuItem JSMRegistroMascota;
    private javax.swing.JMenuItem JSMRegistroServicios;
    private javax.swing.JMenuItem JSMimprimirServicios;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
