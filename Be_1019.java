package Exercicios_Beecrowd;

import java.util.Scanner;

public class Be_1019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalSeg =input.nextInt();
		int qtdeHora = totalSeg /3600;
		totalSeg = totalSeg % 3600;
		
		int qtdeMin = totalSeg /60;
		totalSeg = totalSeg % 60;
		
		int qtdeSeg =  totalSeg ;
		
		System.out.println(qtdeHora + ":" + qtdeMin + ":" + qtdeSeg);
		input.close();

	}

}
