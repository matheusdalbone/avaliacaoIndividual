package festival.classes;

public abstract class Artista {
	private String nome;
	private double cache;
	
	public Artista(String nome, double cache) {
		this.nome = nome;
		this.cache = cache;
	}

	public String getNome() {
		return nome;
	};

	public double getCache() {
		return cache;
	}
	
	public void setCache(double cache) {
		this.cache = cache;
	}

	public String toString() {
		return String.format("""
				%s
				""", nome);
	}
}