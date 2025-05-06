/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;



/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "lotes")
public class Lote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Instant caducidad;

    @Column(nullable = false)
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @OneToMany(mappedBy = "lote", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Entrada> entradas;

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

    public Lote(Instant caducidad, Integer cantidad, Producto producto, List<Entrada> entradas) {
        this.caducidad = caducidad;
        this.cantidad = cantidad;
        this.producto = producto;
        this.entradas = entradas;
    }

    public Lote(Integer id, Instant caducidad, Integer cantidad, Producto producto) {
        this.id = id;
        this.caducidad = caducidad;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Lote(Instant caducidad, Integer cantidad, Producto producto) {
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

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }  
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lote other)) {
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
        return "Lote{" + "id=" + id + ", caducidad=" + caducidad + ", cantidad=" + cantidad + ", producto=" + producto + ", entradas=" + entradas + '}';
    }
    
    

}
