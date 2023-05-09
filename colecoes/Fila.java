package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Diferença de comportamento quando a fila está cheia
		fila.add("Ana"); // Lança uma exceção
		fila.offer("Bia"); // retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Gui");
		fila.offer("Rafaela");	
		
		// Diferença de comportamento quando a fila está vazia	
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção 
		System.out.println(fila.element());
		
		//retorna proximo elemeto removendo da fila
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.remove());// Lança uma exceção 
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}
}
