
import Enums.TipoProducto;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.DetalleDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.EntradaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.LoteDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProveedoresDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.UsuarioDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.VentasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Compra;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Entrada;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Promocion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Proveedor;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jl4ma
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConexion conexion = new Conexion();

// Crear los DAOs
        PromocionesDAO promocionesDAO = new PromocionesDAO(conexion);
        ProductosDAO productosDAO = new ProductosDAO(conexion);
        LoteDAO loteDAO = new LoteDAO(conexion);
        EntradaDAO entradaDAO = new EntradaDAO(conexion);
        DetalleDAO detalleDAO = new DetalleDAO(conexion);
        ComprasDAO comprasDAO = new ComprasDAO(conexion);
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);
        ProveedoresDAO proveedorDAO = new ProveedoresDAO(conexion);
        VentasDAO ventaDAO = new VentasDAO(conexion);
        
        Lote l= loteDAO.findByProductoId_Last(1);
        System.out.println(l);
//        
//Producto producto = new Producto("Producto A", 100.0f, "P001");
//// --- 1. Crear y probar Promoción ---
//        Promocion promocion = new Promocion("PROMO001", "Descuento 10%", producto, 100,10.0f  );
//        promocionesDAO.save(promocion);
//
// --- 2. Crear y probar Usuario ---
//        Usuario usuarioVenta = new Usuario("Juan", 1234, "Vendedor", "Calle Falsa 123", "1234567890");
//        usuarioDAO.save(usuarioVenta);
//
//// --- 3. Crear y probar Producto ---
//        
//        productosDAO.save(producto);
//
//// --- 4. Crear y probar Proveedor ---
//        List<String> telefonosProveedor = new ArrayList<>();
//        telefonosProveedor.add("555-6789");
//        Proveedor proveedor = new Proveedor("Proveedor A", "Calle Proveedores 10", telefonosProveedor, "RFC123456");
//        proveedorDAO.save(proveedor);
//
//// --- 5. Crear y probar Lote (requiere producto) ---
//    Entrada entrada = new Entrada(java.time.Instant.now(), 200.0f);
//        Lote lote = new Lote(java.time.Instant.now(),100, producto, entrada);
//        loteDAO.save(lote);
//
//// --- 6. Crear y probar Entrada (simple, sin relaciones complejas) ---
//        
//        entradaDAO.save(entrada);
//
//// --- 7. Crear y probar Compra ---
//        Compra compra = new Compra("Compra001",producto, proveedor,500.0f,java.time.Instant.now());
//        comprasDAO.save(compra);
//
//// --- 8. Crear y probar Detalle de Venta (requiere producto) ---
//        Venta venta = new Venta(200.0f, 200.0f, java.time.Instant.now(), usuarioVenta);
//        DetalleVenta detalle = new DetalleVenta(200.0f,200.0f,2,venta,producto );
//        detalleDAO.save(detalle);
//
//// --- 9. Crear y probar Venta (requiere usuario, promociones y detalles) ---
//        
//        venta.setUsuarioEnTurno(usuarioVenta);
//        venta.setSubtotal(900.0f);
//        venta.setTotal(1000.0f);
//        venta.setFecha(java.time.Instant.now());
//
//        List<DetalleVenta> detallesVenta = new ArrayList<>();
//        detallesVenta.add(detalle);
//        venta.setDetallesVenta(detallesVenta);
//
//        List<Promocion> promociones = new ArrayList<>();
//        promociones.add(promocion);
//        venta.setPromociones(promociones);
//
//        ventaDAO.save(venta);
//
//// --- Pruebas de recuperación, actualización y eliminación opcionales ---
//        System.out.println("Venta guardada con ID: " + venta.getId());
//        Venta ventaEncontrada = ventaDAO.findById(venta.getId());
//        System.out.println("Venta encontrada: Total = " + ventaEncontrada.getTotal());
//
//// Actualizar total
//        ventaEncontrada.setTotal(1100.0f);
//        ventaDAO.update(ventaEncontrada);
//
//// Eliminar
//        ventaDAO.delete(ventaEncontrada.getId());
//        System.out.println("Venta eliminada.");

