/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package facade;

import factory.AbstractDAOFactory;
import factory.DAOFactory;
import java.time.Instant;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author jl4ma
 */
public class FacadeTest {
//
//    private IFacade facade;
//    private IConexion conexion;
//    private AbstractDAOFactory fabrica;
//
//    @BeforeEach
//    public void setUp() {
//        facade = new Facade();
//        conexion = new Conexion();
//        fabrica = new DAOFactory(conexion);
//    }
//
//    @Test
//    public void testBuscarProductos() throws Exception {
//
//    }
//
//    @Test
//    public void testBuscar_Lotes_de_Producto() {
//
//    }
//
//    @Test
//    public void testAgregarLote() {
//
//    }
//
//    @Test
//    public void testAgregarProducto() {
//
//    }
//
//    @Test
//    public void testBuscar_Productos_Y_Lotes() throws Exception {
//
//    }
//
//    @Test
//    public void testAgregarVenta() {
//        Usuario usuario = fabrica.getUsuarioDAO().findByCodigo(1234);
//        Venta venta;
//        if(usuario == null){
//            fabrica.getUsuarioDAO().save(new Usuario("Juan", 1234, "Vendedor", "Calle Falsa 123", "1234567890"));
//        }
//        
//        Usuario usuarioBuscado = fabrica.getUsuarioDAO().findByCodigo(1234);
//        venta = new Venta(100.0f, 90.0f, Instant.now(), usuarioBuscado);
//        
//        
//        Venta ventaGuardada = facade.agregarVenta(venta);
//        assertNotNull(ventaGuardada);
//        assertEquals(venta.getTotal(), ventaGuardada.getTotal());
//    }
//
//    @Test
//    public void testBuscarVentaPorId() {
//        Usuario usuario = fabrica.getUsuarioDAO().findByCodigo(5678);
//        Venta venta;
//        if(usuario == null){
//            fabrica.getUsuarioDAO().save(new Usuario("Maria", 5678, "Vendedor", "Av Siempre Viva", "0987654321"));
//        }
//        
//        Usuario usuarioBuscado = fabrica.getUsuarioDAO().findByCodigo(5678);
//        
//        venta = new Venta(100.0f, 90.0f, Instant.now(), usuarioBuscado);
//        Venta ventaGuardada = facade.agregarVenta(venta);
//
//        Venta ventaBuscada = facade.buscarVentaPorId(ventaGuardada.getId());
//        assertNotNull(ventaBuscada);
//        assertEquals(ventaGuardada.getId(), ventaBuscada.getId());
//    }
//
//    @Test
//    public void testBuscarTodasLasVentas() {
//        Usuario usuario1 = fabrica.getUsuarioDAO().findByCodigo(4321);
//        Usuario usuario2 = fabrica.getUsuarioDAO().findByCodigo(8765);
//        Venta venta1;
//        Venta venta2;
//        if(usuario1 == null && usuario2 == null){
//            fabrica.getUsuarioDAO().save(new Usuario("Ana", 4321, "Vendedor", "Calle Luna", "1231231234"));
//            fabrica.getUsuarioDAO().save(new Usuario("Luis", 8765, "Vendedor", "Calle Sol", "3213214321"));
//        }
//        
//        Usuario usuarioBuscado1 = fabrica.getUsuarioDAO().findByCodigo(4321);
//        Usuario usuarioBuscado2 = fabrica.getUsuarioDAO().findByCodigo(8765);
//        
//        // Aseguramos que existan al menos 2 ventas
//        venta1 = facade.agregarVenta(new Venta(200.0f, 180.0f, Instant.now(), usuario1));
//        venta2 = facade.agregarVenta(new Venta(300.0f, 270.0f, Instant.now(), usuario2));
//
//        List<Venta> ventas = facade.buscarTodasLasVentas();
//        assertNotNull(ventas);
//        assertTrue(ventas.size() >= 2);
//    }
//
//    @Test
//    public void testBuscarVentasPorUsuario() {
//        Usuario usuario = fabrica.getUsuarioDAO().findById(1);
//        Venta venta1 = new Venta(150.0f, 135.0f, Instant.now(), usuario);
//        Venta venta2 = new Venta(250.0f, 225.0f, Instant.now(), usuario);
//
//        facade.agregarVenta(venta1);
//        facade.agregarVenta(venta2);
//
//       
//        List<Venta> ventasDePedro = facade.buscarVentasPorUsuario(usuario);
//        assertNotNull(ventasDePedro);
//        assertFalse(ventasDePedro.isEmpty());
//        for (Venta v : ventasDePedro) {
//            assertEquals(usuario.getNombre(), v.getUsuarioEnTurno().getNombre());
//        }
//    }
//
//    @Test
//    public void testEliminarVenta() {
//        Usuario usuario = fabrica.getUsuarioDAO().findById(1);
//        Venta venta = new Venta(120.0f, 100.0f, Instant.now(),usuario);
//        Venta ventaGuardada = facade.agregarVenta(venta);
//
//        assertDoesNotThrow(() -> facade.eliminarVenta(ventaGuardada.getId()));
//
//        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
//            facade.buscarVentaPorId(ventaGuardada.getId());
//        });
//        assertTrue(exception.getMessage().contains("Venta no encontrada"));
//    }

}
