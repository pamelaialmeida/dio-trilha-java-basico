package bancoDigital.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import bancoDigital.models.Banco;
import bancoDigital.models.Cliente;
import bancoDigital.models.ContaCorrente;
import bancoDigital.models.ContaPoupança;

class BancoTest {

	/**
	 * Metodo de teste para validar que o nome do banco é retornado corretamente
	 */
	@Test
	void deveRetornarNomeDoBanco() {
		String nomeBanco = "ABC Bank";
		
		Banco bancoABC = new Banco(nomeBanco);
		assertEquals(nomeBanco, bancoABC.getNomeBanco());
	}

	/**
	 * Metodo de teste para validar que lista corretamente somente as contas vinculadas ao banco
	 */
	@Test
	void deveRetornarListaDeContasDoBanco() {
		String nomePrimeiroBanco = "Pam Bank";
		String nomeSegundoBanco = "DEF Bank";
		
		//Criando duas instancias diferentes da classe Banco
		Banco bancoPam = new Banco(nomePrimeiroBanco);
		Banco defBank = new Banco(nomeSegundoBanco);
		
		//Criando instancias de clientes para criar contas
		Cliente jose = new Cliente("Jose");
		Cliente maria = new Cliente("Maria");
		
		//Criando contas que pertencem ao primeiro banco
		ContaCorrente contaCorrenteUm = new ContaCorrente(maria, bancoPam);
		ContaPoupança contaPoupancaUm = new ContaPoupança(jose, bancoPam);
		
		//Criando conta que pertence ao segundo banco
		ContaCorrente contaCorrenteDois = new ContaCorrente(jose, defBank);
		
		assertTrue(bancoPam.listarContas().contains(contaCorrenteUm) && 
				bancoPam.listarContas().contains(contaPoupancaUm) && 
				!bancoPam.listarContas().contains(contaCorrenteDois), "Listagem de contas incorreta para o banco " + bancoPam.getNomeBanco());
	}
	
	/**
	 * Metodo de teste para validar que lista corretamente somente os clientes vinculados as contas do banco
	 */
	@Test
	void deveRetornarListaDeClientesDoBanco() {
		String nomePrimeiroBanco = "Pam Bank";
		String nomeSegundoBanco = "DEF Bank";
		
		//Criando duas instancias diferentes da classe Banco
		Banco bancoPam = new Banco(nomePrimeiroBanco);
		Banco defBank = new Banco(nomeSegundoBanco);
		
		//Criando instancias de clientes para criar contas
		Cliente jose = new Cliente("Jose");
		Cliente maria = new Cliente("Maria");
		Cliente joao = new Cliente("Joao");
		
		//Criando contas que pertencem ao primeiro banco
		ContaCorrente contaCorrenteUm = new ContaCorrente(maria, bancoPam);
		ContaPoupança contaPoupancaUm = new ContaPoupança(jose, bancoPam);
		
		//Criando conta que pertence ao segundo banco
		ContaCorrente contaCorrenteDois = new ContaCorrente(joao, defBank);
		
		assertTrue(bancoPam.listarClientesBanco().contains(jose.getNomeCliente()) && 
				bancoPam.listarClientesBanco().contains(maria.getNomeCliente()) && 
				!bancoPam.listarClientesBanco().contains(joao.getNomeCliente()), "Listagem de clientes incorreta para o banco " + bancoPam.getNomeBanco());
	}
}
