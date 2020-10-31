package Java;

import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		double salarioFixo = input.nextDouble();
		double totalVendas	= input.nextDouble();
		double comissao = totalVendas * 0.15;
		
		System.out.printf("TOTAL = %.2f%n" , (salarioFixo + comissao));
		
		input.close();
	
	}
}
