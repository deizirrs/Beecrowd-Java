package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1010 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int codPeca = input.nextInt();
		int qtdPeca = input.nextInt();
		double valorUniPeca = input.nextDouble();
		
		int codPeca2 = input.nextInt();
		int qtdPeca2= input.nextInt();
		double valorUniPeca2 = input.nextDouble();
		
		double custoTot = ((qtdPeca * valorUniPeca) + (qtdPeca2 * valorUniPeca2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" , custoTot);
	}

}
