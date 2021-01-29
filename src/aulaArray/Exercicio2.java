package aulaArray;

import java.util.Scanner;

/* 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o. */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int dado[] = new int[10], i, maior=0;
		float soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<dado.length; i++)
		{
			System.out.printf("Entre com o resultado do " +(i+1)+ "o. lan�amento do dado: ");
			dado[i] = scan.nextInt();
			
			if(dado[i] < 1 || dado[i] >6)
			{
				System.out.println("\nVoc� digitou um valor inv�lido, por favor digite um um valor v�lido\n");
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
		
		System.out.println("\nTotal de ocorr�ncias de pontua��o 6 do dado foi: " + maior);
		System.out.println("\nM�dia dos lan�amentos do dado foi:  " + (soma/10));

	}
}
