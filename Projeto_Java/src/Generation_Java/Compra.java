package Generation_Java;

public class Compra extends Frutas{
	
	private boolean disponibilidade;
	
	public Compra(String nome, double peso, String tipo, String cor, double pre�o, boolean disponibilidade) 
	{
		super(nome, peso, tipo, cor, pre�o);
		this.disponibilidade = disponibilidade;	
	
	}

	double Total = 0;
	double pre�o = 0;

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = (total+pre�o);
	}
	
	public double getPre�o()
	{
		return pre�o;
	}
	
	
	
	
	
}