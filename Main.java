package ProjetoJava;

import java.net.URL;
import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) throws Exception {
	
		int op;
		Scanner ler = new Scanner(System.in);
		
		PessoaCadastro pc = new PessoaCadastro();
		FeedClass fc = new FeedClass();
		
		final ImageIcon icon = new ImageIcon(new URL("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/65636dc9-8b61-4bdb-8baf-fdfeecae0613/d88qv47-f3b15584-5f28-44a5-ae1e-6387108f317d.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzY1NjM2ZGM5LThiNjEtNGJkYi04YmFmLWZkZmVlY2FlMDYxM1wvZDg4cXY0Ny1mM2IxNTU4NC01ZjI4LTQ0YTUtYWUxZS02Mzg3MTA4ZjMxN2QuZ2lmIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.p07n2uU-pF_6LG1bz0xw6Zd6lA4NXFmoihHbtr5H4is"));
		
		JOptionPane.showMessageDialog(null,null,null, JOptionPane.INFORMATION_MESSAGE, icon);
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n BEM VINDO AO STEAM 36!!\n ----------------------------------------");
		
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n "
				+ "Escolha a opção\n ----------------------------------------\n "
				+ "1) Cadastro\n 2) Login\n 3) Informações\n Opção: "));
		
		switch (op) {
		case 1: pc.cadastro(); break;
		case 2: pc.login(); break;
		case 3: pc.print(); break;
		
		default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); break;
		}
		
		op = Integer.parseInt(JOptionPane.showInputDialog("\n 1) FEED DE JOGOS\n 0) VOLTAR "));
		
		} while (op == 0);

		fc.print();
		
	}
}
