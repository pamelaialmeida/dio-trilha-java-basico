package bancoDigital.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nomebanco;
	private List<Conta> contasBanco;
	
	public Banco(String nomeBanco) {
		this.nomebanco = nomeBanco;
		this.contasBanco = new ArrayList();
	}
	
	/**
	 * Metodo que retorna o nome do banco
	 * @return nomeBanco
	 */
	public String getNomeBanco() {
		return this.nomebanco;
	}
	
	/**
	 * Metodo para adicionar/vincular conta ao banco
	 */
	public void vincularContaAoBanco(Conta conta) {
		this.contasBanco.add(conta);
	}

	/**
	 * Metodo que retorna lista de contas do banco
	 * @return contasBanco
	 */
	public List<Conta> listarContas(){
		return this.contasBanco;
	}

	/**
	 * Metodo para listar clientes do banco
	 */
	public List<String> listarClientesBanco(){
		List<String> clientesBanco = new ArrayList<String>();
		if(!contasBanco.isEmpty()) {
			for (Conta conta : contasBanco) {
				clientesBanco.add(conta.titularConta.getNomeCliente());
			}
		}
		return clientesBanco;
	}
}
