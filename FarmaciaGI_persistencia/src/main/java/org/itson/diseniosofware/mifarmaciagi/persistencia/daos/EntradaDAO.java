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
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Entrada;

public class EntradaDAO {

    private final EntityManager em;

    public EntradaDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    public List<Entrada> findAll() {
        TypedQuery<Entrada> query = em.createQuery("SELECT e FROM Entrada e", Entrada.class);
        return query.getResultList();
    }

    public Entrada findById(Integer id) {
        return em.find(Entrada.class, id);
    }

    public void save(Entrada entrada) {
        em.getTransaction().begin();
        em.persist(entrada);
        em.getTransaction().commit();
    }

    public void update(Entrada entrada) {
        em.getTransaction().begin();
        em.merge(entrada);
        em.getTransaction().commit();
    }

    public void delete(Integer id) {
        Entrada entrada = em.find(Entrada.class, id);
        if (entrada != null) {
            em.getTransaction().begin();
            em.remove(entrada);
            em.getTransaction().commit();
        }
    }
}
