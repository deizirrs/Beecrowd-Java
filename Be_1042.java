package Exercicios_Beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class Be_1042 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		int [] numeros = {n1, n2, n3};
		Arrays.sort(numeros);
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		System.out.println("   ");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		input.close();

	}

}
