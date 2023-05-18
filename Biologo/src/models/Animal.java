package models;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Animal {
	String especie;
	double peso;
	double tamanho;
	String[] cores;
	String foto;
	int patas;
	boolean penas;
	boolean pelo;
	Date registro;
	String local;
	String id;
	
	public Animal clone() {
		return new Animal(
				this.getId(),
				this.getEspecie(),
				this.getPeso(),
				this.getTamanho(),
				this.getCores(),
				this.getFoto(),
				this.getPatas(),
				this.isPenas(),
				this.isPelo(),
				this.registro,
				this.local
			);
	}
	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String[] getCores() {
		return cores;
	}

	public void setCores(String[] cores) {
		this.cores = cores;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isPenas() {
		return penas;
	}

	public void setPenas(boolean penas) {
		this.penas = penas;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	public Date getRegistro() {
		return registro;
	}
	
	public String getRegistroStr() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.format(this.registro);
	}

	public void setRegistro(Date registro) {
		this.registro = registro;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Animal(
			String especie,
			double peso,
			double tamanho,
			String[] cores,
			String foto,
			int patas,
			boolean penas,
			boolean pelo,
			Date registro,
			String local
			) {
		this.especie = especie;
		this.peso = peso;
		this.tamanho = tamanho;
		this.cores = cores;
		this.foto = foto;
		this.patas = patas;
		this.penas = penas;
		this.pelo = pelo;
		this.registro = registro;
		this.local = local;
		this.id = UUID.randomUUID().toString();
	}
	
	private Animal(
			String id,
			String especie,
			double peso,
			double tamanho,
			String[] cores,
			String foto,
			int patas,
			boolean penas,
			boolean pelo,
			Date registro,
			String local
			) {
		this.id = id;
		this.especie = especie;
		this.peso = peso;
		this.tamanho = tamanho;
		this.cores = cores;
		this.foto = foto;
		this.patas = patas;
		this.penas = penas;
		this.pelo = pelo;
		this.registro = registro;
		this.local = local;
	}
	
	public Animal() {
		this.id = UUID.randomUUID().toString();
		this.cores = new String[3];
		this.registro = new Date();
	}
	
	public String getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		String texto = "";
		
		String cores = "[";
		for(String cor : this.cores) { // for(int = 0; i < this.cores.length; i++)
			cores += cor + ", ";
		}
		cores += "]";
		// Arrays.toString(this.cores);
		
		texto += "ID: "+this.getId()+"\n";
		texto += "Especie: "+this.especie+"\n";
		texto += "Peso: "+this.peso+"\n";
		texto += "Tamanho: "+this.tamanho+"\n";
		texto += "Cores: "+cores+"\n";
		texto += "Foto: "+this.foto+"\n";
		texto += "Patas: "+this.patas+"\n";
		texto += "Possui Penas? "+(this.penas ? "Sim" : "Nao")+"\n";
		/*
		 * Formas equivalentes de escrever um IF
		 * (this.penas ? "Sim" : "Nao")
		 * if(this.penas) {
		 *  	System.out.println("Sim");
		 * }else {
		 *  	System.out.println("Nao");
		 * }
		*/
		texto += "Possui Pelos? "+(this.pelo ? "Sim" : "Nao")+"\n";
		
		/*
			String dataFormatada = "";
			dataFormatada += this.registro.getDay();
			dataFormatada += "/" + this.registro.getMonth();
			dataFormatada += "/" + this.registro.getYear();
		*/
		
		/*
		 * SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		 * texto += "Data do registro: "+formatador.format(this.registro)+"\n";
		 * new SimpleDateFormat("dd/MM/yyyy").format(this.registro)+"\n";
		 */
		
		texto += "Data do registro: "+this.getRegistroStr()+"\n";
		texto += "Local: "+this.local+"\n";
		
		return texto;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Animal aux = (Animal)obj;
		return this.id == aux.getId();
	}
	
	
}
