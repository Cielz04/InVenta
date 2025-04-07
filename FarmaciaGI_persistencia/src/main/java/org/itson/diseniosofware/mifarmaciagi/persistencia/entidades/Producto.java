package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import java.util.LinkedList;
import org.bson.types.ObjectId;

/**
 *
 * @author Hector Espinoza
 */
public class Producto {

    private Integer id; //id del producto
    private String nombre; //nombre del producto
    private String marca; //marca del producto
    private Float precio; //precio del producto
    private String codigo; //codigo del producto
    private String tipo; //Tipo del producto 
    private LinkedList <ObjectId> id_proveedores; //proveedores que suministtran el producto

    
    
    /**
     * Constructor default de un objeto tipo producto
     */
    public Producto() {
    }

    public Producto(Integer id) {
        this.id = id;
    }
    
    /**
     * Constructor que recibe el nombre, el precio y el código del producto.
     *
     * @param nombre El nombre del producto
     * @param precio El precio del producto
     * @param codigo El código del producto
     */
    public Producto(String nombre, Float precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    /**
     * Constructor que recibe el nombre, la marca, el precio, el código y la
     * cantidad del producto.
     *
     * @param nombre El nombre del producto
     * @param marca La marca del producto
     * @param precio El precio del producto
     * @param codigo El código del producto
     * @param cantidad La cantidad del producto
     */
    public Producto(String nombre, String marca, Float precio, String codigo, Integer cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = codigo;

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

    public LinkedList<ObjectId> getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(LinkedList<ObjectId> id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    
 
}
