package Frames;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * @author Manzano
 */
public class JFImprimir_Clientes extends javax.swing.JFrame {

    //Buscar Datos
    private TableRowSorter trsFiltro;

    JFMenu Menu;

    public JFImprimir_Clientes(JFMenu M) {
        initComponents();
        Menu = M;
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        CargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Clientes = new javax.swing.JTable();
        BTRegresar = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox();
        BTEliminar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();

        setTitle("Clientes registrados");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        Tabla_Clientes.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Clientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Nombre", "Apellido", "Telefóno", "Dirección", "E-mail", "RFC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Clientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla_Clientes.setGridColor(new java.awt.Color(0, 0, 0));
        Tabla_Clientes.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(Tabla_Clientes);
        if (Tabla_Clientes.getColumnModel().getColumnCount() > 0) {
            Tabla_Clientes.getColumnModel().getColumn(4).setMinWidth(100);
            Tabla_Clientes.getColumnModel().getColumn(4).setPreferredWidth(150);
            Tabla_Clientes.getColumnModel().getColumn(4).setMaxWidth(250);
            Tabla_Clientes.getColumnModel().getColumn(5).setMinWidth(100);
            Tabla_Clientes.getColumnModel().getColumn(5).setPreferredWidth(150);
            Tabla_Clientes.getColumnModel().getColumn(5).setMaxWidth(250);
            Tabla_Clientes.getColumnModel().getColumn(6).setMinWidth(100);
            Tabla_Clientes.getColumnModel().getColumn(6).setPreferredWidth(150);
            Tabla_Clientes.getColumnModel().getColumn(6).setMaxWidth(150);
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
        Etiqueta.setText("Clientes Registrados ");

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

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fecha", "Nombre", "Apellido", "Telefóno", "Dirección", "E-mail", "RFC" }));
        comboFiltro.setSelectedIndex(1);

        BTEliminar.setText("Eliminar  a un cliente");
        BTEliminar.setPreferredSize(new java.awt.Dimension(120, 20));
        BTEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarActionPerformed(evt);
            }
        });

        BTModificar.setText("Modificar a un cliente");
        BTModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Etiqueta)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BTEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTModificar)
                        .addGap(35, 35, 35)
                        .addComponent(BTRegresar)
                        .addContainerGap())))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Etiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTRegresar)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void CargarTabla() {
        //obtener el numero de registros en el arreglo
        int n = Menu.Login.ModeloClase.ContClientes;
        int numFilas = 0;
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Clientes.getModel();

        tabla.addRow(new Object[numFilas]);
        for (int i = 0; i < n; i++) {
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getFechaRegistro(), numFilas, 0);
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getNombre(), numFilas, 1);
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getApellido(), numFilas, 2);
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getTelefono(), numFilas, 3);
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getDireccion(), numFilas, 4);
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getCorreo_Electronico(), numFilas, 5);
            Tabla_Clientes.setValueAt(Menu.Login.ModeloClase.ArreCliente[i].getRFC(), numFilas, 6);

            numFilas++;
        }

    }

    public void Filtro() {

        int columnaABuscar = 0;

        if (comboFiltro.getSelectedItem() == "Fecha") {
            columnaABuscar = 0;
        }
        if ("Nombre".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("Apellido".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
        if ("Telefóno".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
        if ("Dirección".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 4;
        }
        if ("E-mail".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 5;
        }
        if ("RFC".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 6;
        }
        try {
            trsFiltro.setRowFilter(RowFilter.regexFilter(TxtBuscar.getText(), columnaABuscar));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "No se encontraron coincidencias");
        }
    }

    public void ActualizarTabla() {
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Clientes.getModel();
        tabla.setRowCount(0);
        tabla.setRowCount(20);
    }


    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        //Boton regresar 
        Menu.enable();
        Menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BTRegresarActionPerformed

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
        trsFiltro = new TableRowSorter(Tabla_Clientes.getModel());
        Tabla_Clientes.setRowSorter(trsFiltro);

    }//GEN-LAST:event_TxtBuscarKeyTyped

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        // TODO add your handling code here:
        Menu.enable();
    }//GEN-LAST:event_Desbloquea

    private void BTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarActionPerformed

        // Eliminar 
        if (Menu.Login.ModeloClase.ContClientes == 0) {
            JOptionPane.showMessageDialog(this, "No tienes a nadie registrado");
        } else {

            String Elimina = JOptionPane.showInputDialog("Introduce el nombre del cliente que quieres eliminar :");
            boolean V = false;
            int c = Menu.Login.ModeloClase.ContClientes;

            for (int i = 0; i < c; i++) {
                if (Elimina.equals(Menu.Login.ModeloClase.ArreCliente[i].getNombre())) {
                    for (int j = i; j < c - 1; j++) {
                        Menu.Login.ModeloClase.ArreCliente[j] = Menu.Login.ModeloClase.ArreCliente[j + 1];

                    }
                    Menu.Login.ModeloClase.ContClientes--;
                    V = true;

                }
            }

            if (V == true) {
                JOptionPane.showMessageDialog(this, "Cliente Eliminado");
                ActualizarTabla();
                CargarTabla();
            } else {

                JOptionPane.showMessageDialog(this, "Cliente no encontrado");
            }
        }

    }//GEN-LAST:event_BTEliminarActionPerformed

    private void BTModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarActionPerformed
        if (Menu.Login.ModeloClase.ContClientes == 0) {
            JOptionPane.showMessageDialog(this, "No tienes a nadie registrado");
        } else {
            JFModificar_Cliente MC = new JFModificar_Cliente(Menu);
            this.dispose();
            MC.setVisible(true);
            ActualizarTabla();
        }


    }//GEN-LAST:event_BTModificarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFImprimir_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new JFImprimir_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JButton BTRegresar;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTable Tabla_Clientes;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
