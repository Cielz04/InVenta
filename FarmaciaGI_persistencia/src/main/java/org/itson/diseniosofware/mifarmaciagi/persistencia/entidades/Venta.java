/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Float total;
    @Column(nullable = false)
    private Float subtotal;
    @Column(nullable = false)
    private Instant fecha;

    // Relación con Usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuarioEnTurno;

    // Relación con DetalleVenta (cada producto vendido)
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta> detallesVenta; // Inicializado

    // Relación con Promociones (muchas a muchas)
    @ManyToMany
    @JoinTable(
            name = "venta_promocion",
            joinColumns = @JoinColumn(name = "venta_id"),
            inverseJoinColumns = @JoinColumn(name = "promocion_id")
    )
    private List<Promocion> promociones = new ArrayList<>(); // Inicializado

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

    public Venta(Integer id, Float total, Float subtotal, Instant fecha, Usuario usuarioEnTurno) {
        this.id = id;
        this.total = total;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
    }

    public Venta(Float total, Float subtotal, Instant fecha, Usuario usuarioEnTurno) {
        this.total = total;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
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

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", total=" + total + ", subtotal=" + subtotal + ", fecha=" + fecha + ", usuarioEnTurno=" + usuarioEnTurno + ", detallesVenta=" + detallesVenta + ", promociones=" + promociones + '}';
    }
    

}
