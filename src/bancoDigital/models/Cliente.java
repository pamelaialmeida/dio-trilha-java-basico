package bancoDigital.models;

public class Cliente {
	
	private String nomeCliente;
	private String telefoneCliente;
	private String emailCliente;
	
	public Cliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	/**
	 * Metodo que retorna o nome do cliente
	 * @return nomeCliente
	 */
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	/**
	 * Metodo para alterar nome do cliente
	 */
	public void alterarNomeCliente(String nome) {
		this.nomeCliente = nome;
	}
	
	/**
	 * Metodo para alterar telefone do cliente
	 */
	public void alterarTelefoneCliente(String telefone) {
		this.telefoneCliente = telefone;
	}
	
	/**
	 * Metodo para alterar email do cliente
	 */
	public void alterarEmailCliente(String email) {
		this.emailCliente = email;
	}
	
	/**
	 * Metodo que retorna o telefone do cliente
	 * @return telefoneCliente
	 */
	public String getTelefoneCliente() {
		return this.telefoneCliente;
	}
	
	/**
	 * Metodo que retorna o email do cliente
	 * @return emailCliente
	 */
	public String getEmailCliente() {
		return this.emailCliente;
	}

}
