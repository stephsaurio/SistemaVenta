package com.mycompany.sistemaventa;

import javax.swing.JOptionPane;

public class NuevoUsuario extends javax.swing.JFrame {

    private Usuario usuarioActual;

    public NuevoUsuario(Usuario usuarioActual) {
        initComponents();
        this.usuarioActual = usuarioActual;

        jComboBox1.removeAllItems();
        jComboBox1.addItem("Administrador");
        jComboBox1.addItem("Vendedor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 114, 161));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 114, 161));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 114, 161));
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 114, 161));
        jLabel4.setText("Tipo:");

        jTextField1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(207, 114, 161));

        jTextField2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(207, 114, 161));

        jTextField3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(207, 114, 161));

        jButton1.setBackground(new java.awt.Color(237, 206, 225));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(207, 114, 161));
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(237, 206, 225));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(207, 114, 161));
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 114, 161));
        jLabel5.setText("Nuevo usuario");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(144, 96, 120));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel5))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Usuario u = new Usuario();
        u.nombre = jTextField2.getText().trim();
        u.usuario = jTextField1.getText().trim();
        u.password = jTextField3.getText().trim();

        String rolStr = jComboBox1.getSelectedItem().toString();

        if (rolStr.equals("Administrador")) {
            u.rol = 1;
        } else {
            u.rol = 2;
        }

        // Validar campos
        if (u.usuario.isEmpty() || u.password.isEmpty() || u.nombre.isEmpty() || rolStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Validar contraseña
        if (!validarContraseña(u.password)) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres, "
                    + "una letra mayúscula, una letra minúscula y un número.");
            return;
        }

        // Verificar si el usuario actual es administrador
        if (usuarioActual.rol != 0) {
            JOptionPane.showMessageDialog(this, "No tiene permiso para crear usuarios.");
            return;
        }

        // Verificar si el usuario ya existe
        for (Usuario usuario : SistemaVenta.usuarios) {
            if (u.usuario.equals(usuario.usuario)) { // Comparar el nombre de usuario
                JOptionPane.showMessageDialog(this, "El nombre de usuario ya está en uso.");
                return;
            }
        }

        SistemaVenta.usuarios.add(u);

        JOptionPane.showMessageDialog(this, "Usuario creado exitosamente.");
        this.dispose(); // Cerrar la ventana actual
        new Login().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
