package br.com.bytebank.banco.model;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		// passando agencia e numero para o construtor da classe m�e pois apenas o construtor padr�o � herdado automaticamente
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double ValorASacar = valor + 0.2;
		super.saca(ValorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
}
