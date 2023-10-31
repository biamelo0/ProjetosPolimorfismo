package PoliformismoCalculoJunto;

public abstract class Calculando implements Calculos{
	
	public double div(double v1, double v2) {
		return v1 / v2;
	}
	public double multi(double v1, double v2) {
		return v1 * v2;
	}
	public double soma(double v1, double v2) {
		return v1 + v2;
	}
	public int expo(int v1, int v2) {
		return v1 ^ v2;
	}
	public double sub(double variavel1, double variavel2) {
		return variavel1 - variavel2;
	}
}
