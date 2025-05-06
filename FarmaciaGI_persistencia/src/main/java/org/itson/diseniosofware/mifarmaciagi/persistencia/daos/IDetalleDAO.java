/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;

/**
 *
 * @author jl4ma
 */
public interface IDetalleDAO {
    
    public List<DetalleVenta> findAll();
    public DetalleVenta findById(Integer id);
    public void save(DetalleVenta detalle);
    public void update(DetalleVenta detalle);
    public void delete(Integer id);
    public List<DetalleVenta> findByVenta(Integer ventaId);
}
