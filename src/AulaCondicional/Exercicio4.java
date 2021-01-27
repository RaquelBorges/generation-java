package AulaCondicional;

import java.util.Scanner;

/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */

public class Exercicio4 {
	
	public static void main (String args[])
	{
		double num;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		num = ler.nextDouble();
		
		if (num%2 == 0)
		{
			System.out.println("O número " + num + " é par e ele a raiz quadrada dele é " + String.format("%.2f", Math.sqrt(num)));
		}
				
		else
		{
			System.out.println("O número " + num + " é ímpar e ele elevado ao quadrado é " + String.format("%.2f", Math.pow(num, 2)));
		}
	}
}
