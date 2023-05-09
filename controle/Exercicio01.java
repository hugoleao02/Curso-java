package controle;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = entrada.nextDouble();
		
		if(numero <= 10 || numero >= 0  ) {
			if(numero % 2 == 0 ) {
				System.out.print("Número é par");
			}else {
				System.out.print("Número é impar");
			}	
		}
		

		entrada.close();
	}
}
