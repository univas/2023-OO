package services;

import java.util.ArrayList;

import models.ContaCorrente;

public class Banco {
	ArrayList<ContaCorrente> contas;
	
	public Banco() {
		contas = new ArrayList<>();
	}
	
	public ContaCorrente criarConta(String nome, String cpf, String senha) {
		ContaCorrente conta = new ContaCorrente(nome, cpf, senha);
		
		this.contas.add(conta);
		
		return conta;
	}
	
	public String getContas() {
		return this.contas.toString();
	}
	
	public void transferirEntreContas(int contaOrigem, int contaDestino, double valor, ContaCorrente.tiposTransferencia tipo) {
		ContaCorrente origem = null;
		ContaCorrente destino = null;
		for(int i = 0; i < this.contas.size(); i++) {
			if(this.contas.get(i).getNumero() == contaOrigem) {
				origem = this.contas.get(i);
			}else if(this.contas.get(i).getNumero() == contaDestino) {
				destino = this.contas.get(i);
			}
		}
		
		if(origem == null || destino == null) {
			System.out.println("Não eh possivel transferir entre estas contas.");
		}else {
			origem.sacar(valor);
			destino.depositar(valor);
			System.out.println("Transferencia realizada.");
		}
	}
}
