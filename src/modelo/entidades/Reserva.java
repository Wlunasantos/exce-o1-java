package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroDaSala;
	private Date entrada;
	private Date saida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer numeroDaSala, Date entrada, Date saida) {
		this.numeroDaSala = numeroDaSala;
		this.entrada = entrada;
		this.saida = saida;
	}


	public Integer getNumeroDaSala() {
		return numeroDaSala;
	}


	public void setNumeroDaSala(Integer numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}


	public Date getEntrada() {
		return entrada;
	}


	public Date getSaida() {
		return saida;
	}
	
	public long duracao() {
		long diferente = saida.getTime() - entrada.getTime(); // Devolve a quantidade de milisegundos das datas
		return TimeUnit.DAYS.convert(diferente, TimeUnit.MILLISECONDS);// Converte o valor de milisegundos para dias 
	}

	public void atualizarDatas(Date entrada, Date saida) {
		this.entrada = entrada;
		this.saida = saida;
	}
	
	@Override // Sobreposição
	public String toString() {
		return " Sala " 
				+ numeroDaSala 
				+ " Entrada: "
				+ sdf.format(entrada)
				+ ", Saída: "
				+ sdf.format(saida)
				+ ", "
				+ duracao()
				+ " Noites: ";
				
				
	}
	
}
