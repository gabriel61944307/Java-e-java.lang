package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.model.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		// passando agencia e numero para o construtor da classe m�e pois apenas o construtor padr�o � herdado automaticamente
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
