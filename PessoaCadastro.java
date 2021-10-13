package ProjetoJava;

import java.util.Scanner;

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
	public void cadastro() {	// Implementa dados do usuário
		String a, b, c, d, e;
		System.out.print("\n ----------------------------------------");
		System.out.print("\n CADASTRO\n");
		System.out.print(" Nome: "); a = ler.next(); this.setNome(a);
		System.out.print(" Usuário: "); b = ler.next(); this.setUsuario(b);
		System.out.print(" Senha: "); c = ler.next(); this.setSenha(c);
		System.out.print(" Email: "); d = ler.next(); this.setEmail(d);
		System.out.print(" Data de Nascimento: "); e = ler.next(); this.setNascimento(e);
		System.out.print("\n CADASTRADO COM SUCESSO!!\n\n Digite 1 para ir para o FEED DE JOGOS ou ");
	}
	
	public void login() {	// Compara Strings Atributos com as String do método para validar login
		String a, b;
		
		System.out.print("\n ----------------------------------------");
		System.out.print("\n LOGIN\n");
		System.out.print(" Usuário: "); a = ler.next();
		System.out.print(" Senha: "); b = ler.next();
		
		if (a.equals(getUsuario()) && b.equals(getSenha()) ) {	// Compara Strings
		System.out.print("\n SEJA BEM VINDO "+getNome()+"!!\n\n Digite 1 para ir para o FEED DE JOGOS ou "); }
		
		else { System.out.println("\n USUARIO E SENHA INCORRETOS"); this.login(); }
	}
		
	public void print() {
		System.out.print("\n ----------------------------------------");
		System.out.print("\n Informações");
		System.out.print("\n Nome: "+nome);
		System.out.print("\n Usuário: "+usuario);
		System.out.print("\n Senha: "+senha);
		System.out.print("\n Email: "+email);
		System.out.print("\n Data de Nascimento: "+nascimento);
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
