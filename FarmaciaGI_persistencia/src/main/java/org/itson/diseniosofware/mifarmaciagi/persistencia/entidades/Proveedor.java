package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @ElementCollection
    @CollectionTable(name = "proveedor_telefonos", joinColumns = @JoinColumn(name = "proveedor_id"))
    @Column(name = "telefono")
    private List<String> telefonos;

    @Column(nullable = false, unique = true)
    private String rfc;

    /**
     * Constructor por defecto de la clase Proveedor.
     */
    public Proveedor() {
    }

    /**
     * Constructor con parámetros de la clase Proveedor.
     * @param nombre Nombre del proveedor.
     * @param direccion Dirección del proveedor.
     * @param telefonos Lista de teléfonos del proveedor.
     * @param rfc Registro Federal de Contribuyentes del proveedor.
     */
    public Proveedor(String nombre, String direccion, List<String> telefonos, String rfc) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.rfc = rfc;
    }

    /**
     * Obtiene el identificador único del proveedor.
     * @return El identificador único del proveedor.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el identificador único del proveedor.
     * @param id El identificador único del proveedor a establecer.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del proveedor.
     * @return El nombre del proveedor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proveedor.
     * @param nombre El nombre del proveedor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del proveedor.
     * @return La dirección del proveedor.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del proveedor.
     * @param direccion La dirección del proveedor a establecer.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la lista de teléfonos del proveedor.
     * @return La lista de teléfonos del proveedor.
     */
    public List<String> getTelefonos() {
        return telefonos;
    }

    /**
     * Establece la lista de teléfonos del proveedor.
     * @param telefonos La lista de teléfonos del proveedor a establecer.
     */
    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    /**
     * Obtiene el Registro Federal de Contribuyentes (RFC) del proveedor.
     * @return El RFC del proveedor.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el Registro Federal de Contribuyentes (RFC) del proveedor.
     * @param rfc El RFC del proveedor a establecer.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Devuelve una representación en forma de cadena de caracteres de la instancia Proveedor.
     * @return Una cadena que representa la instancia Proveedor.
     */
    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefonos=" + telefonos +
                ", rfc='" + rfc + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, telefonos, rfc);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Proveedor proveedor = (Proveedor) obj;
        return Objects.equals(id, proveedor.id) &&
               Objects.equals(nombre, proveedor.nombre) &&
               Objects.equals(direccion, proveedor.direccion) &&
               Objects.equals(telefonos, proveedor.telefonos) &&
               Objects.equals(rfc, proveedor.rfc);
    }
}
