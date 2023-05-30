package models;

public class Funcionario extends Pessoa {
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void trocarSetor(String novoSetor) {
		this.setSetor(novoSetor);
		System.out.println("Funcionario esta em um setor novo");
	}

	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", nome=" + getNome() + ", sexo=" + getSexo() + "]";
	}
	
	
}
