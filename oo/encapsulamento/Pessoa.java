package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	Pessoa(String nome, int idade){
		setNome(nome);
		setIdade(idade);
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
			
		if(novaIdade >=  0 && novaIdade <=120) {
			this.idade = novaIdade;
		}
	}
}
