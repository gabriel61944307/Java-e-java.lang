package br.com.bytebank.banco.test;

public class TesteString {
	public static void main(String[] args) {
		String nome = "Alura"; //object literal
		//String outro = new String("Outra string");
		
		
		nome += nome.replace("A", "a");
		//nome.toLowerCase();
		
		System.out.println(nome);
	}
}
