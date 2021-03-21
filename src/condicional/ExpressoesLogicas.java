package condicional;

public class ExpressoesLogicas {

	public static void main(String[] args) {

		// ExpressoesLogicas && || !

		int numero = 20;
		boolean result;

		// && e
		result = numero > 10 && numero == 20;
		System.out.println(result);

		// || ou
		result = numero > 10 || numero == 20;
		System.out.println(result);

		// ! nao
		result = !(numero > 10 || numero == 20);
		System.out.println(result);

	}

}
