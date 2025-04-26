/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import Enums.TipoProducto;
import basura.Lote2;
import basura.DetalleVenta2;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
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
@Table(name = "productos")
public class Producto implements Serializable {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private Float precio;

    @Column(unique = true)
    private String codigo;

    @Column(nullable = false)
    private TipoProducto tipo;

    // Relación con Lote
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Lote2> lotes = new LinkedList<>();

    // Relación con DetalleVenta
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DetalleVenta2> detallesVenta = new LinkedList<>();

    @Transient
    private LinkedList<Integer> id_proveedores;

    public Producto() {
    }

    public Producto(Integer id) {
        this.id = id;
    }

    public Producto(String nombre, Float precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public Producto(String nombre, String marca, Float precio, String codigo, TipoProducto tipo) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = codigo;
        this.tipo = tipo;
    }
    
    

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public List<Lote2> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote2> lotes) {
        this.lotes = lotes;
    }

    public List<DetalleVenta2> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta2> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public LinkedList<Integer> getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(LinkedList<Integer> id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    // Opcionales: equals y hashCode si lo vas a usar en colecciones

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, marca, precio, codigo, tipo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto other = (Producto) obj;
        return Objects.equals(id, other.id);
    }

    public Producto(String nombre, String marca, Float precio, String codigo, TipoProducto tipo, LinkedList<Integer> id_proveedores) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = codigo;
        this.tipo = tipo;
        this.id_proveedores = id_proveedores;
    }
    
}
