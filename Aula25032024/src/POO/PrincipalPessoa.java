package POO;

import java.util.Scanner;

public class PrincipalPessoa {
	public static void main(String[] args) {
		
		Scanner fonte = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		System.out.println("Digite seu nome: ");
		p.nome = fonte.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		p.sobrenome = fonte.nextLine();
		
		System.out.println("Olá "+ p.nome + " "+ p.sobrenome + " Seja Bem Vindo(a)");
	}
}
