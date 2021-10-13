package ProjetoJava;

import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
	
		int op;
		Scanner ler = new Scanner(System.in);
		
		PessoaCadastro pc = new PessoaCadastro();
		FeedClass fc = new FeedClass();
		
		JOptionPane.showMessageDialog(null,"\n BEM-VINDO AO STEAM 36!!");
		
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog(" ----------------------------------------\n Escolha a opção\n 1) Cadastro\n 2) Login\n 3) Informações\n Opção: "));
		
		switch (op) {
		case 1: pc.cadastro(); break;
		case 2: pc.login(); break;
		case 3: pc.print(); break;
		
		default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); break;
		}
		
		op = Integer.parseInt(JOptionPane.showInputDialog("\n Digite 0 para voltar: "));
		
		} while (op == 0);

		fc.print();
		
	}
}
