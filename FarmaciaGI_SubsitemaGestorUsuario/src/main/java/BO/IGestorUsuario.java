/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BO;

import java.time.LocalDate;
import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.AsistenciaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;

/**
 *
 * @author Enrique Rodriguez
 */
public interface IGestorUsuario {
    public UsuarioDTO buscarUsuario_id(UsuarioDTO usuarioDTO);
    public UsuarioDTO buscarUsuario_Codigo(UsuarioDTO usuarioDTO);
    public List<UsuarioDTO> obtenerTodosLosUsuarios();
    public List<AsistenciaDTO> obtenerAsistenciasPorFecha(LocalDate fecha);
    public AsistenciaDTO obtenerAsistenciaHoy(UsuarioDTO usuarioDTO);
    public void registrarSalida(UsuarioDTO usuarioDTO);
    public void registrarEntrada(UsuarioDTO usuarioDTO);
}
