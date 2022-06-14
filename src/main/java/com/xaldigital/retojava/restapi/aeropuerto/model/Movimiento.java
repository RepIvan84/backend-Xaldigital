package com.xaldigital.retojava.restapi.aeropuerto.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_movimientos")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimiento;

    @Column(name = "descripcion", nullable = false, length = 20)
    private String descripcion;

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
