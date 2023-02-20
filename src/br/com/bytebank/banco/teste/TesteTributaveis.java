package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;



public class TesteTributaveis {
public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente(111, 333);
	cc.deposita(1000.0);
	
	SeguroDeVida sv = new SeguroDeVida(60);
	
	
	CalculadorImposto ci = new CalculadorImposto();
	System.out.println("O seu saldo tributado eh: " + ci.registro(cc));
	
	System.out.println("O seguro de vida ja tributado, vai custar " + ci.registro(sv));
	
	}
}
