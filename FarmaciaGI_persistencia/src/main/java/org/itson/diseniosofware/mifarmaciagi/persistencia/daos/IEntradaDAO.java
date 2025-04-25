/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Entrada;

/**
 *
 * @author jl4ma
 */
public interface IEntradaDAO {
    
    public List<Entrada> findAll();
    public Entrada findById(Integer id);
     public void save(Entrada entrada);
     public void update(Entrada entrada);
     public void delete(Integer id);
}
