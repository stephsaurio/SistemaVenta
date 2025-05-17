package com.mycompany.sistemaventa;

import java.io.IOException;
import javax.swing.JOptionPane;

public class VentanaAdministradores extends javax.swing.JFrame {

    private Usuario usuarioActual;

    public VentanaAdministradores(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
        initComponents();
        jLabel7.setText(usuarioActual.password);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 114, 161));
        jLabel2.setText("Bienvenido administrador");

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
        jButton2.setText("Ingresar nuevo libro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(237, 206, 225));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(207, 114, 161));
        jButton3.setText("Agrega Cupon");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Contraseña:");

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jButton5.setText("Cambiar contraseña");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nueva contraseña:");

        jMenu1.setText("Consultar libros");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar cupones");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Consultar Ventas");
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(211, 211, 211))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton5)))
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton1))
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jButton5)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login l = new Login();
        l.setVisible(true);
this.dispose();       }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        {
            NuevoLibro nuevoLibro = new NuevoLibro();
            nuevoLibro.setVisible(true);
}    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        ConsultaLibros c = new ConsultaLibros();
c.setVisible(true);        }//GEN-LAST:event_jMenu1MenuSelected

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        NuevoCupon nc = new NuevoCupon();
        nc.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
          try {
        ConsultaCupones cc = new ConsultaCupones();
        cc.setVisible(true);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al abrir la ventana de cupones.");
    }

    }//GEN-LAST:event_jMenu2MenuSelected

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed
public boolean validarContraseña(String password) {
        if (password.length() < 6) {
            return false; // Mínimo 6 caracteres
        }

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
        }

        return tieneNumero && tieneMayuscula && tieneMinuscula; // Debe cumplir todas las condiciones
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nuevaContraseña = textField1.getText();

        // Validaciones
        if (nuevaContraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una nueva contraseña.");
        } else if (!validarContraseña(nuevaContraseña)) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña debe tener al menos 6 caracteres, "
                    + "y debe incluir al menos una letra mayúscula, una letra minúscula y un número.");
        } else if (nuevaContraseña.equals(usuarioActual.password)) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña no puede ser la misma que la actual.");
        } else {
            // Si todas las validaciones pasan, cambia la contraseña
            usuarioActual.password = nuevaContraseña; // Cambiar la contraseña
            jLabel7.setText(usuarioActual.password); // Actualizar el JLabel para mostrar la nueva contraseña
            JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
      ConsultaVentas cv = new ConsultaVentas();
      cv.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MenuSelected


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
