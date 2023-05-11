package models;

import java.util.Random;

public class ContaCorrente {
	public String titular;
	private double saldo;
	public String cpf;
	public String cartao;
	public String senha;
	public double cheque_especial;
	public double limite_cartao;
	public int numero;
	public String agencia;
	public String[] chave_pix;
	private double juros_cheque = .2;
	
	public ContaCorrente(String titular, String cpf, String senha) {
		this.titular = titular;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = 0;
		this.cheque_especial = 0;
		this.limite_cartao = 0;
		
		this.agencia = "0001";
		this.numero = (1000000 % new Random().nextInt()) + 1000;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		if(this.saldo < 0) {
			valor += this.saldo * (this.juros_cheque);
			this.cheque_especial += (valor - (this.saldo*-1));
		}
		
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		// verificar se o saldo + cheque permite o saque
		if(this.saldo + this.cheque_especial >= valor) {
			if(this.saldo < valor) {
				this.cheque_especial -= (valor - this.saldo);
			}
			
			this.saldo -= valor;
		}else {
			System.out.println("Nao pode sacar");
		}
	}
	
	public void transferir(String agencia, int conta, double valor) {
		
	}
	
	public void transferirPix(String pix, double valor) {
		
	}
}
