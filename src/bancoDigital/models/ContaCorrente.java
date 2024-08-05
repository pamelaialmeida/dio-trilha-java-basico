package bancoDigital.models;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente titularConta, Banco bancoDaConta) {
		super(titularConta, bancoDaConta);
	}

	/**
	 * Metodo para imprimir resumo da conta corrente
	 */
	public void imprimirResumo() {
		System.out.println("=== Resumo Dados Conta Corrente ===");
		super.imprimirResumoConta();
	}
	
	/**
	 * Metodo para imprimir extrato de transacoes da conta corrente
	 */
	public void imprimirExtratoTransacoes() {
		System.out.println("=== Extrato de Transacoes da Conta Corrente ===");
		super.imprimirExtratoConta();
	}

}
