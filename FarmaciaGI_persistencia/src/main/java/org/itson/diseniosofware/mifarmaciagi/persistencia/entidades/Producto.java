/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import Enums.TipoProducto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jl4ma
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private Float precio;

    @Column(unique = true)
    private String codigo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoProducto tipo;


    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetalleVenta> detalleVenta = new LinkedList<>();

    @Transient
    private LinkedList<Integer> id_proveedores;

    public Producto() {
    }

    public Producto(Integer id) {
        this.id = id;
    }

    public Producto(String codigo) {
        this.codigo = codigo;
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", codigo=" + codigo + ", tipo=" + tipo + ", detalleVenta=" + detalleVenta + ", id_proveedores=" + id_proveedores + '}';
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
