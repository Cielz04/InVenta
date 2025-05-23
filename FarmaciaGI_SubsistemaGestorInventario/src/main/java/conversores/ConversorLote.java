/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversores;

import Enums.TipoProductoDTO;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.LoteDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public class ConversorLote {
    private ConversorProducto cp = new ConversorProducto();
    
    public LoteDTO convertir_Entidad_A_DTO(Lote lote){
        ProductoDTO p = cp.conversor_Entidad_A_DTO(lote.getProducto());
        
        LoteDTO loteDTO = new LoteDTO(
                lote.getCaducidad(), 
                lote.getCantidad(), 
                p);
        
        return loteDTO;
    }
    
    public Lote convertir_DTO_A_Entidad(LoteDTO loteDTO){
        Producto p = cp.conversor_DTO_A_Entidad(loteDTO.getProducto());
        
        Lote lote = new Lote(
                loteDTO.getCaducidad(), 
                loteDTO.getCantidad(), 
                p);
        
        return lote;
    }
    
    public List<LoteDTO> convertir_Entidad_A_DTO(List<Lote> listaLote){
        
        List<LoteDTO> listaLoteDTO = new ArrayList<>();
        
        for (Lote lote : listaLote) {
            listaLoteDTO.add(this.convertir_Entidad_A_DTO(lote));
            
        }
        return listaLoteDTO;
    }
    public List<Lote> convertir_DTO_A_Entidad(List<LoteDTO> listaLoteDTO){
        
        List<Lote> listaLote = new ArrayList<>();
        
        for (LoteDTO loteDTO : listaLoteDTO) {
            listaLote.add(this.convertir_DTO_A_Entidad(loteDTO));
        }
        return listaLote;
    }
}
