package Java;

import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int ano = N/365;
		int mes = (N%365)/30;
		int dias = (N%365)%30;
		
		System.out.println( ano + " ano(s)");
		System.out.println( mes + " mes(es)");
		System.out.println( dias + " dia(s)");	
		
		input.close();
	}

}