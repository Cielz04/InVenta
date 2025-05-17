/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author jl4ma
 */
public class UsuarioDAO implements IUsuarioDAO {

    private final EntityManager em;

    public UsuarioDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    @Override
    public List<Usuario> findAll() {
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
        return query.getResultList();
    }

    @Override
    public Usuario findById(Integer id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public Usuario findByCodigo(Integer codigo) {
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.codigo = :codigo", Usuario.class);
        query.setParameter("codigo", codigo);
        List<Usuario> resultados = query.getResultList();
        return resultados.isEmpty() ? null : resultados.get(0);
    }
  
    @Override
    public List<Usuario> findByNombreOCodigo(String textoBusqueda) {
        try {
            int codigo = Integer.parseInt(textoBusqueda);
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.codigo = :codigo", Usuario.class);
            query.setParameter("codigo", codigo);
            return query.getResultList();
        } catch (NumberFormatException e) {
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE LOWER(u.nombre) LIKE :nombre", Usuario.class);
            query.setParameter("nombre", "%" + textoBusqueda.toLowerCase() + "%");
            return query.getResultList();
        }
    }

    @Override
    public void save(Usuario usuario) {
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }

    @Override
    public void update(Usuario usuario) {
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Integer id) {
        Usuario usuario = em.find(Usuario.class, id);
        if (usuario != null) {
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }
    }

    @Override
    public List<Usuario> buscarTodos() {
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
        return query.getResultList();
    }
    
    @Override
    public void inserciones(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Adriana", 235633, "Vendedor", "Su casa", "00000000"));
        usuarios.add(new Usuario("Astorga", 245791, "Vendedor", "Leandro", "00000000"));
        usuarios.add(new Usuario("Madero", 244903, "Vendedor", "Las lomas", "00000000"));
        usuarios.add(new Usuario("Kike", 246966, "Vendedor", "Su depa", "00000000"));
        usuarios.add(new Usuario("Reyna", 4321, "Administrador", "FarmaciaGI", "00000000"));
        usuarios.add(new Usuario("Elva", 1234, "Vendedor", "Su cubiculo", "00000000"));
        
        for(Usuario user: usuarios){
            this.save(user);
        }
    }

}
