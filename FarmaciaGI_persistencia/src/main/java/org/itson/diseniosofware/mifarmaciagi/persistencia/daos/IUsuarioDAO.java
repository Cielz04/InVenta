/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author jl4ma
 */
public interface IUsuarioDAO {
    public List<Usuario> findAll();
    public Usuario findById(Integer id);
    public Usuario findByCodigo(Integer codigo);
    public void save(Usuario usuario);
    public void update(Usuario usuario);
     public void delete(Integer id);
}
