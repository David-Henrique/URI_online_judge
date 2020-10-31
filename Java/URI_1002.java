package Java;

import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = input.nextDouble();
		double area = (raio * raio) * n ;
		
		System.out.printf("A=%.4f\n", area);
		
		input.close();

	}

}