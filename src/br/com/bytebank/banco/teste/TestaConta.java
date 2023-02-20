package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111,111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cc.deposita(100.0);
		cp.deposita(200.0);
		
		try {
			cc.transfere(20, cp);
		} catch (SaldoInsuficienteException e) {
			
			e.printStackTrace();
		}
		
		try {
			cc.transfere(100.0, cp);
		} catch (SaldoInsuficienteException e) {
			
			e.printStackTrace();
		}

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cc.getSaldo());

	}
}
