package festival.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nome;
	private int capacidade;
	private List<Eventos> eventos = new ArrayList<>();
	
	public Palco(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public List<Eventos> getEventos() {
		return eventos;
	}
	
	public void setEventos(List<Eventos> eventos) {
		this.eventos = eventos;
	}

	public void adicionaEventos(Eventos eventos) {
		this.eventos.add(eventos);
	}
	
	public void exibeEventos() {
		for(Eventos eventos : eventos) {
			System.out.println(eventos);
		}
	}
	
	@Override
	public String toString() { 
		return String.format("""
				Palco: %s
				Capacidade: %s
				--------------Eventos--------------
				""", nome, capacidade);
	}
}
