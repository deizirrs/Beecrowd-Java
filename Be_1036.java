package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1036 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double Delta =Math.pow(B, 2) - (4 * A * C);
		double R1 = (-B + Math.sqrt(Delta))/(2 * A);
		double R2 = (-B - Math.sqrt(Delta))/(2 * A);
		
		if(Delta > 0 && A!= 0) {
			System.out.printf("R1 = %.5f%n" ,R1);
			System.out.printf("R2 = %.5f%n" ,R2);
			
		}else {
			System.out.println("Impossivel calcular");
			
		}
		
		input.close();

	}

}
