package condicional;

public class OperacaoTernaria {

	public static void main(String[] args) {

		//IF ELSE COMUM
		
		int idade = 14;
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		}else {
			System.out.println("Menor de Idade");
		}
		
		
		//OperacaoTernaria
		System.out.println(idade >= 18 ? "Maior de Idade":"Menor de Idade");
		
		
	}

}
