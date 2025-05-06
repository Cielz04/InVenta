/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

public class GestorVentaTest {

//    private GestorVenta gestorVenta;
//
//    @BeforeEach
//    public void setUp() {
//        gestorVenta = new GestorVenta();
//    }
//
//    @Test
//    public void testAgregarVenta() {
//        VentaDTO ventaDTO = new VentaDTO();
//        ventaDTO.setTotal(500.0f);
//
//        VentaDTO ventaGuardada = gestorVenta.agregarVenta(ventaDTO);
//
//        assertNotNull(ventaGuardada);
//        assertNotNull(ventaGuardada.getId());
//        assertEquals(500.0f, ventaGuardada.getTotal());
//    }
//
//    @Test
//    public void testBuscarVentaPorId() {
//        VentaDTO venta = gestorVenta.buscarVentaPorId(1);
//
//        assertNotNull(venta);
//        assertEquals(1, venta.getId());
//    }
//
//    @Test
//    public void testBuscarTodasLasVentas() {
//        List<VentaDTO> ventas = gestorVenta.buscarTodasLasVentas();
//
//        assertNotNull(ventas);
//        assertTrue(ventas.size() >= 0);
//    }
//
//    @Test
//    public void testBuscarVentasPorUsuario() {
//        UsuarioDTO usuarioDTO = new UsuarioDTO();
//        usuarioDTO.setId(1);
//
//        List<VentaDTO> ventas = gestorVenta.buscarVentasPorUsuario(usuarioDTO);
//
//        assertNotNull(ventas);
//        assertTrue(ventas.size() >= 0);
//    }
//
//    @Test
//    public void testEliminarVenta() {
//        assertDoesNotThrow(() -> gestorVenta.eliminarVenta(1));
//    }
}