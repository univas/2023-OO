package models;

import java.util.ArrayList;
import java.util.HashMap;

public class ContaCorrente {
	 String titular;
	 double saldo;
	 String cpf;
	 String cartao;
	 String senha;
	 double cheque_especial;
	 double limite_cartao;
	 int numero;
	 String agencia;
	 String[] chave_pix;
	 double juros_cheque = .2;
	 static int cont = 0;
	 ArrayList<String> extrato;
	 
	 HashMap<ContaCorrente.tiposTransferencia, Double> taxas;
	 
	 public static enum tiposTransferencia{
		 PIX, TED, DOC
	 }
	 
	 public String getExtrato() {
		 return this.extrato.toString();
	 }
	 
	 public int getNumero() {
		 return this.numero;
	 }
	
	public ContaCorrente(String titular, String cpf, String senha) {
		this.titular = titular;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = 0;
		this.cheque_especial = 0;
		this.limite_cartao = 0;
		
		this.agencia = "0001";
		this.numero = ++ContaCorrente.cont;
		this.extrato = new ArrayList<String>();
		
		this.taxas = new HashMap<>();
		
		this.taxas.put(ContaCorrente.tiposTransferencia.PIX, 0.0);
		this.taxas.put(ContaCorrente.tiposTransferencia.TED, 8.0);
		this.taxas.put(ContaCorrente.tiposTransferencia.DOC, 5.0);
	}
	
	public int getCont() {
		return this.numero;
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
		
		this.extrato.add("Depositou " + valor + " reais");
	}
	
	public double getLimitChequeEspecialTotal() {
		if(this.saldo < 0) {
			return this.cheque_especial + (-1 * this.saldo);
		}else {
			return this.cheque_especial;
		}
	}
	
	public double getLimiteChequeEspecialAtual() {
		return this.cheque_especial;
	}
	public String getTitular() {
		return this.titular + "[" + this.cpf + "]";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String retorno = "Titular: "+this.getTitular() + "\n";
		retorno += "Ag: " + this.agencia + " Cc: " + this.numero + "\n";
		retorno+= "Saldo atual: " + this.getSaldo();
		
		return retorno;
		
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
		
		this.extrato.add("Sacou "+valor+" reais");
	}
	
	public void transferir(
			String agencia, 
			int conta, 
			double valor, 
			ContaCorrente.tiposTransferencia tipo) {
		
		double taxa = this.taxas.get(tipo);
		
		this.sacar(valor+taxa);
	}
	
	public void transferirPix(String pix, double valor) {
		this.sacar(valor + this.taxas.get(ContaCorrente.tiposTransferencia.PIX));
	}
}