package fundamentos;

import java.util.Scanner;

public class CalculoDoIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Informe a peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura,2);
		
		System.out.printf("Seu Imc é %.2f", imc);
		
		entrada.close();
	}
}
