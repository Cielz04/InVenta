/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Asistencia;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author Enrique Rodriguez
 */
public class AsistenciaDAO {

    private final EntityManager em;

    public AsistenciaDAO(EntityManager em) {
        this.em = em;
    }

    /**
     * Guarda una nueva asistencia en la base de datos.
     */
    public void save(Asistencia asistencia) {
        em.getTransaction().begin();
        em.persist(asistencia);
        em.getTransaction().commit();
    }

    /**
     * Actualiza una asistencia existente (por ejemplo, para agregar hora de
     * salida).
     */
    public void update(Asistencia asistencia) {
        em.getTransaction().begin();
        em.merge(asistencia);
        em.getTransaction().commit();
    }

    /**
     * Busca la asistencia de hoy para un usuario específico.
     */
    public Asistencia buscarAsistenciaHoy(Usuario usuario) {
        try {
            TypedQuery<Asistencia> query = em.createQuery(
                    "SELECT a FROM Asistencia a WHERE a.usuario = :usuario AND a.fecha = :fecha",
                    Asistencia.class
            );
            query.setParameter("usuario", usuario);
            query.setParameter("fecha", LocalDate.now());

            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; 
        }
    }

    /**
     * Devuelve todas las asistencias registradas en una fecha específica.
     */
    public List<Asistencia> buscarPorFecha(LocalDate fecha) {
        TypedQuery<Asistencia> query = em.createQuery(
                "SELECT a FROM Asistencia a WHERE a.fecha = :fecha",
                Asistencia.class
        );
        query.setParameter("fecha", fecha);
        return query.getResultList();
    }
}
