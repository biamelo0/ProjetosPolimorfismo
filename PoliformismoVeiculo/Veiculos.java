package PoliformismoVeiculo;

public abstract class Veiculos {
	private String placa;
	private String modelo;
	private String cor;
	private String ano;
	public Veiculos(String placa, String modelo, String cor, String ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public abstract void acelerar();
	
	public abstract void frear();
	
	public abstract void virar();
	
	public abstract void ligar();

}
