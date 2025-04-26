/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import factory.AbstractDAOFactory;
import factory.DAOFactory;
import java.util.List;
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

    public List<Producto> buscarProductos() throws Exception {

        try {
            List<Producto> lista = fabrica.getProductosDAO().findAll();
            if(lista.isEmpty()){
                throw new Exception("La lista esta vacia");
            }
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception(e);
        }
    }
    
    public Producto agregarProducto(Producto producto){
        Lote lote1 = new Lote();
        fabrica.getProductosDAO().save(producto);
        return fabrica.getProductosDAO().findByCodigo(producto.getCodigo());
    }
}
