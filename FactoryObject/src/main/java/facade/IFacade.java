/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package facade;

import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;

/**
 *
 * @author jl4ma
 */
public interface IFacade {

    
    //Métodos para el subsitema de Gestor Inventario
    public Map<Producto, List<Lote>> buscar_Productos_Y_Lotes() throws Exception;
    public Producto agregarProducto(Producto producto);
    public List<Lote> agregarLote(Lote lote);
    
    
    //Métodos para el subsistema de Gestor Venta
    public Venta agregarVenta(Venta venta);
    public Venta buscarVentaPorId(Integer id);
    public List<Venta> buscarTodasLasVentas();
    public List<Venta> buscarVentasPorUsuario(Usuario usuario);
    public void eliminarVenta(Integer id);
    
}
