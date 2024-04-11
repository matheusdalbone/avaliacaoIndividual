package festival.classes;

public class Banda extends Artista{
	protected static String tipo = "Banda";
		
	public Banda(String nome, double cache) {
		super(nome, cache);
	}

	public static String getTipo() {
		return tipo;
	}

}
