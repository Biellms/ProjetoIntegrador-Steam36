package ProjetoJava;

import java.util.Scanner;
import javax.swing.*;

public class PessoaCadastro{

	// Atributos
	public String nome;
	public String usuario;
	public String senha;
	public String email;
	public String nascimento;
	
	Scanner ler = new Scanner(System.in);
	
	// Contrutor
	public PessoaCadastro() { // Vazio para podermos implementar no método cadastro
	}
	
	// Métodos
	public void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
		String a, b, c, d, e;
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n           "
				+ "CADASTRO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome: "); this.setNome(a);
		b = JOptionPane.showInputDialog(" Usuário: "); this.setUsuario(b);
		c = JOptionPane.showInputDialog(" Senha: "); this.setSenha(c);
		d = JOptionPane.showInputDialog(" Email: "); this.setEmail(d);
		e = JOptionPane.showInputDialog(" Data de Nascimento: "); this.setNascimento(e);
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!");
	}
	
	public void login() {	// Compara Strings Atributos com as String do método para validar login
		String a, b;
		
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n              "
				+ "LOGIN\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Usuário: ");
		b = JOptionPane.showInputDialog(" Senha: ");
		
		if (a.equals(getUsuario()) && b.equals(getSenha()) ) {	// Compara Strings
		JOptionPane.showMessageDialog(null,"\n SEJA BEM VINDO "+getNome()+"!!"); }
		
		else { JOptionPane.showMessageDialog(null,"\n USUARIO E SENHA INCORRETOS"); this.login(); }
	}
		
	public void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n          "
				+ "INFORMAÇÕES\n ---------------------------------------- "
				+ "\n Nome: "+getNome()+""
						+ "\n Usuário: "+getUsuario()+""
								+ "\n Senha: "+getSenha()+""
										+ "\n Email: "+getEmail()+""
												+ "\n Data de Nascimento: "+getNascimento()+"\n\n");
	}
	
	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getUsuario() { return usuario; }

	public void setUsuario(String usuario) { this.usuario = usuario; }

	public String getSenha() { return senha; }

	public void setSenha(String senha) { this.senha = senha; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public String getNascimento() { return nascimento; }

	public void setNascimento(String nascimento) { this.nascimento = nascimento; }

	
}
