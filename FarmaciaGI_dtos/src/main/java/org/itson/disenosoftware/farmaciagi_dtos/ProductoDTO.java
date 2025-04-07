package org.itson.disenosoftware.farmaciagi_dtos;

import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Objects;

public class ProductoDTO {

    private String codigo;
    private String nombre;
    private Float precio;
    private String marca;
    private LinkedList<String> id_proveedores;

    /**
     * Constructor.
     */
    public ProductoDTO() {
    }

    /**
     * Constructor que recibe el código, nombre y precio del producto.
     *
     * @param codigo El código del producto
     * @param nombre El nombre del producto
     * @param precio El precio del producto
     */
    public ProductoDTO(String codigo, String nombre, Float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Constructor que recibe el código, nombre, costro y marca del producto.
     *
     * @param codigo El código del producto
     * @param nombre El nombre del producto
     * @param precio El precio del producto
     * @param marca La marca del producto
     */
    public ProductoDTO(String codigo, String nombre, Float precio, String marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    /**
     * Permite obtener el código del producto.
     *
     * @return El código del producto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Permite establecer el código del producto
     *
     * @param codigo El código del producto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Permite obtener el nombre del producto.
     *
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite establecer el nombre del producto.
     *
     * @param nombre El nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el precio del producto.
     *
     * @return El precio del producto
     */
    public Float getprecio() {
        return precio;
    }

    /**
     * Permite establecer el precio del producto.
     *
     * @param precio El precio del producto
     */
    public void setprecio(Float precio) {
        this.precio = precio;
    }

    /**
     * Permite obtener la marca del producto.
     *
     * @return La marca del producto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Permite establecer la marca del producto.
     *
     * @param marca La marca del producto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public LinkedList<String> getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(LinkedList<String> id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    /**
     * Permite obtener un código hash que representa este producto.
     *
     * @return El código hash del producto
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    /**
     * Permite comparar una promoción con otra y saber si son la misma
     * promoción.
     *
     * @param obj La promoción con la que se comparará
     * @return true si se trata de la misma promoción, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return nombre + ", " + marca + ", " + NumberFormat.getCurrencyInstance().format(precio);
    }

}
