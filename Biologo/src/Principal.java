import models.Animal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Animal b = a.clone();
		
		System.out.println(a);
		System.out.println(b);
	}

}
