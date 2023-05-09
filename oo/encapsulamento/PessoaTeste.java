package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Pedro", -20);
		
		pessoa.setIdade(25);
		
		System.out.println(pessoa.getNome());	
		System.out.println(pessoa.getIdade());
		
	}
}
