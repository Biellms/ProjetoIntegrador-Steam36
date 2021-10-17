package steam36;

import java.util.*;
import javax.swing.*;

public class PessoaCadastro{

	/* Atributos Static para não precisar criar um Objeto, e não 
	acabar perdendo o valor ao voltar em algum método*/
	public static String nome;	
	public static String usuario;
	public static String senha;
	public static String email;
	public static String nascimento;
	public static int cont = 0;
	
	Scanner ler = new Scanner(System.in);
	
	// Contrutor
	public PessoaCadastro() { // Vazio para podermos implementar no método cadastro
	}
	
	// Métodos
	static void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
		String a, b, c, d, e;
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n           "
				+ "CADASTRO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome: "); PessoaCadastro.setNome(a);
		b = JOptionPane.showInputDialog(" Usuário: "); PessoaCadastro.setUsuario(b);
		c = JOptionPane.showInputDialog(" Senha: "); PessoaCadastro.setSenha(c);
		d = JOptionPane.showInputDialog(" Email: "); PessoaCadastro.setEmail(d);
		e = JOptionPane.showInputDialog(" Data de Nascimento: "); PessoaCadastro.setNascimento(e);
		cont++;
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!"
										 + "\n\n SEJA BEM VINDO "+getNome()+"!!\n");
		FeedClass.FeedClass1();
	}
	
	static void login() {	// Compara Strings Atributos com as String do método para validar login
		String a, b;
		int op;
		
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n              "
				+ "LOGIN\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Usuário: ");
		b = JOptionPane.showInputDialog(" Senha: ");
		
		if (a.equals(getUsuario()) && b.equals(getSenha()) ) {	// Compara Strings
		JOptionPane.showMessageDialog(null,"\n SEJA BEM VINDO "+getNome()+"!!"); 
		FeedClass.FeedClass1(); }
		
		// Retornar ou continuar tentando
		else { op = Integer.parseInt(JOptionPane.showInputDialog("\n USUARIO E SENHA INCORRETOS!!\n"
					+ "\n 1) Tentar novamente"
					+ "\n 2) Voltar"
					+ "\n\n Opção")); 
		if (op == 1) { PessoaCadastro.login(); } else { Main.Menu(); }
		}
	}
		
	static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n          "
				+ "INFORMAÇÕES\n ---------------------------------------- "
				+ "\n Nome: "+getNome()+""
						+ "\n Usuário: "+getUsuario()+""
								+ "\n Senha: "+getSenha()+""
										+ "\n Email: "+getEmail()+""
												+ "\n Data de Nascimento: "+getNascimento()+"\n\n");
		FeedClass.Feed();
	}
	
	// Get e Set
	public static String getNome() { return nome; }

	public static void setNome(String nome) { PessoaCadastro.nome = nome; }

	public static String getUsuario() { return usuario; }

	public static void setUsuario(String usuario) { PessoaCadastro.usuario = usuario; }

	public static String getSenha() { return senha; }

	public static void setSenha(String senha) { PessoaCadastro.senha = senha; }

	public static String getEmail() { return email; }

	public static void setEmail(String email) { PessoaCadastro.email = email; }

	public static String getNascimento() { return nascimento; }

	public static void setNascimento(String nascimento) { PessoaCadastro.nascimento = nascimento; }

	
}
