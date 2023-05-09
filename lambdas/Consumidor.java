package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.9);
		imprimir.accept(p1);
		System.out.println("============");
		Produto p2 = new Produto("Notebook", 2982.34, 0.25);
		Produto p3 = new Produto("Caderno", 19.34, 0.3);
		Produto p4 = new Produto("Borracha", 7.34, 0.18);
		Produto p5 = new Produto("Lapis", 2.34, 0.19);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
