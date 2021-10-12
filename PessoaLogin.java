package ProjetoJava;

import java.util.Scanner;

public class PessoaLogin extends PessoaCadastro{

	Scanner ler = new Scanner(System.in);
	
	// Construtor
	public PessoaLogin () { }
	
	// Métodos
	public void login() {

		String a, b;
		

		System.out.print("\n ----------------------------------------");
		System.out.print("\n LOGIN\n");
		System.out.print(" Digite o Usuário: "); a = ler.next();
		System.out.print(" Digite a Senha: "); b = ler.next();
		
		if (a != getUsuario() || b != getSenha()) {
			System.out.println("\n USUÁRIO OU SENHA INCORRETOS"); }
		
		else { System.out.println("\n LOGADO!!"); }
	}
	
	public void print() {
		System.out.print(" Usuario: "+getUsuario());
		System.out.print(" Senha: "+getSenha());
	}
}
