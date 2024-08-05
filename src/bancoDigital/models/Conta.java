package bancoDigital.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int sequencial = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente titularConta;
	protected List<Transacao> transacoesConta;
	protected Banco bancoDaConta;
	
	/**
	 * Construtor que cria conta gerando numero de agencia e de conta, alem de setar saldo inicial
	 */
	public Conta(Cliente titularConta, Banco bancoDaConta) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = sequencial++;
		this.saldo = 0.00;
		this.titularConta = titularConta;
		this.transacoesConta = new ArrayList<Transacao>();
		this.bancoDaConta = bancoDaConta;
		bancoDaConta.vincularContaAoBanco(this);
	}
	
	/**
	 * Metodo que permite sacar valores da conta
	 * @param valor
	 */
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor invalido. Por favor, informe valor valido. Saque nao realizado.");
		} else if (valor > this.saldo) {
			System.out.println("Saque nao realizado. Voce nao possui saldo suficiente para realizar este saque.");
		} else {
			this.saldo -= valor;
			transacoesConta.add(new Transacao("Saque de R$" + valor + " realizado."));
		}				
	}
	
	/**
	 * Metodo que permite depositar valores na conta
	 * @param valor
	 */
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor invalido. Por favor, informe valor valido. Deposito nao realizado.");
		} else {
			this.saldo += valor;
			transacoesConta.add(new Transacao("Deposito de R$" + valor + " realizado."));
		}		
	}
	
	/**
	 * Metodo para realizar transferencia entre contas de qualquer tipo
	 * @param valor
	 * @param contaDestino
	 */
	public void transferir(double valor, Conta contaDestino) {
		try {
			this.sacar(valor);
			contaDestino.depositar(valor);
			this.transacoesConta.add(new Transacao("Transferido valor R$" + valor + " para conta " + contaDestino.numeroConta));
			contaDestino.transacoesConta.add(new Transacao("Recebido valor R$" + valor + " transferido da conta " + this.numeroConta));
		} catch (Exception e) {
			System.out.println("Algo inesperado aconteceu: " + e);
		}		
	}
	
	/**
	 * Metodo que permite consultar valor do saldo da conta
	 * @return double saldo
	 */
	public double consultarSaldo() {
		return this.saldo;
	}

	/**
	 * Metodo para imprimir resumo de conta com as informacoes de agencia, numero de conta e saldo
	 */
	protected void imprimirResumoConta() {
		System.out.println(String.format("Banco: %s", this.bancoDaConta.getNomeBanco()));
		System.out.println(String.format("Titular: %s", this.titularConta.getNomeCliente()));
		System.out.println(String.format("Agencia: %03d", this.agencia));
		System.out.println(String.format("Numero: %03d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	/**
	 * Metodo para imprimir extrato das transacoes da conta
	 */
	protected void imprimirExtratoConta() {
		System.out.println(String.format("Banco: %s", this.bancoDaConta.getNomeBanco()));
		System.out.println(String.format("Titular: %s", this.titularConta.getNomeCliente()));
		System.out.println(String.format("Agencia: %03d", this.agencia));
		System.out.println(String.format("Numero: %03d", this.numeroConta));
		
		for (Transacao transacao : transacoesConta) {
			System.out.println(transacao.getTransacao());
		}		
		
		System.out.println("-------------------------------------------------");
		System.out.println(String.format("Saldo atual: %.2f", this.saldo));
	}

}
