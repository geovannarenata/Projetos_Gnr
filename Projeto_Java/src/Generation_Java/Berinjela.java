package Generation_Java;

public class Berinjela extends Legumes{
	
	private boolean disponibilidade;
	
	public Berinjela(String nome, double peso, String tipo, String cor, double pre�o, boolean disponibilidade)
	{
		super(nome, peso, tipo, cor, pre�o);
		this.disponibilidade = disponibilidade;
	}


	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	

}
