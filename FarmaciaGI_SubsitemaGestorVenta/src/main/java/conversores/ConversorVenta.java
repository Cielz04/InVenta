/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversores;

import java.time.Instant;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.itson.disenosoftware.farmaciagi_dtos.DetalleVentaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

/**
 *
 * @author Dell
 */
public class ConversorVenta {
    
//    public Venta conversor_DTO_A_Entidad(VentaDTO ventaDTO){
//        if(ventaDTO == null){
//            System.out.println("La venta esta vacia en el ConversorVenta");
//            return null;
//        }
//        
//        List<DetalleVentaDTO> listDVDTO = ventaDTO.getDetalleVenta();
//        List<DetalleVenta> listDV;
//        DetalleVenta detalle;
//        
//        for (DetalleVentaDTO dv : listDVDTO) {
//             detalle = this.conversor_DTO_A_Entidad(dv);
//             listDV.add(detalle);
//        }
//        
//        Venta venta = new Venta(
//                ventaDTO.getId(), 
//                ventaDTO.getTotal(), 
//                ventaDTO.getSubtotal(), 
//                ventaDTO.getFecha(), 
//                new Usuario(ventaDTO.getUsuarioEnTurno().getId()), 
//                listDV, 
//                ventaDTO.getPromociones());
//        return venta;
//    }
    
    private DetalleVenta conversor_DTO_A_Entidad(DetalleVentaDTO detallesVentaDTO){
        if(detallesVentaDTO == null){
            System.out.println("El detalleVenta esta vacio en el ConversorVenta");
            return null;
        }
        
        DetalleVenta detallesVenta = new DetalleVenta(
                detallesVentaDTO.getId(), 
                detallesVentaDTO.getPrecioUnitario(), 
                detallesVentaDTO.getImporte(), 
                detallesVentaDTO.getCantidad(), 
                new Venta(detallesVentaDTO.getId()), 
                new Producto(detallesVentaDTO.getId()));
        
        return detallesVenta;
        
    }
    
    
}
