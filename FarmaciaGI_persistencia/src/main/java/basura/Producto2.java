package basura;

import basura.Lote2;
import basura.DetalleVenta2;
import jakarta.persistence.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "productos")
public class Producto2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private Float precio;

    @Column(unique = true)
    private String codigo;

    @Column(nullable = false)
    private String tipo;

    // Relación con Lote
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Lote2> lotes = new LinkedList<>();

    // Relación con DetalleVenta
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DetalleVenta2> detallesVenta = new LinkedList<>();

    @Transient
    private LinkedList<Integer> id_proveedores;

    public Producto2() {
    }

    public Producto2(Integer id) {
        this.id = id;
    }

    public Producto2(String nombre, Float precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public Producto2(String nombre, String marca, Float precio, String codigo, String tipo) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    // Getters y Setters

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

    public List<Lote2> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote2> lotes) {
        this.lotes = lotes;
    }

    public List<DetalleVenta2> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta2> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public LinkedList<Integer> getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(LinkedList<Integer> id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    // Opcionales: equals y hashCode si lo vas a usar en colecciones

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, marca, precio, codigo, tipo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto2)) return false;
        Producto2 other = (Producto2) obj;
        return Objects.equals(id, other.id);
    }
}
