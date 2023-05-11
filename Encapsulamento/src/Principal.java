import models.ContaCorrente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente("Marcos", "123", "123");
		
		System.out.println(conta.getSaldo());
		
		conta.depositar(100);
		conta.cheque_especial = 100;
		
		System.out.println(conta.getSaldo());
		
		conta.sacar(200);
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.cheque_especial);
		
		conta.depositar(200);
		
		System.out.println();
		System.out.println(conta.getSaldo());
		System.out.println(conta.cheque_especial);
	}

}
