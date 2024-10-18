package com.example.moduloEquipaje.ModuloEquipaje;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


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
}
