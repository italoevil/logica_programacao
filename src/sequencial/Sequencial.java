package sequencial;

import java.util.Random;
import java.util.Scanner;

public class Sequencial {

	public static void main(String[] args) {
		
		//SORTEIO DE UM NUMERO
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		int numero = sc.nextInt();
		
		//PROCESSAMENTO
		Random rotacao = new Random();
		int numeroSorteado = rotacao.nextInt(10);
		
		String result;
		if (numero == numeroSorteado) {
			result = "PARABENS, VOCE ACERTOU!!";
		}else {
			result = "QUE PENA, VOCE ERROU!!";
		}
		
		//SAIDA
		System.out.println(result);
		System.out.println("NUMERO ESCOLHIDO: "+numero);
		System.out.println("NUMERO SORTEADO: "+numeroSorteado);
		
		sc.close();
	}
}
