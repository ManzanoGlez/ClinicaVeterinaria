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
public class JFImprimir_Mascotas extends javax.swing.JFrame {

    //Buscar Datos
    private TableRowSorter trsFiltro;

    JFMenu Menu;

    public JFImprimir_Mascotas(JFMenu m) {

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
        Tabla_Mascotas = new javax.swing.JTable();
        BTRegresar = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox();
        BTEliminar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();

        setTitle("Mascotas registradas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fondo.setBackground(new java.awt.Color(0, 102, 153));

        Tabla_Mascotas.setBackground(new java.awt.Color(204, 204, 255));
        Tabla_Mascotas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Tabla_Mascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Dueño", "Nombre mascota", "Especie", "Raza", "Sexo", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Mascotas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla_Mascotas.setColumnSelectionAllowed(true);
        Tabla_Mascotas.setGridColor(new java.awt.Color(0, 0, 0));
        Tabla_Mascotas.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(Tabla_Mascotas);
        Tabla_Mascotas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (Tabla_Mascotas.getColumnModel().getColumnCount() > 0) {
            Tabla_Mascotas.getColumnModel().getColumn(0).setPreferredWidth(120);
            Tabla_Mascotas.getColumnModel().getColumn(1).setPreferredWidth(120);
            Tabla_Mascotas.getColumnModel().getColumn(2).setPreferredWidth(120);
            Tabla_Mascotas.getColumnModel().getColumn(3).setPreferredWidth(120);
            Tabla_Mascotas.getColumnModel().getColumn(4).setPreferredWidth(120);
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
        Etiqueta.setText("Mascotas registradas ");

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar : ");

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

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dueño", "Nombre mascota", "Especie", "Raza", "Sexo", "Edad" }));

        BTEliminar.setText("Eliminar  a una mascota");
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
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Etiqueta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTRegresar)
                .addGap(44, 44, 44))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Etiqueta)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTRegresar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        int n = Menu.Login.ModeloClase.ContMascotas;
        int numFilas = 0;
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Mascotas.getModel();
        tabla.addRow(new Object[numFilas]);
        for (int i = 0; i < n; i++) {
            Tabla_Mascotas.setValueAt(Menu.Login.ModeloClase.ArreMascota[i].getNombreCliente(), numFilas, 0);
            Tabla_Mascotas.setValueAt(Menu.Login.ModeloClase.ArreMascota[i].getNombre_Mascota(), numFilas, 1);
            Tabla_Mascotas.setValueAt(Menu.Login.ModeloClase.ArreMascota[i].getEspecie(), numFilas, 2);
            Tabla_Mascotas.setValueAt(Menu.Login.ModeloClase.ArreMascota[i].getRaza(), numFilas, 3);
            Tabla_Mascotas.setValueAt(Menu.Login.ModeloClase.ArreMascota[i].getSexo(), numFilas, 4);
            Tabla_Mascotas.setValueAt(Menu.Login.ModeloClase.ArreMascota[i].getEdad_Mascota(), numFilas, 5);
            numFilas++;
        }

    }

    public void Filtro() {

        int columnaABuscar = 0;
        if ("Dueño".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
            System.out.println("Encuenta Dueño");
        }
        if ("Nombre mascota".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
            System.out.println("Encuenta Nombre mascota");
        }
        if ("Especie".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
            System.out.println("Encuenta Especie");
        }
        if ("Raza".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
            System.out.println("Encuenta Raza");
        }
        if ("Sexo".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 4;
            System.out.println("Encuenta Sexo");
        }
        if ("Edad".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 5;
            System.out.println("Encuenta Edad");
        }

        trsFiltro.setRowFilter(RowFilter.regexFilter(TxtBuscar.getText(), columnaABuscar));

    }

    public void ActualizarTabla() {
        DefaultTableModel tabla = (DefaultTableModel) Tabla_Mascotas.getModel();
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
        trsFiltro = new TableRowSorter(Tabla_Mascotas.getModel());
        Tabla_Mascotas.setRowSorter(trsFiltro);

    }//GEN-LAST:event_TxtBuscarKeyTyped

    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        // TODO add your handling code here:
        Menu.enable();
    }//GEN-LAST:event_Desbloquea

    private void BTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarActionPerformed
        // Eliminar 
        int NumMascotas;
        String Elimina = JOptionPane.showInputDialog("Introduce el nombre de la mascota que quieres eliminar :");
        boolean V = false;
        int c = Menu.Login.ModeloClase.ContMascotas;

        for (int i = 0; i < c; i++) {
            if (Elimina.equals(Menu.Login.ModeloClase.ArreMascota[i].getNombre_Mascota())) {
                for (int j = i; j < c - 1; j++) {
                    Menu.Login.ModeloClase.ArreMascota[j] = Menu.Login.ModeloClase.ArreMascota[j + 1];
                    NumMascotas = Menu.Login.ModeloClase.ArreCliente[j].getNum_Mascotas();
                    Menu.Login.ModeloClase.ArreCliente[j].setNum_Mascotas(NumMascotas--);
                }
                Menu.Login.ModeloClase.ContMascotas--;
                V = true;

            }
        }

        if (V == true) {
            JOptionPane.showMessageDialog(this, "Mascota Eliminado");

            ActualizarTabla();
            CargarTabla();
        } else {

            JOptionPane.showMessageDialog(this, "Mascota no encontrado");
        }

    }//GEN-LAST:event_BTEliminarActionPerformed

    private void BTModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarActionPerformed
        if (Menu.Login.ModeloClase.ContMascotas == 0) {
            JOptionPane.showMessageDialog(this, "No tienes a mascotas registradas");
        } else {
            JFModificar_Mascota MM = new JFModificar_Mascota(Menu);
            this.dispose();
            MM.setVisible(true);
            ActualizarTabla();
        }


    }//GEN-LAST:event_BTModificarActionPerformed

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFImprimir_Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new JFImprimir_Mascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JButton BTRegresar;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTable Tabla_Mascotas;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
