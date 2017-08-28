package Frames;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manzano
 */
public class JFDescuentos extends javax.swing.JFrame {

    JFMenu Menu;

    public JFDescuentos(JFMenu m) {
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
        initComponents();
        Menu = m;
        CargarTabla2Mascotasal15();
        CargarTabla3Mascotasal25();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fonfo = new javax.swing.JPanel();
        Etiqueta = new javax.swing.JLabel();
        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_2mal15 = new javax.swing.JTable();
        BTRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_3mal25 = new javax.swing.JTable();

        setTitle("Descuentos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Fonfo.setBackground(new java.awt.Color(0, 102, 153));

        Etiqueta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta.setText("Clientes a los que se les aplica descuento.");

        Etiqueta1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Etiqueta1.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta1.setText("3 o más mascotas se hará un 25% de descuento sobre el Total");

        Etiqueta2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        Etiqueta2.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta2.setText("2 Mascotas se hará un 15% de Descuento sobre el Total");

        Tabla_2mal15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Nombre Mascota", "Dinero ahorrado por servicio"
            }
        ));
        jScrollPane1.setViewportView(Tabla_2mal15);

        BTRegresar.setBackground(new java.awt.Color(0, 102, 153));
        BTRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        BTRegresar.setBorderPainted(false);
        BTRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRegresarActionPerformed(evt);
            }
        });

        Tabla_3mal25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Nombre Mascota", "Dinero ahorrado por servicio"
            }
        ));
        jScrollPane2.setViewportView(Tabla_3mal25);

        javax.swing.GroupLayout FonfoLayout = new javax.swing.GroupLayout(Fonfo);
        Fonfo.setLayout(FonfoLayout);
        FonfoLayout.setHorizontalGroup(
            FonfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FonfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTRegresar)
                .addContainerGap())
            .addGroup(FonfoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(FonfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta2)
                    .addComponent(Etiqueta1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        FonfoLayout.setVerticalGroup(
            FonfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FonfoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Etiqueta)
                .addGap(33, 33, 33)
                .addComponent(Etiqueta2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Etiqueta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(BTRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fonfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fonfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void CargarTabla2Mascotasal15() {

        int c = Menu.Login.ModeloClase.ContClientes;
        int s = Menu.Login.ModeloClase.ContServicios;
        double DescuentoTotal = 0;
        double Total = 0;

        int numFilas = 0;
        DefaultTableModel tabla1 = (DefaultTableModel) Tabla_2mal15.getModel();
        tabla1.addRow(new Object[numFilas]);

        for (int i = 0; i < c; i++) {

            if (Menu.Login.ModeloClase.ArreCliente[i].getNum_Mascotas() == 2) {
                for (int j = 0; j < s; j++) {

                    if (Menu.Login.ModeloClase.ArreCliente[i].getNombre().equals(Menu.Login.ModeloClase.ArreServicio[j].getNombreServicioCliente())) {
                        Tabla_2mal15.setValueAt(Menu.Login.ModeloClase.ArreServicio[j].getNombreServicioCliente(), numFilas, 0);
                        Tabla_2mal15.setValueAt(Menu.Login.ModeloClase.ArreServicio[j].getNombreServicioMascota(), numFilas, 1);
                        Total = Menu.Login.ModeloClase.ArreServicio[j].getPrecioTotal();

                        DescuentoTotal = Total * 0.15;

                        System.out.println("Precio descontado " + DescuentoTotal);
                        // Menu.Login.ModeloClase.ArreServicio[j].setPrecioTotal((double) Math.round(DescuentoTotal * 100d) / 100d);
                        Tabla_2mal15.setValueAt((double) Math.round(DescuentoTotal * 100d) / 100d, numFilas, 2);

                        numFilas++;

                    }
                }
            }
        }
    }

    public final void CargarTabla3Mascotasal25() {

        int c = Menu.Login.ModeloClase.ContClientes;
        int s = Menu.Login.ModeloClase.ContServicios;
        double DescuentoTotal = 0;
        double Total = 0;

        int numFilas = 0;//Controla el numero de registros a mostrar en la latabla
        DefaultTableModel tabla1 = (DefaultTableModel) Tabla_2mal15.getModel();
        tabla1.addRow(new Object[numFilas]);

        for (int i = 0; i < c; i++) {

            if (Menu.Login.ModeloClase.ArreCliente[i].getNum_Mascotas() >= 3) {

                for (int j = 0; j < s; j++) {

                    if (Menu.Login.ModeloClase.ArreCliente[i].getNombre().equals(Menu.Login.ModeloClase.ArreServicio[j].getNombreServicioCliente())) {

                        Tabla_3mal25.setValueAt(Menu.Login.ModeloClase.ArreServicio[j].getNombreServicioCliente(), numFilas, 0);
                        Tabla_3mal25.setValueAt(Menu.Login.ModeloClase.ArreServicio[j].getNombreServicioMascota(), numFilas, 1);
                        Total = Menu.Login.ModeloClase.ArreServicio[j].getPrecioTotal();

                        DescuentoTotal = Total * 0.25;

                        System.out.println("Precio descontado " + DescuentoTotal);
                        // Menu.Login.ModeloClase.ArreServicio[j].setPrecioTotal((double) Math.round(DescuentoTotal * 100d) / 100d);
                        Tabla_3mal25.setValueAt((double) Math.round(DescuentoTotal * 100d) / 100d, numFilas, 2);
                        numFilas++;
                    }
                }
            }
        }
    }

    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        // TODO add your handling code here:
        Menu.enable();
    }//GEN-LAST:event_Desbloquea

    private void BTRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegresarActionPerformed
        //Boton regresar
        Menu.enable();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(JFDescuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //  new JFDescuentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTRegresar;
    private javax.swing.JLabel Etiqueta;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JPanel Fonfo;
    private javax.swing.JTable Tabla_2mal15;
    private javax.swing.JTable Tabla_3mal25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
