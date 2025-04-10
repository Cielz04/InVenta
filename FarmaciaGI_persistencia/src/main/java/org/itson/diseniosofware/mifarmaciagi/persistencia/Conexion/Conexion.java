package org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion;

//import com.mongodb.ConnectionString;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
//import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
//import org.bson.codecs.configuration.CodecRegistry;
//import org.bson.codecs.pojo.PojoCodecProvider;

public class Conexion  implements IConexion{

     @Override
    public EntityManager crearConexion() {
        // Creamos el EntityManagerFactory.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DbAstro");
        
        // Creamos el EntityManager.
        EntityManager em = emf.createEntityManager();

        // Retornamos el EntityManager.
        return em;
    }

}
