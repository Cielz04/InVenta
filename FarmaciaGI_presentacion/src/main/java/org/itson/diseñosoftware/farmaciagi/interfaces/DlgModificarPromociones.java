package org.itson.diseñosoftware.farmaciagi.interfaces;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.GestorPromociones;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.IGestorPromociones;
import org.itson.disenosoftware.farmaciagi_subsistema_promociones.excepciones.SubsistemaPromocionesException;

public class DlgModificarPromociones extends javax.swing.JDialog {

    private IGestorPromociones gestorPromociones;
    private Frame parent;

    /**
     * Creates new form DlgModificarPromociones
     *
     * @param parent
     * @param modal
     */
    public DlgModificarPromociones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        btnCancelar.setBackground(Color.WHITE);
        btnActualizar.setBackground(Color.WHITE);
        btnEliminar.setBackground(Color.WHITE);

        gestorPromociones = new GestorPromociones();
        DefaultComboBoxModel listaPromociones = promocionesComboBoxModel();
        cbxPromociones.setModel(listaPromociones);
        this.parent = parent;
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
        lblTitulo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        cbxPromociones = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(216, 215, 255));
        fondo.setMaximumSize(new java.awt.Dimension(812, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("MODIFICAR PROMOCIÓN");

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setFocusPainted(false);
        btnActualizar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnActualizar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblProductos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblProductos.setText("PROMOCIÓN");

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbxPromociones.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        cbxPromociones.setFocusable(false);

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEliminar.setPreferredSize(new java.awt.Dimension(173, 48));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(193, 193, 193))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblProductos)
                .addGap(18, 18, 18)
                .addComponent(cbxPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(48, 48, 48)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductos)
                    .addComponent(cbxPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        DlgActualizarPromocion pActualizarPromocion = new DlgActualizarPromocion(parent, true, (PromocionDTO) cbxPromociones.getSelectedItem());
        pActualizarPromocion.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Deseas confirmar la eliminación de la promoción?",
                "Eliminar Promoción", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            PromocionDTO promocionEliminar = (PromocionDTO) cbxPromociones.getSelectedItem();
            try {
                gestorPromociones.eliminarPromocion(promocionEliminar);
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente la promoción.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } catch (SubsistemaPromocionesException ex) {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la promoción.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private DefaultComboBoxModel<PromocionDTO> promocionesComboBoxModel() {
        DefaultComboBoxModel<PromocionDTO> defaultComboBoxModel = new DefaultComboBoxModel<>();
        if (!gestorPromociones.obtenerPromociones().isEmpty()) {
            // Para cada elemento de la Lista 
            for (int i = 0; i < gestorPromociones.obtenerPromociones().size(); i++) {
                // Agregalo a la instancia de la clase DefaultComboBoxModel 
                defaultComboBoxModel.addElement(gestorPromociones.obtenerPromociones().get(i));
            }
            return defaultComboBoxModel;
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxPromociones;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
