package fundamentos;

import java.util.Scanner;

public class CalculoArea {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a base: ");
		double base = entrada.nextDouble();

		System.out.println("Informe a base: ");
		double altura = entrada.nextDouble();

		
		double area = (base * altura) / 2;
		
		System.out.printf("Area do triangulo é %.2f", area);
		entrada.close();
	}
}
