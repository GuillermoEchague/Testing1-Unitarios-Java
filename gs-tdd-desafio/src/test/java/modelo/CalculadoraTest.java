package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Calculadora;

public class CalculadoraTest {

	
	@Test
	public void constructorDebeSetearSuma() {
	Calculadora resultado = new Calculadora(3,4);
	assertEquals(7, resultado.getSumar());
	}
	
	
	@Test
	public void constructorDebeSetearResta() {
	Calculadora resultado = new Calculadora(3,4);
	assertEquals(-1, resultado.getRestar());
	}
	
	
	@Test
	public void constructorDebeSetearMultiplicar() {
	Calculadora resultado = new Calculadora(3,4);
	assertEquals(12, resultado.getMultiplicar());
	}
	
	
	@Test
	public void constructorDebeSetearDividir() {
	Calculadora resultado = new Calculadora(3,4);
	assertEquals(0.75, resultado.getDividir());
	}
	
}
