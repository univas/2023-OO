package models;

public class Pessoa {
	private String nome;
	private String sexo;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome="+this.nome+", sexo="+this.sexo+"]";
	}
}
