package main;

import models.Aluno;
import models.Funcionario;
import models.Pessoa;
import models.Professor;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Maria Aparecida");
		a.setSexo("F");
		a.setMatricula(123);
		
		System.out.println(a);
		
		Professor p = new Professor();
		p.setNome("José");
		p.setSexo("M");
		p.setEspecialidade("Medicina");
		
		System.out.println(p);
		p.trocarEspecialidade("Gastronomia");
		
		System.out.println(p);
		
		Funcionario f = new Funcionario();
		f.setNome("Aurelio");
		f.setSexo("M");
		f.setSetor("Secretaria");
		System.out.println(f);
		
		f.trocarSetor("Direcao");
		System.out.println(f);
		
		Pessoa pe = new Pessoa();
		pe.setNome("Pessoa");
		pe.setSexo("F");
		System.out.println(pe);
	}

}
