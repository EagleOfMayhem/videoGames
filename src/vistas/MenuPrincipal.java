package vistas;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

    public class imagenes extends javax.swing.JPanel {
        public imagenes() {
            this.setSize(300, 400); 
        }
        
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Images/Diagrama.png")); 
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
}
}
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtMenu = new javax.swing.JMenu();
        txtDatosEmpresa = new javax.swing.JMenuItem();
        txtAltaProducto = new javax.swing.JMenuItem();
        txtAltaCliente = new javax.swing.JMenuItem();
        txtActualizacionExisPrec = new javax.swing.JMenuItem();
        txtRegistroRenta = new javax.swing.JMenuItem();
        txtResivirVideojuegos = new javax.swing.JMenuItem();
        txtCatalogoProducto = new javax.swing.JMenuItem();
        txtExistenciaInv = new javax.swing.JMenuItem();
        txtReporteRenta = new javax.swing.JMenuItem();
        txtEstadisGenRen = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setForeground(new java.awt.Color(102, 102, 255));

        jTextField1.setBackground(new java.awt.Color(0, 0, 102));
        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("GAMES PLANET");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        txtMenu.setText("MENU PRINCIPAL");

        txtDatosEmpresa.setText("Datos generales de la empresa");
        txtDatosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosEmpresaActionPerformed(evt);
            }
        });
        txtMenu.add(txtDatosEmpresa);

        txtAltaProducto.setText("Alta de Producto");
        txtAltaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltaProductoActionPerformed(evt);
            }
        });
        txtMenu.add(txtAltaProducto);

        txtAltaCliente.setText("Alta de cliente");
        txtAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltaClienteActionPerformed(evt);
            }
        });
        txtMenu.add(txtAltaCliente);

        txtActualizacionExisPrec.setText("Actualizacion de existencia y precio");
        txtActualizacionExisPrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizacionExisPrecActionPerformed(evt);
            }
        });
        txtMenu.add(txtActualizacionExisPrec);

        txtRegistroRenta.setText("Registro de renta");
        txtRegistroRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroRentaActionPerformed(evt);
            }
        });
        txtMenu.add(txtRegistroRenta);

        txtResivirVideojuegos.setText("Resivir Videojuegos");
        txtResivirVideojuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResivirVideojuegosActionPerformed(evt);
            }
        });
        txtMenu.add(txtResivirVideojuegos);

        txtCatalogoProducto.setText("Catalogo de producto");
        txtCatalogoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatalogoProductoActionPerformed(evt);
            }
        });
        txtMenu.add(txtCatalogoProducto);

        txtExistenciaInv.setText("Existencia de inventario");
        txtExistenciaInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciaInvActionPerformed(evt);
            }
        });
        txtMenu.add(txtExistenciaInv);

        txtReporteRenta.setText("Reporte de renta");
        txtReporteRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReporteRentaActionPerformed(evt);
            }
        });
        txtMenu.add(txtReporteRenta);

        txtEstadisGenRen.setText("Estadistica general de renta");
        txtEstadisGenRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadisGenRenActionPerformed(evt);
            }
        });
        txtMenu.add(txtEstadisGenRen);

        jMenuBar1.add(txtMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2232, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2414, 2414, 2414)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosEmpresaActionPerformed

        DatoE de = new DatoE();
        de.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_txtDatosEmpresaActionPerformed

    private void txtAltaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltaProductoActionPerformed

        AltaProducto ap = new AltaProducto();
        ap.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_txtAltaProductoActionPerformed

    private void txtAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltaClienteActionPerformed

        AltaCliente ac = new AltaCliente();
        ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_txtAltaClienteActionPerformed

    private void txtExistenciaInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciaInvActionPerformed

        ExistenciaInventario ei = new ExistenciaInventario();
        ei.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_txtExistenciaInvActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtRegistroRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroRentaActionPerformed

        RegistroRenta rr = new RegistroRenta();
        rr.setVisible(true);
        dispose();
    }//GEN-LAST:event_txtRegistroRentaActionPerformed

    private void txtActualizacionExisPrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizacionExisPrecActionPerformed

        ActualizacionExisPrecio aep = new ActualizacionExisPrecio();
        aep.setVisible(true);
        dispose();

    }//GEN-LAST:event_txtActualizacionExisPrecActionPerformed

    private void txtResivirVideojuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResivirVideojuegosActionPerformed

        RecibirVideojuegos rv = new RecibirVideojuegos();
        rv.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_txtResivirVideojuegosActionPerformed

    private void txtCatalogoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatalogoProductoActionPerformed

        CatalogoProducto cp = new CatalogoProducto();
        cp.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_txtCatalogoProductoActionPerformed

    private void txtReporteRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReporteRentaActionPerformed

        ReporteRenta rpr = new ReporteRenta();
        rpr.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_txtReporteRentaActionPerformed

    private void txtEstadisGenRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadisGenRenActionPerformed

        EstadisticaGenRen egr = new EstadisticaGenRen();
        egr.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_txtEstadisGenRenActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem txtActualizacionExisPrec;
    private javax.swing.JMenuItem txtAltaCliente;
    private javax.swing.JMenuItem txtAltaProducto;
    private javax.swing.JMenuItem txtCatalogoProducto;
    private javax.swing.JMenuItem txtDatosEmpresa;
    private javax.swing.JMenuItem txtEstadisGenRen;
    private javax.swing.JMenuItem txtExistenciaInv;
    private javax.swing.JMenu txtMenu;
    private javax.swing.JMenuItem txtRegistroRenta;
    private javax.swing.JMenuItem txtReporteRenta;
    private javax.swing.JMenuItem txtResivirVideojuegos;
    // End of variables declaration//GEN-END:variables
}
