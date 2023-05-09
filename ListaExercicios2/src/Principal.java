import Exercicio3.Retangulo;
import exercicio1.Pessoa;
import exercicio10.Cliente;
import exercicio2.BanckAccount;
import exercicio4.Animal;
import exercicio5.Carro;
import exercicio6.Triangulo;
import exercicio7.Livro;
import exercicio8.Funcionario;
import exercicio9.Circulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generamethod stub
		Cliente c = new Cliente();
		
		c.endereco = "rua da univas";
		c.telefone = "3449-9201";
		
		c.imprimir();
	}
	
	public static void ex10() {
		Cliente c = new Cliente();
		c.nome = "cliente";
		c.endereco = "rua da univas";
		c.telefone = "3449-9201";
		
		c.imprimir();
	}
	
	public static void ex9() {
		Circulo circ = new Circulo();
		circ.raio = 3;
		System.out.println(circ.area());
	}
	
	public static void ex8() {
		Funcionario func = new Funcionario();
		func.cargo = "Professor";
		func.nome = "Fulano";
		func.salario = 10000;
		func.imprimirInfos();
	}
	
	public static void ex7() {
		Livro livro = new Livro();
		livro.autor = "Autor";
		livro.titulo = "Um livro";
		livro.ano = 2023;
		
		livro.imprimir();
	}
	
	public static void ex6() {
		Triangulo tri = new Triangulo();
		tri.base = 2;
		tri.altura = 2;
		
		tri.imprimir();
	}
	
	public static void ex5() {
		Carro uno = new Carro();
		uno.ano = 2013;
		uno.modelo = "Uno";
		uno.marca = "FIAT";
		uno.imprimir();
	}
	
	public static void ex4() {
		Animal cavalo = new Animal();
		cavalo.nome = "pangaré";
		cavalo.especie = "cavalo";
		cavalo.imprimirDados();
	}
	
	public static void ex3() {
		Retangulo ret = new Retangulo();
		ret.altura = 2;
		ret.base = 2;
		
		System.out.println(ret.area());
	}
	
	public static void ex2() {
		BanckAccount account = new BanckAccount();
		
		account.balance = 100;
		account.holder = "Jeremias";
		
		account.deposit(100);
		
		System.out.println(account.balance);
		
		account.withdraw(250);
		System.out.println(account.balance);
	}

}
