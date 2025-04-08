package org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion;

//import com.mongodb.client.MongoDatabase;

import jakarta.persistence.EntityManager;


public interface IConexion {

    /**
     * Permite crear una conexión al mecanismo de persistencia.
     * 
     * @return Una conexión al mecanismo de persistencia
     */
public EntityManager crearConexion();
}
