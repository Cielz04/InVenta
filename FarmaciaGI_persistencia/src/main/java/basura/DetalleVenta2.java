package basura;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalle_venta")
@Access(AccessType.FIELD)
public class DetalleVenta2 {

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
    private Venta2 venta;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto2 producto;

    public DetalleVenta2() {
    }

    public DetalleVenta2(Integer id) {
        this.id = id;
    }

    public DetalleVenta2(Integer id, Float precioUnitario, Float importe, Integer cantidad) {
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
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

    public Venta2 getVenta() {
        return venta;
    }

    public void setVenta(Venta2 venta) {
        this.venta = venta;
    }

    public Producto2 getProducto() {
        return producto;
    }

    public void setProducto(Producto2 producto) {
        this.producto = producto;
    }

    // Equals y hashCode (basado en ID)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DetalleVenta2 other)) return false;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
