package org.itson.disenosoftware.farmaciagi_dtos;

import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class VentaDTO {

    private Integer id;
    private Float total;
    private String codigo;
    private Float subtotal;
    private Instant fecha;
    private UsuarioDTO usuarioEnTurno;
    private List<DetalleVentaDTO> detallesVenta;
    private List<PromocionDTO> promociones;

    public VentaDTO() {
    }
    
    /**
     * Constructor que recibe el código de la venta.
     *
     * @param codigo El código de la venta
     */
    public VentaDTO(String codigo) {
        this.codigo = codigo;
        this.detallesVenta = new LinkedList<>();
        this.total = 0.0F;
        this.fecha = null;
    }

    /**
     * Constructor que recibe el código, la lista de productos, el total y la
     * fecha de la venta.
     *
     * @param codigo El código de la venta
     * @param productos La lista de productos de la venta
     * @param total El total de la venta
     * @param fecha La fecha de la venta
     */
    public VentaDTO(String codigo, List<DetalleVentaDTO> detallesVenta, Float total, Instant fecha) {
        this.codigo = codigo;
        this.detallesVenta = detallesVenta;
        this.total = total;
        this.fecha = fecha;
    }

    /**
     * Constructor que recibe el código, la lista de productos, el total y la
     * fecha de la venta.
     *
     * @param codigo El código de la venta
     * @param productos La lista de productos de la venta
     * @param promociones La lista de promociones
     * @param total El total de la venta
     * @param fecha La fecha de la venta
     */
    public VentaDTO(String codigo, List<DetalleVentaDTO> detallesVenta, List<PromocionDTO> promociones, Float total, Instant fecha) {
        this.codigo = codigo;
        this.detallesVenta = detallesVenta;
        this.promociones = promociones;
        this.total = total;
        this.fecha = fecha;
    }

    public VentaDTO(Integer id, Float total, String codigo, Float subtotal, Instant fecha, UsuarioDTO usuarioEnTurno, List<DetalleVentaDTO> detallesVenta, List<PromocionDTO> promociones) {
        this.id = id;
        this.total = total;
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
        this.detallesVenta = detallesVenta;
        this.promociones = promociones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

    /**
     * Permite obtener el código de la venta.
     *
     * @return El código de la venta
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Permite obtener la lista de productos de la venta.
     *
     * @return La lista de productos de la venta
     */
    public List<DetalleVentaDTO> getDetalleVenta() {
        return detallesVenta;
    }

    /**
     * Permite obtener la lista de promociones de la venta.
     *
     * @return La lista de promociones de la venta
     */
    public List<PromocionDTO> getPromociones() {
        return promociones;
    }

    /**
     * Permite establecer la lista de promociones de la venta.
     *
     * @param promociones La lista de promociones de la venta
     */
    public void setPromociones(List<PromocionDTO> promociones) {
        this.promociones = promociones;
    }

    /**
     * Permite obtener el total de la venta.
     *
     * @return El total de la venta
     */
    public Float getTotal() {
        return total;
    }

    /**
     * Permite obtener la fecha de la venta.
     *
     * @return La fecha de la venta
     */
    public Instant getFecha() {
        return fecha;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public UsuarioDTO getUsuarioEnTurno() {
        return usuarioEnTurno;
    }

    public void setUsuarioEnTurno(UsuarioDTO usuarioEnTurno) {
        this.usuarioEnTurno = usuarioEnTurno;
    }

    

    /**
     * Permite obtener un código hash de la venta.
     *
     * @return El código hash de la venta
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    /**
     * Permite saber si dos ventas son iguales.
     *
     * @param obj La venta con la que se comparará
     * @return true si se trata de la misma venta, false en caso contrario
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
        final VentaDTO other = (VentaDTO) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

}
