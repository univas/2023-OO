package models;

import java.sql.Date;

public class Animal {
	public String especie;
	public double peso;
	public double tamanho;
	public String[] cores;
	public String foto;
	public int patas;
	public boolean penas;
	public boolean pelo;
	public Date registro;
	public String local;
	
	public Animal(String especie, String[] cores, int patas) {
		this.especie = especie;
		this.cores = cores;
		this.patas = patas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.especie;
	}
}
