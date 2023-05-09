package exercicio10;

public class Cliente {
	public String nome;
	public String endereco;
	public String telefone;
	
	public Cliente() {
		this.nome = "Sem nome";
	}
	
	public void imprimir() { 
		System.out.println(this.nome);
		System.out.println(this.endereco);
		System.out.println(this.telefone);
		
	}

}
