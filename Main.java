package steam36;

import java.awt.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Main {
	
	@SuppressWarnings("static-access")	// 
	static void Menu () {
		
		int op = 0;
		
		// Menu de Opções
		// Exception para aceitar apenas Números
		try {
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n "
					+ "Escolha a opção\n ----------------------------------------\n "
					+ "1) Login\n 2) Cadastro\n 3) Feed de Jogos\n 4) Sair\n\n Opção: "));
			
		} catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
			
			JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
					+ "\n Você deve entrar com um número INTEIRO!"
					+ "\n Por favor tente novamente!");
			Main.Menu();
			}

			switch (op) {
			case 1: PessoaCadastro.login(); break;
			case 2: PessoaCadastro.cadastro();break;
			case 3: FeedClass.FeedClass1(); break;
			case 4: System.exit(0); break;
			
			default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); Main.Menu(); break;
			}
			
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
