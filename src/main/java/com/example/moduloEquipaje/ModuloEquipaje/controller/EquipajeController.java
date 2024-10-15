package com.example.moduloEquipaje.ModuloEquipaje.controller;

import com.example.moduloEquipaje.ModuloEquipaje.entity.Equipaje;
import com.example.moduloEquipaje.ModuloEquipaje.entity.Reserva;
import com.example.moduloEquipaje.ModuloEquipaje.service.EquipajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EquipajeController {

    @Autowired
    private EquipajeService equipajeService;

    @PostMapping("/equipajes/reservas/{idReserva}/agregar")
    public ResponseEntity<?> agregarEquipaje(@PathVariable Integer idReserva, @RequestBody Equipaje equipaje) {
        try {
            System.out.println("ID de Reserva recibido: " + idReserva);
            System.out.println("Datos del equipaje recibido: " + equipaje);

            // Validación de campos obligatorios
            if (equipaje.getCantidadEquipaje() == null || equipaje.getCantidadEquipaje().compareTo(BigDecimal.ZERO) <= 0) {
                return ResponseEntity.badRequest().body("La cantidad de equipaje es obligatoria y debe ser mayor a cero.");
            }

            // Agregar el equipaje a la reserva especificada
            Equipaje nuevoEquipaje = equipajeService.agregarEquipaje(idReserva, equipaje);

            System.out.println("Equipaje agregado con éxito: " + nuevoEquipaje);
            return ResponseEntity.ok(nuevoEquipaje);
        } catch (Exception e) {
            System.err.println("Error al agregar equipaje: " + e.getMessage());
            e.printStackTrace(); // Muestra el stack trace completo para detalles de error
            return ResponseEntity.status(500).body("Error al agregar el equipaje. Verifica los datos y vuelve a intentar.");
        }
    }

    @GetMapping("/reservas")
    public ResponseEntity<List<Reserva>> obtenerReservas() {
        try {
            List<Reserva> reservas = equipajeService.obtenerReservas();
            return ResponseEntity.ok(reservas);
        } catch (Exception e) {
            System.err.println("Error al obtener reservas: " + e.getMessage());
            e.printStackTrace(); // Muestra el stack trace completo para detalles de error
            return ResponseEntity.status(500).body(null); // Retorna un error 500 en caso de fallo
        }
    }

    @GetMapping("/health")
    public String health(){
        return "OK";
    }
}
