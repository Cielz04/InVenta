package basura;

import basura.Usuario2;
import basura.Promocion2;
import basura.DetalleVenta2;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Float total;

    private Float subtotal;

    private Instant fecha;

    // Relación con Usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario2 usuarioEnTurno;

    // Relación con DetalleVenta (cada producto vendido)
    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta2> detallesVenta = new ArrayList<>(); // Inicializado

    // Relación con Promociones (muchas a muchas)
    @ManyToMany
    @JoinTable(
        name = "venta_promocion",
        joinColumns = @JoinColumn(name = "venta_id"),
        inverseJoinColumns = @JoinColumn(name = "promocion_id")
    )
    private List<Promocion2> promociones = new ArrayList<>(); // Inicializado

    public Venta2() {
    }

    public Venta2(Integer id) {
        this.id = id;
    }

    public Venta2(Integer id, Float total, Float subtotal, Instant fecha, Usuario2 usuarioEnTurno,
                 List<DetalleVenta2> detallesVenta, List<Promocion2> promociones) {
        this.id = id;
        this.total = total;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.usuarioEnTurno = usuarioEnTurno;
        this.detallesVenta = detallesVenta;
        this.promociones = promociones;
    }

    // Getters y Setters...

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

    public Usuario2 getUsuarioEnTurno() {
        return usuarioEnTurno;
    }

    public void setUsuarioEnTurno(Usuario2 usuarioEnTurno) {
        this.usuarioEnTurno = usuarioEnTurno;
    }

    public List<DetalleVenta2> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta2> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public List<Promocion2> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion2> promociones) {
        this.promociones = promociones;
    }
}
