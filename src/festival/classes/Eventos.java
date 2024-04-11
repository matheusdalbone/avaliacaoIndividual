package festival.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Eventos{
	private Artista nome;
	private LocalDate dataApresentacao;
	private LocalTime horarioApresentacao;
	
	public Eventos(Artista nome, LocalDate dataApresentacao, LocalTime horarioApresentacao) {
		this.nome = nome;
		this.dataApresentacao = dataApresentacao;
		this.horarioApresentacao = horarioApresentacao;
	}
	
	public Artista getNome() {
		return nome;
	}
	
	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}

	public LocalTime getHorarioApresentacao() {
		return horarioApresentacao;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("""
				  Artista: %s  Data de Apresentação: %s
				  Horario de Apresentação: %s
				""", nome, df.format(dataApresentacao), horarioApresentacao);
	}
}
