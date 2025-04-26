/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversores;

import java.time.Instant;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.itson.disenosoftware.farmaciagi_dtos.DetalleVentaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.PromocionDTO;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

/**
 *
 * @author Dell
 */
public class ConversorVenta {
    
    public Venta conversor_DTO_A_Entidad(VentaDTO ventaDTO){
        if(ventaDTO == null){
            System.out.println("La venta esta vacia en el ConversorVenta");
            return null;
        }
        Usuario usuario = new Usuario(ventaDTO.getId());
        
        Venta venta = new Venta(
                ventaDTO.getId(),
                ventaDTO.getTotal(), 
                ventaDTO.getSubtotal(), 
                ventaDTO.getFecha(), 
                usuario);
        
        return venta;
    }
    
    public VentaDTO conversor_Entidad_A_DTO(Venta venta){
        if(venta == null){
            System.out.println("La venta esta vacia en el ConversorVenta");
            return null;
        }
        
        UsuarioDTO usuarioDTO = new UsuarioDTO(venta.getId());
        
        VentaDTO ventaDTO = new VentaDTO(
                venta.getId(), 
                venta.getTotal(), 
                venta.getSubtotal(), 
                venta.getFecha(), 
                usuarioDTO);
        
        return ventaDTO;
    }
    
    public Promocion convertidor_DTO_A_Entidad(PromocionDTO promocionDTO){
        if(promocionDTO == null){
            System.out.println("La promocion esta vacia en el convertidorVenta");
            return null;
        }
        
        Producto producto = new Producto(promocionDTO.getProducto().getId());
        
        Promocion promocion = new Promocion(
                promocionDTO.getCodigo(), 
                promocionDTO.getDescripcion(), 
                producto, 
                promocionDTO.getCantidad(), 
                promocionDTO.getPrecioUnitario());
        
        return promocion;
        
    }
    
    public PromocionDTO convertidor_DTO_A_Entidad(Promocion promocion){
        if(promocion == null){
            System.out.println("La promocion esta vacia en el convertidorVenta");
            return null;
        }
        
        ProductoDTO productoDTO = new ProductoDTO(promocion.getProducto().getId());
        
        PromocionDTO promocionDTO = new PromocionDTO(
                promocion.getCodigo(), 
                promocion.getDescripcion(), 
                productoDTO, 
                promocion.getCantidad(), 
                promocion.getPrecioUnitario());
        
        return promocionDTO;
        
    }
    
//    public DetalleVenta conversor_DTO_A_Entidad(DetalleVentaDTO detallesVentaDTO){
//        if(detallesVentaDTO == null){
//            System.out.println("El detalleVenta esta vacio en el ConversorVenta");
//            return null;
//        }
//        
//        DetalleVenta detallesVenta = new DetalleVenta(
//                detallesVentaDTO.getId(), 
//                detallesVentaDTO.getPrecioUnitario(), 
//                detallesVentaDTO.getImporte(), 
//                detallesVentaDTO.getCantidad(), 
//                new Venta(detallesVentaDTO.getId()), 
//                new Producto(detallesVentaDTO.getId()));
//        
//        return detallesVenta;
//        
//    }
    
    
}
