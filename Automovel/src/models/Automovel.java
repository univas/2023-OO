package models;

public class Automovel {
	protected double peso;
	protected int velocidade;
	protected String marca;
	
	private static int cont = 0;
	
	public static int getCont() {
		return Automovel.cont;
	}
	
	public Automovel () {
		Automovel.cont++;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void aumentarVelocidade() {
		this.velocidade++;
	}
	@Override
	public String toString() {
		return "Automovel [peso=" + peso + ", velocidade=" + velocidade + ", marca=" + marca + "]";
	}
	
	
}
