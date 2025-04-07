package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "lotes")
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Instant caducidad;

    @Column(nullable = false)
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entrada_id", nullable = false)
    private Entrada entrada;

    public Lote() {
    }

    public Lote(Integer id) {
        this.id = id;
    }

    public Lote(Integer id, Instant caducidad, Integer cantidad) {
        this.id = id;
        this.caducidad = caducidad;
        this.cantidad = cantidad;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
}
