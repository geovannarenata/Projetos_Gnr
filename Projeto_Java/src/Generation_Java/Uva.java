package Generation_Java;

public class Uva extends Frutas {
	
	private boolean disponibilidade;
	
	public Uva(String nome, double peso, String tipo, String cor, double preco, boolean disponibilidade)
	{
		super(nome, peso, tipo, cor, preco);
		this.disponibilidade = disponibilidade;
	}

	
}
