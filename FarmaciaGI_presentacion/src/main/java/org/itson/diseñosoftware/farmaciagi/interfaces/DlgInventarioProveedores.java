/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Frame;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProveedorDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.GestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.IGestorProductos;
import org.itson.disenosoftware.farmaciagi_subsistema_productos.excepciones.GestorProductosException;
import org.itson.disenosoftware.farmaciagi_subsistema_proveedores.GestorProveedores;
import org.itson.disenosoftware.farmaciagi_subsistema_proveedores.IGestorProveedores;

/**
 *
 * @author Hector Espinoza
 */
public class DlgInventarioProveedores extends javax.swing.JDialog {
    
    private IGestorProductos gestorProductos;
    private IGestorProveedores gestorProveedores;
    private ProductoDTO producto;
    private List<ProveedorDTO> proveedores;
    private Frame parent;

    /**
     * Creates new form DlgInventarioProductos
     *
     * @param parent
     * @param modal
     * @param producto
     */
    public DlgInventarioProveedores(java.awt.Frame parent, boolean modal, ProductoDTO producto) {
        super(parent, modal);
        gestorProductos = new GestorProductos();
        gestorProveedores = new GestorProveedores();
        this.producto = producto;
        this.parent = parent;
        initComponents();
        
        btnAsignar.setBackground(Color.WHITE);
        btnVolver.setBackground(Color.WHITE);
        
        llenarTabla();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnPromociones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        btnComprarProductos.setActionCommand("btnCompras");
        btnComprarProductos.setBorderPainted(false);
        btnComprarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprarProductos.setFocusPainted(false);
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
            .addComponent(btnComprarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
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
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
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
            .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        tblProveedores.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE", "DIRECCION", "CONTACTO", "RFC"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        btnVolver.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusPainted(false);
        btnVolver.setPreferredSize(new java.awt.Dimension(173, 48));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAsignar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnAsignar.setText("ASIGNAR PROVEEDOR");
        btnAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignar.setFocusPainted(false);
        btnAsignar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(166, 164, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(145, 145));
        jPanel4.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        dispose();
        DlgProductosPrincipal menuProductos = new DlgProductosPrincipal(parent, true);
        menuProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        dispose();
        DlgProveedores proveedores = new DlgProveedores(parent, true);
        proveedores.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        dispose();
        PantallaVenta venta = new PantallaVenta();
        venta.setVisible(true);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        volver();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = tblProveedores.getSelectedRow();
        
        if (filaSeleccionada != -1) { // Verificar que haya una fila seleccionada
            // Obtener el proveedor seleccionado en la tabla
            ProveedorDTO proveedorSeleccionado = proveedores.get(filaSeleccionada);
            
            try {
                // Abrir el diálogo con la opción seleccionada y el proveedor seleccionado
                gestorProductos.asignarProveedorAProducto(producto, proveedorSeleccionado);
                JOptionPane.showMessageDialog(rootPane, "Proveedor asignado correctamente al producto", "Proveedor asignado", JOptionPane.INFORMATION_MESSAGE);
                volver();
            } catch (GestorProductosException ex) {
                JOptionPane.showMessageDialog(parent, ex.getMessage(), "Error: No es posible asignar proveedor", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Mostrar un mensaje de advertencia si no hay fila seleccionada
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un proveedor de la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
        llenarTabla();
    }//GEN-LAST:event_btnAsignarActionPerformed

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
    
    public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("CONTACTO");
        modelo.addColumn("RFC");
        
        proveedores = gestorProveedores.buscarProveedores();
        
        if (!proveedores.isEmpty()) {
            for (ProveedorDTO proveedor : proveedores) {
                
                List<String> telefonosExistentes = proveedor.getTelefonos();
                StringBuilder telefonos = new StringBuilder();
                for (String telefonosExistente : telefonosExistentes) {
                    telefonos.append(telefonosExistente).append(",");
                }
                if (telefonos.length() > 0) {
                    telefonos.delete(telefonos.length() - 1, telefonos.length());
                }
                
                Object[] fila = {
                    proveedor.getNombre(),
                    proveedor.getDireccion().getCalle() + ","
                    + //TODO: Pensar si esto va de esta forma 
                    proveedor.getDireccion().getColonia() + ","
                    + proveedor.getDireccion().getNumero() + ","
                    + proveedor.getDireccion().getCodigo_postal() + ","
                    + proveedor.getDireccion().getCiudad(),
                    telefonos.toString(),
                    proveedor.getRfc()
                };
                modelo.addRow(fila);
            }
        }
        
        tblProveedores.setModel(modelo);
        TableColumnModel columnModel = tblProveedores.getColumnModel();
        
    }
    
    private ProductoDTO obtenerProductoSeleccionado() {
        
        int filaSeleccionada = tblProveedores.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            int filaModelo = tblProveedores.convertRowIndexToModel(filaSeleccionada);
            
            DefaultTableModel modelo = (DefaultTableModel) tblProveedores.getModel();
            
            String codigo = modelo.getValueAt(filaModelo, 0).toString();
            String nombre = modelo.getValueAt(filaModelo, 1).toString();
            String marca = modelo.getValueAt(filaModelo, 2).toString();
            Float costo = Float.parseFloat(modelo.getValueAt(filaModelo, 3).toString());
            
            ProductoDTO productoSeleccionado = new ProductoDTO();
            productoSeleccionado.setCodigo(codigo);
            productoSeleccionado.setNombre(nombre);
            productoSeleccionado.setMarca(marca);
            productoSeleccionado.setCosto(costo);
            
            return productoSeleccionado;
        } else {
            return null;
        }
    }
    
    private void volver() {
        dispose();
        DlgProductosPrincipal productosPrincipal = new DlgProductosPrincipal(parent, true);
        productosPrincipal.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnComprarProductos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedores;
    // End of variables declaration//GEN-END:variables
}
