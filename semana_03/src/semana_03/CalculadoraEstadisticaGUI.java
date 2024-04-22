/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semana_03;

/**
 *
 * @author JEFF
 */
public class CalculadoraEstadisticaGUI extends javax.swing.JFrame {
    public CalculadoraEstadisticaGUI() {
        initComponents();
        // Centrar el JFrame en la pantalla
this.setLocationRelativeTo(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        btnCalcularDesv = new javax.swing.JButton();
        btnCalcularVarianza = new javax.swing.JButton();
        btnEliminarResultados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalidaDatos = new javax.swing.JTextArea();
        btnEliminarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntradaDatos = new javax.swing.JTextArea();
        btnCalcularMedia = new javax.swing.JButton();
        btnCalcularModa = new javax.swing.JButton();
        btnCalcularMediana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalcularDesv.setText("calcular la desviación estándar");
        btnCalcularDesv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularDesvActionPerformed(evt);
            }
        });

        btnCalcularVarianza.setText("calcular la varianza");
        btnCalcularVarianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularVarianzaActionPerformed(evt);
            }
        });

        btnEliminarResultados.setText("eliminar resultados");
        btnEliminarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarResultadosActionPerformed(evt);
            }
        });

        jLabel1.setText("\"Ingrese los datos separados por comas\"");

        jLabel2.setText("Las funciones estadisticas son:");

        txtSalidaDatos.setColumns(20);
        txtSalidaDatos.setRows(5);
        jScrollPane2.setViewportView(txtSalidaDatos);

        btnEliminarDatos.setText("Eliminar Datos");
        btnEliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatosActionPerformed(evt);
            }
        });

        txtEntradaDatos.setColumns(20);
        txtEntradaDatos.setRows(5);
        jScrollPane1.setViewportView(txtEntradaDatos);

        btnCalcularMedia.setText("calcular la media");
        btnCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMediaActionPerformed(evt);
            }
        });

        btnCalcularModa.setText("calcular la moda");
        btnCalcularModa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularModaActionPerformed(evt);
            }
        });

        btnCalcularMediana.setText("calcular la mediana");
        btnCalcularMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMedianaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDatosLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCalcularModa)
                                .addComponent(btnCalcularMedia))
                            .addGap(81, 81, 81)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCalcularVarianza)
                                .addComponent(btnCalcularMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(btnCalcularDesv))
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(btnEliminarResultados))
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarDatos))
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDatosLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnEliminarDatos)
                    .addGap(30, 30, 30)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCalcularMedia)
                        .addComponent(btnCalcularMediana))
                    .addGap(18, 18, 18)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCalcularModa)
                        .addComponent(btnCalcularVarianza))
                    .addGap(18, 18, 18)
                    .addComponent(btnCalcularDesv)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminarResultados)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCalcularMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMedianaActionPerformed
        // Obtener datos del área de texto de entrada
        String[] datosStr = txtEntradaDatos.getText().split("\n");
        double[] datos = new double[datosStr.length];
        for (int i = 0; i < datosStr.length; i++) {
            datos[i] = Double.parseDouble(datosStr[i]);
        }

        // Calcular y mostrar la mediana
        Operaciones operaciones = new Operaciones();
        double mediana = operaciones.calcularMediana(datos);
        txtSalidaDatos.append("Mediana: " + mediana + "\n");
    }//GEN-LAST:event_btnCalcularMedianaActionPerformed

    private void btnCalcularModaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularModaActionPerformed
        // Obtener datos del área de texto de entrada
        String[] datosStr = txtEntradaDatos.getText().split("\n");
        double[] datos = new double[datosStr.length];
        for (int i = 0; i < datosStr.length; i++) {
            datos[i] = Double.parseDouble(datosStr[i]);
        }

        // Calcular y mostrar la moda
        Operaciones operaciones = new Operaciones();
        double moda = operaciones.calcularModa(datos);
        txtSalidaDatos.append("Moda: " + moda + "\n");
    }//GEN-LAST:event_btnCalcularModaActionPerformed
                        
                                        
    private void btnCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMediaActionPerformed
        // Obtener datos del área de texto de entrada
        String[] datosStr = txtEntradaDatos.getText().split("\n");
        double[] datos = new double[datosStr.length];
        for (int i = 0; i < datosStr.length; i++) {
            datos[i] = Double.parseDouble(datosStr[i]);
        }

        // Calcular y mostrar la media
        Operaciones operaciones = new Operaciones();
        double media = operaciones.calcularMedia(datos);
        txtSalidaDatos.append("Media: " + media + "\n");
    }//GEN-LAST:event_btnCalcularMediaActionPerformed

    private void btnEliminarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatosActionPerformed
        // Limpiar el área de texto de entrada
        txtEntradaDatos.setText("");
    }//GEN-LAST:event_btnEliminarDatosActionPerformed

    private void btnEliminarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarResultadosActionPerformed
        // Limpiar el área de texto de salida
        txtSalidaDatos.setText("");
    }//GEN-LAST:event_btnEliminarResultadosActionPerformed

    private void btnCalcularVarianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularVarianzaActionPerformed
        // Obtener datos del área de texto de entrada
        String[] datosStr = txtEntradaDatos.getText().split("\n");
        double[] datos = new double[datosStr.length];
        for (int i = 0; i < datosStr.length; i++) {
            datos[i] = Double.parseDouble(datosStr[i]);
        }

        // Calcular y mostrar la varianza
        Operaciones operaciones = new Operaciones();
        double varianza = operaciones.calcularVarianza(datos);
        txtSalidaDatos.append("Varianza: " + varianza + "\n");
    }//GEN-LAST:event_btnCalcularVarianzaActionPerformed

    private void btnCalcularDesvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularDesvActionPerformed
        String[] datosStr = txtEntradaDatos.getText().split("\n");
        double[] datos = new double[datosStr.length];
        for (int i = 0; i < datosStr.length; i++) {
            datos[i] = Double.parseDouble(datosStr[i]);
        }

        // Calcular y mostrar la desviación estándar
        Operaciones operaciones = new Operaciones();
        double desv = operaciones.calcularDesviacionEstandar(datos);
        txtSalidaDatos.append("Desviación Estándar: " + desv + "\n");

    }//GEN-LAST:event_btnCalcularDesvActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CalculadoraEstadisticaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraEstadisticaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraEstadisticaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraEstadisticaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraEstadisticaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularDesv;
    private javax.swing.JButton btnCalcularMedia;
    private javax.swing.JButton btnCalcularMediana;
    private javax.swing.JButton btnCalcularModa;
    private javax.swing.JButton btnCalcularVarianza;
    private javax.swing.JButton btnEliminarDatos;
    private javax.swing.JButton btnEliminarResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextArea txtEntradaDatos;
    private javax.swing.JTextArea txtSalidaDatos;
    // End of variables declaration//GEN-END:variables
}
