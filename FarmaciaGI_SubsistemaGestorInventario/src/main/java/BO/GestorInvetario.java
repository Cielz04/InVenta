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
        this.facade = new Facade();
    }

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
    
    public ProductoDTO agregarProducto(ProductoDTO productoDTO){
        Producto productoConvert = this.conversorProducto.conversor_DTO_A_Entidad(productoDTO);
        
        Producto productoAgregado = facade.agregarProducto(productoConvert);
        
        ProductoDTO productoAgregadoDTO = this.conversorProducto.conversor_Entidad_A_DTO(productoAgregado);
        
        return productoAgregadoDTO;
    }
    
    public List<LoteDTO> agregarLote(LoteDTO loteDTO){
        Lote loteConvert = this.conversorLote.convertir_DTO_A_Entidad(loteDTO);
        
        List<Lote> listaLotes = this.facade.agregarLote(loteConvert);
        
        List<LoteDTO> listaLotesDTO = this.conversorLote.convertir_Entidad_A_DTO(listaLotes);
        
        return listaLotesDTO;
    }

}
