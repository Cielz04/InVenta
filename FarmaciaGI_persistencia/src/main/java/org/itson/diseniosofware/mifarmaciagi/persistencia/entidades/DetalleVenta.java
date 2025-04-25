/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jl4ma
 */
    @Entity
    @Table(name = "detalles_ventas")
    @Access(AccessType.FIELD)
    public class DetalleVenta implements Serializable {

       @jakarta.persistence.Id
        @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "precio_unitario", nullable = false)
        private Float precioUnitario;

        @Column(name = "importe", nullable = false)
        private Float importe;

        @Column(name = "cantidad", nullable = false)
        private Integer cantidad;

        @ManyToOne(optional = false, fetch = FetchType.LAZY)
        @JoinColumn(name = "id_venta")
        private Venta venta;

        @ManyToOne(optional = false, fetch = FetchType.LAZY)
        @JoinColumn(name = "id_producto")
        private Producto producto;

        public DetalleVenta() {
        }

        public DetalleVenta(Integer id) {
            this.id = id;
        }

        public DetalleVenta(Integer id, Float precioUnitario, Float importe, Integer cantidad) {
            this.id = id;
            this.precioUnitario = precioUnitario;
            this.importe = importe;
            this.cantidad = cantidad;
        }

    public DetalleVenta(Float precioUnitario, Float importe, Integer cantidad, Venta venta, Producto producto) {
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
        this.venta = venta;
        this.producto = producto;
    }

    public DetalleVenta(Integer id, Float precioUnitario, Float importe, Integer cantidad, Venta venta, Producto producto) {
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
        this.venta = venta;
        this.producto = producto;
    }

        // Getters y Setters

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Float getPrecioUnitario() {
            return precioUnitario;
        }

        public void setPrecioUnitario(Float precioUnitario) {
            this.precioUnitario = precioUnitario;
        }

        public Float getImporte() {
            return importe;
        }

        public void setImporte(Float importe) {
            this.importe = importe;
        }

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public Venta getVenta() {
            return venta;
        }

        public void setVenta(Venta venta) {
            this.venta = venta;
        }

        public Producto getProducto() {
            return producto;
        }

        public void setProducto(Producto producto) {
            this.producto = producto;
        }

        // Equals y hashCode (basado en ID)

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof DetalleVenta other)) return false;
            return Objects.equals(id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    
}
