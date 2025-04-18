package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.GestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;

/**
 *
 * @author Hector Espinoza
 */
public class DlgRegistroProductos extends javax.swing.JDialog {
    
    private ProductoDTO producto;
    private int constante;
    private Frame parent;
    
    /**
     * Constructor para el registro de los productos
     * @param parent
     * @param modal
     */
    public DlgRegistroProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        producto = new ProductoDTO();
        this.parent = parent;
        
        btnVolver.setBackground(Color.WHITE);
        btnRestaurar.setBackground(Color.WHITE);
        btnRegistrar.setBackground(Color.WHITE);
    }
    
    /**
     * Constructor para el funcinamiento de la actualización de un producto
     * @param parent
     * @param modal
     * @param producto producto para actualizar
     */
    public DlgRegistroProductos(java.awt.Frame parent, boolean modal, ProductoDTO producto){
        initComponents();
        this.producto = producto;
        this.parent = parent;
        txtCodigo.setText(producto.getCodigo());
        txtNombre.setText(producto.getNombre());
        txtMarca.setText(producto.getMarca());
        txtCosto.setText(String.valueOf(producto.getCosto()));
        txtCodigo.setEditable(false);
        btnRegistrar.setText("Actualizar");
        
        btnVolver.setBackground(Color.WHITE);
        btnRestaurar.setBackground(Color.WHITE);
        btnRegistrar.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnComprarProductos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnRestaurar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnPromociones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");

        jPanel1.setBackground(new java.awt.Color(226, 228, 241));

        jPanel2.setBackground(new java.awt.Color(166, 164, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel2.setRequestFocusEnabled(false);

        btnProductos.setBackground(new java.awt.Color(226, 228, 241));
        btnProductos.setForeground(new java.awt.Color(166, 164, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prouctos1.png"))); // NOI18N
        btnProductos.setBorderPainted(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setFocusPainted(false);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(166, 164, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel3.setRequestFocusEnabled(false);

        btnComprarProductos.setBackground(new java.awt.Color(58, 55, 142));
        btnComprarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_carrito.png"))); // NOI18N
        btnComprarProductos.setBorderPainted(false);
        btnComprarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(166, 164, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel5.setRequestFocusEnabled(false);

        btnProveedores.setBackground(new java.awt.Color(58, 55, 142));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proveedor.png"))); // NOI18N
        btnProveedores.setBorder(null);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setFocusPainted(false);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(166, 164, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel6.setRequestFocusEnabled(false);

        btnVenta.setBackground(new java.awt.Color(58, 55, 142));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenVenta.png"))); // NOI18N
        btnVenta.setBorder(null);
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setFocusPainted(false);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        btnVolver.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setText("Código del producto:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel4.setText("Nombre del producto:");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel6.setText("Marca del producto:");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel7.setText("Costo del producto:");

        txtCodigo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N

        txtCosto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N

        btnRestaurar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(166, 164, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel8.setRequestFocusEnabled(false);

        btnPromociones.setBackground(new java.awt.Color(58, 55, 142));
        btnPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tagIcon.png"))); // NOI18N
        btnPromociones.setActionCommand("btnPromociones");
        btnPromociones.setBorderPainted(false);
        btnPromociones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPromociones.setFocusPainted(false);
        btnPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromocionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnRestaurar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validarCampos()) {
            GestorProductos gestor = new GestorProductos();

            if (producto.getCodigo() != null) {

                try {

                    try {
                        if (validacionCosto()) {
                            producto.setMarca(txtMarca.getText());
                            producto.setCosto(Float.parseFloat(txtCosto.getText()));
                            producto.setNombre(txtNombre.getText());
                            gestor.actualizarProducto(producto);
                            JOptionPane.showMessageDialog(rootPane, "Producto actualizado correctamente", "Tarea realizada", JOptionPane.INFORMATION_MESSAGE);
                            volver();

                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(parent, "Inserte un formato válido", "Error en campo costo", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (GestorProductosException ex) {
                    JOptionPane.showMessageDialog(rootPane, "No fue posible realizar la actualización", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                try {
                   if (validacionCosto()) {
                    producto.setCodigo(txtCodigo.getText());
                    producto.setMarca(txtMarca.getText());
                    producto.setCosto(Float.parseFloat(txtCosto.getText()));
                    producto.setNombre(txtNombre.getText());
                    producto.setCantidad(0);

                    try {
                        producto = gestor.registrarProducto(producto);
                        JOptionPane.showMessageDialog(rootPane, "Producto registrado correctamente", "Tarea realizada", JOptionPane.INFORMATION_MESSAGE);
                        volver();
                    } catch (GestorProductosException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error en registro", JOptionPane.ERROR_MESSAGE);
                    }

                }  
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(parent, "Inserte un formato válido", "Error en campo costo", JOptionPane.ERROR_MESSAGE);
                }
                

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Asegurese de llenar todos los campos", "Error en registro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed

    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        dispose();
        DlgProveedores proveedores = new DlgProveedores(parent, true);
        proveedores.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        restaurar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnComprarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarProductosActionPerformed
        dispose();
        DlgComprarProductos productosPrincipal = new DlgComprarProductos();
        productosPrincipal.setVisible(true);
    }//GEN-LAST:event_btnComprarProductosActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        dispose();
        DlgPromociones dlgPromociones = new DlgPromociones(parent, true);
        dlgPromociones.setVisible(true);
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void restaurar(){
        if (producto.getCodigo()!=null){
            txtNombre.setText(producto.getNombre());
            txtMarca.setText(producto.getMarca());
            txtCosto.setText(String.valueOf(producto.getCosto()));
        }else{
            txtCodigo.setText("");
            txtNombre.setText("");
            txtMarca.setText("");
            txtCosto.setText("");
        }
    }
    
    
    
    private boolean validarCampos(){
        if (txtCodigo.getText().isBlank()
                || txtNombre.getText().isBlank()
                || txtMarca.getText().isBlank()
                || txtCosto.getText().isBlank()){
            return false;
        }
        return true;
    }
    
    private void volver(){
        dispose();   
        DlgProductosPrincipal productosPrincipal = new DlgProductosPrincipal(parent, true);
        productosPrincipal.setVisible(true);
    }
    
    private boolean validacionCosto() throws NumberFormatException {
        try {
            float costo = Float.parseFloat(txtCosto.getText());
            if (costo > 0) {
                return true;
            } else {
                throw new NumberFormatException("Error: El costo debe ser mayor a 0");
            }
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Error: Introduzca un formato valido");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarProductos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
