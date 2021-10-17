package steam36;

import java.awt.Font;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Main {
	
	@SuppressWarnings("static-access")	// 
	static void Menu () {
		
		int op;
		
		// Menu de Opções
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n "
					+ "Escolha a opção\n ----------------------------------------\n "
					+ "1) Login\n 2) Cadastro\n 3) Informações\n 4) Feed de Jogos\n\n Opção: "));
			
			switch (op) {
			case 1: PessoaCadastro.login(); break;
			case 2: PessoaCadastro.cadastro(); break;
			case 3: PessoaCadastro.print(); break;
			case 4: FeedClass.FeedClass1(); break;
			
			default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); Main.Menu(); break;
			}
			
			// Loop para manter o usuário no menu
			op = Integer.parseInt(JOptionPane.showInputDialog("\n 1) FEED DE JOGOS\n 0) VOLTAR\n\n Opção:"));
			if (op == 1) { FeedClass.FeedClass1(); } else { Main.Menu(); }
	}

	public static void main(String[] args) throws Exception {
		
		// Alterando Fonte do JOptionPane
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 14)));
		
		// Gif no JOptionPane
		final ImageIcon icon = new ImageIcon(new URL("https://bityli.com/gLdSwA"));
		
		JOptionPane.showMessageDialog(null,null,null, JOptionPane.INFORMATION_MESSAGE, icon);
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n "
				+ "BEM VINDO AO STEAM 36!!\n "
				+ "----------------------------------------");
		
		Main.Menu();
		
	}
}
