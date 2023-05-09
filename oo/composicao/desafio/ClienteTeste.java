package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.16,100);
		compra1.adicionarItem(new Produto("Notebook",1897.56),2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Borracha", 2.16,100);
		compra2.adicionarItem(new Produto("Cardeno",20.56),50);
		
		Cliente cliente = new Cliente("Hugo Ferreira");
		cliente.adicinonarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
