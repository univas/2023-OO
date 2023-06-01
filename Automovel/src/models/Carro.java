package models;

public class Carro extends Automovel {
	private double tamanhoPortaMalas;

	public double getTamanhoPortaMalas() {
		return tamanhoPortaMalas;
	}

	public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
		this.tamanhoPortaMalas = tamanhoPortaMalas;
	}
	
	public void aumentarPortaMalas(double valor) {
		this.tamanhoPortaMalas += valor;
	}

	@Override
	public String toString() {
		return "Carro [tamanhoPortaMalas=" + tamanhoPortaMalas + ", Peso=" + getPeso() + ", Velocidade="
				+ getVelocidade() + ", Marca=" + getMarca() + "]";
	}
	
	
}
