package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "precio_unitario", nullable = false)
    private Float precioUnitario;

    @Column(name = "importe", nullable = false)
    private Float importe;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    // Relación con Venta (muchos a uno)
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_venta")
    private Venta venta;

    // Relación con Producto (muchos a uno)
    @ManyToOne(optional = false)
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

    // Getters y setters

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

    // Equals y hashCode

    @Override
    public int hashCode() {
        return Objects.hash(id, precioUnitario, importe, cantidad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DetalleVenta)) return false;
        DetalleVenta other = (DetalleVenta) obj;
        return Objects.equals(id, other.id);
    }
}
