package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(112, 112);
		cp.deposita(200);
		
		
		System.out.println("CC = " + cc.getSaldo());
		System.out.println("CP = " + cp.getSaldo());
		cc.transfere(10.0, cp);
		System.out.println("CC = " + cc.getSaldo());
		System.out.println("CP = " + cp.getSaldo());
	}
}