/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.farmaciagi_dtos;

import java.util.Date;

/**
 *
 * @author Enrique Rodriguez
 */
public class ProductoVariadoDTO {
   private Float precio;
   private Date caducidad;
   private String tipo;
   private String nombre;
   private String marca;
   
    public ProductoVariadoDTO() {
    }

    public ProductoVariadoDTO(Float precio, Date caducidad, String tipo, String nombre, String marca) {
        this.precio = precio;
        this.caducidad = caducidad;
        this.tipo = tipo;
        this.nombre = nombre;
        this.marca = marca;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
   
}
