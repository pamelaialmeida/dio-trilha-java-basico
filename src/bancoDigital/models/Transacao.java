package bancoDigital.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
	
	private String dataHoraTransacao;
	private String descricaoTransacao;
	
	public Transacao(String descricaoTransacao) {
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");		
		this.dataHoraTransacao = dataHora.format(formatter);
		this.descricaoTransacao = descricaoTransacao;
	}
	
	/**
	 * Metodo para pegar a data e hora da transacao
	 * @return dataHoraTransacao - descricaoTransacao
	 */
	public String getTransacao() {
		return dataHoraTransacao + " - " + descricaoTransacao;
	}

	
	

}
