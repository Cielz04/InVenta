package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

//import com.mongodb.client.MongoCollection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

//import com.mongodb.client.MongoDatabase;
//import static com.mongodb.client.model.Filters.eq;
//import java.util.LinkedList;
//import java.util.List;
//import org.bson.Document;
//import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
//import org.itson.diseniosofware.mifarmaciagi.persistencia.Exception.PersistenciaException;
//import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;

public class PromocionesDAO implements IPromocionesDAO {
//    private final MongoDatabase baseDatos;
//    private String nombreColeccion;
//
//    /**
//     * Constructor que recibe la conexión al mecanismo de persistencia.
//     *
//     * @param conexion La conexión al mecanismo de persistencia
//     */
//    public PromocionesDAO(IConexion conexion) {
//        baseDatos = conexion.crearConexion();
//        nombreColeccion = "promociones";
//    }
//
//    /**
//     * {@inheritDoc }
//     */
//    @Override
//    public Promocion obtenerPromocion(Promocion promocionBuscada) {
//        MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);
//
//        Promocion promocionRegistro = coleccion.find(eq("codigo", promocionBuscada.getCodigo())).first();
//
//        return promocionRegistro;
//    }
//
//    /**
//     * {@inheritDoc }
//     */
//    @Override
//    public void registrarPromocion(Promocion promocionNueva) throws PersistenciaException {
//        if (obtenerPromocion(promocionNueva) == null) {
//            MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);
//
//            coleccion.insertOne(promocionNueva);
//        } else {
//            throw new PersistenciaException("La promoción ya existe.");
//        }
//    }
//
//    /**
//     * {@inheritDoc }
//     */
//    @Override
//    public void actualizarPromocion(Promocion promocionActualizada) throws PersistenciaException {
//        if (obtenerPromocion(promocionActualizada) != null) {
//            MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);
//            
//            coleccion.updateOne(new Document()
//                    .append("codigo", promocionActualizada.getCodigo()),
//                    new Document("$set", new Document()
//                            .append("descripcion", promocionActualizada.getDescripcion())
//                            .append("producto", promocionActualizada.getProducto())
//                            .append("cantidad", promocionActualizada.getCantidad())
//                            .append("precioUnitario", promocionActualizada.getPrecioUnitario())));
//        } else {
//            throw new PersistenciaException("La promoción no existe.");
//        }
//    }
//
//    /**
//     * {@inheritDoc }
//     */
//    @Override
//    public void eliminarPromocion(Promocion promocionEliminar) throws PersistenciaException {
//        if (obtenerPromocion(promocionEliminar) != null) {
//            MongoCollection coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);
//            
//            coleccion.deleteOne(new Document().append("codigo", promocionEliminar.getCodigo()));
//        } else {
//            throw new PersistenciaException("La promoción no existe.");
//        }
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    public List<Promocion> obtenerPromociones() {
//        MongoCollection<Promocion> coleccion = baseDatos.getCollection(nombreColeccion, Promocion.class);
//
//        List<Promocion> promociones = new LinkedList<>();
//        coleccion.find().into(promociones);
//
//        return promociones;
//    }

     private final EntityManager em;

    public PromocionesDAO(IConexion conexion) {
        this.em = conexion.crearConexion();
    }

    public List<Promocion> findAll() {
        TypedQuery<Promocion> query = em.createQuery("SELECT p FROM Promocion p", Promocion.class);
        return query.getResultList();
    }

    public Promocion findByCodigo(String codigo) {
        return em.find(Promocion.class, codigo);
    }

    public void save(Promocion promocion) {
        em.getTransaction().begin();
        em.persist(promocion);
        em.getTransaction().commit();
    }

    public void update(Promocion promocion) {
        em.getTransaction().begin();
        em.merge(promocion);
        em.getTransaction().commit();
    }

    public void delete(String codigo) {
        Promocion promocion = em.find(Promocion.class, codigo);
        if (promocion != null) {
            em.getTransaction().begin();
            em.remove(promocion);
            em.getTransaction().commit();
        }
    }

}
