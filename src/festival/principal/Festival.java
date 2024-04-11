package festival.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import festival.classes.Artista;
import festival.classes.Cantor;
import festival.classes.Banda;
import festival.classes.Eventos;
import festival.classes.Palco;

public class Festival {
	public static void main(String[] args) {
	
		Artista cantor1 = new Cantor("Ludmilla", 100000);
		Artista cantor2 = new Cantor("Iza", 15000);
		Artista	banda1 = new Banda("Red Hot Chilli Peppers", 200000);
		Artista	banda2 = new Banda("The Cure", 100000);
		
		Palco palcoPrincipal = new Palco("Palco Principal", 20000);
		
		palcoPrincipal.adicionaEventos(new Eventos(cantor2, LocalDate.of(2024, 05, 20), LocalTime.of(19, 00)));
		palcoPrincipal.adicionaEventos(new Eventos(banda1, LocalDate.of(2024, 05, 20), LocalTime.of(22, 00)));
		palcoPrincipal.adicionaEventos(new Eventos(cantor1, LocalDate.of(2024, 05, 21), LocalTime.of(18, 00)));
		palcoPrincipal.adicionaEventos(new Eventos(banda2, LocalDate.of(2024, 05, 21), LocalTime.of(23, 00)));
		
		System.out.println(palcoPrincipal);
		palcoPrincipal.exibeEventos();
		
	}
	
}
