package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.CalculadorDeImposto;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new br.com.bytebank.banco.model.SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		
		ci.registra(cc);
		ci.registra(sv);
		System.out.println(ci.getTotalImposto());
	}
}
