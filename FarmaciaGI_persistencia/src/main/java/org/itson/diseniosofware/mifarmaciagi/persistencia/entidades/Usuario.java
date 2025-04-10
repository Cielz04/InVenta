package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private Integer codigo;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    @OneToMany(mappedBy = "usuarioEnTurno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Venta> ventas;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nombre, int codigo, String tipo, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
