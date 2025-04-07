package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import java.time.Instant;
import java.util.List;

public class Venta {

    private Integer id;
    private Float total; //Costo total de la venta
    private List<Producto> productos; //Lista de productos de la venta
    private Float subtotal;
    private Instant fecha;
    private Usuario usuarioEnTurno;
    private List<Promocion> promociones; //Lista de promociones de la venta

    /**
     * Constructor vacio
     */
    public Venta() {
    }

    public Venta(Integer id) {
        this.id = id;
    }

    public Venta(Integer id, Float total, List<Producto> productos, Float subtotal, Instant fecha, Usuario usuarioEnTurno, List<Promocion> promociones) {
        this.id = id;
        this.total = total;
        this.productos = productos;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
        this.promociones = promociones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuarioEnTurno() {
        return usuarioEnTurno;
    }

    public void setUsuarioEnTurno(Usuario usuarioEnTurno) {
        this.usuarioEnTurno = usuarioEnTurno;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    

}
