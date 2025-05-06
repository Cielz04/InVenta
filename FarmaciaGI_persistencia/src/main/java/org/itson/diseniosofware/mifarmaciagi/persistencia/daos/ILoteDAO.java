/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;

/**
 *
 * @author jl4ma
 */
public interface ILoteDAO {
    
    public List<Lote> findAll();
     public Lote findById(Integer id);
     public void save(Lote lote);
     public void update(Lote lote);
     public void delete(Integer id);
     public List<Lote> findByProductoId(Integer productoId);
     public List<Lote> findByProductoId_Plus_0(Integer productoId);
     public Lote findByProductoId_Last(Integer productoId);
     public List<Lote> findByEntradaId(Integer entradaId);
}