//        // Crear conexión a la base de datos
//        IConexion conexion = new Conexion();
//
//        // Crear los DAOs
//        PromocionesDAO promocionesDAO = new PromocionesDAO(conexion);
//        ProductosDAO productosDAO = new ProductosDAO(conexion);
//        LoteDAO loteDAO = new LoteDAO(conexion);
//        EntradaDAO entradaDAO = new EntradaDAO(conexion);
//        DetalleDAO detalleDAO = new DetalleDAO(conexion);
//        ComprasDAO comprasDAO = new ComprasDAO(conexion);
//        UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);
//        ProveedoresDAO proveedorDAO = new ProveedoresDAO(conexion);
//        VentasDAO ventaDAO = new VentasDAO(conexion);
//        
//        // --- Prueba de PromocionesDAO ---
//        System.out.println("=== Prueba de PromocionesDAO ===");
//
//        // Crear una nueva promoción
//        Promocion promocion = new Promocion("PROMO001", "Descuento 10%", 10.0f);
//        promocionesDAO.save(promocion);
//        System.out.println("Promoción guardada: " + promocion.getCodigo());
//
//        // Buscar una promoción por código
//        Promocion promocionEncontrada = promocionesDAO.findByCodigo("PROMO001");
//        System.out.println("Promoción encontrada: " + promocionEncontrada.getDescripcion());
//
//        // Actualizar promoción
//        promocionEncontrada.setDescripcion("Descuento 15%");
//        promocionesDAO.update(promocionEncontrada);
//        System.out.println("Promoción actualizada: " + promocionEncontrada.getDescripcion());
//
//        // Eliminar promoción
//        promocionesDAO.delete("PROMO001");
//        System.out.println("Promoción eliminada.");
//
//        // --- Prueba de ProductosDAO ---
//        System.out.println("\n=== Prueba de ProductosDAO ===");
//
//        // Crear un nuevo producto
//        Producto producto = new Producto("Producto A", 100.0f,"P001" );
//        productosDAO.save(producto);
//        System.out.println("Producto guardado: " + producto.getNombre());
//
//        // Buscar producto por ID
//        Producto productoEncontrado = productosDAO.findById(producto.getId());
//        System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
//
//        // Buscar producto por código
//        Producto productoPorCodigo = productosDAO.findByCodigo("P001");
//        System.out.println("Producto por código encontrado: " + productoPorCodigo.getNombre());
//
//        // Actualizar producto
//        productoEncontrado.setPrecio(120.0f);
//        productosDAO.update(productoEncontrado);
//        System.out.println("Producto actualizado: " + productoEncontrado.getPrecio());
//
//        // Eliminar producto
//        productosDAO.delete(productoEncontrado.getId());
//        System.out.println("Producto eliminado.");
//
//        // --- Prueba de LoteDAO ---
//        System.out.println("\n=== Prueba de LoteDAO ===");
//
//        // Crear un nuevo lote
//        Lote lote = new Lote(producto, 100, 50.0f);
//        loteDAO.save(lote);
//        System.out.println("Lote guardado.");
//
//        // Buscar lote por ID
//        Lote loteEncontrado = loteDAO.findById(lote.getId());
//        System.out.println("Lote encontrado: Producto = " + loteEncontrado.getProducto().getNombre());
//
//        // Eliminar lote
//        loteDAO.delete(lote.getId());
//        System.out.println("Lote eliminado.");
//
//        // --- Prueba de EntradaDAO ---
//        System.out.println("\n=== Prueba de EntradaDAO ===");
//
//        // Crear una nueva entrada
//        Entrada entrada = new Entrada(new Instant(), 200.0f);
//        entradaDAO.save(entrada);
//        System.out.println("Entrada guardada.");
//
//        // Buscar entrada por ID
//        Entrada entradaEncontrada = entradaDAO.findById(entrada.getId());
//        System.out.println("Entrada encontrada: " + entradaEncontrada.getCodigo());
//
//        // Eliminar entrada
//        entradaDAO.delete(entrada.getId());
//        System.out.println("Entrada eliminada.");
//
//        // --- Prueba de DetalleDAO ---
//        System.out.println("\n=== Prueba de DetalleDAO ===");
//
//        // Crear un nuevo detalle de venta
//        DetalleVenta detalle = new DetalleVenta(producto, 2, 200.0f);
//        detalleDAO.save(detalle);
//        System.out.println("Detalle de venta guardado.");
//
//        // Buscar detalle por ID
//        DetalleVenta detalleEncontrado = detalleDAO.findById(detalle.getId());
//        System.out.println("Detalle encontrado: Producto = " + detalleEncontrado.getProducto().getNombre());
//
//        // Eliminar detalle
//        detalleDAO.delete(detalle.getId());
//        System.out.println("Detalle eliminado.");
//
//        // --- Prueba de ComprasDAO ---
//        System.out.println("\n=== Prueba de ComprasDAO ===");
//
//        // Crear una nueva compra
//        Compra compra = new Compra("Compra001", 500.0f);
//        comprasDAO.save(compra);
//        System.out.println("Compra guardada.");
//
//        // Buscar compra por ID
//        Compra compraEncontrada = comprasDAO.findById(compra.getId());
//        System.out.println("Compra encontrada: " + compraEncontrada.getCodigo());
//
//        // Eliminar compra
//        comprasDAO.delete(compra.getId());
//        System.out.println("Compra eliminada.");
//
//        // --- Prueba de UsuarioDAO ---
//
//        // Crear un nuevo usuario
//        Usuario nuevoUsuario = new Usuario("Juan Pérez", 1234, "Administrador", "Calle Ficticia 123", "555-1234");
//        usuarioDAO.save(nuevoUsuario);
//        System.out.println("Usuario guardado: " + nuevoUsuario.getNombre());
//
//        // Buscar un usuario por ID
//        Usuario usuarioEncontrado = usuarioDAO.findById(nuevoUsuario.getId());
//        System.out.println("Usuario encontrado: " + usuarioEncontrado.getNombre());
//
//        // Actualizar usuario
//        usuarioEncontrado.setDireccion("Calle Nueva 456");
//        usuarioDAO.update(usuarioEncontrado);
//        System.out.println("Usuario actualizado: " + usuarioEncontrado.getDireccion());
//
//        // Eliminar usuario
//        usuarioDAO.delete(usuarioEncontrado.getId());
//        System.out.println("Usuario eliminado.");
//
//        // --- Prueba de ProveedorDAO ---
//
//        // Crear un nuevo proveedor
//        List<String> telefonosProveedor = new ArrayList<>();
//        telefonosProveedor.add("555-6789");
//        Proveedor proveedor = new Proveedor("Proveedor A", "Calle Proveedores 10", telefonosProveedor, "RFC123456");
//        proveedorDAO.save(proveedor);
//        System.out.println("Proveedor guardado: " + proveedor.getNombre());
//
//        // Buscar proveedor por ID
//        Proveedor proveedorEncontrado = proveedorDAO.findById(proveedor.getId());
//        System.out.println("Proveedor encontrado: " + proveedorEncontrado.getNombre());
//
//        // Actualizar proveedor
//        proveedorEncontrado.setDireccion("Calle Proveedores Actualizada 20");
//        proveedorDAO.update(proveedorEncontrado);
//        System.out.println("Proveedor actualizado: " + proveedorEncontrado.getDireccion());
//
//        // Eliminar proveedor
//        proveedorDAO.delete(proveedorEncontrado.getId());
//        System.out.println("Proveedor eliminado.");
//
        // --- Prueba de VentaDAO ---

        // Crear una nueva venta
