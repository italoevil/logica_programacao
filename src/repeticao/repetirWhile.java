package repeticao;

import java.util.Scanner;

public class repetirWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantas vezes a palavra JAVA ira exibir na tela: ");
		int numero = sc.nextInt();
		
		if (numero == 1) {
			System.out.println("JAVA");
		}else {
			while (numero > 0) {
				System.out.println("JAVA");
				numero--;
			}
		}
		sc.close();
	}
}
