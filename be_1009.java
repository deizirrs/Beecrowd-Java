package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class be_1009 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome = input.next();
		double salFixo = input.nextDouble();
		double totVendas = input.nextDouble();
		
		double valorComissao= (totVendas * 15)/100;
		double salTotal = salFixo + valorComissao;		
		
		System.out.printf("TOTAL = R$ %.2f%n", salTotal);
		
		

	}

}
