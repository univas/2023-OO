package models;

public class Aluno extends Pessoa {
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void cancelarMatricula() {
		this.matricula = 0;
		System.out.println("Matricula cancelada!");
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + getNome() + ", sexo=" + getSexo() + "]";
	}

	
}
