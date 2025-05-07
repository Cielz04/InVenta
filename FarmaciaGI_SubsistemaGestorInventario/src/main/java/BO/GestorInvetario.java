/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import com.mycompany.factoryobject.FactoryObject;
import conversores.ConversorLote;
import conversores.ConversorProducto;
import facade.Facade;
import facade.IFacade;
import interfaces.IGestorInventario;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.LoteDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public class GestorInvetario implements IGestorInventario {

    private ConversorProducto conversorProducto;
    private ConversorLote conversorLote;
    private IFacade facade;

    public GestorInvetario() {
        this.conversorProducto = new ConversorProducto();
        this.conversorLote = new ConversorLote();
        this.facade = new Facade();
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public Map<ProductoDTO, List<LoteDTO>> buscar_Productos_Y_Lotes() throws Exception {
        Map<Producto, List<Lote>> listaEnt = facade.buscar_Productos_Y_Lotes();
        Map<ProductoDTO, List<LoteDTO>> resultado = new HashMap<>();

        for (Map.Entry<Producto, List<Lote>> entry : listaEnt.entrySet()) {
            Producto producto = entry.getKey();
            List<Lote> lotes = entry.getValue();
            

            ProductoDTO productoDTO = conversorProducto.conversor_Entidad_A_DTO(producto);
            List<LoteDTO> loteDTOs = lotes.stream()
                    .map(lote -> conversorLote.convertir_Entidad_A_DTO(lote)) 
                    .toList();

            resultado.put(productoDTO, loteDTOs);
        }

        return resultado;
    }
    
    @Override
    public Map<ProductoDTO, List<LoteDTO>> buscar_Un_Producto_Y_Lotes(ProductoDTO productoDTO) throws Exception {
        Producto poductoConvert = new Producto(productoDTO.getCodigo());
        Map<Producto, List<Lote>> listaEnt = facade.buscar_Un_Producto_Y_Lotes(poductoConvert);
        Map<ProductoDTO, List<LoteDTO>> resultado = new HashMap<>();

        for (Map.Entry<Producto, List<Lote>> entry : listaEnt.entrySet()) {
            Producto producto = entry.getKey();
            List<Lote> lotes = entry.getValue();
            
            System.out.println(producto.toString());

            ProductoDTO productoConvertDTO = conversorProducto.conversor_Entidad_A_DTO(producto);
            List<LoteDTO> loteDTOs = lotes.stream()
                    .map(lote -> conversorLote.convertir_Entidad_A_DTO(lote)) 
                    .toList();

            resultado.put(productoConvertDTO, loteDTOs);
        }

        return resultado;
    }
    
    public ProductoDTO agregarProducto(ProductoDTO productoDTO){
        Producto productoConvert = this.conversorProducto.conversor_DTO_A_Entidad(productoDTO);
        
        Producto productoAgregado = facade.agregarProducto(productoConvert);
        
        ProductoDTO productoAgregadoDTO = this.conversorProducto.conversor_Entidad_A_DTO(productoAgregado);
        
        return productoAgregadoDTO;
    }
    
    public LoteDTO agregarLote(LoteDTO loteDTO){
        Lote loteConvert = this.conversorLote.convertir_DTO_A_Entidad(loteDTO);
        
        Lote loteGuardado = this.facade.agregarLote(loteConvert);
        
        LoteDTO loteGuardadoDTO = this.conversorLote.convertir_Entidad_A_DTO(loteGuardado);
        
        return loteGuardadoDTO;
    }

    @Override
    public ProductoDTO buscarProductoPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Map<ProductoDTO, List<LoteDTO>> agregar_Producto_Y_Lote(ProductoDTO productoDTO, LoteDTO loteDTO) throws Exception{
        ProductoDTO productoGuardado = this.agregarProducto(productoDTO);
        LoteDTO loteCopia = loteDTO;
        loteCopia.setProducto(productoGuardado);
        LoteDTO loteGuardado = this.agregarLote(loteCopia);
        return this.buscar_Un_Producto_Y_Lotes(productoGuardado);
    }
    
    @Override
    public ProductoDTO editar_Producto(ProductoDTO productoViejoDTO, ProductoDTO productoNuevoDTO){
        Producto productoViejoConvert = new Producto(productoViejoDTO.getCodigo());
        Producto productoNuevoConvert = conversorProducto.conversor_DTO_A_Entidad(productoNuevoDTO);
        Producto productoUpdate = facade.editarProducto(productoViejoConvert, productoNuevoConvert);
        
        ProductoDTO UpdateDTO = conversorProducto.conversor_Entidad_A_DTO(productoUpdate);
        
        return UpdateDTO;
    }
    
    @Override
    public LoteDTO editarLote_Para_Venta(Integer cantidad, ProductoDTO productoDTO) throws Exception{
        Producto produ = new Producto(productoDTO.getCodigo());
        Producto productoBuscado = facade.buscarProducto_Codigo(produ);
        
        Lote lote = facade.editarLote_Para_Venta(cantidad, productoBuscado);
        LoteDTO loteConvert = conversorLote.convertir_Entidad_A_DTO(lote);
        return loteConvert;
    }
    
    public ProductoDTO buscarProducto_Por_Codigo(ProductoDTO productoDTO) throws Exception{
        
        Producto producto = new Producto(productoDTO.getCodigo());
        
        
        Producto productoBuscado = facade.buscarProducto_Codigo(producto);
        
        ProductoDTO productoBuscadoDTO = conversorProducto.conversor_Entidad_A_DTO(productoBuscado);
        
        return productoBuscadoDTO;
    }
    
}
