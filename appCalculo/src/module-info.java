
module appCalculo {

	exports br.com.co3r.calculo;
	requires appLoging;
	
	exports br.com.co3r.calculo.interno
		to appFinanceiro;
	
	requires appApiPublica;
	provides br.com.cod3r.appApiPublica.Calculadora
		with br.com.co3r.calculo.CalculadoraImpl;
}