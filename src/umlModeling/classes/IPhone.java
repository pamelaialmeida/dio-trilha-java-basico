package umlModeling.classes;

import umlModeling.interfaces.AparelhoTelefonico;
import umlModeling.interfaces.NavegadorInternet;
import umlModeling.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	private String modelo;
	private String cor;
	private String imei;
	
	public IPhone(String modelo, String cor, String imei) {
		this.modelo = modelo;
		this.cor = cor;
		this.imei = imei;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getImei() {
		return imei;
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url + ".");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando nova página.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número informado: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica solicitada: " + musica);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica.");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}	

}
