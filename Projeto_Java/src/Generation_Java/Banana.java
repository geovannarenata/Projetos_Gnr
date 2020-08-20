package Generation_Java;

public class Banana extends Frutas{
	
	private boolean disponibilidade;
	
	public Banana(String nome, double peso, String tipo, String cor, double preco, boolean disponibilidade)
	{
		super(nome, peso, tipo, cor, preco);
		this.disponibilidade = disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	
	

}
