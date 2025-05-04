/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;

import static org.junit.jupiter.api.Assertions.*;

import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

public class VentasDAOTest {

//    private VentasDAO ventasDAO;
//    private EntityManager em;
//
//    @BeforeEach
//    public void setUp() {
//        IConexion conexion = new Conexion();
//         em = conexion.crearConexion();
//
//        ventasDAO = new VentasDAO(conexion);
//    }
//
//    @Test
//    public void testSave() {
//        Venta venta = new Venta(500.00f, 450.00f, Instant.EPOCH, new Usuario("aef", 0, "adf", "ada", "af"));
//        ventasDAO.save(venta);
//
//        assertNotNull(1); // Asume que ID se genera automáticamente
//    }
//
//    @Test
//    public void testFindAll() {
//        List<Venta> ventas = ventasDAO.findAll();
//        assertNotNull(ventas);
//        assertTrue(ventas.size() >= 0);
//    }
//
//    @Test
//    public void testFindById() {
//    Venta venta = new Venta(500.00f, 450.00f, Instant.EPOCH, new Usuario("aef", 0, "adf", "ada", "af"));
//
//        ventasDAO.save(venta);
//
//        venta.setId(1);
//        Venta ventaEncontrada = ventasDAO.findById(venta.getId());
//
//        assertNotNull(ventaEncontrada);
//        assertEquals(venta.getId(), ventaEncontrada.getId());
//    }
//
//    @Test
//    public void testFindByUsuario() {
//        Usuario usuario = new Usuario("aef", 0, "adf", "ada", "af");
//        
//        usuario.setNombre("Test Usuario");
//        
//        // Se guarda el usuario de alguna manera en la base, depende de cómo esté tu estructura
//        // Aquí simularé un usuario ligado a una venta
//
//        Venta venta = new Venta(500.00f, 450.00f, Instant.EPOCH, usuario);
//        ventasDAO.save(venta);
//
//        usuario.setId(1);
//        List<Venta> ventasUsuario = ventasDAO.findByUsuario(usuario);
//
//        assertNotNull(ventasUsuario);
//        assertTrue(ventasUsuario.size() >= 0);
//    }
//
//    @Test
//    public void testUpdate() {
//        Venta venta = new Venta(500.00f, 450.00f, Instant.EPOCH, new Usuario("aef", 0, "adf", "ada", "af"));
//
//        ventasDAO.save(venta);
//
//        venta.setTotal(450.0f);
//        ventasDAO.update(venta);
//
//        Venta ventaActualizada = ventasDAO.findById(1);
//        assertEquals(450.0f, ventaActualizada.getTotal());
//    }
//
//    @Test
//    public void testDelete() {
//        Venta venta = new Venta(500.00f, 450.00f, Instant.EPOCH, new Usuario("aef", 0, "adf", "ada", "af"));
//        ventasDAO.save(venta);
//
//        ventasDAO.delete(1);
//
//        Venta ventaEliminada = ventasDAO.findById(1);
//        assertNull(ventaEliminada);
//    }
}

