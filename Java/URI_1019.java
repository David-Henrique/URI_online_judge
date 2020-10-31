package Java;

import java.util.Scanner;

public class URI_1019 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int horas = N/3600 ;
		int minutos = (N%3600)/60 ;
		int segundos = (N%3600)%60 ;
			
		System.out.print( horas + ":" + minutos + ":" + segundos );
		
		input.close();
	}

}