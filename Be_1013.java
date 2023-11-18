package Exercicios_Beecrowd;

import java.util.Scanner;

public class Be_1013 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A =input.nextInt();
		int B =input.nextInt();
		int C =input.nextInt();
		
		int MAIORAB = (A + B + Math.abs(A - B))/2;
		int MAIORABC = (MAIORAB + C + Math.abs(MAIORAB - C))/2;

		System.out.println( MAIORABC + " eh o maior");
		
		input.close();
	}

}
