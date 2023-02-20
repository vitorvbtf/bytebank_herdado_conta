package br.com.bytebank.banco.modelo;

public class CalculadorImposto {

	public double registro(Tributavel x) {
		double valorDoProduto = x.getValorImposto();
		return valorDoProduto;
	}
}
