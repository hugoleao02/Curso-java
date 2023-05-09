package fundamentos;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {

		//(1,8*°C +32  )= °F
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe temperatura em celsius: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 1.8 + 32);
		
		System.out.printf("Celsius em Fahrenheit  é %.2f", fahrenheit);
		
		entrada.close();
	}
}
