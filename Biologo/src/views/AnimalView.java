package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import models.Animal;

public class AnimalView {
	private Scanner scanner;
	
	public AnimalView() {
		this.scanner = new Scanner(System.in);
	}
	
	public void visualizarTodos(ArrayList<Animal> animais) {
		for(Animal a : animais) {
			System.out.println(a);
		}
	}
	
 	public Animal criarNovoAnimal() throws ParseException {
		Animal a = new Animal();
		// especie
		System.out.println("Digite a especie do animal");
		a.setEspecie(this.scanner.nextLine());
		
		// peso
		System.out.println("Digite o peso do animal");
		a.setPeso(this.scanner.nextDouble());
		this.scanner.nextLine();
		
		// tamanho
		System.out.println("Digite o tamanho do animal em cm");
		a.setTamanho(this.scanner.nextDouble());
		this.scanner.nextLine();
		
		// cores
		System.out.println("Quantas cores o animal possui?");
		int contCores = this.scanner.nextInt();
		this.scanner.nextLine();
		
		String[] cores = new String[contCores];
		for(int i=0; i<contCores; i++) {
			System.out.println("Digite a cor "+(i+1));
			cores[i] = this.scanner.nextLine();
		}
		
		a.setCores(cores);
		
		// foto
		System.out.println("Digite a URL da foto:");
		a.setFoto(this.scanner.nextLine());
		
		// patas
		System.out.println("Digite a quantidade de patas:");
		a.setPatas(this.scanner.nextInt());
		this.scanner.nextLine();
		
		// penas
		System.out.println("Este animal possui penas? (S/N)");
		String escolha = this.scanner.nextLine();
		if(escolha.toUpperCase() == "S") {
			a.setPenas(true);
		}else {
			a.setPenas(false);
		}
		
		// pelo
		System.out.println("Este animal possui pelo?");
		a.setPelo((this.scanner.nextLine().toUpperCase().equals("S")) ? true : false);
		
		// registro
		System.out.println("Digite a data que foi visto:");
		String data = this.scanner.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		a.setRegistro(format.parse(data));
		
		// local
		System.out.println("Digite o local que o animal foi visto");
		a.setLocal(this.scanner.nextLine());
		
		return a;
	}
}
