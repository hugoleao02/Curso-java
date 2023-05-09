package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d = new Data(25,05,1998);
	
		System.out.println(d.obterDataFormatada());
		d.imprimirDataFormatada();
		
		var d2 = new Data();
		d2.dia = 1;
		d2.mes = 1;
		d2.ano = 1970;
		
		System.out.println(d2.obterDataFormatada());
		d2.imprimirDataFormatada();
	}
}
