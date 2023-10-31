package PolimorfismoAnimalInter;

public class Leao implements Animal{
	
	@Override
	public void dormir() {
		System.out.println("O Leao esta dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Leao esta caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O Leao esta correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Leao esta uivando");
	}

}
