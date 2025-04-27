/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.farmaciagi_dtos;

import java.time.Instant;

/**
 *
 * @author Dell
 */
public class LoteDTO {
    private Integer id;

    private Instant caducidad;

    private Integer cantidad;

    private ProductoDTO producto;

    public LoteDTO() {
    }

    public LoteDTO(Instant caducidad, Integer cantidad, ProductoDTO producto) {
        this.caducidad = caducidad;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Instant caducidad) {
        this.caducidad = caducidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }
    
    
}
