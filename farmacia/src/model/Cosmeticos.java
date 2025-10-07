package model;

public class Cosmeticos extends Produto {
	private String fragrancia;

	public Cosmeticos(int id, String nome, int categoria, float preco, String fragrancia) {
		super(id, nome, categoria, preco);
		this.fragrancia = fragrancia;

	}

	public String getFragancia() {
		return fragrancia;
	}

	public void setFragancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.printf("Fragrância: %s\n", this.fragrancia);
	}
	
	
	
	
	
	
}
