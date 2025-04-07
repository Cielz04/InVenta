package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Float total;

    private Float subtotal;

    private Instant fecha;

    // Relación con Usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuarioEnTurno;

    // Relación con DetalleVenta (cada producto vendido)
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta> detallesVenta;

    // Relación con Promociones (muchas a muchas)
    @ManyToMany
    @JoinTable(
        name = "venta_promocion",
        joinColumns = @JoinColumn(name = "venta_id"),
        inverseJoinColumns = @JoinColumn(name = "promocion_id")
    )
    private List<Promocion> promociones;

    public Venta() {
    }

    public Venta(Integer id) {
        this.id = id;
    }

    public Venta(Integer id, Float total, Float subtotal, Instant fecha, Usuario usuarioEnTurno,
                 List<DetalleVenta> detallesVenta, List<Promocion> promociones) {
        this.id = id;
        this.total = total;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
        this.detallesVenta = detallesVenta;
        this.promociones = promociones;
    }

    // Getters y Setters...

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuarioEnTurno() {
        return usuarioEnTurno;
    }

    public void setUsuarioEnTurno(Usuario usuarioEnTurno) {
        this.usuarioEnTurno = usuarioEnTurno;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }
}
