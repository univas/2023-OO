package modelo;

public class Fisica extends Pessoa {
	private String cpf;
	public Fisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
