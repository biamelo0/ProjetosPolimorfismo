package PolimorfismoAnimal;


public class Principal {

	public static void main(String[] args) {
		
		Lobo Lobo = new Lobo("Lobo", "M","cinzento");
		Lobo.emitirSom();
		
		Leao Leao = new Leao("Leao", "M","qualquer");
		Leao.emitirSom();
		
		Cachorro Cachorro = new Cachorro("Cachorro", "F","labrador");
		Cachorro.emitirSom();
		
		Gato Gato = new Gato("Gato", "M","siames");
		Gato.emitirSom();
		
		Tigre Tigre = new Tigre("tigre", "M"," de bengala");
		Tigre.emitirSom();
		
		
		

	}

}
