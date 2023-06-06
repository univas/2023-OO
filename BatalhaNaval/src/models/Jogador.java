package models;

import java.util.ArrayList;

public class Jogador {
	private int vida;
	private String nome;
	private int id;
	private ArrayList<Embarcacao> barcos;
	
	public Jogador(int id) {
		this.vida = 100;
		this.id = id;
		this.barcos = new ArrayList<Embarcacao>();
		
		this.barcos.add(new PortaAvioes());
		this.barcos.add(new Submarino());
		this.barcos.add(new Submarino());
		this.barcos.add(new Veleiro());
		this.barcos.add(new Veleiro());
	}
	
	public ArrayList<Embarcacao> getBarcos(){
		return this.barcos;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
}
