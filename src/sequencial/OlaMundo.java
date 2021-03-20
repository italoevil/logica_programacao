package sequencial;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		//algoritimo exibir nome e email
		
		//SEQUENCIAL
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Infome seu email: ");
		String email = sc.nextLine();
		
		//PROCESSAMENTO
		String result = nome + " - " + email;
		
		//SAIDA
		System.out.println(result);
		
		
		sc.close();
		
	}
}
