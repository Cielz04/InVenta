/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;

/**
 *
 * @author jl4ma
 */
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;

public class LoteDAO {

    private final EntityManager em;

    public LoteDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    public List<Lote> findAll() {
        TypedQuery<Lote> query = em.createQuery("SELECT l FROM Lote l", Lote.class);
        return query.getResultList();
    }

    public Lote findById(Integer id) {
        return em.find(Lote.class, id);
    }

    public void save(Lote lote) {
        em.getTransaction().begin();
        em.persist(lote);
        em.getTransaction().commit();
    }

    public void update(Lote lote) {
        em.getTransaction().begin();
        em.merge(lote);
        em.getTransaction().commit();
    }

    public void delete(Integer id) {
        Lote lote = em.find(Lote.class, id);
        if (lote != null) {
            em.getTransaction().begin();
            em.remove(lote);
            em.getTransaction().commit();
        }
    }

    // Opcional: Buscar lotes por producto o entrada si te interesa

    public List<Lote> findByProductoId(Integer productoId) {
        TypedQuery<Lote> query = em.createQuery(
            "SELECT l FROM Lote l WHERE l.producto.id = :productoId", Lote.class);
        query.setParameter("productoId", productoId);
        return query.getResultList();
    }

    public List<Lote> findByEntradaId(Integer entradaId) {
        TypedQuery<Lote> query = em.createQuery(
            "SELECT l FROM Lote l WHERE l.entrada.id = :entradaId", Lote.class);
        query.setParameter("entradaId", entradaId);
        return query.getResultList();
    }
}
