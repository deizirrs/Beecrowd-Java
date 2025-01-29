package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1038 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int opcao =input.nextInt();
		int qtde = input.nextInt();
		double valortotal;
		
		switch(opcao){
			case 1: 
			valortotal = 4.00 * qtde;
			System.out.printf("Total: R$ %.2f%n", valortotal);
			break;
			
			case 2: 
				valortotal = 4.50 * qtde;
				System.out.printf("Total: R$ %.2f%n", valortotal);
				break;
				
			case 3: 
				valortotal = 5.00 * qtde;
				System.out.printf("Total: R$ %.2f%n", valortotal);
				break;
			case 4: 
				valortotal = 2.00 * qtde;
				System.out.printf("Total: R$ %.2f%n", valortotal);
				break;
			case 5: 
				valortotal = 1.50 * qtde;
				System.out.printf("Total: R$ %.2f%n" , valortotal);
				break;
		}
				
		input.close();
	
	}

}
