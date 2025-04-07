package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

/**
 *
 * @author Enrique Rodriguez
 */
public class DetalleVenta {
    private Integer id;
    private Float precioUnitario;
    private Float importe;
    private Integer cantidad;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id) {
        this.id = id;
    }

    public DetalleVenta(Integer id, Float precioUnitario, Float importe, Integer cantidad) {
        this.id = id;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.cantidad = cantidad;
    }

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
    
    
}
