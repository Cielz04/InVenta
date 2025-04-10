package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

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

    @Column(nullable = false)
    private String tipo;

    // Relación con Lote
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lote> lotes = new LinkedList<>();

    // Relación con DetalleVenta
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta> detallesVenta = new LinkedList<>();

    // No mapeado como relación por ahora, solo si decides implementar Proveedor como entidad
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

    public Producto(String nombre, String marca, Float precio, String codigo, Integer cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = codigo;
    }

    // Getters y Setters...

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public LinkedList<Integer> getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(LinkedList<Integer> id_proveedores) {
        this.id_proveedores = id_proveedores;
    }
}
