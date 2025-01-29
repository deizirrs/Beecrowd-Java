package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double valorMonetario = input.nextDouble();
		int valor = 0;
		
		System.out.println("NOTAS: ");
		valor = (int) valorMonetario/100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valorMonetario = valorMonetario % 100.0;
		
		valor = (int) valorMonetario/50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valorMonetario = valorMonetario % 50.0;
		
		valor = (int) valorMonetario/20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valorMonetario = valorMonetario % 20.0;
		
		valor = (int) valorMonetario/10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valorMonetario = valorMonetario % 10.0;
		
		valor = (int) valorMonetario/5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valorMonetario = valorMonetario % 5.0;
		
		valor = (int) valorMonetario/2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valorMonetario = valorMonetario % 2.0;
		
		
		valorMonetario = valorMonetario * 100.0;
		
		System.out.println("MOEDAS:");
		
		valor = (int) valorMonetario/100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		valorMonetario = valorMonetario % 100.0;
		
		valor = (int) valorMonetario/50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		valorMonetario = valorMonetario % 50.0;
		
		valor = (int) valorMonetario/25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		valorMonetario = valorMonetario % 25.0;
		
		valor = (int) valorMonetario/10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		valorMonetario = valorMonetario % 10.0;
		
		valor = (int) valorMonetario/5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		valorMonetario = valorMonetario % 5.0;
		
		valor = (int) valorMonetario/1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		valorMonetario = valorMonetario % 1.0;
		
		
		
		
		
		input.close();

	}

}
