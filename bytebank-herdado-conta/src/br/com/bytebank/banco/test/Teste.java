package br.com.bytebank.banco.test;


import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		//System.out.println("x");
		//System.out.println(3);
		//System.out.println(3.3);
		
		Object cc = new ContaCorrente(123, 456);
		Object cp = new ContaPoupanca(123, 321);
		Object cliente = new Cliente();
		
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cc);
		//println(cp);
		//println(cliente);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean x) {}
	static void println(Object c) {}

}
