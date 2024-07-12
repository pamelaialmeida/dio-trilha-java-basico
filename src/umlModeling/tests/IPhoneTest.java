package umlModeling.tests;

import umlModeling.classes.IPhone;

public class IPhoneTest {
	//Essa classe terá somente o metodo main mas poderia ser uma classe de teste
	public static void main(String[] args) {
		IPhone iphone = new IPhone("5S", "Branco", "XPTO1234");
		
		System.out.println("Informações do aparelho: "
				+ "Modelo: " + iphone.getModelo()
				+ "Cor: " + iphone.getCor()
				+ "IMEI: " + iphone.getImei());
		
		//Usando funções de Aparelho Telefonico
		iphone.ligar("1234567890");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		//Usando funções de Reprodutor Musical
		iphone.selecionarMusica("Careless whisper - George Michael");
		iphone.tocar();
		iphone.pausar();
		
		//Usando funções de Navegador Internet
		iphone.exibirPagina("https://www.google.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}

}
