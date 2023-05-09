package controle;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = entrada.nextInt();
		int contadorDivisor = 0;

		for (int divisor = 2; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
				contadorDivisor++;
			}

			switch (contadorDivisor) {

			case 0:
				System.out.println("O numero " + numero + " é um numero primo.");
				break;

			default:
				System.out.println("O numero " + numero + "  não é um numero primo.");

			}

		}
		entrada.close();

	}
}
