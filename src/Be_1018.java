package Exercicios_Beecrowd;

import java.util.Scanner;

public class Be_1018 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int valor = input.nextInt();
	  
	
	System.out.println(valor);
	System.out.println(valor/100 + " notas(s) de R$ 100,00");

	System.out.println(valor/50 + " notas(s) de R$ 50,00");
	
	System.out.println(valor/20 + " notas(s) de R$ 20,00");
	
	System.out.println(valor/10 + " notas(s) de R$ 10,00");
	
	System.out.println(valor/5 + " notas(s) de R$ 5,00");
	
	System.out.println(valor/2 + " notas(s) de R$ 2,00");
	
	System.out.println(valor/1 + " notas(s) de R$ 1,00");
	
	
	input.close();
	}

}
