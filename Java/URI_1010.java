package Java;

import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int codigo1 = input.nextInt();
		int qtd1 = input.nextInt();
		double preco1 = input.nextDouble();
		
		int codigo2 = input.nextInt();
		int qtd2 = input.nextInt();
		double preco2 = input.nextDouble();
		
		double total = (qtd1 * preco1) + (qtd2 * preco2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f" , total);
		
		input.close();
		
	}

}
