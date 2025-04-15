package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "compras")
@Access(AccessType.FIELD)
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    @Column(name = "costo_total")
    private Float costoTotal;

    @Column(name = "fecha")
    private Instant fecha;

    public Compra() {
    }

    public Compra(String codigo, Producto producto, Proveedor proveedor, Float costoTotal, Instant fecha) {
        this.codigo = codigo;
        this.producto = producto;
        this.proveedor = proveedor;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", producto=" + producto +
                ", proveedor=" + proveedor +
                ", costoTotal=" + costoTotal +
                ", fecha=" + fecha +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, proveedor, costoTotal, fecha);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Compra other = (Compra) obj;
        return Objects.equals(producto, other.producto) &&
               Objects.equals(proveedor, other.proveedor) &&
               Objects.equals(costoTotal, other.costoTotal) &&
               Objects.equals(fecha, other.fecha);
    }
}
