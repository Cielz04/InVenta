package org.itson.diseniosofware.mifarmaciagi.persistencia.entidades;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "entradas")
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Instant fecha;

    @Column(nullable = false)
    private Float total;

    public Entrada() {
    }

    public Entrada(Integer id) {
        this.id = id;
    }

    public Entrada(Integer id, Instant fecha, Float total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    // Opcionales: equals y hashCode si planeas comparar objetos o usarlos en colecciones

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, total);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Entrada)) return false;
        Entrada other = (Entrada) obj;
        return Objects.equals(id, other.id);
    }
}
