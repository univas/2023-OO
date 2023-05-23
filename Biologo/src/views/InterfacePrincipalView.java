package views;

import java.text.ParseException;
import java.util.Scanner;

import services.AnimalService;

public class InterfacePrincipalView {
	private void exibirMenuPrincipal() {
		System.out.println("Selecione uma opcao");
		System.out.println("1. Cadastrar");
		System.out.println("2. Listar todos");
		System.out.println("3. Excluir um registro");
		System.out.println("4. Buscar um registro");
		System.out.println("5. Sair");
	}
	
	private Scanner scanner;
	
	public InterfacePrincipalView() {
		this.scanner = new Scanner(System.in);
	}
	
	public void executar() throws ParseException {
		int opcao = 0;
		
		while(opcao != 5) {
			this.exibirMenuPrincipal();
			opcao = this.scanner.nextInt();
			this.scanner.nextLine();
			AnimalView animalView = new AnimalView();
			AnimalService animalService = new AnimalService();
			
			switch(opcao) {
				case 1:
					System.out.println("Cadastrar novo animal");
					animalService.create(animalView.criarNovoAnimal());
					break;
				case 2:
					System.out.println("Listar todos os animais");
					animalView.visualizarTodos(animalService.get());
					break;
				case 3:
					System.out.println("Excluir um animal pelo Id");
					break;
				case 4:
					System.out.println("Buscar um animal pelo Id");
					break;
				case 5:
					System.out.println("Encerrando o programa.");
					break;
			}
		}
		
		this.scanner.close();
	}
}
