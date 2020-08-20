package Generation_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Projeto_Inicial {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0 , produto=0, contBV=0, contBN=0, contUV=0, contUr=0, contBR=0, contBB=0;
		double pagamento=0;
		
		
		System.out.println("\n----------- Menu de Opções -----------");

		System.out.println("\n1) Escolhas os Produtos \n2) Carrinho \n3) Pagamento \n4) Categorias & Produtos \n5) Finalizar Sessão ");
		opcao = sc.nextInt();
		
	//Escolha dos produtos
	switch (opcao) {
	
	
	case 1:  { 
			
			String[] produtosEscolhidos = new String[20];
					
			System.out.println("----------\tProdutos\t----------");
						
			Frutas bananaVerde = new Banana("Banana", 1.0, "Nanica", "Verde", 4.70, true);
			
			System.out.println("1 -- Produto "+ bananaVerde.getNome());
			System.out.println("Peso: \t"+ bananaVerde.getPeso() + " Kg");
			System.out.println("Tipo: \t" + bananaVerde.getTipo());
			System.out.println("Cor: \t"+ bananaVerde.getCor());
			System.out.println("Preço: \tR$ " + bananaVerde.getPreco());
			System.out.println("Disponibilidade: " + bananaVerde.isDisponibilidade());
			System.out.println("\n");
			
			Frutas bananaNanica = new Banana("Banana Nanica", 1.0, "Anã", "Amarela", 3.50, true);
			{
				System.out.println("2 -- Produto "+ bananaNanica.getNome());
				System.out.println("Peso: \t"+ bananaNanica.getPeso() + " Kg");
				System.out.println("Tipo: \t" + bananaNanica.getTipo());
				System.out.println("Cor: \t"+ bananaNanica.getCor());
				System.out.println("Preço: \tR$ " + bananaNanica.getPreco());
				System.out.println("Disponibilidade: " + bananaNanica.isDisponibilidade());
				System.out.println("\n");
				
			}
			
			Frutas UvaVerde = new Uva("Uva Verde", 1.0, "Itália", "Rosada", 7.50,  true);
			{
				System.out.println("3 -- Produto "+ UvaVerde.getNome());
				System.out.println("Peso: \t"+ UvaVerde.getPeso() + " Kg");
				System.out.println("Tipo: \t" + UvaVerde.getTipo());
				System.out.println("Cor: \t"+ UvaVerde.getCor());
				System.out.println("Preço: \tR$ " + UvaVerde.getPreco());
				System.out.println("Disponibilidade: " + UvaVerde.isDisponibilidade());
				System.out.println("\n");
			}
			
			Frutas UvaRoxa = new Uva("Uva Roxa", 1.5, "Thompson", "Âmbar", 5.25, true);
			{
				System.out.println("4 -- Produto "+ UvaRoxa.getNome());
				System.out.println("Peso: \t"+ UvaRoxa.getPeso() + " Kg");
				System.out.println("Tipo: \t" + UvaRoxa.getTipo());
				System.out.println("Cor: \t"+ UvaRoxa.getCor());
				System.out.println("Preço: \tR$ " + UvaRoxa.getPreco());
				System.out.println("Disponibilidade: " + UvaRoxa.isDisponibilidade());
				System.out.println("\n");
			}
			
			Legumes berinjela = new Berinjela("Berinjela Roxa", 1.5 , "Comprida Roxa", "Roxa Escuro", 3.50, true);
			{
				System.out.println("5 -- Produto "+ berinjela.getNome());
				System.out.println("Peso: \t"+ berinjela.getPeso() + " Kg");
				System.out.println("Tipo: \t" + berinjela.getTipo());
				System.out.println("Cor: \t"+ berinjela.getCor());
				System.out.println("Preço: \tR$ " + berinjela.getPreco());
				System.out.println("Disponibilidade: " + berinjela.isDisponibilidade());
				System.out.println("\n");
			}
			
			Legumes berinjelaBilbo = new Berinjela("Berinjela Bilbo", 1.0 , "Mini Berinjela Bilbo", "Roxa Rajada", 4.75, true);
			{
				System.out.println("6 -- Produto "+ berinjelaBilbo.getNome());
				System.out.println("Peso: \t"+ berinjelaBilbo.getPeso() + " Kg");
				System.out.println("Tipo: \t" + berinjelaBilbo.getTipo());
				System.out.println("Cor: \t"+ berinjelaBilbo.getCor());
				System.out.println("Preço: \tR$ " + berinjelaBilbo.getPreco());
				System.out.println("Disponibilidade: " + berinjelaBilbo.isDisponibilidade());
			}
			
			// pegando os nomes e anexando no array
			for ( int i=0; i< 6; i++)
			{
				System.out.println("\nSelecione o n° do produto para adicioná-lo em seu carrinho: ");
				produto = sc.nextInt();
				
				if(produto == 1) 
				{	
					String escolha = bananaVerde.getNome();
					produtosEscolhidos[i] = escolha;
					contBV++;
				}
				if (produto == 2)
				{
					String escolha = bananaNanica.getNome();
					produtosEscolhidos[i] = escolha;
					contBN++;
				}
				if (produto == 3)
				{
					String escolha = UvaVerde.getNome();
					produtosEscolhidos[i] = escolha;
					contUV++;
				}
				if (produto == 4)
				{
					String escolha = UvaRoxa.getNome();
					produtosEscolhidos[i] = escolha;
					contUr++;
				}
				if ( produto == 5)
				{
					String escolha = berinjela.getNome();
					produtosEscolhidos[i] = escolha;
					contBR++;
					
				}
				if ( produto == 6)
				{
					String escolha = berinjelaBilbo.getNome();
					produtosEscolhidos[i] = escolha;
					contBB++;
				}
				else if ( produto <=0 || produto >=7) 
				{	
					System.out.println("Opção inválida! \nSelecione o n° do produto para adicioná-lo em seu carrinho: ");
					produto = sc.nextInt();
				}
				
			}
			
			//demonstrando o que tem no carrinho
			System.out.println("\tItens do Carrinho: ");
			
			for ( int i =0; i <6; i++) {
				System.out.println(produtosEscolhidos[i]);
			}			
			
		//código do Pagamento 
		
			pagamento = (contBV * 4.70) +  (contBN * 3.50) +  (contUV * 7.50) + (contUr * 5.25) + (contBR * 3.50) + (contBB * 4.75);
			System.out.println("Sua compra totalizou em R$: " + pagamento);
			
			System.out.println("\n----------- PAGAMENTO ------------");
						
			System.out.println("Escolha a forma de pagamento \n1-- Boleto \n2-- Cartão");
			int entrada = sc.nextInt();
			
			//pagamento com boleto
			if(entrada == 1 )
			{
				System.out.println("Aguarde, seu boleto está sendo emitido ...");
				for ( int i=0; i <10 ; i++) 
				{
					
					System.out.println("\n");
				}
				System.out.println("Seu boleto foi gerado. Obrigada pela preferência ");
			}
	
			//pagamento com cartão
			if (entrada ==2) 
			{
			
				System.out.println("Insira o N° do Cartão");
				double num = sc.nextDouble();
				
				System.out.println("Insira sua senha");
				int senha = sc.nextInt();
				
				System.out.println("...");
				System.out.println("Aguardando pagamento ...");		
				
				for ( int i=0; i <10 ; i++) {
				
					System.out.println("\n");
				}
				
				System.out.println("Pagamento Aprovado! O código do seu pedido será enviado por e-mail.");
								
			}
			
			// inserção de opção inválida no pagamento
			if (entrada <=0 || entrada >=3) 
			{
				System.out.println("Opção Inválida! Escolha novamente: ");
				System.out.println("\n-------- Sessão Finalizada ---------");				
			}
	}
		break; 	
		
	//Categorias e produtos
		case 4:
			
		{
			
			System.out.println("----------\tCategorias & Produtos\t----------");
			
			List <String> categoriaFrutas = new ArrayList<String>();
			categoriaFrutas.add("Banana Verde");
			categoriaFrutas .add("Banana Nanica");
			categoriaFrutas.add("Uva Verde");
			categoriaFrutas.add("Uva Roxa");
			
			System.out.println("\nFrutas");
			for(String lista : categoriaFrutas)
			{
			    System.out.println("\t*" + lista);
			}
			
			System.out.println("\nLegumes");
			
			List <String> categoriaLegumes = new ArrayList<String>();
			categoriaLegumes.add("Berinjela Roxa");
			categoriaLegumes.add("Berinjela Bilbo");

			for(String lista : categoriaLegumes)
			{
			    System.out.println("\t*" + lista);
			}
		}
		break;
		
	//Opção de finalização
		case 5: 
		{
			System.out.println("Deseja finalizar sua sessão? \n1 --- Sim \n2 --- Não ");
			int sair = sc.nextInt();
			
			if (sair == 2)
			{										
					System.out.println("\n----------- Menu de Opções -----------");
					System.out.println("\n1) Comprar Produtos \n2) Carrinho \n3) Pagamento \n4) Categorias & Produtos \n5) Finalizar Sessão ");
					opcao = sc.nextInt();	
					
			}
			
			
			if (sair <=0 || sair >= 3)
			{
					System.out.println("Opção inválida! Deseja permanecer logado(a)?");
					sair = sc.nextInt();
			
			}
			if (sair ==1) 
			{
				System.out.println("Agradecemos a preferência! ");
				System.out.println("----\tSessão finalizada\t----");
			} 
		}
		break;
	}
			
	}
}
		
	

