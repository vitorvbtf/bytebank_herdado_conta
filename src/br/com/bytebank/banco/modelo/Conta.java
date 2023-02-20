package br.com.bytebank.banco.modelo;

/**
 * 
 * @author Vitor Bruno
 * @since 1.0
 *
 */
public abstract class Conta  {

	protected double saldo;
	private int agencia;
	private int numero;
	private Conta titular;
	private static int total = 0;
	
	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		if(agencia >0) {
			this.agencia = agencia;
			this.numero = numero;
		} else {
			this.agencia = 1999;
			this.numero = 2000;
		}
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(valor > this.saldo) {
			//Problema
			throw new SaldoInsuficienteException("O seu saldo eh insuficiente para fazer esse tipo de operacao. Saldo: " + this.getSaldo() + " valor: " + valor);
		} else {
			this.saldo -= valor;
		}
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		    saca(valor);
			destino.deposita(valor);
		} 


	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta getTitular() {
		return titular;
	}

	public void setTitular(Conta titular) {
		this.titular = titular;
	}
	
	public int getTotal() {
		return Conta.total;
	}
}
