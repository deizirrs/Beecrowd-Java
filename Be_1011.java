package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio = input.nextDouble();
		double PI = 3.14159;
		
		double volEsfera = (4.0/3) * PI * Math.pow(raio, 3);
		System.out.printf("VOLUME = %.3f%n" , volEsfera);
	}

}
