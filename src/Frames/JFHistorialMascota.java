package Frames;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * @author Manzano
 */
public class JFHistorialMascota extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;
    JFMenu Menu;

    public JFHistorialMascota(JFMenu m) {
        initComponents();
        Menu = m;
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BTRegresar = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Historial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox();
        TxtBuscar = new javax.swing.JTextField();

        setTitle("Historial Mascotas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquear(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

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
        Etiqueta.setText("Historial de mascotas");

        Tabla_Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Dueño", "Mascota", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Historial);
        if (Tabla_Historial.getColumnModel().getColumnCount() > 0) {
            Tabla_Historial.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabla_Historial.getColumnModel().getColumn(1).setPreferredWidth(40);
            Tabla_Historial.getColumnModel().getColumn(2).setPreferredWidth(40);
            Tabla_Historial.getColumnModel().getColumn(3).setPreferredWidth(450);
        }

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar : ");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fecha", "Cliente", "Mascota" }));

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

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Etiqueta)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTRegresar)))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Etiqueta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTRegresar)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Historial.getModel();
        // Inicializar los registros (Renglones)en el modelo
        tabla.addRow(new Object[numFilas]);
        //Llenar la tabla con la informaion del arreglo de objetos

        for (int i = 0; i < n; i++) {
//Se establecen los valores para cada columna de la tabla
            Tabla_Historial.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getFechaHistorialMascota(), numFilas, 0);
            Tabla_Historial.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getNombreServicioCliente(), numFilas, 1);
            Tabla_Historial.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getNombreServicioMascota(), numFilas, 2);
            Tabla_Historial.setValueAt(Menu.Login.ModeloClase.ArreServicio[i].getDescripcion(), numFilas, 3);

            numFilas++;
        }

    }

    public void Filtro() {

        int columnaABuscar = 0;
        if ("Fecha".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("Cliente".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("Mascota".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }

        trsFiltro.setRowFilter(RowFilter.regexFilter(TxtBuscar.getText(), columnaABuscar));
    }


    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        //Boton regresar
        Menu.enable();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTRegresarActionPerformed

    private void Desbloquear(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquear
        // Desbloquea la ventana
        Menu.enable();
    }//GEN-LAST:event_Desbloquear

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
        trsFiltro = new TableRowSorter(Tabla_Historial.getModel());
        Tabla_Historial.setRowSorter(trsFiltro);
    }//GEN-LAST:event_TxtBuscarKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFHistorialMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new JFHistorialMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTRegresar;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTable Tabla_Historial;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
