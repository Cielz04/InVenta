package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

/**
 *
 * @author Enrique Rodriguez
 */
public class Usuario {
    private Integer id;
    private String nombre;
    private Integer codigo;
    private String tipo;
    private String direccion;
    private String telefono;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
    
    
}
