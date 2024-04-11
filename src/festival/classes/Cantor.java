package festival.classes;

public class Cantor extends Artista{
	
	protected static String tipo = "Cantor";
	
	public Cantor(String nome, double cache) {
		super(nome, cache);
	}

	public static String getTipo() {
		return tipo;
	}
	

}
