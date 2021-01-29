package aulaArray;

import java.util.Scanner;

/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		double array[] = new double[5], maior;
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<5; i++)
		{
			System.out.println("Entre com o " +(i+1)+ "a. pontuação da atividade: ");
			array[i] = scan.nextDouble();
			
		}
		
		maior = array[0];
		
		for(i=0; i<5; i++)
		{
			if (array[i] > maior)
			{
				maior = array[i];
			}
		}
		
		for(i=0; i<5; i++)
		{
			if(array[i] == maior)
			{
				System.out.printf("Vetor[%d] = %.2f <-- Maior pontuação\n", i, array[i]);
			}
			else
			{
				System.out.printf("Vetor[%d] = %.2f\n", i, array[i]);
			}
		}
	}
}
