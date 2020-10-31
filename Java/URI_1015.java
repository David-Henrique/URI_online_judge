package Java;

import java.util.Scanner;

public class URI_1015 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();
		
		double XX = X1 - X2;
		double YY = Y1 - Y2;
		
		double distancia = Math.sqrt((XX*XX)+(YY*YY));
		
		System.out.printf("%.4f%n" , distancia);
		
		input.close();
		
	}

}
