package com.mycompany.sistemaventa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConsultaLibros extends javax.swing.JFrame {
private Libros libro;
    public ConsultaLibros() {
        initComponents();
        
      DefaultTableModel t = new DefaultTableModel(
            new String[]{"Título", "Autor", "Género", "Precio con IVA", "Precio sin IVA", "IVA", "Stock"},
            SistemaVenta.libros.size()
        );
        
        jTable1.setModel(t);
        TableModel tabla = jTable1.getModel();
        
        for (int i = 0; i < SistemaVenta.libros.size(); i++) {
            Libros u = SistemaVenta.libros.get(i);
            double precioSinIVA = u.precioIVA / 1.12;
            double montoIVA = u.precioIVA - precioSinIVA;

            tabla.setValueAt(u.titulo, i, 0);
            tabla.setValueAt(u.autor, i, 1);
            tabla.setValueAt(u.genero, i, 2);
            tabla.setValueAt(String.format("%.2f", u.precioIVA), i, 3);
            tabla.setValueAt(String.format("%.2f", precioSinIVA), i, 4);
            tabla.setValueAt(String.format("%.2f", montoIVA), i, 5);
            tabla.setValueAt(u.stock, i, 6);
        }
    }
private void pintarTabla() {
  DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
    for (Libros u : SistemaVenta.libros) {
        double precioSinIVA = u.precioIVA / 1.12; // Calcular precio sin IVA
        double montoIVA = u.precioIVA - precioSinIVA; // Calcular monto de IVA
        
        modelo.addRow(new Object[]{
            u.titulo,
            u.autor,
            u.genero,
            String.format("%.2f", u.precioIVA), // Precio con IVA
            String.format("%.2f", precioSinIVA), // Precio sin IVA
            String.format("%.2f", montoIVA), // Monto de IVA
            u.stock
        });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(237, 206, 225));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(207, 114, 161));
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(237, 206, 225));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(207, 114, 161));
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(237, 206, 225));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(207, 114, 161));
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 114, 161));
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 114, 161));
        jLabel4.setText("Género:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 114, 161));
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 114, 161));
        jLabel6.setText("Stock:");

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 114, 161));
        jLabel2.setText("Título:");

        jButton4.setBackground(new java.awt.Color(237, 206, 225));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(207, 114, 161));
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  int borrar = jTable1.getSelectedRow();
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este libro?") == 0) {
                SistemaVenta.libros.remove(borrar);
                pintarTabla();
                JOptionPane.showMessageDialog(this, "Libro eliminado");
                 } else {
        JOptionPane.showMessageDialog(this, "Seleccione un elemento a borrar");
    
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int modificar = jTable1.getSelectedRow();
    if (modificar > -1) {
        libro = SistemaVenta.libros.get(modificar);
       textField1.setText(libro.titulo); // Accediendo directamente
        textField2.setText(libro.autor); // Accediendo directamente
        textField3.setText(libro.genero); // Accediendo directamente
        textField4.setText(String.valueOf(libro.precioIVA)); // Accediendo directamente
        textField5.setText(String.valueOf(libro.stock)); // Accediendo directamente
       
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un elemento a modificar");
    }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   if (libro != null) {
        // Accediendo a los campos de texto
        libro.titulo = textField1.getText();
        libro.autor = textField2.getText();
        libro.genero = textField3.getText();
        
        // Convertir el precio a decimal
        try {
            double valor = Double.parseDouble(textField4.getText());
            libro.precioIVA = valor; // Guardar el precio con IVA
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número decimal válido.");
            return; // Salir si hay un error de formato
        }
        
        // Convertir el stock a entero
        try {
            int stock = Integer.parseInt(textField5.getText());
            libro.stock = stock;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El stock debe ser un número entero válido.");
            return; // Salir si hay un error de formato
        }

        // Actualizar la tabla y mostrar un mensaje de éxito
        pintarTabla();
        JOptionPane.showMessageDialog(this, "Libro modificado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Ningún libro seleccionado.");
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}
