package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

//import com.mongodb.client.MongoCollection;

import Enums.TipoProducto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;


public class ProductosDAO implements IProductosDAO {

     private final EntityManager em;

    public ProductosDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

     @Override
    public List<Producto> findAll() {
        TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p", Producto.class);
        return query.getResultList();
    }

     @Override
    public Producto findById(Integer id) {
        return em.find(Producto.class, id);
    }

     @Override
    public Producto findByCodigo(String codigo) {
        TypedQuery<Producto> query = em.createQuery(
            "SELECT p FROM Producto p WHERE p.codigo = :codigo", Producto.class);
        query.setParameter("codigo", codigo);
        List<Producto> result = query.getResultList();
        return result.isEmpty() ? null : result.get(0);
    }

     @Override
    public void save(Producto producto) {
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
    }

     @Override
    public void update(Producto producto) {
        em.getTransaction().begin();
        em.merge(producto);
        em.getTransaction().commit();
    }
    @Override
    public void delete(Integer id) {
        Producto producto = em.find(Producto.class, id);
        if (producto != null) {
            em.getTransaction().begin();
            em.remove(producto);
            em.getTransaction().commit();
        }
    }
     @Override
    public void inserciones(){
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Paracetamol", "Tylenol", 22.00f, "PRC-001", TipoProducto.Medicamento));
        productos.add(new Producto("Naproxeno", "Flanax", 44.00f, "NPX-001", TipoProducto.Medicamento));
        productos.add(new Producto("Electrolit", "Suerox", 25.00f, "ELC-001", TipoProducto.Variado));
        productos.add(new Producto("Condones", "Durex", 112.00f, "CDN-001", TipoProducto.Variado));
        productos.add(new Producto("Agua", "Bonafont", 16.00f, "BNF-001", TipoProducto.Variado));
        
        for(Producto p: productos){
            this.save(p);
        }
    }

}
