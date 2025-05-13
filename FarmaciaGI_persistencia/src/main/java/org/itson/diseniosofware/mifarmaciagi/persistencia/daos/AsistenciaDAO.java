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
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Asistencia;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author Enrique Rodriguez
 */
public class AsistenciaDAO implements IAsistenciaDAO {

    private final EntityManager em;

    public AsistenciaDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    /**
     * Guarda una nueva asistencia en la base de datos.
     *
     * @param asistencia
     */
    @Override
    public void save(Asistencia asistencia) {
        em.getTransaction().begin();
        em.persist(asistencia);
        em.getTransaction().commit();
    }

    /**
     * Actualiza una asistencia existente (por ejemplo, para agregar hora de
     * salida).
     *
     * @param asistencia
     */
    @Override
    public void update(Asistencia asistencia) {
        em.getTransaction().begin();
        em.merge(asistencia);
        em.getTransaction().commit();
    }

    /**
     * Busca la asistencia de hoy para un usuario específico.
     *
     * @param usuario
     * @return
     */
    @Override
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
     *
     * @param fecha
     * @return
     */
    @Override
    public List<Asistencia> buscarPorFecha(LocalDate fecha) {
        TypedQuery<Asistencia> query = em.createQuery(
                "SELECT a FROM Asistencia a WHERE a.fecha = :fecha",
                Asistencia.class
        );
        query.setParameter("fecha", fecha);
        return query.getResultList();
    }

    @Override
    public Asistencia ultimaAsistencia() {
        TypedQuery<Asistencia> query = em.createQuery(
                "SELECT a FROM Asistencia a ORDER BY a.id DESC",
                Asistencia.class
        );
        query.setMaxResults(1); // Solo la más reciente por ID
        List<Asistencia> resultados = query.getResultList();

        return resultados.isEmpty() ? null : resultados.get(0);
    }
}
