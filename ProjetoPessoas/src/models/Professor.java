package models;

public class Professor extends Pessoa {
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void trocarEspecialidade(String novaEsp) {
		this.setEspecialidade(novaEsp);
		System.out.println("Professor comecou a ministrar novo conteudo.");
	}

	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", nome=" + getNome() + ", sexo=" + getSexo()
				+ "]";
	}

}
