import models.ContaCorrente;
import models.ContaCorrente.tiposTransferencia;
import services.Banco;

public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		ContaCorrente cMarcos = banco.criarConta("Marcos", "123", "123");
		ContaCorrente cJose = banco.criarConta("José", "124", "124");
		
		cMarcos.depositar(100);
		cJose.depositar(100);
		
		System.out.println(banco.getContas());
		
		banco.transferirEntreContas(
			cMarcos.getNumero(), cJose.getNumero(), 
			50, tiposTransferencia.PIX);
		
		System.out.println(banco.getContas());
	}
	
	
	public static void mainAnterior() {
		// TODO Auto-generated method stub
				ContaCorrente conta = new ContaCorrente("Marcos", "123", "123");
				
				
				System.out.println(conta.getSaldo());
				
				conta.depositar(100);
				//conta.cheque_especial = 100;
				
				System.out.println(conta.getSaldo());
				
				conta.sacar(200);
				
				System.out.println(conta.getSaldo());
				//System.out.println(conta.cheque_especial);
				
				conta.depositar(200);
				
				System.out.println(conta.getCont());
				
				System.out.println();
				System.out.println(conta);
				//System.out.println(conta.cheque_especial);
				
				System.out.println(conta.getSaldo());
				conta.transferir("123", 1, 10, ContaCorrente.tiposTransferencia.TED);
				
				System.out.println(conta.getSaldo());
				
				System.out.println(conta.getExtrato());
				
				ContaCorrente conta2 = new ContaCorrente("Lucca", "123", "123");
				
				System.out.println(conta.getCont());
				
				conta2 = new ContaCorrente("João", "123", "123");
	}

}
