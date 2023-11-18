package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1014 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int X = input.nextInt();
		double Y = input.nextDouble();
		
		double conTotal = X / Y;
		
		System.out.printf("%.3f km/l %n" ,conTotal);
		
		input.close();
	}

}
