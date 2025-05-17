/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.disenosoftware.farmaciagi_dtos.LoteDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public interface IGestorInventario {

    public Map<ProductoDTO, List<LoteDTO>> buscar_Productos_Y_Lotes() throws Exception;
    public Map<ProductoDTO, List<LoteDTO>> buscar_Un_Producto_Y_Lotes(ProductoDTO productoDTO) throws Exception;
    public Map<ProductoDTO, List<LoteDTO>> agregar_Producto_Y_Lote(ProductoDTO productoDTO, LoteDTO loteDTO) throws Exception;
    public ProductoDTO editar_Producto(ProductoDTO productoViejoDTO, ProductoDTO productoNuevoDTO);
    public LoteDTO editarLote_Para_Venta(Integer cantidad, ProductoDTO productoDTO) throws Exception;
    public ProductoDTO buscarProducto_Por_Codigo(ProductoDTO productoDTO) throws Exception;

    public ProductoDTO buscarProductoPorId(Integer id);
    public void inserciones();
    
}
