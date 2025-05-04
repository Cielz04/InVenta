/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import jakarta.persistence.EntityManager;
import java.time.Instant;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author jl4ma
 */
public class LoteDAOTest {
    
//    private ILoteDAO loteDAO;
//    private EntityManager em;
//
//    @BeforeEach
//    public void setUp() {
//        IConexion conexion = new Conexion();
//         em = conexion.crearConexion();
//
//        loteDAO = new LoteDAO(conexion);
//    }
//
//    @Test
//    public void testFindAll() {
//        List<Lote> lotes = loteDAO.findAll();
//        assertNotNull(lotes);
//        assertTrue(lotes.size() >= 0);
//    }
//
//    @Test
//    public void testFindById() {
//        Lote lote = loteDAO.findById(1);
//        assertNotNull(lote);
//        assertEquals(1, lote.getId());
//    }
//
//    @Test
//    public void testSave() {
//        Lote lote = new Lote(Instant.EPOCH, 20, new Producto(1));
//        
//        loteDAO.save(lote);
//        
//        assertNotNull(1);
//        
//    }
//
//    @Test
//    public void testUpdate() {
//        Lote lote = loteDAO.findById(2);
//        assertNotNull(lote);
//        lote.setCantidad(400);
//        loteDAO.update(lote);
//        
//        assertEquals(400, loteDAO.findById(2).getCantidad());
//                
//    }
//
//    @Test
//    public void testDelete() {
//        
//        loteDAO.delete(3);
//        Lote lote = loteDAO.findById(3);
//        assertNull(lote);
//    }
//
//    @Test
//    public void testFindByProductoId() {
//        Lote lote = new Lote(Instant.EPOCH, 20, new Producto(1));
//        
//        loteDAO.save(lote);
//        
//        List<Lote> lote2 = loteDAO.findByProductoId(1);
//        assertNotNull(lote2);
//        assertTrue(lote2.size() >= 0);
//    }
//
//    @Test
//    public void testFindByEntradaId() {
//    }
    
}
