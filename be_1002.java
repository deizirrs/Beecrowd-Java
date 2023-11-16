package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class be_1002 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Locale.setDefault(Locale.US);
	  
		double area;
		double n = 3.14159;
	    double raio = input.nextDouble();
	    
	    
		area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n" , area);
		
		input.close();

	}

}
