/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BO;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

/**
 *
 * @author Enrique Rodriguez
 */
public interface IGestorVenta {

    public VentaDTO agregarVenta(VentaDTO ventaDTO);
    public VentaDTO buscarVentaPorId(Integer id);
    public List<VentaDTO> buscarTodasLasVentas();
    public List<VentaDTO> buscarVentasPorUsuario(UsuarioDTO usuarioDTO);
    public void eliminarVenta(Integer id);
}
