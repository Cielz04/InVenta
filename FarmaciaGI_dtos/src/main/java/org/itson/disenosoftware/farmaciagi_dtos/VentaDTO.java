package org.itson.disenosoftware.farmaciagi_dtos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class VentaDTO {

    private Integer id;

    private Float total;

    private Float subtotal;

    private Instant fecha;

    private UsuarioDTO usuarioEnTurno;

    private List<DetalleVentaDTO> detallesVenta = new ArrayList<>();

    private List<PromocionDTO> promociones; // Inicializado

    public VentaDTO() {
    }

    public VentaDTO(Instant fecha, UsuarioDTO usuarioEnTurno) {
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
    }
    
    

    public VentaDTO(Integer id, Float total, Float subtotal, Instant fecha, UsuarioDTO usuarioEnTurno, List<DetalleVentaDTO> detallesVenta) {
        this.id = id;
        this.total = total;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
        this.detallesVenta = detallesVenta;
    }

    public List<DetalleVentaDTO> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVentaDTO> detallesVenta) {
        this.detallesVenta = detallesVenta;
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

    public UsuarioDTO getUsuarioEnTurno() {
        return usuarioEnTurno;
    }

    public void setUsuarioEnTurno(UsuarioDTO usuarioEnTurno) {
        this.usuarioEnTurno = usuarioEnTurno;
    }

    public List<PromocionDTO> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<PromocionDTO> promociones) {
        this.promociones = promociones;
    }

}
