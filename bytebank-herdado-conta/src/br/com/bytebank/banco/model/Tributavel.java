package br.com.bytebank.banco.model;

public interface Tributavel {
	
	//N�o � necessario escrever public abstract antes do m�todo pois este � o padr�o de uma interface
	double getValorImposto();
}
