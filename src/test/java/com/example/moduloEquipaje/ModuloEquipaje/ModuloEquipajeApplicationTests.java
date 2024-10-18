package com.example.moduloEquipaje.ModuloEquipaje;

import com.example.moduloEquipaje.ModuloEquipaje.entity.Equipaje;
import com.example.moduloEquipaje.ModuloEquipaje.entity.Pago;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles("test") // Indica que se debe usar el perfil de test

class ModuloEquipajeApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void example() {
		assert(true);
	}

	@Test
	void testGettersAndSetters() {
		// Crea una instancia de Pago
		Pago pago = new Pago();

		// Configura los valores
		Long idPago = 1L;
		Equipaje equipaje = new Equipaje();
		BigDecimal cargoAdicional = new BigDecimal("10.00");
		BigDecimal cantidadTotal = new BigDecimal("50.00");
		Date fechaPago = new Date();

		// Usa los setters
		pago.setIdPago(idPago);
		pago.setEquipaje(equipaje);
		pago.setCargoAdicional(cargoAdicional);
		pago.setCantidadTotal(cantidadTotal);
		pago.setFechaPago(fechaPago);

		// Verifica los valores usando los getters
		assertEquals(idPago, pago.getIdPago());
		assertEquals(equipaje, pago.getEquipaje());
		assertEquals(cargoAdicional, pago.getCargoAdicional());
		assertEquals(cantidadTotal, pago.getCantidadTotal());
		assertEquals(fechaPago, pago.getFechaPago());
	}

	@Test
	void testCantidadTotalNoNula() {
		// Crear una instancia de Pago sin cantidadTotal para verificar si lanza una excepción
		Pago pago = new Pago();
		Exception exception = assertThrows(NullPointerException.class, () -> {
			pago.setCantidadTotal(null);
		});

		String expectedMessage = "cantidadTotal cannot be null";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

}
