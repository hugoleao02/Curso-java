package controle;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int soma = 0;

		
		do {
			System.out.println("Digite número positivo(Sair qualquer negativo)");
		numero = entrada.nextInt();
			if(numero >= 0) {
                soma += numero;
                System.out.println("Soma: " + soma);
            }
		} while (numero >= 0);

		entrada.close();
	}
}
