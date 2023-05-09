package oo.polimorrfismo;

public class jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);
	
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());
		
		Sorvete  sobremessa = new Sorvete(0.4);
		
		convidado.comer(sobremessa);
		System.out.println(convidado.getPeso());
	}
}
