package ProjetoJava;

import java.util.Scanner;

public class PessoaCadastro {

	// Atributos
	private String nome;
	private String usuario;
	private String senha;
	private String email;
	private String nascimento;
	
	Scanner ler = new Scanner(System.in);
	
	// Contrutor
	public PessoaCadastro() {
		
	}
	
	// Métodos
	public void cadastro() { 
		System.out.print("\n ----------------------------------------");
		System.out.print("\n CADASTRO\n");
		System.out.print(" Nome: "); this.nome = ler.next();
		System.out.print(" Usuário: "); this.usuario = ler.next();
		System.out.print(" Senha: "); this.senha = ler.next();
		System.out.print(" Email: "); this.email = ler.next();
		System.out.print(" Data de Nascimento: "); this.nascimento = ler.next();
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
