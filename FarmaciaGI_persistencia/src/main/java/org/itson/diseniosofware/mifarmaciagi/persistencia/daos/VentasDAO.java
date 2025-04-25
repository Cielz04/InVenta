package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

//import com.mongodb.client.MongoCollection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;

//import com.mongodb.client.MongoDatabase;
//import static com.mongodb.client.model.Filters.eq;
//import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
//import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
//import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;

public class VentasDAO implements IVentasDAO {
//    private MongoCollection<Venta> collection;
//
//    /**
//     * Constructor que recibe la conexión al mecanismo de persistencia.
//     *
//     * @param conexion La conexión al mecanismo de persistencia
//     */
//    public VentasDAO(IConexion conexion) {
//        MongoDatabase baseDatos = conexion.crearConexion();
//
//        collection = baseDatos.getCollection("ventas", Venta.class);
//    }
//
//    /**
//     * Método el cual nos permitirá registrar una venta a la bd
//     *
//     * @param venta venta a registrar
//     * @return regresa la venta en caso de éxito
//     * @throws PersistenciaException en caso de no poder registrarla
//     */
//    @Override
//    public Venta registrarVenta(Venta venta) throws PersistenciaException {
//        if (encontrarVenta(venta.getCodigoVenta()) == null) {
//            collection.insertOne(venta);
//
//            return venta;
//        } else {
//            throw new PersistenciaException("ERROR: Esta venta ya esta registrada");
//        }
//    }
//
//    /**
//     * Este método se encarga de encontrar ua venta en la bd
//     *
//     * @param codigo código de la venta que se desea encontrar
//     * @return retorna la venta que se encontro
//     */
//    @Override
//    public Venta encontrarVenta(String codigo) {
//
//        Venta ventaEncontrada;
//
//        ventaEncontrada = collection.find(eq("codigo_venta", codigo)).first();
//
//        if (ventaEncontrada == null) {
//            return null;
//        }
//        return ventaEncontrada;
//
//    }

    private final EntityManager em;

    public VentasDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    public List<Venta> findAll() {
        TypedQuery<Venta> query = em.createQuery("SELECT v FROM Venta v", Venta.class);
        return query.getResultList();
    }

    public Venta findById(Integer id) {
        return em.find(Venta.class, id);
    }

    public List<Venta> findByUsuario(Usuario usuario) {
        TypedQuery<Venta> query = em.createQuery("SELECT v FROM Venta v WHERE v.usuarioEnTurno = :usuario", Venta.class);
        query.setParameter("usuario", usuario);
        return query.getResultList();
    }

    public void save(Venta venta) {
        em.getTransaction().begin();
        em.persist(venta);
        em.getTransaction().commit();
    }

    public void update(Venta venta) {
        em.getTransaction().begin();
        em.merge(venta);
        em.getTransaction().commit();
    }

    public void delete(Integer id) {
        Venta venta = em.find(Venta.class, id);
        if (venta != null) {
            em.getTransaction().begin();
            em.remove(venta);
            em.getTransaction().commit();
        }
    }

}
