package br.com.co3r.calculo;

import br.com.co3r.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.appApiPublica.Calculadora;
import br.com.cod3r.appLoging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "Abc";
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
