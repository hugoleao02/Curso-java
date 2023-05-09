package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Palio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Palio palio = new Palio(150);
		
		for(int i = 0; i < 200; i++) {
			palio.acelerar();
		}
		palio.frear();
		System.out.println(palio.velocidade);
		
		Ferrari ferrari = new Ferrari(300);
	
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.frear();
		System.out.println(ferrari.velocidade);
	}
}
