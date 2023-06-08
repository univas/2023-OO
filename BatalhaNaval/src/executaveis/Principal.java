package executaveis;

import java.util.ArrayList;
import java.util.Scanner;

import models.Embarcacao;
import models.Jogador;

public class Principal {
	
	public static Embarcacao[][] tabuleiro;
	public static ArrayList<Jogador> jogadores;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabuleiro = new Embarcacao[10][10];
		jogadores = new ArrayList<Jogador>();
		
		criarJogador();
		criarJogador();
		
		posicionarBarcos(jogadores.get(0));
	}
	
	public static void atacar(Jogador jogador) {
		// ataque escolhe barco
		int cont = 0;
		for(Embarcacao barco : jogador.getBarcos()) {
			System.out.println(cont + " - " + barco.getClass());
			cont++;
		}
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		sc.nextLine();
		Embarcacao barcoAtacante = jogador.getBarcos().get(opcao);
		
		// ataque escolhe local e valida
		int linha;
		int coluna;
		
		boolean podeUsarLinha = true;
		do {
			podeUsarLinha = true;
			System.out.println("Digite a linha");
			linha = sc.nextInt();
			sc.nextLine();
			
			if(jogador.getId() == 1 && linha < 5) {
				podeUsarLinha = false;
			}else if(jogador.getId() == 2 && linha > 5) {
				podeUsarLinha = false;
			}
		}while(!podeUsarLinha);
		
		System.out.println("Digite a coluna");
		coluna = sc.nextInt();
		sc.nextLine();
		
		String resultadoJogada = "";
		
		// verifica se vazio
		if(tabuleiro[linha][coluna] == null) {
			// se sim perde uma vida
			jogador.diminuirVida(1);
			resultadoJogada = "Errou barco";
		}else {
			// se não confere o barco que está lá
			Embarcacao barcoDefensor = tabuleiro[linha][coluna];
			
			int resultado = barcoAtacante.getAtaque() - barcoDefensor.getDefesa();
			resultadoJogada = "Acertou barco \n";
			
			if(resultado > 0) {
				int vidaResultante = barcoDefensor.diminuirVida(resultado);
				
				if(vidaResultante == 0) {
					resultadoJogada += "Destruiu barco \n";
					for(int i = coluna; i<(coluna + barcoDefensor.getTamanho()) && i < tabuleiro.length; i ++) {
						if(
							tabuleiro[linha][i] != null && 
							tabuleiro[linha][i].equals(barcoDefensor)
						) {
							tabuleiro[linha][i] = null;
						}
					}
					for(int i = coluna; i>(coluna + barcoDefensor.getTamanho()) && i > 0; i --) {
						if(
							tabuleiro[linha][i] != null && 
							tabuleiro[linha][i].equals(barcoDefensor)
						) {
							tabuleiro[linha][i] = null;
						}
					}
				}
				// atualiza vidas
				int vidaResultanteJog = jogador.diminuirVida(resultado);
				resultadoJogada += "Diminuiu " + resultado + " vidas do jogador.";
			}
		}
		// mostra resultado do ataque (acertou barco, destruiu barco, vida retirada)
		System.out.println(resultadoJogada);
	}
	
	public static void criarJogador() {
		if(jogadores.size() < 2) {
			Jogador j = new Jogador(jogadores.size() + 1);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o nome do jogador");
			j.setNome(sc.nextLine());
			
			jogadores.add(j);
		}else {
			System.out.println("Limite de jogadores atingido.");
		}
		
	}
	
	public static void posicionarBarcos(Jogador jogador) {
		int start = 0;
		if(jogador.getId() == 2) {
			start = 5;
		}
		
		boolean posicionou = false;
		
		for(int i = start; i <= start+4; i++) {
			for(int j = 0; j <= 9; j++) {
				if(tabuleiro[i][j] != null) {
					posicionou = true;
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		for(Embarcacao barco : jogador.getBarcos()) {
			boolean podePosicionar = true;
			do {
				System.out.println("Insira as coordenadas do barco "+barco.getClass());
				
				System.out.println("Posicao X");
				int linha = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Posicao Y");
				int coluna = sc.nextInt();
				sc.nextLine();
				podePosicionar = true;
				
				// verifica se digitou linha correta
				if(jogador.getId() == 2 && linha < 5 ||
				   jogador.getId() == 1 && linha > 4	) {
					podePosicionar = false;
				}else {
					// verifica se vai estourar o tabuleiro
					if(linha+barco.getTamanho() < tabuleiro.length) {
						// verifica se as posições estão vazias
						for(int i = linha; i < linha+barco.getTamanho(); i++) {
							if(tabuleiro[i][coluna] != null) {
								podePosicionar = false;
							}
						}
					}else {
						podePosicionar = false;
					}
				}
				
				if(podePosicionar) {
					for(int i = linha; i < linha+barco.getTamanho(); i++) {
						tabuleiro[i][coluna] = barco;
					}
				}else {
					System.out.println("Nao pode colocar nesta posicao!");
				}
			}while(!podePosicionar);
		}
	}

}
