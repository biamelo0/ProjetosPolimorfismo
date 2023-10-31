package PoliformismoVeiculo;

public class Principal {
	public static void main (String[] args) {
		Carro ferrari = new Carro("000","F1","Vermelho","2023");
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("-----------------------");
		
		Onibus ferrari1 = new Onibus("000","F1","Vermelho","2023");
		ferrari1.ligar();
		ferrari1.acelerar();
		ferrari1.virar();
		ferrari1.frear();
		
		System.out.println("-----------------------");
		
		
		
	}

}
