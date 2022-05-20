package br.com.bytebank.banco.model;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(int agencia, int numero) {
		// passando agencia e numero para o construtor da classe m�e pois apenas o construtor padr�o � herdado automaticamente
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta Poupanca, " + super.toString();
	}
}
