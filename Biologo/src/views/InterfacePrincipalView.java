package views;

import java.text.ParseException;
import java.util.Scanner;

import models.Animal;
import services.AnimalService;

public class InterfacePrincipalView {
	private void exibirMenuPrincipal() {
		System.out.println("Selecione uma opcao");
		System.out.println("1. Cadastrar");
		System.out.println("2. Listar todos");
		System.out.println("3. Excluir um registro");
		System.out.println("4. Buscar um registro");
		System.out.println("5. Mostrar quantidade de animais");
		System.out.println("6. Listar animais com penas");
		System.out.println("7. Listar animais com pelos");
		System.out.println("8. Atualizar registro");
		System.out.println("9. Sair");
	}
	
	private Scanner scanner;
	
	public InterfacePrincipalView() {
		this.scanner = new Scanner(System.in);
	}
	
	public void executar() throws ParseException {
		int opcao = 0;
		
		while(opcao != 9) {
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
					String id = animalView.lerId();
					animalService.delete(id);
					break;
				case 4:
					System.out.println("Buscar um animal pelo Id");
					String idParaBuscar = animalView.lerId();
					Animal a = animalService.get(idParaBuscar);
					System.out.println(a);
					break;
				case 5:
					int quantidade = animalService.count();
					if(quantidade > 1) {
						System.out.println("Voce tem " + quantidade + " animais");
					}else {
						System.out.println("Voce tem " + quantidade + " animal");
					}
					//System.out.println("Voce tem " + quantidade + (quantidade > 1 ? " animais" : " animal"));
					break;
				case 6:
					System.out.println("Listando animais com penas");
					animalView.visualizarTodos(animalService.getComPenas());
					break;
				case 7:
					System.out.println("Listando animais com pelos");
					animalView.visualizarTodos(animalService.getComPelos());
					break;
				case 8:
					System.out.println("Atualizar dados de um animal");
					String idParaAtualizar = animalView.lerId();
					Animal animalParaAtualizar = animalService.get(idParaAtualizar);
					animalView.atualizarDados(animalParaAtualizar);
					animalService.update(animalParaAtualizar);
					break;
				case 9:
					System.out.println("Encerrando o programa.");
					break;
			}
		}
		
		this.scanner.close();
	}
}
