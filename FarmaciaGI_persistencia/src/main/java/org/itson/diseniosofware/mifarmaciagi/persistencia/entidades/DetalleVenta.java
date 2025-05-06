/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "detalles_ventas")
public class DetalleVenta implements Serializable {

  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name = "producto_id")
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

    public DetalleVenta(Float precioUnitario, Float importe, Integer cantidad, Venta venta) {
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
        this.venta = venta;
    }

    public DetalleVenta(Float precioUnitario, Float importe, Integer cantidad, Venta venta, Producto producto) {
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

    public Producto getProductos() {
        return producto;
    }

    public void setProductos(Producto producto) {
        this.producto = producto;
    }

    // Equals y hashCode (basado en ID)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetalleVenta other)) {
            return false;
        }
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "id=" + id + ", precioUnitario=" + precioUnitario + ", importe=" + importe + ", cantidad=" + cantidad + ", venta=" + venta + ", producto=" + producto + '}';
    }

    
}
