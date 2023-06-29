package view;

import java.util.Scanner;

import modelo.Fisica;
import modelo.Juridica;
import modelo.Pessoa;
import modelo.Venda;

public class VendaView {
	public Venda registrarVenda() {
		Scanner sc = new Scanner(System.in);
		Pessoa cliente;
		
		System.out.println("Digite o nome do cliente:");
		String nomeDoCliente = sc.nextLine();
		
		System.out.println("Digit o numero do documento: (CPF/CNPJ)");
		String documento = sc.nextLine();
		
		if(documento.length() == 11) {
			cliente = new Fisica(nomeDoCliente, documento);
		}else {
			cliente = new Juridica(nomeDoCliente, documento);
		}
		
		System.out.println("Digite o nome do produto:");
		String nomeDoProduto = sc.nextLine();
		
		System.out.println("Digite a quantidade vendida:");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Qual o valor de cada produto?");
		double valor = sc.nextDouble();
		sc.nextLine();
		
		Venda venda = new Venda(cliente, nomeDoProduto, valor, quantidade);
		//sc.close();
		
		return venda;
	}
	
	public void exibirRelatorioDeVendas(double valorTotal, double valorMedio) {
		System.out.println("Valor Total de vendas: "+ valorTotal);
		System.out.println("Valor Médio por venda: "+ valorMedio);
	}
}
