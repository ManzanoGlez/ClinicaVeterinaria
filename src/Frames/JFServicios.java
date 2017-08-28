package Frames;

import javax.swing.ImageIcon;

/**
 *
 * @author Manzano
 */
public class JFServicios extends javax.swing.JFrame {

    public JFServicios() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoVeterinariatransparente.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Color = new javax.swing.JPanel();
        JBConsulta = new javax.swing.JButton();
        JBVacuna = new javax.swing.JButton();
        JBRegresar = new javax.swing.JButton();
        JBDesparasitar = new javax.swing.JButton();
        JBCirugia = new javax.swing.JButton();
        JBPension = new javax.swing.JButton();
        textoConsulta = new javax.swing.JLabel();
        textoInyeccion = new javax.swing.JLabel();
        textocirugia = new javax.swing.JLabel();
        textoPension = new javax.swing.JLabel();
        textoEstetica = new javax.swing.JLabel();
        textDesparasitación = new javax.swing.JLabel();
        JBEstetica1 = new javax.swing.JButton();

        setTitle("Servicios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Desbloquea(evt);
            }
        });

        Color.setBackground(new java.awt.Color(0, 102, 153));
        Color.setDoubleBuffered(false);
        Color.setPreferredSize(new java.awt.Dimension(700, 470));

        JBConsulta.setBackground(new java.awt.Color(0, 102, 153));
        JBConsulta.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        JBConsulta.setForeground(new java.awt.Color(0, 102, 153));
        JBConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta.png"))); // NOI18N
        JBConsulta.setBorderPainted(false);
        JBConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsultaActionPerformed(evt);
            }
        });

        JBVacuna.setBackground(new java.awt.Color(0, 102, 153));
        JBVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inyeccion.png"))); // NOI18N
        JBVacuna.setBorderPainted(false);
        JBVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVacunaActionPerformed(evt);
            }
        });

        JBRegresar.setBackground(new java.awt.Color(0, 102, 153));
        JBRegresar.setForeground(new java.awt.Color(0, 102, 153));
        JBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        JBRegresar.setBorderPainted(false);
        JBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegresarActionPerformed(evt);
            }
        });

        JBDesparasitar.setBackground(new java.awt.Color(0, 102, 153));
        JBDesparasitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Desparasitar.png"))); // NOI18N
        JBDesparasitar.setBorderPainted(false);
        JBDesparasitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDesparasitarActionPerformed(evt);
            }
        });

        JBCirugia.setBackground(new java.awt.Color(0, 102, 153));
        JBCirugia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cirujia.png"))); // NOI18N
        JBCirugia.setBorderPainted(false);
        JBCirugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCirugiaActionPerformed(evt);
            }
        });

        JBPension.setBackground(new java.awt.Color(0, 102, 153));
        JBPension.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pension.png"))); // NOI18N
        JBPension.setBorderPainted(false);
        JBPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPensionActionPerformed(evt);
            }
        });

        textoConsulta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        textoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        textoConsulta.setText("Consulta");

        textoInyeccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        textoInyeccion.setForeground(new java.awt.Color(255, 255, 255));
        textoInyeccion.setText("Vacunas");

        textocirugia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        textocirugia.setForeground(new java.awt.Color(255, 255, 255));
        textocirugia.setText("Cirugías");

        textoPension.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        textoPension.setForeground(new java.awt.Color(255, 255, 255));
        textoPension.setText("Pensíon");

        textoEstetica.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        textoEstetica.setForeground(new java.awt.Color(255, 255, 255));
        textoEstetica.setText("Estética");

        textDesparasitación.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        textDesparasitación.setForeground(new java.awt.Color(255, 255, 255));
        textDesparasitación.setText("Desparasitación");

        JBEstetica1.setBackground(new java.awt.Color(0, 102, 153));
        JBEstetica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estetica.png"))); // NOI18N
        JBEstetica1.setBorderPainted(false);
        JBEstetica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstetica1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ColorLayout = new javax.swing.GroupLayout(Color);
        Color.setLayout(ColorLayout);
        ColorLayout.setHorizontalGroup(
            ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorLayout.createSequentialGroup()
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColorLayout.createSequentialGroup()
                        .addContainerGap(573, Short.MAX_VALUE)
                        .addComponent(JBRegresar))
                    .addGroup(ColorLayout.createSequentialGroup()
                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ColorLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(textoConsulta)
                                .addGap(136, 136, 136)
                                .addComponent(textocirugia)
                                .addGap(162, 162, 162)
                                .addComponent(textoPension))
                            .addGroup(ColorLayout.createSequentialGroup()
                                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(JBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JBVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textoInyeccion))))
                                .addGap(107, 107, 107)
                                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(textoEstetica)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textDesparasitación))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(JBCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)
                                        .addComponent(JBPension, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ColorLayout.createSequentialGroup()
                                        .addComponent(JBEstetica1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBDesparasitar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ColorLayout.setVerticalGroup(
            ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textocirugia)
                        .addComponent(textoConsulta))
                    .addComponent(textoPension))
                .addGap(11, 11, 11)
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPension, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEstetica)
                    .addComponent(textoInyeccion)
                    .addComponent(textDesparasitación))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBDesparasitar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBEstetica1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(JBRegresar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Color, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegresarActionPerformed
        // Regresar al menu principal

        this.setVisible(false);
    }//GEN-LAST:event_JBRegresarActionPerformed

    private void JBConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultaActionPerformed
        //Abre la ventana de servicio de Consulta
        this.setVisible(false);
        JFServicio_Consulta SC = new JFServicio_Consulta();
        SC.setVisible(true);

    }//GEN-LAST:event_JBConsultaActionPerformed

    private void JBCirugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCirugiaActionPerformed
        // Abre la ventana de servicio de Cirujia
        this.setVisible(false);
        JFServicio_Cirujia SCA = new JFServicio_Cirujia();
        SCA.setVisible(true);
    }//GEN-LAST:event_JBCirugiaActionPerformed

    private void JBVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVacunaActionPerformed
        // Abre ventana de servicio de inyeccion

        this.setVisible(false);
        JFServicio_Vacunas Si = new JFServicio_Vacunas();
        Si.setVisible(true);
    }//GEN-LAST:event_JBVacunaActionPerformed

    private void JBPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPensionActionPerformed
        // Abre ventana de servicio a Pension
        this.setVisible(false);
        JFServicio_Pension SP = new JFServicio_Pension();
        SP.setVisible(true);
    }//GEN-LAST:event_JBPensionActionPerformed

    private void JBDesparasitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDesparasitarActionPerformed
        // Desparasitacion
        this.setVisible(false);
        JFServicio_Despararasitar SD = new JFServicio_Despararasitar();
        SD.setVisible(true);
    }//GEN-LAST:event_JBDesparasitarActionPerformed

    private void JBEstetica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstetica1ActionPerformed
        // Abre ventana de servicio de Estetica
        this.setVisible(false);
        JFServicio_Estetica SE = new JFServicio_Estetica();
        SE.setVisible(true);
    }//GEN-LAST:event_JBEstetica1ActionPerformed


    private void Desbloquea(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Desbloquea
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(JFServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Color;
    private javax.swing.JButton JBCirugia;
    private javax.swing.JButton JBConsulta;
    private javax.swing.JButton JBDesparasitar;
    private javax.swing.JButton JBEstetica1;
    private javax.swing.JButton JBPension;
    private javax.swing.JButton JBRegresar;
    private javax.swing.JButton JBVacuna;
    private javax.swing.JLabel textDesparasitación;
    private javax.swing.JLabel textoConsulta;
    private javax.swing.JLabel textoEstetica;
    private javax.swing.JLabel textoInyeccion;
    private javax.swing.JLabel textoPension;
    private javax.swing.JLabel textocirugia;
    // End of variables declaration//GEN-END:variables
}
