package vista;

import controlador.ControladorMascota;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Mascota;

public class AlmacenarMascota extends javax.swing.JFrame {

    public AlmacenarMascota() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.spnCantAten.setVisible(false);
        this.jLabel5.setVisible(false);
        txtNombreDuenio.setEditable(false);
        txtTelDueno.setEditable(false);
        txtNombreDuenio.setOpaque(false);
        txtTelDueno.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlmacenar = new javax.swing.JButton();
        btnMantenedor1 = new javax.swing.JButton();
        btnAbout1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        spnEdadMascota = new javax.swing.JSpinner();
        cbbTipoMascota = new javax.swing.JComboBox<>();
        ckbDuenio = new javax.swing.JCheckBox();
        spnCantAten = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        ckbAtenPrev = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelDueno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDIPET");
        setBounds(new java.awt.Rectangle(600, 250, 600, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 700));

        jPanel1.setBackground(new java.awt.Color(160, 172, 72));

        btnAlmacenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btnAlmacenar.setText("ALMACENAR MASCOTA");
        btnAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlmacenar);

        btnMantenedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MANTENEDOR.png"))); // NOI18N
        btnMantenedor1.setText("MANTENEDOR MASCOTAS");
        btnMantenedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedor1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantenedor1);

        btnAbout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/QUIENES SOMOS.png"))); // NOI18N
        btnAbout1.setText("¿QUIENES SOMOS?");
        btnAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbout1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(112, 178, 156));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("EDAD:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TIPO:");

        txtNombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMascotaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreMascotaKeyPressed(evt);
            }
        });

        spnEdadMascota.setModel(new javax.swing.SpinnerNumberModel(1, 1, 150, 1));
        spnEdadMascota.setBounds(1,20,0,1);

        cbbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "GATO", "PERRO" }));

        ckbDuenio.setBackground(new java.awt.Color(112, 178, 156));
        ckbDuenio.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        ckbDuenio.setForeground(new java.awt.Color(0, 0, 0));
        ckbDuenio.setText("¿POSEE DUEÑO?");
        ckbDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbDuenioActionPerformed(evt);
            }
        });

        spnCantAten.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CANTIDAD:");

        ckbAtenPrev.setBackground(new java.awt.Color(112, 178, 156));
        ckbAtenPrev.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        ckbAtenPrev.setForeground(new java.awt.Color(0, 0, 0));
        ckbAtenPrev.setText("¿POSEE ATENCIONES PREVIAS?");
        ckbAtenPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbAtenPrevMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NOMBRE:");

        txtNombreDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDuenioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TELÉFONO:");

        txtTelDueno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelDuenoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelDuenoKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DESCRIPCIÓN: ");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel4.setBackground(new java.awt.Color(112, 178, 156));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        btnInicio.setText("VOLVER");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel4.add(btnInicio);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(spnCantAten))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreMascota)
                                            .addComponent(cbbTipoMascota, 0, 200, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ckbDuenio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ckbAtenPrev))))
                        .addGap(8, 8, 8)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(spnEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ckbAtenPrev))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnCantAten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbDuenio)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("W17714mR Design © 2019");
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.dispose();
        Inicio in = new Inicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.cbbTipoMascota.setSelectedIndex(0);
        this.txtDescripcion.setText("");
        this.txtNombreDuenio.setText("");
        this.txtNombreMascota.setText("");
        this.spnEdadMascota.setValue(1);
        this.spnCantAten.setValue(1);
        this.ckbAtenPrev.setSelected(false);
        this.ckbDuenio.setSelected(false);
        this.txtTelDueno.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Mascota mascota = new Mascota();
        boolean validador = false;
        while (!validador) {
            if (this.txtNombreMascota.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: CAMPO NOMBRE MASCOTA NO PUEDE ESTAR EN BLANCO");
                break;

            } else if (this.txtNombreMascota.getText().length() > 50) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: CAMPO NOMBRE MASCOTA EXCEDE EL MÁXIMO PERMITIDO (50)");
            }

            if (this.cbbTipoMascota.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: DEBE SELECCIONAR UN TIPO DE MASCOTA");
                break;
            }
            if (!ckbAtenPrev.isSelected()) {
                this.spnCantAten.setValue(0);
            }
            if (this.txtDescripcion.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: DEBE INGRESAR UNA DESCRIPCION");
                break;
            }
            if (!ckbDuenio.isSelected()) {
                this.txtNombreDuenio.setText(null);
                this.txtTelDueno.setText(null);
            } else {
                if (this.txtNombreDuenio.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR: DEBE INGRESAR UN NOMBRE DE DUENO");
                    break;
                } else if (this.txtNombreDuenio.getText().length() > 50) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR: CAMPO NOMBRE DUEÑO EXCEDE EL MÁXIMO PERMITIDO (50).");
                }
                if (this.txtTelDueno.getText().equals("")) {

                    JOptionPane.showMessageDialog(rootPane, "ERROR: DEBE INGRESAR UN NÚMERO DE TELÉFONO.");
                    break;
                } else if (txtTelDueno.getText().length() != 9) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR: FAVOR INGRESAR NÚMERO DE TELÉFONO EN FORMATO DE 9 DÍGITOS.");
                    break;
                }
            }
            validador = true;
            if (validador) {
                try {
                    mascota.setNomMascota(this.txtNombreMascota.getText().toUpperCase());
                    mascota.setEdadMascota((int) this.spnEdadMascota.getValue());
                    String aux = (String) this.cbbTipoMascota.getSelectedItem();
                    mascota.setTipoMascota(aux.toUpperCase());
                    mascota.setAtPrevia(this.ckbAtenPrev.isSelected());
                    mascota.setCantAtPrev((int) this.spnCantAten.getValue());
                    mascota.setDescriMascota(this.txtDescripcion.getText().toUpperCase());
                    mascota.setDuenio(this.ckbDuenio.isSelected());
                    mascota.setNomDuenio(this.txtNombreDuenio.getText().toUpperCase());
                    mascota.setTelefono(this.txtTelDueno.getText().toUpperCase());
                    ControladorMascota cm = new ControladorMascota();
                    cm.MascotaAlmacenar(mascota);
                    JOptionPane.showMessageDialog(rootPane, "OBJETO GUARDADO CON ÉXITO");
                    this.btnLimpiarActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(AlmacenarMascota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    private void ckbAtenPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbAtenPrevMouseClicked

        if (ckbAtenPrev.isSelected()) {
            this.jLabel5.setVisible(true);
            this.spnCantAten.setVisible(true);
        } else {
            this.spnCantAten.setVisible(false);
            this.jLabel5.setVisible(false);
            this.spnCantAten.setValue(1);
        }
    }//GEN-LAST:event_ckbAtenPrevMouseClicked

    private void ckbDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbDuenioActionPerformed
        if (ckbDuenio.isSelected()) {
            txtNombreDuenio.setEditable(true);
            txtTelDueno.setEditable(true);
            txtNombreDuenio.setOpaque(true);
            txtTelDueno.setOpaque(true);
        } else {
            txtNombreDuenio.setText("");
            txtTelDueno.setText("");
            txtNombreDuenio.setOpaque(false);
            txtTelDueno.setOpaque(false);
            txtNombreDuenio.setEditable(false);
            txtTelDueno.setEditable(false);
        }
    }//GEN-LAST:event_ckbDuenioActionPerformed

    private void btnAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenarActionPerformed
        this.dispose();
        AlmacenarMascota in = new AlmacenarMascota();
    }//GEN-LAST:event_btnAlmacenarActionPerformed

    private void btnAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbout1ActionPerformed
        this.dispose();
        VentanaAbout va  = new VentanaAbout();
    }//GEN-LAST:event_btnAbout1ActionPerformed

    private void btnMantenedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenedor1ActionPerformed
        this.dispose();
        MantenedorMascota mm = new MantenedorMascota();
    }//GEN-LAST:event_btnMantenedor1ActionPerformed

    private void txtNombreMascotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMascotaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMascotaKeyPressed

    private void txtNombreMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMascotaKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_DELETE || Character.isSpaceChar(c))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreMascotaKeyTyped

    private void txtNombreDuenioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDuenioKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_DELETE || Character.isSpaceChar(c)))
            evt.consume();
    }//GEN-LAST:event_txtNombreDuenioKeyTyped

    private void txtTelDuenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelDuenoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelDuenoKeyPressed

    private void txtTelDuenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelDuenoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtTelDuenoKeyTyped

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
            java.util.logging.Logger.getLogger(AlmacenarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlmacenarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlmacenarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlmacenarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlmacenarMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout1;
    private javax.swing.JButton btnAlmacenar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMantenedor1;
    private javax.swing.JComboBox<String> cbbTipoMascota;
    private javax.swing.JCheckBox ckbAtenPrev;
    private javax.swing.JCheckBox ckbDuenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantAten;
    private javax.swing.JSpinner spnEdadMascota;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtTelDueno;
    // End of variables declaration//GEN-END:variables
}
