package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
			conta.saca(210);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
		
	}
}
