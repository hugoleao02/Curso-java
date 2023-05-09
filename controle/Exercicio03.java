package controle;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe primeira nota parcial:");
		double nota1 = entrada.nextDouble();
		System.out.println("Informe primeira nota parcial:");
		double nota2 = entrada.nextDouble();
		
		
		double mediaFinal = (nota1 + nota2)/2;
		
		if(mediaFinal >= 7.0 ) {
			System.out.println("Aprovado!!");
		}else if(mediaFinal < 7.0 || mediaFinal > 4) {
			System.out.println("Recuperção!!");
		}else {
			System.out.println("Reprovado!!");
		}

		entrada.close();
	}
	
}
