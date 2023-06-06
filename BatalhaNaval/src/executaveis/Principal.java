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
