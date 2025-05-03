/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import java.util.Map;
import org.itson.disenosoftware.farmaciagi_dtos.LoteDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public interface IGestorInventario {

    public Map<ProductoDTO, List<LoteDTO>> buscar_Productos_Y_Lotes() throws Exception;

    public ProductoDTO buscarProductoPorId(Integer id);
    
}
