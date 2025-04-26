/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversores;

import Enums.TipoProducto;
import Enums.TipoProductoDTO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public class ConversorProducto {
    
    public Producto conversor_DTO_A_Entidad(ProductoDTO productoDTO){
        if(productoDTO == null){
            System.out.println("El productoDTO esta vacio En ConversorProducto");
            return null;
        }
        
        TipoProducto tipo = this.identificador_TipoProducto(productoDTO.getTipo());
        
        Producto producto = new Producto(
                productoDTO.getNombre(), 
                productoDTO.getMarca(), 
                productoDTO.getPrecio(), 
                productoDTO.getCodigo(),
                tipo, 
                productoDTO.getId_proveedores());
        
        return producto;
        
    }
    
    public ProductoDTO conversor_Entidad_A_DTO(Producto producto){
        if(producto == null){
            System.out.println("El producto esta vacio En ConversorProducto");
            return null;
        }
        
        TipoProductoDTO tipo = this.identificador_TipoProductoDTO(producto.getTipo());
        
        ProductoDTO productoDTO = new ProductoDTO(producto.getNombre(), 
                producto.getMarca(), 
                producto.getPrecio(), 
                producto.getCodigo(), 
                tipo, 
                producto.getId_proveedores());
        
        return productoDTO;
    }
    
    public TipoProductoDTO identificador_TipoProductoDTO(TipoProducto tipo){
        switch (tipo) {
            case tipo.Medicamento:
                return TipoProductoDTO.Medicamento;
                
            case tipo.Variado:
                return TipoProductoDTO.Variado;
            default:
                throw new AssertionError();
        }
    }
    
    public TipoProducto identificador_TipoProducto(TipoProductoDTO tipo){
        switch (tipo) {
            case tipo.Medicamento:
                return TipoProducto.Medicamento;
                
            case tipo.Variado:
                return TipoProducto.Variado;
            default:
                throw new AssertionError();
        }
    }
    
}
