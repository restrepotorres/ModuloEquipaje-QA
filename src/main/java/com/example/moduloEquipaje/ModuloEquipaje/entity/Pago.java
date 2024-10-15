package com.example.moduloEquipaje.ModuloEquipaje.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
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


    public void setCantidadTotal(BigDecimal cantidadTotal) {
        if (cantidadTotal == null) {
            throw new NullPointerException("cantidadTotal cannot be null");
        }
        this.cantidadTotal = cantidadTotal;
    }
}
