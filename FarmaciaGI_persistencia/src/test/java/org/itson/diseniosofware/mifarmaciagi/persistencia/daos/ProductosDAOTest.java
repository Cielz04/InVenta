/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import Enums.TipoProducto;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author jl4ma
 */
public class ProductosDAOTest {
    
//    private IProductosDAO productosDAO;
//    private EntityManager em;
//
//    @BeforeEach
//    public void setUp() {
//        IConexion conexion = new Conexion();
//         em = conexion.crearConexion();
//
//        productosDAO = new ProductosDAO(conexion);
//    }
//
//    @Test
//    public void testFindAll() {
//        List<Producto> productos = productosDAO.findAll();
//        assertNotNull(productos);
//        assertTrue(productos.size() >= 0);
//    }
//
//    @Test
//    public void testFindById() {
//        Producto pro = productosDAO.findById(1);
//        assertNotNull(pro);
//        assertEquals(1, pro.getId());
//    }
//
//    @Test
//    public void testFindByCodigo() {
//        Producto pro = productosDAO.findByCodigo("AAA");
//        assertNotNull(pro);
//        assertEquals("AAA", pro.getCodigo());
//    }
//
//    @Test
//    public void testSave() {
//       Producto producto= new Producto("Dorito", "Sabritas", 22.00f, "AAA", TipoProducto.Variado);
//        
//        productosDAO.save(producto);
//        
//        assertNotNull(1); 
//    }
//
//    @Test
//    public void testUpdate() {
//        Producto pro = productosDAO.findById(1);
//        assertNotNull(pro);
//        pro.setMarca("Sabritas");
//        productosDAO.update(pro);
//        assertEquals("Sabritas", productosDAO.findById(1).getMarca());
//    }
//
//    @Test
//    public void testDelete() {
//               Producto producto= new Producto("Dorito", "Sabritas", 22.00f, "CCC", TipoProducto.Variado);
//               productosDAO.save(producto);
//        productosDAO.delete(4);
//        Producto pro = productosDAO.findById(4);
//        assertNull(pro);
//    }
    
}
