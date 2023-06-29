package executavel;

import java.util.Scanner;

import modelo.Venda;
import service.VendaService;
import view.VendaView;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VendaService service = new VendaService();
		VendaView view = new VendaView();
		
		System.out.println("Escolha uma opcao");
		System.out.println("1 - Registrar Venda");
		System.out.println("2 - Exibir relatorio");
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = sc.nextInt();
		sc.nextLine();
		
		do {
			switch(opcao) {
				case 1:
					
					// service.addVenda(view.registrarVenda());
					
					Venda vendaRegistrada = view.registrarVenda();
					service.addVenda(vendaRegistrada);
					break;
				case 2: 
					// view.exibirRelatorioDeVendas(service.calcularValorTotal(), service.calcularValorMedio());
					
					double valorTotal = service.calcularValorTotal();
					double valorMedio = service.calcularValorMedio();
					view.exibirRelatorioDeVendas(valorTotal, valorMedio);
					break;
				default:
					System.out.println("Tchau");
					break;
			}
			System.out.println("Escolha uma opcao");
			System.out.println("1 - Registrar Venda");
			System.out.println("2 - Exibir relatorio");
			
			opcao = sc.nextInt();
			sc.nextLine();
		}while(opcao == 1 || opcao == 2);
		
		//sc.close();
	}

}
