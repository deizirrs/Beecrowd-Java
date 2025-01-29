package Exercicios_Beecrowd;

import java.util.Scanner;

public class Be_1037 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		double num = input.nextDouble();
		
		intervalo(num);
	}
		
	private static void intervalo(double n) {
		
		if (n < 0 || n > 100) {
			System.out.println("Fora de Intervalo");
			return;
		}
		
		if (n >= 0 && n <= 25) {
			System.out.println("Intervalo [0,25]");
	} else if (n >25 && n <= 50){
		System.out.println("Intervalo [25,50]");
	} else if (n >50 && n <= 75){
		System.out.println("Intervalo [50,75]");
	}else 
		System.out.println("Intervalo [75,100]");
	}
	
	}



