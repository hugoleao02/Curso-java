package fundamentos;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = entrada.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = entrada.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		

		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nDelta é: " + delta);
		
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO x1 da equação é: %.2f", x1);	
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO x2 da equação é: %.2f", x2);
		
		entrada.close();
	}
}
