package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import java.util.List;
import java.util.Objects;

public class Proveedor {
    private Integer id;
    private String nombre;
    private String direccion;
    private List<String> telefonos;
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
     * @param _id El identificador único del proveedor a establecer.
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
        StringBuilder sb = new StringBuilder();
        sb.append("Proveedor{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefonos=").append(telefonos);
        sb.append(", rfc=").append(rfc);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.direccion);
        hash = 97 * hash + Objects.hashCode(this.telefonos);
        hash = 97 * hash + Objects.hashCode(this.rfc);
        return hash;
    }

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
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.rfc, other.rfc)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return Objects.equals(this.telefonos, other.telefonos);
    }


    
    

}
