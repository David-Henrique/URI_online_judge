package Java;

import java.util.Scanner;

public class URI_1017 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double tempo = input.nextInt();
		double velocidade = input.nextInt();
		double litros = (tempo * velocidade) / 12;
		
		System.out.printf("%.3f%n" , litros);
		
		input.close();
	}

}
