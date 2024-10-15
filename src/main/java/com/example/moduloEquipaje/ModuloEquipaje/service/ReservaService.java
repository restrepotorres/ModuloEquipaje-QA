package com.example.moduloEquipaje.ModuloEquipaje.service;

import com.example.moduloEquipaje.ModuloEquipaje.entity.Reserva;
import com.example.moduloEquipaje.ModuloEquipaje.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }
}