//        Venta venta = new Venta();
//        venta.setTotal(1000.0f);
//        venta.setSubtotal(900.0f);
//        venta.setFecha(java.time.Instant.now());
//
//        // Suponiendo que ya tienes un usuario y detalles de venta creados
//        List<DetalleVenta> detallesVenta = new ArrayList<>(); // Crear detalles de venta
//        List<Promocion> promociones = new ArrayList<>(); // Asignar promociones
//        Usuario usuarioVenta = new Usuario("Maria Gómez", 5678, "Vendedor", "Calle Vendedores 789", "555-2345"); // Crear un usuario de venta
//        venta.setUsuarioEnTurno(usuarioVenta);
//        venta.setDetallesVenta(detallesVenta);
//        venta.setPromociones(promociones);
//
//        // Guardar la venta
//        ventaDAO.save(venta);
//        System.out.println("Venta guardada con ID: " + venta.getId());
//
//        // Buscar venta por ID
//        Venta ventaEncontrada = ventaDAO.findById(venta.getId());
//        System.out.println("Venta encontrada: Total = " + ventaEncontrada.getTotal());
//
//        // Actualizar venta
//        ventaEncontrada.setTotal(1100.0f);
//        ventaDAO.update(ventaEncontrada);
//        System.out.println("Venta actualizada: Total = " + ventaEncontrada.getTotal());
//
//        // Eliminar venta
//        ventaDAO.delete(ventaEncontrada.getId());
//        System.out.println("Venta eliminada.");
//        Usuario usuario = new Usuario("Pedro", 1234, "Vendedor", "Calle Estrella", "5555555555");
//
//        Producto p = new Producto("coca", "cola", 15.22F, "12345", TipoProducto.Variado);
//        
//        Producto busca =productosDAO.findByCodigo(p.getCodigo());
//        Lote l = new Lote(0, Instant.now(), 100, busca);
//        loteDAO.save(l);
   }

}
