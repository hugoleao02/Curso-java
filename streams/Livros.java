package streams;

public class Livros {
	final int indicacao;
	final boolean eTerror;
	final int alunoIdade;
	final String nome;
	
	public Livros(String nome, int indicacao, boolean eTerror, int alunoIdade) {
		this.indicacao = indicacao;
		this.eTerror = eTerror;
		this.alunoIdade = alunoIdade;
		this.nome = nome;
	}

}
