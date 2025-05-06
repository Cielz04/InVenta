/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversores;

import Enums.TipoProducto;
import Enums.TipoProductoDTO;
import java.util.ArrayList;
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

    public Venta conversor_DTO_A_Entidad_Con_ID(VentaDTO ventaDTO) {
        if (ventaDTO == null) {
            System.out.println("La venta esta vacia en el ConversorVenta");
            return null;
        }
        Usuario usuario = this.convertidor_DTO_A_Entidad(ventaDTO.getUsuarioEnTurno());

        Venta venta = new Venta(
                ventaDTO.getId(),
                ventaDTO.getTotal(),
                ventaDTO.getSubtotal(),
                ventaDTO.getFecha(),
                usuario);

        return venta;
    }
    
    public Venta conversor_DTO_A_Entidad_Sin_ID(VentaDTO ventaDTO) {
        if (ventaDTO == null) {
            System.out.println("La venta esta vacia en el ConversorVenta");
            return null;
        }
        Usuario usuario = this.convertidor_DTO_A_Entidad(ventaDTO.getUsuarioEnTurno());

        Venta venta = new Venta(
                ventaDTO.getTotal(),
                ventaDTO.getSubtotal(),
                ventaDTO.getFecha(),
                usuario);

        return venta;
    }

    public VentaDTO conversor_Entidad_A_DTO_Con_ID(Venta venta) {
        if (venta == null) {
            System.out.println("La venta esta vacia en el ConversorVenta");
            return null;
        }

        UsuarioDTO usuarioDTO = this.convertidor_Entidad_A_DTO(venta.getUsuarioEnTurno());
        
        VentaDTO ventaDTO = new VentaDTO(
                venta.getId(),
                venta.getTotal(),
                venta.getSubtotal(),
                venta.getFecha(),
                usuarioDTO);

        return ventaDTO;
    }
    
    public VentaDTO conversor_Entidad_A_DTO_Sin_ID(Venta venta) {
        if (venta == null) {
            System.out.println("La venta esta vacia en el ConversorVenta");
            return null;
        }

        UsuarioDTO usuarioDTO = this.convertidor_Entidad_A_DTO(venta.getUsuarioEnTurno());

        List<DetalleVentaDTO> detalleDTO =  new ArrayList<>(venta.getId());
        
        VentaDTO ventaDTO = new VentaDTO(
                venta.getTotal(),
                venta.getSubtotal(),
                venta.getFecha(),
                usuarioDTO)
                ;

        return ventaDTO;
    }

    public Promocion convertidor_DTO_A_Entidad(PromocionDTO promocionDTO) {
        if (promocionDTO == null) {
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

    public PromocionDTO convertidor_DTO_A_Entidad(Promocion promocion) {
        if (promocion == null) {
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

    public List<VentaDTO> convertidor_Lista_Entidad_A_DTO(List<Venta> ventas) {
        if (ventas == null || ventas.isEmpty()) {
            return new ArrayList<>();
        }

        List<VentaDTO> listaVentasDTO = new ArrayList<>();
        for (Venta venta : ventas) {
            VentaDTO ventaDTO = conversor_Entidad_A_DTO_Sin_ID(venta);
            listaVentasDTO.add(ventaDTO);
        }
        return listaVentasDTO;
    }
    
    public UsuarioDTO convertidor_Entidad_A_DTO(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO(
                usuario.getId(), 
                usuario.getNombre(), 
                usuario.getCodigo(), 
                usuario.getTipo(), 
                usuario.getDireccion(), 
                usuario.getTelefono());
        return usuarioDTO;
    }
    
    public Usuario convertidor_DTO_A_Entidad(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario(
                usuarioDTO.getId(), 
                usuarioDTO.getNombre(), 
                usuarioDTO.getCodigo(), 
                usuarioDTO.getTipo(), 
                usuarioDTO.getDireccion(), 
                usuarioDTO.getTelefono());
        return usuario;
    }
    
    public DetalleVentaDTO conversor_Entidad_A_DTO(DetalleVenta detalleVenta){
        
        DetalleVentaDTO dvd = new DetalleVentaDTO(
                detalleVenta.getPrecioUnitario(), 
                detalleVenta.getImporte(), 
                detalleVenta.getCantidad(), 
                this.conversor_Entidad_A_DTO_Con_ID(detalleVenta.getVenta()), 
                this.conversor_Entidad_A_DTO(detalleVenta.getProductos()));
        
        return dvd;
    }
    
    public DetalleVenta conversor_DTO_A_Entidad(DetalleVentaDTO detalleVentaDTO){
        
        DetalleVenta dvd = new DetalleVenta(
                detalleVentaDTO.getPrecioUnitario(), 
                detalleVentaDTO.getImporte(), 
                detalleVentaDTO.getCantidad(), 
                this.conversor_DTO_A_Entidad_Con_ID(detalleVentaDTO.getVenta()), 
                this.conversor_DTO_A_Entidad(detalleVentaDTO.getProducto()));
        
        return dvd;
    }
    
    public ProductoDTO conversor_Entidad_A_DTO(Producto producto){
        if(producto == null){
            System.out.println("El producto esta vacio En ConversorProducto");
            return null;
        }
        
        TipoProductoDTO tipo = this.identificador_TipoProductoDTO(producto.getTipo().toString());
        
        ProductoDTO productoDTO = new ProductoDTO(
                producto.getNombre(), 
                producto.getMarca(), 
                producto.getPrecio(), 
                producto.getCodigo(), 
                tipo, 
                producto.getId_proveedores());
        
        return productoDTO;
    }
    
    public Producto conversor_DTO_A_Entidad(ProductoDTO productoDTO){
        if(productoDTO == null){
            System.out.println("El producto esta vacio En ConversorProducto");
            return null;
        }
        
        TipoProducto tipo = this.identificador_TipoProducto(productoDTO.getTipo().toString());
        
        Producto producto = new Producto(
                productoDTO.getNombre(), 
                productoDTO.getMarca(), 
                productoDTO.getPrecio(), 
                productoDTO.getCodigo(), 
                tipo, 
                productoDTO.getId_proveedores());
        
        return producto;
    }
    
    public TipoProductoDTO identificador_TipoProductoDTO(String tipo){
        switch (tipo) {
            case "Medicamento":
                return TipoProductoDTO.Medicamento;
                
            case "Variado":
                return TipoProductoDTO.Variado;
            default:
                throw new AssertionError();
        }
    }
    
    public TipoProducto identificador_TipoProducto(String tipo){
        switch (tipo) {
            case "Medicamento":
                return TipoProducto.Medicamento;
                
            case "Variado":
                return TipoProducto.Variado;
            default:
                throw new AssertionError();
        }
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
