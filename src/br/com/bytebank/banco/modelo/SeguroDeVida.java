package br.com.bytebank.banco.modelo;


public class SeguroDeVida implements Tributavel {

	private double idade;
	private double valorInicial = 20.0;
	
	
	public SeguroDeVida(double idade) {
		if(idade >= 0 && idade <= 120)
		this.idade = idade;
		else {
			System.out.println("idade invalida");
		}
	}
	
	@Override
	public double getValorImposto() {
		if(this.idade <= 10) {
			return this.valorInicial; 
		} else if (this.idade <= 20) {
			return 20 * 0.1 + this.valorInicial;
		} else if (this.idade <= 30) {
			return 20 * 0.2 + this.valorInicial;
		} else if (this.idade <= 40) {
			return 20 * 0.3 + this.valorInicial;
		} else if (this.idade <= 50) {
			return 20 * 0.4 + this.valorInicial;
		} else if (this.idade <= 60) {
			return 20 * 0.5 + this.valorInicial;
		} else if (this.idade <= 70) {
			return 20 * 0.6 + this.valorInicial;
		} else if (this.idade <= 80) {
			return 20 * 0.7 + this.valorInicial;
		} else if (this.idade <= 90) {
			return 20 * 0.8 + this.valorInicial;
		} else if (this.idade <= 100) {
			return 20 * 0.9 + this.valorInicial;
		} else {
			return 20 * 1.0 + this.valorInicial;
		}
	
	}
}
