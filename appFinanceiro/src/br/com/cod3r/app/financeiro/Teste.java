package br.com.cod3r.app.financeiro;

import java.util.ServiceLoader;

import br.com.cod3r.appApiPublica.Calculadora;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc =  ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(2, 3, 4));
//		
//		OperacoesAritmeticas opAritmetica = new OperacoesAritmeticas();
//		System.out.println(opAritmetica.soma(4,5,6));

	}
}
