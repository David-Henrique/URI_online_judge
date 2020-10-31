package Java;

import java.util.Scanner;

public class URI_1014 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int X = input.nextInt();
	double Y = input.nextDouble();
	double kmLitro = X / Y;
	
	System.out.printf("%.3f km/l%n", kmLitro);
	
	input.close();
		
	}

}
