package Generation_Java;

public class Legumes {
	
	String nome;
	double peso;
	String tipo;
	String cor;
	double pre�o;
	
	public Legumes (String nome, double peso, String tipo, String cor, double pre�o)//construtor
	{
		this.nome = nome;
		this.peso = peso;
		this.tipo = tipo;
		this.cor = cor;		
		this.pre�o = pre�o;
	}
	
	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCaixa()
	{
		String Caixa = "Seja bem vindo ao caixa! Passe aqui seus pedidos: ";
		return Caixa;
	}
	
	public double getCompra()
	{
		double Compra = pre�o;
		return Compra;
	}
	
	public double getPreco() {
		return pre�o;
	}

	public void setPreco(double preco) {
		this.pre�o = preco;
	}

	public String isDisponibilidade() {
		// TODO Auto-generated method stub
		return "Em estoque";
	}
	
	/*public double getTotal()
	{
		// while// total da compra
		
	}*/
}

	
	

