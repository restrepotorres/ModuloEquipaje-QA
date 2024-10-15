package com.example.moduloEquipaje.ModuloEquipaje.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long idPago;

    @ManyToOne
    @JoinColumn(name = "id_equipaje", nullable = true)
    private Equipaje equipaje;

    @Column(name = "cargo_adicional", nullable = false)
    private BigDecimal cargoAdicional;

    @Column(name = "cantidad_total", nullable = false)
    private BigDecimal cantidadTotal;

    @Column(name = "fecha_pago")
    private Date fechaPago;

    // Getters y Setters

    public Long getIdPago() {
        return idPago;
    }

    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public Equipaje getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Equipaje equipaje) {
        this.equipaje = equipaje;
    }

    public BigDecimal getCargoAdicional() {
        return cargoAdicional;
    }

    public void setCargoAdicional(BigDecimal cargoAdicional) {
        this.cargoAdicional = cargoAdicional;
    }

    public BigDecimal getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(BigDecimal cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}
