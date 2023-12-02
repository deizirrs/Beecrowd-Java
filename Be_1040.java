package Exercicios_Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Be_1040 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float N1 = input.nextFloat();
		float N2 = input.nextFloat();
		float N3 = input.nextFloat();
		float N4 = input.nextFloat();
		float media =((N1 * 2) + (N2 * 3) +(N3 * 4) + (N4 * 1))/10;
			
		if(media >= 7) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno aprovado.");
			
		}else if(media < 5) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno reprovado.");
		}
		
		if(media >= 5.0 && media <= 6.9) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno em exame.");

				float nExame = input.nextFloat();

		    System.out.println("Nota do exame: " + nExame);
			 float novaMedia = (nExame + media)/2;
			 
		 if(novaMedia >= 5.0) {
			 System.out.println("Aluno aprovado.");
			 System.out.println("Media final: " + String.format("%.1f",novaMedia));
		 }else if(novaMedia <= 4.9) {
			 System.out.println("Aluno reprovado.");
			 System.out.println("Media final: " + String.format("%.1f",novaMedia));
		}
		}
		   
		input.close();

	}

}
