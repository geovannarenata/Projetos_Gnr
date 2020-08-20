package Generation_Java;

public class Compra extends Frutas{
	
	private boolean disponibilidade;
	
	public Compra(String nome, double peso, String tipo, String cor, double preço, boolean disponibilidade) 
	{
		super(nome, peso, tipo, cor, preço);
		this.disponibilidade = disponibilidade;	
	
	}

	double Total = 0;
	double preço = 0;

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = (total+preço);
	}
	
	public double getPreço()
	{
		return preço;
	}
	
	
	
	
	
}