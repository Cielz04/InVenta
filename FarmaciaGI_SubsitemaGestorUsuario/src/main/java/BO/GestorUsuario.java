package BO;

import conversores.ConversorUsuario;
import facade.Facade;
import facade.IFacade;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Asistencia;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.disenosoftware.farmaciagi_dtos.AsistenciaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;

public class GestorUsuario implements IGestorUsuario {

    private final IFacade facade;
    private final ConversorUsuario cu;
    private final ConversorUsuario ca;

    public GestorUsuario() {
        this.facade = new Facade();
        this.cu = new ConversorUsuario();
        this.ca = new ConversorUsuario();
    }

    @Override
    public UsuarioDTO buscarUsuario_id(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(usuarioDTO.getId());
        Usuario usuarioBuscado = facade.buscarUsuario_ID(usuario);
        return cu.conversor_Entidad_A_DTO(usuarioBuscado);
    }

    @Override
    public UsuarioDTO buscarUsuario_Codigo(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(0, usuarioDTO.getCodigo());
        Usuario usuarioBuscado = facade.buscarUsuario_Codigo(usuario);
        return cu.conversor_Entidad_A_DTO(usuarioBuscado);
    }

    /**
     * Registra la hora de entrada del usuario (si aún no ha sido registrada hoy).
     * @param usuarioDTO
     */
    public void registrarEntrada(UsuarioDTO usuarioDTO) {
        Usuario usuario = cu.conversor_DTO_A_Entidad(usuarioDTO);
        facade.registrarEntrada(usuario);
    }

    /**
     * Registra la hora de salida del usuario (si ya se registró entrada hoy).
     * @param usuarioDTO
     */
    public void registrarSalida(UsuarioDTO usuarioDTO) {
        Usuario usuario = cu.conversor_DTO_A_Entidad(usuarioDTO);
        facade.registrarSalida(usuario);
    }

    /**
     * Obtiene la asistencia de hoy para el usuario dado.
     * @param usuarioDTO
     * @return 
     */
    public AsistenciaDTO obtenerAsistenciaHoy(UsuarioDTO usuarioDTO) {
        Usuario usuario = cu.conversor_DTO_A_Entidad(usuarioDTO);
        Asistencia asistencia = facade.buscarAsistenciaHoy(usuario);
        return ca.convertirEntidadADTO(asistencia);
    }

    /**
     * Devuelve todas las asistencias registradas en una fecha específica.
     * @param fecha
     * @return 
     */
    public List<AsistenciaDTO> obtenerAsistenciasPorFecha(LocalDate fecha) {
        List<Asistencia> asistencias = facade.buscarAsistenciasPorFecha(fecha);
        return asistencias.stream()
                .map(ca::convertirEntidadADTO)
                .collect(Collectors.toList());
    }
}
