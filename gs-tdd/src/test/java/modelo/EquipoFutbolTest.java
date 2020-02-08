package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.EquipoFutbol;

public class EquipoFutbolTest {

	
	@Test
	public void constructorDebeSetearJuegosGanados() {
	EquipoFutbol team = new EquipoFutbol(3);
	assertEquals(3, team.getJuegosGanados());
	}

	
	
	
}
