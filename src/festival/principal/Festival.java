package festival.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import festival.classes.Artista;
import festival.classes.Cantor;
import festival.classes.Banda;
import festival.classes.Eventos;
import festival.classes.Palco;

public class Festival {
	public static void main(String[] args) {
	
		Artista cantor1 = new Cantor("Ludmilla", 20000);
		Artista	banda1 = new Banda("Red Hot Chilli Peppers", 25000);
		
		Palco palcoPrincipal = new Palco("Palco Principal", 50000);
		
		palcoPrincipal.adicionaEventos(new Eventos(cantor1, LocalDate.of(2024, 05, 05), LocalTime.of(21, 00)));
		palcoPrincipal.adicionaEventos(new Eventos(banda1, LocalDate.of(2024, 05, 05), LocalTime.of(22, 00)));
		
		System.out.println(palcoPrincipal);
		palcoPrincipal.exibeEventos();
	}
	
}
