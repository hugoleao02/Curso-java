package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	// velociade atual
	public int velocidade;
	private int delta = 5;
	
	
	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	// metodo acelera
	public void acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getDelta();
		}
	}

	// metodo frear
	public void frear() {
		if (velocidade != 0) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}

	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

}
