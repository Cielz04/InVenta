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

    void registrarEntrada(Usuario usuario);

    void registrarSalida(Usuario usuario);

    Asistencia buscarAsistenciaHoy(Usuario usuario);

    List<Asistencia> listarAsistenciasPorFecha(LocalDate fecha);
}
