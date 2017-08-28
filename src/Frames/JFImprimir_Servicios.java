package Frames;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Manzano
 */
public class JFImprimir_Servicios extends javax.swing.JFrame {

    //Buscar Datos
    private TableRowSorter trsFiltro;

    JFMenu Menu;

    public JFImprimir_Servicios(JFMenu m) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());

        Menu = m;

        CargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Servicios = new javax.swing.JTable();
        BTRegresar = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox();
        BTEliminar = new javax.swing.JButton();
        BTModificarServicio = new javax.swing.JButton();

        setTitle("Registro Servicios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));
        Fondo.setToolTipText("Servicios Registrados");

        Tabla_Servicios.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Servicios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Tabla_Servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Mascota", "Servicio1", "Servicio 2", "Servicio 3", "Servicio 4", "Servicio 5", "Servicio 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Servicios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla_Servicios.setGridColor(new java.awt.Color(0, 0, 0));
        Tabla_Servicios.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(Tabla_Servicios);
        if (Tabla_Servicios.getColumnModel().getColumnCount() > 0) {
            Tabla_Servicios.getColumnModel().getColumn(0).setPreferredWidth(35);
            Tabla_Servicios.getColumnModel().getColumn(1).setPreferredWidth(80);
            Tabla_Servicios.getColumnModel().getColumn(2).setPreferredWidth(80);
            Tabla_Servicios.getColumnModel().getColumn(3).setPreferredWidth(100);
            Tabla_Servicios.getColumnModel().getColumn(4).setPreferredWidth(100);
            Tabla_Servicios.getColumnModel().getColumn(5).setPreferredWidth(100);
            Tabla_Servicios.getColumnModel().getColumn(6).setPreferredWidth(100);
            Tabla_Servicios.getColumnModel().getColumn(7).setPreferredWidth(100);
            Tabla_Servicios.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        BTRegresar.setBackground(new java.awt.Color(0, 102, 153));
        BTRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BTRegresar.setBorderPainted(false);
        BTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegresarActionPerformed(evt);
            }
        });

        Etiqueta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta.setText("Servicios Registrados ");

        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });
        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar : ");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente", "Mascota", "Servicio 1", "Servicio 2", "Servicio 3", "Servicio 4", "Servicio 5", "Servicio 6" }));

        BTEliminar.setText("Eliminar  a un servicio");
        BTEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarActionPerformed(evt);
            }
        });

        BTModificarServicio.setText("Modificar un servicio");
        BTModificarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTModificarServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BTEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTModificarServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(BTRegresar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(Etiqueta))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Etiqueta)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTEliminar)
                            .addComponent(BTModificarServicio))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTRegresar)
                        .addGap(22, 22, 22))))
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

    public final void CargarTabla() {

        //obtener el numero de registros en el arreglo
        int n = Menu.Login.ModeloClase.ContServicios;
        int numFilas = 0;//Controla el numero de registros a mostrar en la latabla
        //se obtiene el modelo (Diseño de tabla)
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Servicios.getModel();
        // Inicializar los registros (Renglones)en el modelo
        tabla.addRow(new Object[numFilas]);
        //Llenar la tabla con la informaion del arreglo de objetos

        for (int i = 0; i < n; i++) {
//Se establecen los valores para cada columna de la tabla

            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getId_Servicio(), numFilas, 0);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getNombreServicioCliente(), numFilas, 1);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getNombreServicioMascota(), numFilas, 2);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getServicio_Consulta(), numFilas, 3);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getServicio_Vacuna(), numFilas, 4);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getServicio_Cirugia(), numFilas, 5);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getServicio_Desparasitacion(), numFilas, 6);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getServicio_Estetica(), numFilas, 7);
            Tabla_Servicios.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getServicio_Pension(), numFilas, 8);

            numFilas++;
        }

    }

    public void Filtro() {

        int columnaABuscar = 0;
        if ("Cliente".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("Mascota".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("Servicio 1".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
        if ("Servicio 2".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
        if ("Servicio 3".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 4;
        }
        if ("Servicio 4".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 5;
        }
        if ("Servicio 5".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 6;
        }
        if ("Servicio 6".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 7;

        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(TxtBuscar.getText(), columnaABuscar));
    }

    public void ActualizarTabla() {
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Servicios.getModel();
        tabla.setRowCount(0);
        tabla.setRowCount(20);
    }

    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        //Boton regresar
        Menu.enable();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTRegresarActionPerformed

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void TxtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarKeyTyped
        // TODO add your handling code here:
        TxtBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (TxtBuscar.getText());
                TxtBuscar.setText(cadena);
                repaint();
                Filtro();
            }
        });
        trsFiltro = new TableRowSorter(Tabla_Servicios.getModel());
        Tabla_Servicios.setRowSorter(trsFiltro);
    }//GEN-LAST:event_TxtBuscarKeyTyped

    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        // TODO add your handling code here:
        Menu.enable();
    }//GEN-LAST:event_Desbloquea

    private void BTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarActionPerformed
        // Eliminar
        int Eliminado;
        String Elimina = JOptionPane.showInputDialog("Introduce el ID del servicio que quieres dar de baja : ");
        Eliminado = Integer.parseInt(Elimina);
        boolean V = false;
        int c = Menu.Login.ModeloClase.ContServicios;

        for (int i = 0; i < c; i++) {
            if (Eliminado == (Menu.Login.ModeloClase.ArreServicio[i].getId_Servicio())) {

                for (int j = i; j < c - 1; j++) {
                    Menu.Login.ModeloClase.ArreServicio[j] = Menu.Login.ModeloClase.ArreServicio[j + 1];
                }
                Menu.Login.ModeloClase.ContServicios--;
                V = true;
            }
        }

        if (V == true) {
            JOptionPane.showMessageDialog(this, "Servicio Eliminada");
            ActualizarTabla();
            CargarTabla();
        } else {

            JOptionPane.showMessageDialog(this, "Servicio no encontrada");
        }
    }//GEN-LAST:event_BTEliminarActionPerformed

    private void BTModificarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarServicioActionPerformed
        // Eliminar Serivicio
        if (Menu.Login.ModeloClase.ContServicios == 0) {
            JOptionPane.showMessageDialog(this, "No tienes ningún servicio registrado");
        } else {
            JFModificar_Servicios MS = new JFModificar_Servicios(Menu);
            this.dispose();
            MS.setVisible(true);
            ActualizarTabla();
        }

        if (Menu.Login.ModeloClase.ContClientes == 0) {
            JOptionPane.showMessageDialog(this, "No tienes a nadie registrado");
        } else {
            JFModificar_Cliente MC = new JFModificar_Cliente(Menu);

            MC.setVisible(true);

        }


    }//GEN-LAST:event_BTModificarServicioActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFImprimir_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new JFImprimir_Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTModificarServicio;
    private javax.swing.JButton BTRegresar;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTable Tabla_Servicios;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
