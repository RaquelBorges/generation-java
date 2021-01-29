package aulaArray;

import java.util.Scanner;

/* 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int dado[] = new int[10], i, maior=0;
		float soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<dado.length; i++)
		{
			System.out.printf("Entre com o resultado do " +(i+1)+ "o. lançamento do dado: ");
			dado[i] = scan.nextInt();
			
			if(dado[i] < 1 || dado[i] >6)
			{
				System.out.println("\nVocê digitou um valor inválido, por favor digite um um valor válido\n");
				i--;
			}
			
			else if(dado[i] == 6)
			{
				maior++;
			}
		}
		System.out.println("");
		
		for(i=0; i<10; i++)
		{
			soma = soma + dado[i];
			System.out.printf("Dado[%d] = %d \n", i, dado[i]);
		}
		
		System.out.println("\nTotal de ocorrências de pontuação 6 do dado foi: " + maior);
		System.out.println("\nMédia dos lançamentos do dado foi:  " + (soma/10));

	}
}
