package conversores;

import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Asistencia;
import org.itson.disenosoftware.farmaciagi_dtos.AsistenciaDTO;

/**
 *
 * @author Enrique Rodriguez
 */
public class ConversorAsistencia {

    /**
     * Convierte una entidad Asistencia a DTO.
     *
     * @param asistencia
     * @return
     */
    public AsistenciaDTO convertirEntidadADTO(Asistencia asistencia) {
        if (asistencia == null) {
            return null;
        }

        AsistenciaDTO dto = new AsistenciaDTO();
        dto.setId(asistencia.getId());
        dto.setUsuarioId(asistencia.getUsuario().getId());
        dto.setFecha(asistencia.getFecha());
        dto.setHoraEntrada(asistencia.getHoraEntrada());
        dto.setHoraSalida(asistencia.getHoraSalida());

        return dto;
    }

    /**
     * Convierte una lista de entidades Asistencia a lista de DTOs.
     * @param asistencias
     * @return 
     */
    public List<AsistenciaDTO> convertirListaEntidadADTO(List<Asistencia> asistencias) {
        List<AsistenciaDTO> lista = new ArrayList<>();
        for (Asistencia a : asistencias) {
            lista.add(convertirEntidadADTO(a));
        }
        return lista;
    }

    /**
     * Convierte un DTO a entidad Asistencia (sin usuario cargado).
     * @param dto
     * @return 
     */
    public Asistencia convertirDTOAEntidad(AsistenciaDTO dto) {
        if (dto == null) {
            return null;
        }

        Asistencia asistencia = new Asistencia();
        asistencia.setId(dto.getId());
        asistencia.setFecha(dto.getFecha());
        asistencia.setHoraEntrada(dto.getHoraEntrada());
        asistencia.setHoraSalida(dto.getHoraSalida());

        // NOTA: el usuario se debe setear aparte si lo necesitas completo
        return asistencia;
    }
}
