package AulaCondicional;

import java.util.Scanner;

/* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. */

public class Exercicio4 {
	
	public static void main (String args[])
	{
		double num;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero: ");
		num = ler.nextDouble();
		
		if (num%2 == 0)
		{
			System.out.println("O n�mero " + num + " � par e ele a raiz quadrada dele � " + String.format("%.2f", Math.sqrt(num)));
		}
				
		else
		{
			System.out.println("O n�mero " + num + " � �mpar e ele elevado ao quadrado � " + String.format("%.2f", Math.pow(num, 2)));
		}
	}
}
