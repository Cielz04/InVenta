/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import factory.AbstractDAOFactory;
import factory.DAOFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;

/**
 *
 * @author jl4ma
 */
public class Facade implements IFacade {

    private IConexion conexion;
    private AbstractDAOFactory fabrica;

    public Facade() {
        conexion = new Conexion();
        fabrica = new DAOFactory(conexion);
    }

    
    //Métodos para subsistema Gestor Inventario
    
    public List<Producto> buscarProductos() throws Exception {

        try {
            List<Producto> lista = fabrica.getProductosDAO().findAll();
            if (lista.isEmpty()) {
                throw new Exception("La lista esta vacia");
            }
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception(e);
        }
    }
    
    public List<Lote> buscar_Lotes_de_Producto(Producto producto){
        Producto productoBuscado = fabrica.getProductosDAO().findByCodigo(producto.getCodigo());
        
        List<Lote> lotes = fabrica.getLoteAO().findByProductoId(productoBuscado.getId());
        
        return lotes;
    }

    @Override
    public List<Lote> agregarLote(Lote lote) {
        List<Lote> lote1 = new ArrayList<>();
        fabrica.getLoteAO().save(lote);
        lote1 = fabrica.getLoteAO().findByProductoId(lote.getProductos().getId());

        return lote1;
    }
    
    @Override
    public Producto agregarProducto(Producto producto){
        fabrica.getProductosDAO().save(producto);
        Producto productoBuscado = fabrica.getProductosDAO().findByCodigo(producto.getCodigo());
        
        return productoBuscado;
    }
    
    @Override
    public Map<Producto, List<Lote>> buscar_Productos_Y_Lotes() throws Exception{
        List<Producto> productos = this.buscarProductos();
        
        Map<Producto, List<Lote>> resultado = new HashMap<>();
        
        for (Producto producto : productos) {
            List<Lote> lotesDelProducto = this.buscar_Lotes_de_Producto(producto);
            resultado.put(producto, lotesDelProducto);
        }
        return resultado;
    }

    //Métodos para Subsistema Gestor Venta
    
    
}
