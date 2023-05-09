import models.Animal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] coresDoCavalo = {"preto", "branco"};
		Animal cavalo = new Animal("cavalo", coresDoCavalo, 4);
		
		System.out.println(cavalo);
	}

}
