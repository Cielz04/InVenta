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
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;

public class LoteDAO implements ILoteDAO {

    private final EntityManager em;

    public LoteDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    @Override
    public List<Lote> findAll() {
        TypedQuery<Lote> query = em.createQuery("SELECT l FROM Lote l", Lote.class);
        return query.getResultList();
    }

    @Override
    public Lote findById(Integer id) {
        return em.find(Lote.class, id);
    }

    @Override
    public void save(Lote lote) {
        em.getTransaction().begin();
        em.persist(lote);
        em.getTransaction().commit();
    }

    @Override
    public void update(Lote lote) {
        em.getTransaction().begin();
        em.merge(lote);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Integer id) {
        Lote lote = em.find(Lote.class, id);
        if (lote != null) {
            em.getTransaction().begin();
            em.remove(lote);
            em.getTransaction().commit();
        }
    }

    // Opcional: Buscar lotes por producto o entrada si te interesa
    @Override
    public List<Lote> findByProductoId(Integer productoId) {
        TypedQuery<Lote> query = em.createQuery(
                "SELECT l FROM Lote l WHERE l.producto.id = :productoId", Lote.class);
        query.setParameter("productoId", productoId);
        return query.getResultList();
    }

    @Override
    public List<Lote> findByProductoId_Plus_0(Integer productoId) {
        TypedQuery<Lote> query = em.createQuery(
                "SELECT l FROM Lote l WHERE l.producto.id = :productoId AND l.cantidad > 0", Lote.class);
        query.setParameter("productoId", productoId);
        return query.getResultList();
    }

    @Override
    public Lote findByProductoId_Last(Integer productoId) {
        TypedQuery<Lote> query = em.createQuery(
                "SELECT l FROM Lote l WHERE l.producto.id = :productoId AND l.cantidad > 0 ORDER BY l.id DESC",
                Lote.class);
        query.setParameter("productoId", productoId);
        query.setMaxResults(1); // Solo el último lote
        List<Lote> resultados = query.getResultList();
        return resultados.isEmpty() ? null : resultados.get(0);
    }

    @Override
    public List<Lote> findByEntradaId(Integer entradaId) {
        TypedQuery<Lote> query = em.createQuery(
                "SELECT l FROM Lote l WHERE l.entrada.id = :entradaId", Lote.class);
        query.setParameter("entradaId", entradaId);
        return query.getResultList();
    }

    @Override
    public void inserciones() {
        List<Lote> lotes = new ArrayList<>();
        lotes.add(new Lote(Instant.now(), 30, em.getReference(Producto.class, 1)));
        lotes.add(new Lote(Instant.now(), 50, em.getReference(Producto.class, 2)));
        lotes.add(new Lote(Instant.now(), 20, em.getReference(Producto.class, 3)));
        lotes.add(new Lote(Instant.now(), 10, em.getReference(Producto.class, 4)));
        lotes.add(new Lote(Instant.now(), 15, em.getReference(Producto.class, 5)));

        for (Lote l : lotes) {
            this.save(l);  // o usa save() si tu DAO lo abstrae
        }
    }
}
