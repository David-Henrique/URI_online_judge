package Java;

import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		int horasTrabalhadas = input.nextInt();
		double salarioHora = input.nextDouble();
		double salarioFinal = horasTrabalhadas * salarioHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n" , salarioFinal );
		
		input.close();
	}

}
