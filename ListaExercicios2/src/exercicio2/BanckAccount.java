package exercicio2;

public class BanckAccount {
	public double balance;
	public String holder;
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw( double amount) {
		if ( amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("insufficient funds");
		}
		
	}
}
