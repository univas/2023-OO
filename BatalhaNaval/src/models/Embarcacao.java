package models;

public abstract class Embarcacao {
	protected int tamanho;
	protected int ataque;
	protected int defesa;
	protected int vida;
	
	public Embarcacao() {
		this.vida = 100;
	}
	
	public int diminuirVida(int valor) {
		this.vida -= valor;
		return this.vida;
	}

	public int getTamanho() {
		return tamanho;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getVida() {
		return vida;
	}
	
	
}
