package steam36;

import java.text.NumberFormat;
import java.util.*;
import javax.swing.*;

public class FeedClass {

	// Atributos
	public static int valor = 0;	// Atributo Static para manipular em outra Classe
	
	// Array para fazer o armazenamento dos dados de jogos adicionados no carrinho
	static Carrinho catCarrinho = new Carrinho();	
	static ArrayList <Game> jogosCarrinho = catCarrinho.getLista();
	
	static Scanner ler = new Scanner(System.in);
	
	// Construtor
	public FeedClass() {
	}	

	// Métodos
	static void Feed() {	// Menu de Opções de Categorias
		int op;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
				+ "           CATEGORIAS\n"
				+ " ----------------------------------------\n\n"
				+ " 1) Ação e Aventura\n"
				+ " 2) Luta\n"
				+ " 3) RPG\n"
				+ " 4) Esporte\n"
				+ " ----------------------------------------\n"
				+ " 5) Carrinho\n"
				+ " 6) Home\n"
				+ "\n Opção:"));

		switch (op)  {
		
		case 1: FeedClass.AventuraAção(); break;
		case 2: FeedClass.Luta(); break;
		case 3: FeedClass.RPG(); break;
		case 4: FeedClass.Esporte(); break;
		case 5: FeedClass.Carrinho(); break;
		case 6: Main.Menu(); break;
		default: JOptionPane.showMessageDialog(null, "\n OPÇÃO INVÁLIDA!!"); FeedClass.FeedClass1(); break;
		}
	}
	
	static void bemvindo() {
		JOptionPane.showMessageDialog(null, "\n----------------------------------------\n"
				+ "BEM VINDO AO FEED JOGOS\n----------------------------------------\n");
	}
	
	static void FeedClass1() {
		
		FeedClass.bemvindo();
		FeedClass.Feed();
		
	}
	
	
	static void AventuraAção() { 
		int op;

		// Array para fazer exibir os dados dos jogos, armazenados na Classe Aventura
		Aventura catAventura = new Aventura();
		ArrayList <Game> jogosAventura = catAventura.getLista();
		
			String textoJogos = "";
			for(int i=0;i<jogosAventura.size();i++) {
				// Cria uma lista chamada "textoJogos" para exibir os jogos que estão dentro da ArrayLists Aventura.
				textoJogos += (i + 1) + ") " +jogosAventura.get(i).getNomeJogo() +"\n Preço: "+jogosAventura.get(i).formatarMoeda()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n"
					+ "       JOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
			switch (op) {

			case 1: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosAventura.get(0).getNomeJogo()+"\n Preço: "+jogosAventura.get(0).formatarMoeda());
			jogosCarrinho.add(jogosAventura.get(0));	// Implementa os dados do jogo escolhido na ArrayList Carrinho, para exibi-los no final.
			valor += jogosAventura.get(0).getPrecoUni();	// Implementa o valor do jogo, para descobrir o valor total da compra
			break;
			case 2: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosAventura.get(1).getNomeJogo()+"\n Preço: "+jogosAventura.get(1).formatarMoeda());
			jogosCarrinho.add(jogosAventura.get(1));
			valor += jogosAventura.get(1).getPrecoUni();
			break;
			case 3: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosAventura.get(2).getNomeJogo()+"\n Preço: "+jogosAventura.get(2).formatarMoeda());
			jogosCarrinho.add(jogosAventura.get(2));
			valor += jogosAventura.get(2).getPrecoUni();
			break;
			case 4: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosAventura.get(3).getNomeJogo()+"\n Preço: "+jogosAventura.get(3).formatarMoeda());
			jogosCarrinho.add(jogosAventura.get(3));
			valor += jogosAventura.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Exibir Carrinho\n\n Opção: "));
			if (op == 1) { FeedClass.Feed(); } else { FeedClass.Carrinho(); }
	
	}

	static void Luta() { //MENU DE JOGOS DE LUTA
		int op;

		Luta catLuta = new Luta();
		ArrayList <Game> jogosLuta = catLuta.getLista();

			String textoJogos = "";
			for(int i=0;i<jogosLuta.size();i++) {
				textoJogos += (i + 1) + ") " +jogosLuta.get(i).getNomeJogo() +"\n Preço: "+jogosLuta.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 1: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosLuta.get(0).getNomeJogo()+"\n Preço: "+jogosLuta.get(0).formatarMoeda());
			jogosCarrinho.add(jogosLuta.get(0));
			valor += jogosLuta.get(0).getPrecoUni();
			break;
			case 2: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosLuta.get(1).getNomeJogo()+"\n Preço: "+jogosLuta.get(1).formatarMoeda());
			jogosCarrinho.add(jogosLuta.get(1));
			valor += jogosLuta.get(1).getPrecoUni();
			break;
			case 3: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosLuta.get(2).getNomeJogo()+"\n Preço: "+jogosLuta.get(2).formatarMoeda());
			jogosCarrinho.add(jogosLuta.get(2));
			valor += jogosLuta.get(2).getPrecoUni();
			break;
			case 4: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosLuta.get(3).getNomeJogo()+"\n Preço: "+jogosLuta.get(3).formatarMoeda());
			jogosCarrinho.add(jogosLuta.get(3));
			valor += jogosLuta.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Exibir Carrinho\n\n Opção: "));
			if (op == 1) { FeedClass.Feed(); } else { FeedClass.Carrinho(); }
	
	}
	static void RPG() {	//MENU DE JOGOS DE RPG
		int op;

		RPG catRPG = new RPG();
		ArrayList <Game> jogosRPG = catRPG.getLista();

			String textoJogos = "";
			for(int i=0;i<jogosRPG.size();i++) {
				textoJogos += (i + 1) + ") " +jogosRPG.get(i).getNomeJogo() +"\n Preço: "+jogosRPG.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
			switch (op)  {

			case 1: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosRPG.get(0).getNomeJogo()+"\n Preço: "+jogosRPG.get(0).formatarMoeda());
			jogosCarrinho.add(jogosRPG.get(0));
			valor += jogosRPG.get(0).getPrecoUni();
			break;
			case 2: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosRPG.get(1).getNomeJogo()+"\n Preço: "+jogosRPG.get(1).formatarMoeda());
			jogosCarrinho.add(jogosRPG.get(1));
			valor += jogosRPG.get(1).getPrecoUni();
			break;
			case 3: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosRPG.get(2).getNomeJogo()+"\n Preço: "+jogosRPG.get(2).formatarMoeda());
			jogosCarrinho.add(jogosRPG.get(2));
			valor += jogosRPG.get(2).getPrecoUni();
			break;
			case 4: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosRPG.get(3).getNomeJogo()+"\n Preço: "+jogosRPG.get(3).formatarMoeda());
			jogosCarrinho.add(jogosRPG.get(3));
			valor += jogosRPG.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Exibir Carrinho\n\n Opção: "));
			if (op == 1) { FeedClass.Feed(); } else { FeedClass.Carrinho(); }
			
	}

	static void Esporte() {//MENU DE JOGOS DE ESPORTE
		int op;

		Esporte catEsporte = new Esporte();
		ArrayList <Game> jogosEsporte = catEsporte.getLista();

			String textoJogos = "";
			for(int i=0;i<jogosEsporte.size();i++) {
				textoJogos += (i + 1) + ") " +jogosEsporte.get(i).getNomeJogo() +"\n Preço: "+jogosEsporte.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op) {

			case 1: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosEsporte.get(0).getNomeJogo()+"\n Preço: "+jogosEsporte.get(0).formatarMoeda());
			jogosCarrinho.add(jogosEsporte.get(0));
			valor += jogosEsporte.get(0).getPrecoUni();
			break;
			case 2: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosEsporte.get(1).getNomeJogo()+"\n Preço: "+jogosEsporte.get(1).formatarMoeda());
			jogosCarrinho.add(jogosEsporte.get(1));
			valor += jogosEsporte.get(1).getPrecoUni();
			break;
			case 3: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosEsporte.get(2).getNomeJogo()+"\n Preço: "+jogosEsporte.get(2).formatarMoeda());
			jogosCarrinho.add(jogosEsporte.get(2));
			valor += jogosEsporte.get(2).getPrecoUni();
			break;
			case 4: JOptionPane.showMessageDialog(null,"\n Jogo Adicionado ao Carrinho!!\n\n "+jogosEsporte.get(3).getNomeJogo()+"\n Preço: "+jogosEsporte.get(3).formatarMoeda());
			jogosCarrinho.add(jogosEsporte.get(3));
			valor += jogosEsporte.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Exibir Carrinho\n\n Opção: "));
			if (op == 1) { FeedClass.Feed(); } else { FeedClass.Carrinho(); }
	}
	
	static void Carrinho() {	// Menu onde mostrará os Métodos de forma de pagamento e Carrinho
		int op;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
				+ " CARRINHO"
				+ "\n ----------------------------------------"
				+ "\n VALOR TOTAL: "+FeedClass.formatarMoeda()+"\n"
				+ "\n 1) Adicionar Forma de pagamento"
				+ "\n 2) Exibir Forma de pagamento cadastrado"
				+ "\n 3) Exibir Carrinho"
				+ "\n 4) Voltar"
				+ "\n\n Opção: "));

		switch (op) {
		
		case 1: PagamentoClass.cartao(); break;
		case 2: PagamentoClass.print(); break;
		case 3: FeedClass.exibirCarrinho(); break;
		case 4: FeedClass.Feed(); break;
		default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); FeedClass.Carrinho(); break;
		
		}
	}

	static void exibirCarrinho() {
		
		// Método para Exibir os jogos que foram escolhidos
		String textoJogos = "";
		for(int i=0;i<jogosCarrinho.size();i++) {
			textoJogos += (i + 1) + ") " +jogosCarrinho.get(i).getNomeJogo() +"\n Preço: "+jogosCarrinho.get(i).formatarMoeda()+"\n\n";
		}
		
		JOptionPane.showMessageDialog(null,"\n----------------------------------------\n"
				+ "      ITEMS CARRINHO\n----------------------------------------\n"
				+ textoJogos+"\n Valor total: "+FeedClass.formatarMoeda());
		
		FeedClass.Carrinho();
		
	}
	
	static String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
	// Get e Set
	public static int getValor() { return valor; }

	public static void setValor(int valor) { FeedClass.valor = valor; }

}
