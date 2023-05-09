package fundamentos;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {

		//(°F -32 ) x 5/9 = °C
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe temperatura em fahrenheit: ");
		double fah = entrada.nextDouble();
		
		double celsius = (fah -32) * 5/9;
		
		System.out.printf("Fahrenheit em celsius é %.2f", celsius);
		
		entrada.close();
	}
}
