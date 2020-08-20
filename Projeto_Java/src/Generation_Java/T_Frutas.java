package Generation_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T_Frutas {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		Frutas bananaVerde = new Banana("Banana", 1.0, "Nanica", "Verde", 4.70, true);
		
		System.out.println("Produto "+ bananaVerde.getNome());
		System.out.println("Peso: "+ bananaVerde.getPeso() + " Kg");
		System.out.println("Tipo: " + bananaVerde.getTipo());
		System.out.println("Cor: "+ bananaVerde.getCor());
		System.out.println("Preço: R$ " + bananaVerde.getPreco());
		System.out.println("Disponibilidade: " + bananaVerde.isDisponibilidade());
		System.out.println("\n");
		
		Frutas bananaNanica = new Banana("Banana Nanica", 4.0, "Anã", "Amarela", 3.50, true);
		{
			System.out.println("Produto "+ bananaNanica.getNome());
			System.out.println("Peso: "+ bananaNanica.getPeso() + " Kg");
			System.out.println("Tipo: " + bananaNanica.getTipo());
			System.out.println("Cor: "+ bananaNanica.getCor());
			System.out.println("Preço: R$ " + bananaNanica.getPreco());
			System.out.println("Disponibilidade: " + bananaNanica.isDisponibilidade());
			System.out.println("\n");
			
		}
		
		Frutas UvaVerde = new Uva("Uva Verde", 5.4, "Itália", "Rosada", 7.50,  true);
		{
			System.out.println("Produto "+ UvaVerde.getNome());
			System.out.println("Peso: "+ UvaVerde.getPeso() + " Kg");
			System.out.println("Tipo: " + UvaVerde.getTipo());
			System.out.println("Cor: "+ UvaVerde.getCor());
			System.out.println("Preço: R$ " + UvaVerde.getPreco());
			System.out.println("Disponibilidade: " + UvaVerde.isDisponibilidade());
			System.out.println("\n");
		}
		
		Frutas UvaRoxa = new Uva("Uva Roxa", 5.4, "Thompson", "Âmbar", 5.25, true);
		{
			System.out.println("Produto "+ UvaRoxa.getNome());
			System.out.println("Peso: "+ UvaRoxa.getPeso() + " Kg");
			System.out.println("Tipo: " + UvaRoxa.getTipo());
			System.out.println("Cor: "+ UvaRoxa.getCor());
			System.out.println("Preço: R$ " + UvaRoxa.getPreco());
			System.out.println("Disponibilidade: " + UvaRoxa.isDisponibilidade());
			System.out.println("\n");
		}
		
		Legumes berinjela = new Berinjela("Berinjela Roxa", 2.5, "Comprida Roxa", "Roxa Escuro", 3.50, true);
		{
			System.out.println("Produto "+ berinjela.getNome());
			System.out.println("Peso: "+ berinjela.getPeso() + " Kg");
			System.out.println("Tipo: " + berinjela.getTipo());
			System.out.println("Cor: "+ berinjela.getCor());
			System.out.println("Preço: R$ " + berinjela.getPreco());
			System.out.println("Disponibilidade: " + berinjela.isDisponibilidade());
			System.out.println("\n");
		}
		
		Legumes berinjelaBilbo = new Berinjela("Berinjela Bilbo", 2.5, "Mini Berinjela Bilbo", "Roxa Rajada", 4.75, true);
		{
			System.out.println("Produto "+ berinjelaBilbo.getNome());
			System.out.println("Peso: "+ berinjelaBilbo.getPeso() + " Kg");
			System.out.println("Tipo: " + berinjelaBilbo.getTipo());
			System.out.println("Cor: "+ berinjelaBilbo.getCor());
			System.out.println("Preço: R$ " + berinjelaBilbo.getPreco());
			System.out.println("Disponibilidade: " + berinjelaBilbo.isDisponibilidade());
			System.out.println("\n");
		}
		
	
		
		
		
		
	}
	
}
