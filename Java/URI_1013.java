package Java;

import java.util.Scanner;

public class URI_1013 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A, B, C;
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		int AB = (A + B + Math.abs(A-B))/2;
		int maiorEntreABC = (AB + C + Math.abs(AB-C))/2;
		
		System.out.println( maiorEntreABC + " eh o maior");
		
		input.close();
		
		
	}

}
