package bancoDigital.models;

public class ContaPoupança extends Conta {
	
	public ContaPoupança(Cliente titularConta, Banco bancoDaConta) {
		super(titularConta, bancoDaConta);
	}

	/**
	 * Metodo para imprimir resumo da conta poupanca
	 */
	public void imprimirResumo() {
		System.out.println("=== Resumo Dados Conta Poupanca ===");
		super.imprimirResumoConta();
	}
	
	/**
	 * Metodo para imprimir extrato de transacoes da conta poupanca
	 */
	public void imprimirExtratoTransacoes() {
		System.out.println("=== Extrato de Transacoes da Conta Poupanca ===");
		super.imprimirExtratoConta();
	}

}
