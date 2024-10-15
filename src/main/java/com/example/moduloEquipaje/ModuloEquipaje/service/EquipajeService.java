package com.example.moduloEquipaje.ModuloEquipaje.service;

import com.example.moduloEquipaje.ModuloEquipaje.entity.Equipaje;
import com.example.moduloEquipaje.ModuloEquipaje.entity.Reserva;
import com.example.moduloEquipaje.ModuloEquipaje.repository.EquipajeRepository;
import com.example.moduloEquipaje.ModuloEquipaje.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipajeService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private EquipajeRepository equipajeRepository;

    public Equipaje agregarEquipaje(Integer idReserva, Equipaje equipaje) {
        // Busca la reserva y lanza una excepción si no se encuentra
        Reserva reserva = reservaRepository.findById(idReserva)
                .orElseThrow(() -> new RuntimeException("Reserva con ID " + idReserva + " no encontrada"));

        // Asigna la reserva al equipaje y guarda el equipaje
        equipaje.setReserva(reserva);
        return equipajeRepository.save(equipaje);
    }

    public List<Reserva> obtenerReservas() {
        return reservaRepository.findAll();
    }
}
