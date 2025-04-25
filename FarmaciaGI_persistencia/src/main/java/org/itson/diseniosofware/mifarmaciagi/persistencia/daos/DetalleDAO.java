/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;

/**
 *
 * @author jl4ma
 */
public class DetalleDAO implements IDetalleDAO{
    
    private final EntityManager em;

    public DetalleDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    @Override
    public List<DetalleVenta> findAll() {
        TypedQuery<DetalleVenta> query = em.createQuery("SELECT d FROM DetalleVenta d", DetalleVenta.class);
        return query.getResultList();
    }

    @Override
    public DetalleVenta findById(Integer id) {
        return em.find(DetalleVenta.class, id);
    }

    @Override
    public void save(DetalleVenta detalle) {
        em.getTransaction().begin();
        em.persist(detalle);
        em.getTransaction().commit();
    }

    @Override
    public void update(DetalleVenta detalle) {
        em.getTransaction().begin();
        em.merge(detalle);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Integer id) {
        DetalleVenta detalle = em.find(DetalleVenta.class, id);
        if (detalle != null) {
            em.getTransaction().begin();
            em.remove(detalle);
            em.getTransaction().commit();
        }
    }
    
}
