package Generation_Java;

public class Frutas {
		String nome;
		double peso;
		String tipo;
		String cor;
		double preco;
		
		public Frutas (String nome, double peso, String tipo, String cor, double preco)
		{
			this.nome = nome;
			this.peso = peso;
			this.tipo = tipo;
			this.cor = cor;		
			this.preco = preco;
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

		public String isDisponibilidade() {
			// TODO Auto-generated method stub
			return "Em estoque";
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		

		
		
	}
	

