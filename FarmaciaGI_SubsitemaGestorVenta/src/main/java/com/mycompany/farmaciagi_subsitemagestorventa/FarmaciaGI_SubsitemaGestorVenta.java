/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farmaciagi_subsitemagestorventa;

import BO.GestorVenta;
import BO.IGestorVenta;
import java.time.Instant;
import java.util.List;
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

        try {
            // Instancia del gestor
            IGestorVenta gestorVenta = new GestorVenta();

            // Crear un DetalleVentaDTO falso
            DetalleVentaDTO detalleVentaDTO = new DetalleVentaDTO();
            detalleVentaDTO.setCantidad(2);
            detalleVentaDTO.setImporte(200.0f);
            detalleVentaDTO.setPrecioUnitario(100.0f);
            detalleVentaDTO.setProducto(new ProductoDTO(1)); // Asegúrate que el producto con ID 1 exista en tu base

            // Crear la VentaDTO
            VentaDTO ventaDTO = new VentaDTO();
            ventaDTO.setId(1);
            ventaDTO.setFecha(Instant.now());
            ventaDTO.setSubtotal(200.0f);
            ventaDTO.setTotal(200.0f);
            ventaDTO.setUsuarioEnTurno(new UsuarioDTO(1)); // Asegúrate que el usuario con ID 1 exista en tu base

            // 1. Agregar venta
            VentaDTO ventaAgregada = gestorVenta.agregarVenta(ventaDTO);
            System.out.println("Venta agregada con ID: " + ventaAgregada.getId());

            // 2. Buscar venta por ID
            VentaDTO ventaBuscada = gestorVenta.buscarVentaPorId(ventaAgregada.getId());
            System.out.println("Venta encontrada: ID = " + ventaBuscada.getId() + ", Total = " + ventaBuscada.getTotal());

            // 3. Listar todas las ventas
            List<VentaDTO> ventas = gestorVenta.buscarTodasLasVentas();
            System.out.println("Lista de todas las ventas:");
            for (VentaDTO venta : ventas) {
                System.out.println("Venta ID: " + venta.getId() + " | Total: " + venta.getTotal() + " | Fecha: " + venta.getFecha());
            }

        } catch (Exception e) {
            System.out.println("Error en la prueba: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
