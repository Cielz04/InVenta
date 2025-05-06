/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.farmaciagi_subsitemagestorventa;

import BO.GestorVenta;
import BO.IGestorVenta;
import Enums.TipoProducto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;
import org.itson.disenosoftware.farmaciagi_dtos.DetalleVentaDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;
import org.itson.disenosoftware.farmaciagi_dtos.VentaDTO;

/**
 *
 * @author Dell
 */
public class FarmaciaGI_SubsitemaGestorVenta {

    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MiFarmaciaGI");
//        EntityManager em = emf.createEntityManager();
//        TipoProducto tipo = TipoProducto.Medicamento;
//
//        try {
//            em.getTransaction().begin();
//
//            // 1. Crear un usuario
//            Usuario usuario = new Usuario();
//            usuario.setNombre("Juan Pérez");
//            usuario.setCodigo(1001);
//            usuario.setTipo("Vendedor");
//            usuario.setDireccion("Av. Central #456");
//            usuario.setTelefono("12345678");
//            em.persist(usuario);
//
//            // 2. Crear un producto
//            Producto producto = new Producto();
//            producto.setNombre("Ibuprofeno");
//            producto.setMarca("Genérico");
//            producto.setCodigo("IBU100");
//            producto.setPrecio(25f);
//            producto.setTipo(tipo);
//            em.persist(producto);
//
//            // 3. Crear un lote para ese producto
//            Lote lote = new Lote();
//            lote.setCantidad(100);
//            lote.setCaducidad(Instant.now());
//            lote.setProducto(producto);
//            em.persist(lote);
//
//            // 4. Crear la venta
//            Venta venta = new Venta();
//            venta.setFecha(Instant.now());
//            venta.setUsuarioEnTurno(usuario);
//
//            // NUEVO: Calcula subtotal y total
//            float subtotal = producto.getPrecio() * 2; // O depende de los productos que vendas
//            float total = subtotal; // Si no tienes impuestos ni descuentos todavía
//
//            venta.setSubtotal(subtotal);
//            venta.setTotal(total);
//
//            em.persist(venta);
//
//            // 5. Crear un detalle de venta
//            DetalleVenta detalle = new DetalleVenta();
//            detalle.setVenta(venta);
//            detalle.setProductos(producto);
//            detalle.setCantidad(2);
//            detalle.setPrecioUnitario(producto.getPrecio());
//            detalle.setImporte(producto.getPrecio() * 2);
//            em.persist(detalle);
//
//            // Relacionar detalle con venta
//            List<DetalleVenta> detalles = new ArrayList<>();
//            detalles.add(detalle);
//            venta.setDetallesVenta(detalles);
//            em.merge(venta);
//
//            em.getTransaction().commit();
//
//            System.out.println("✅ Venta registrada con éxito.");
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
    }
}
