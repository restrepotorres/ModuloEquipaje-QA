package com.example.moduloEquipaje.ModuloEquipaje.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Equipaje")
@Getter
@Setter
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
}
