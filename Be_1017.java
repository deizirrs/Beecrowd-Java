package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1017 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int viagemHora = input.nextInt();
		int velMediaKml = input.nextInt();
		
		double qtdeLitros = (viagemHora * velMediaKml)/12.0;
		
		System.out.printf("%.3f%n", qtdeLitros );
		input.close();
	}

}
