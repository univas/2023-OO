package modelo;

public class Juridica extends Pessoa {
	private String cnpj;
	
	public Juridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
}
