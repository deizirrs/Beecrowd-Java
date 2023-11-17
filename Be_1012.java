package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double pi = 3.14159;
		
		double tringulo = (A * C) / 2.0;
		double circulo = pi * Math.pow(C, 2);
		double trapezio = ((A + B) * C)/2.0;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n" , tringulo);
		System.out.printf("CIRCULO: %.3f%n" , circulo);
		System.out.printf("TRAPEZIO: %.3f%n" , trapezio);
		System.out.printf("QUADRADO: %.3f%n" , quadrado);
		System.out.printf("RETANGULO: %.3f%n" , retangulo);
		
		
	}

}
