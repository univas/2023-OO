package modelo;

public class Venda {
	private Pessoa cliente;
	private String produto;
	private double valor;
	private int quantidade;
	
	public Venda(Pessoa cliente, String produto, double valor, int quantidade) {
		super();
		this.cliente = cliente;
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
