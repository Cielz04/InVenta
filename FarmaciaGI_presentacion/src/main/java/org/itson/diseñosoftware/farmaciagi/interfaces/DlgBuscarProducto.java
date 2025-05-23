package org.itson.diseñosoftware.farmaciagi.interfaces;

import BO.GestorInvetario;
import BO.GestorVenta;
import BO.IGestorVenta;
import interfaces.IGestorInventario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.itson.disenosoftware.farmaciagi_dtos.DetalleVentaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.LoteDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;

public class DlgBuscarProducto extends javax.swing.JDialog {

    private IGestorInventario gestorInventario;
    private IGestorVenta gestorVenta;
    private UsuarioDTO usuarioenTurnoDTO;

    public DlgBuscarProducto(java.awt.Frame parent, boolean modal, UsuarioDTO usuario) {
        super(parent, modal);
        initComponents();
        this.usuarioenTurnoDTO = usuario;
        this.gestorInventario = new GestorInvetario();
        this.gestorVenta = new GestorVenta();

        btnCerrar.setBackground(Color.WHITE);
        btnBuscarProducto.setBackground(Color.WHITE);
        centraCuadroDialogo(parent);
        btnBuscarProducto.setBackground(new Color(93, 82, 193));
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Marca", "Precio", "Cantidad", "Agregar"}, 0) {
        };
        
        tblBusqueda.setModel(modelo);
    }

    /**
     * Este método centra el cuadro de dialogo sobre la ventana de la
     * aplicación.
     *
     * @param parent Ventana sobre la que aparecerá el cuadro de diálogo
     */
    private void centraCuadroDialogo(java.awt.Frame parent) {
        // Obtiene el tamaño y posición de la ventana de la aplicación
        Dimension frameSize = parent.getSize();
        Point loc = parent.getLocation();
        // Obtiene el tamaño del cuadro de diálogo
        Dimension dlgSize = getPreferredSize();
        // Centra el cuadro de diálogo sobre la ventana padre
        setLocation((frameSize.width - dlgSize.width) / 2 + loc.x, (frameSize.height - dlgSize.height) / 2 + loc.y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(226, 228, 241));
        fondo.setMaximumSize(new java.awt.Dimension(812, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));
        fondo.setPreferredSize(new java.awt.Dimension(800, 600));

        btnCerrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCerrar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tblBusqueda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ARTICULO", "MARCA", "COSTO", "CANTIDAD", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBusqueda.setName("Busqueda Producto"); // NOI18N
        jScrollPane1.setViewportView(tblBusqueda);

        jPanel1.setBackground(new java.awt.Color(58, 55, 142));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR PRODUCTO");

        txtBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBuscar.setPreferredSize(new java.awt.Dimension(36, 37));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(93, 82, 193));
        btnBuscarProducto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupita2.png"))); // NOI18N
        btnBuscarProducto.setText("| Buscar");
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProducto.setFocusPainted(false);
        btnBuscarProducto.setPreferredSize(new java.awt.Dimension(36, 36));
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        Map<ProductoDTO, List<LoteDTO>> productosYLotes = null;

        try {
            if (this.txtBuscar.getText().isBlank()) {
                productosYLotes = gestorInventario.buscar_Productos_Y_Lotes();
            } else if (this.txtBuscar.getText().matches("\\d+")) {
                ProductoDTO productoDTO = new ProductoDTO(this.txtBuscar.getText());
                productosYLotes = gestorInventario.buscar_Un_Producto_Y_Lotes(productoDTO);
            } else {
                // aqui busca por nombre
            }

        } catch (Exception ex) {
            Logger.getLogger(DlgBuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

//        List<ProductoDTO> productosBuscados = productosYLotes.keySet().stream()
//                .filter(p -> p.getNombre().toLowerCase().contains(txtBuscar.getText().toLowerCase())
//                || p.getCodigo().toLowerCase().contains(txtBuscar.getText().toLowerCase()))
//                .toList();

        this.llenarTablaProductos(productosYLotes);

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
        PantallaVenta pv;
        try {
            pv = new PantallaVenta(usuarioenTurnoDTO);
            pv.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(DlgBuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    //Métodos 
//    private void llenarTablaProductos(List<ProductoDTO> productos) {
//        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Marca", "Precio", "Agregar"}, 0) {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return column == 3; // Solo la columna de "Agregar" es editable
//            }
//        };
//
//        for (ProductoDTO p : productos) {
//            modelo.addRow(new Object[]{
//                p.getNombre(),
//                p.getMarca(),
//                p.getPrecio(),
//                "Agregar"
//            });
//        }
//
//        tblBusqueda.setModel(modelo);
//
//        // Acción del botón
//        Action agregarAction = new AbstractAction("Agregar") {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int fila = Integer.parseInt(e.getActionCommand());
//                ProductoDTO producto = productos.get(fila);
//                agregarProductoALaVenta(producto);
//            }
//        };
//
//        new ButtonColumn(tblBusqueda, agregarAction, 3);
//    }
    
    private void llenarTablaProductos(Map<ProductoDTO, List<LoteDTO>> productos) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre", "Marca", "Precio", "Cantidad", "Agregar"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4; // Solo la columna de "Agregar" es editable
            }
        };
        
        
        
        List<ProductoDTO> productosOrdenados = new ArrayList<>();
        List<Integer> cantidadesDisponibles = new ArrayList<>();
        
        for (Map.Entry<ProductoDTO, List<LoteDTO>> entry : productos.entrySet()) {
            ProductoDTO key = entry.getKey();
            List<LoteDTO> value = entry.getValue();
            Integer cantidadProducto = 0;
            
            productosOrdenados.add(key);
            
            for (LoteDTO loteDTO : value) {
                cantidadProducto += loteDTO.getCantidad();
            }
            cantidadesDisponibles.add(cantidadProducto);
            
            modelo.addRow(new Object[]{
                key.getNombre(),
                key.getMarca(),
                key.getPrecio(),
                cantidadProducto,
                "Agregar"
            });
            
        }

        tblBusqueda.setModel(modelo);

        // Acción del botón
        Action agregarAction = new AbstractAction("Agregar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = Integer.parseInt(e.getActionCommand());
                ProductoDTO producto = productosOrdenados.get(fila);
                Integer cantidadDispo = cantidadesDisponibles.get(fila);
                agregarProductoALaVenta(producto, cantidadDispo);
            }
        };

        new ButtonColumn(tblBusqueda, agregarAction, 4);
    }

    private void agregarProductoALaVenta(ProductoDTO producto, Integer cantidadDisponible) {
        try {
            String input = JOptionPane.showInputDialog(this, "¿Cantidad a vender de " + producto.getNombre() + "?");
            Integer cantidad = Integer.valueOf(input);
            
            if(cantidadDisponible < cantidad){
                throw new Exception();
            }
            
            Float total = cantidad*producto.getPrecio();
            
            DetalleVentaDTO dv = new DetalleVentaDTO(
                    producto.getPrecio(),
                    total,
                    cantidad,
                    producto);

            PantallaVenta.getInstancia().agregarDetalle(dv); // <-- método público

            JOptionPane.showMessageDialog(this, "Producto agregado a la venta.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.\nStock Disponible: "+ cantidadDisponible);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
