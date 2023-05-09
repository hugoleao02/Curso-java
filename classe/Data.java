package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		this(1,1,1970);
		
	}
	
	Data(int dia, int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		
		final String formato = "%d/0%d/%d";
		
	 if(mes < 10) {
		return String.format(formato,this.dia, this.mes, this.ano);
	 }else {
		 return String.format(formato,this.dia, this.mes, this.ano);
	 }
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
