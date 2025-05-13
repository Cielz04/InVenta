/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import java.time.LocalDate;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Asistencia;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author Enrique Rodriguez
 */
public interface IAsistenciaDAO {

    public void save(Asistencia asistencia);

    public void update(Asistencia asistencia);
    public Asistencia buscarAsistenciaHoy(Usuario usuario);
    public List<Asistencia> buscarPorFecha(LocalDate fecha);
    public Asistencia ultimaAsistencia();
}
