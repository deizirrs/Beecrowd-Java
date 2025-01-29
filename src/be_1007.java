package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class be_1007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int number = input.nextInt();
		int qtdeHorasTrabalhadas = input.nextInt();
		double salHora = input.nextDouble();
		double salary;
	
		salary = qtdeHorasTrabalhadas * salHora;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
	}

}
