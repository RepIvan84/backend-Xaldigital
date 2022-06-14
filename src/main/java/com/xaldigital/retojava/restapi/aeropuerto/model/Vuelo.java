package com.xaldigital.retojava.restapi.aeropuerto.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tbl_vuelos")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVuelo;

    @ManyToOne
    @JoinColumn(name = "id_aerolinea", nullable = false, foreignKey = @ForeignKey(name = "FK_vuelo_aerolinea"))
    private Aerolinea aerolinea;

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto", nullable = false, foreignKey = @ForeignKey(name = "FK_vuelo_aeropuerto"))
    private Aeropuerto aeropuerto;

    @ManyToOne
    @JoinColumn(name = "id_movimiento", nullable = false, foreignKey = @ForeignKey(name = "FK_vuelo_movimiento"))
    private Movimiento movimiento;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private LocalDateTime dia;

    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    public LocalDateTime getDia() {
        return dia;
    }

    public void setDia(LocalDateTime dia) {
        this.dia = dia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vuelo vuelo = (Vuelo) o;

        return Objects.equals(idVuelo, vuelo.idVuelo);
    }

    @Override
    public int hashCode() {
        return idVuelo != null ? idVuelo.hashCode() : 0;
    }
}
