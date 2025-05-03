/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import conversores.ConversorVenta;
import facade.Facade;
import facade.IFacade;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.itson.disenosoftware.farmaciagi_dtos.DetalleVentaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

/**
 *
 * @author Enrique Rodriguez
 */
public class GestorVenta implements IGestorVenta {

    private ConversorVenta conversorVenta;
    private IFacade facade;

    public GestorVenta() {
        this.conversorVenta = new ConversorVenta();
        this.facade = new Facade();
    }

    @Override
    public VentaDTO agregarVenta(VentaDTO ventaDTO) {
        Venta venta = conversorVenta.conversor_DTO_A_Entidad(ventaDTO);
        Venta ventaGuardada = facade.agregarVenta(venta);
        return conversorVenta.conversor_Entidad_A_DTO(ventaGuardada);
    }

    @Override
    public VentaDTO buscarVentaPorId(Integer id) {
        Venta venta = facade.buscarVentaPorId(id);
        return conversorVenta.conversor_Entidad_A_DTO(venta);
    }

    @Override
    public List<VentaDTO> buscarTodasLasVentas() {
        List<Venta> ventas = facade.buscarTodasLasVentas();
        return conversorVenta.convertidor_Lista_Entidad_A_DTO(ventas);
    }

    @Override
    public List<VentaDTO> buscarVentasPorUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());

        List<Venta> ventas = facade.buscarVentasPorUsuario(usuario);
        return conversorVenta.convertidor_Lista_Entidad_A_DTO(ventas);
    }

    @Override
    public void eliminarVenta(Integer id) {
        facade.eliminarVenta(id);
    }
    

}

