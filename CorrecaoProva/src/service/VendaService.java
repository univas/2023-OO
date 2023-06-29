package service;

import java.util.ArrayList;

import modelo.Venda;

public class VendaService {
	private ArrayList<Venda> vendas;
	
	public VendaService() {
		this.vendas = new ArrayList<>();
	}
	
	public void addVenda(Venda venda) {
		this.vendas.add(venda);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		
		for(Venda v : this.vendas) {
			valorTotal += v.getValor() * v.getQuantidade();
		}
		
		return valorTotal;
	}
	
	public double calcularValorMedio() {
		double valorTotal = this.calcularValorTotal();
		int quantidadeDeVendas = this.vendas.size(); 
		
		return valorTotal / quantidadeDeVendas;
	}
}
