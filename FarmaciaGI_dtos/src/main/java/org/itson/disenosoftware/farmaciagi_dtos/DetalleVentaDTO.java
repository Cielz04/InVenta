/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.farmaciagi_dtos;

/**
 *
 * @author Dell
 */
public class DetalleVentaDTO {

    private Integer id;

    private Float precioUnitario;

    private Float importe;

    private Integer cantidad;

    private VentaDTO venta;

    private ProductoDTO producto;

    public DetalleVentaDTO() {
    }

    public DetalleVentaDTO(Integer id) {
        this.id = id;
    }

    public DetalleVentaDTO(Integer id, Float precioUnitario, Float importe, Integer cantidad) {
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
    }

    public DetalleVentaDTO(Float precioUnitario, Float importe, Integer cantidad, VentaDTO venta, ProductoDTO producto) {
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
        this.venta = venta;
        this.producto = producto;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public VentaDTO getVenta() {
        return venta;
    }

    public void setVenta(VentaDTO venta) {
        this.venta = venta;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }
}
