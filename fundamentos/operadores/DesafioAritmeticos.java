package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double numA = Math.pow(6*(3+2), 2);
		double denA = 3*2;
		
		double denB = 2;
		double numB = Math.pow((1 - 5)*(2-7)/denB, 2);
		
		
		double superior1 = numA / denA;
		double superior2 = numB;
		
		
		double superior3 = Math.pow(superior1 - superior2, 3);
		double inferior =  Math.pow(10, 3);
		
		double resultado = superior3 / inferior;
		
		System.out.println("O resultado é " + resultado);
		
		
	}

}
