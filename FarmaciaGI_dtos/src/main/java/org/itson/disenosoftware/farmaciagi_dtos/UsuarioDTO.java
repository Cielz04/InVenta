/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.farmaciagi_dtos;

/**
 *
 * @author Enrique Rodriguez
 */
public class UsuarioDTO {
    private Integer id;
    private String nombre;
    private Integer codigo;
    private String tipo;
    private String direccion;
    private String telefono;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Integer id) {
        this.id = id;
    }

    
    public UsuarioDTO(String nombre, Integer codigo, String tipo, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public UsuarioDTO(Integer id, String nombre, Integer codigo, String tipo, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", tipo=" + tipo + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
