/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

}
