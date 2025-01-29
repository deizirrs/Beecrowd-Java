package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1005 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double media = ((A * 2)  + (B * 3) +(C * 5))/ 10;
		
		System.out.printf("MEDIA = %.1f%n ", media );
		
		input.close();
	}

}
