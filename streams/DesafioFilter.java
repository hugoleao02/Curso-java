package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Livros l1  = new Livros("l1",18,true,25);
		Livros l2  = new Livros("l2",15,false,18);
		Livros l3  = new Livros("l3",11,true,12);
		Livros l4  = new Livros("l4",20,false,14);
		
		List<Livros> livros = Arrays.asList(l1, l2, l3, l4);
		
		
		Predicate<Livros> indicaçao = l -> l.alunoIdade >= 16;
		Predicate<Livros> terror = l -> l.eTerror;
		Function<Livros, String> saudacao = 
				a -> l1.nome +  " pode ler  terror";
	
		livros.stream()
			.filter(indicaçao)
			.filter(terror)
			.map(saudacao)
			.forEach(System.out::println);
		
		
	}
}
