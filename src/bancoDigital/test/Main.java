package bancoDigital.test;

import bancoDigital.models.Banco;
import bancoDigital.models.Cliente;
import bancoDigital.models.ContaCorrente;
import bancoDigital.models.ContaPoupança;

public class Main {

	public static void main(String[] args) {
		Banco bancoABC = new Banco("ABC");
		Cliente pamela = new Cliente("Pamela");
		
		ContaCorrente contaCorrente = new ContaCorrente(pamela, bancoABC);
		ContaPoupança contaPoupanca = new ContaPoupança(pamela, bancoABC);
		
		
		contaPoupanca.imprimirResumo();
		
		contaCorrente.imprimirResumo();		
		contaCorrente.depositar(300.0);
		System.out.println(contaCorrente.consultarSaldo());
		
		contaCorrente.sacar(50.0);
		System.out.println(contaCorrente.consultarSaldo());
		
		contaCorrente.transferir(100.0, contaPoupanca);
		System.out.println(contaCorrente.consultarSaldo());
		contaCorrente.imprimirExtratoTransacoes();
		
		System.out.println(contaPoupanca.consultarSaldo());
		contaPoupanca.imprimirExtratoTransacoes();
	}

}
