package model;

public class Calculadora {

	int valor1, valor2;

	public Calculadora(int valor1, int valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public int getSumar() {
		return valor1+valor2;
	}

	public void setSumar(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	
	public int getRestar() {
		return valor1-valor2;
	}
	
	public int getMultiplicar() {
		return valor1*valor2;
	}
	
	
	public float getDividir() {
		return (float) valor1/valor2;
	}
	
	
}
