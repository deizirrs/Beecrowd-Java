package Exercicios_Beecrowd;

import java.util.Scanner;

public class Be_1020 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idadeDias = input.nextInt();
		
		System.out.println(idadeDias/365 + " ano(s)");
		idadeDias = idadeDias % 365;
		System.out.println(idadeDias/30 +" mes(es)");
		idadeDias = idadeDias % 30;
		System.out.println(idadeDias + " dia(s)");
	}

}
