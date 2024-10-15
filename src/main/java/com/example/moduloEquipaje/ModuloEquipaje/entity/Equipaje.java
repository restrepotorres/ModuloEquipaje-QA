package com.example.moduloEquipaje.ModuloEquipaje.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Equipaje")
public class Equipaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipaje")
    private Long idEquipaje;

    @ManyToOne
    @JoinColumn(name = "id_reserva", nullable = true)
    private Reserva reserva;

    @Column(name = "tipo_equipaje", nullable = false)
    private String tipoEquipaje;

    @Column(name = "ubicacion_equipaje", nullable = false)
    private String ubicacionEquipaje;

    @Column(name = "descripcion_equipaje", nullable = false)
    private String descripcionEquipaje;

    @Column(name = "precio_base", nullable = false)
    private BigDecimal precioBase;

    @Column(name = "cargo_adicional", nullable = false)
    private BigDecimal cargoAdicional;

    @Column(name = "dimensiones_equipaje", nullable = false)
    private BigDecimal dimensionesEquipaje;

    @Column(name = "peso_equipaje", nullable = false)
    private BigDecimal pesoEquipaje;

    // Aquí va la columna cantidadEquipaje, configurada como no nula
    @Column(name = "cantidad_equipaje", nullable = false)
    private BigDecimal cantidadEquipaje;

    @Column(name = "costo_total", nullable = false)
    private BigDecimal costoTotal;

    // Getters y Setters

    public Long getIdEquipaje() {
        return idEquipaje;
    }

    public void setIdEquipaje(Long idEquipaje) {
        this.idEquipaje = idEquipaje;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getTipoEquipaje() {
        return tipoEquipaje;
    }

    public void setTipoEquipaje(String tipoEquipaje) {
        this.tipoEquipaje = tipoEquipaje;
    }

    public String getUbicacionEquipaje() {
        return ubicacionEquipaje;
    }

    public void setUbicacionEquipaje(String ubicacionEquipaje) {
        this.ubicacionEquipaje = ubicacionEquipaje;
    }

    public String getDescripcionEquipaje() {
        return descripcionEquipaje;
    }

    public void setDescripcionEquipaje(String descripcionEquipaje) {
        this.descripcionEquipaje = descripcionEquipaje;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public BigDecimal getCargoAdicional() {
        return cargoAdicional;
    }

    public void setCargoAdicional(BigDecimal cargoAdicional) {
        this.cargoAdicional = cargoAdicional;
    }

    public BigDecimal getDimensionesEquipaje() {
        return dimensionesEquipaje;
    }

    public void setDimensionesEquipaje(BigDecimal dimensionesEquipaje) {
        this.dimensionesEquipaje = dimensionesEquipaje;
    }

    public BigDecimal getPesoEquipaje() {
        return pesoEquipaje;
    }

    public void setPesoEquipaje(BigDecimal pesoEquipaje) {
        this.pesoEquipaje = pesoEquipaje;
    }

    public BigDecimal getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    public void setCantidadEquipaje(BigDecimal cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }
}
