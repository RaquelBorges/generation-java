package aulaCondicional;

import java.util.Scanner;

// 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

public class Exercicio2 {
	
	public static void main (String args[])
	{
		int n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 >= n2 && n1 >= n3)
		{
			if (n2 >= n3)
			{
				System.out.println("Ordem crescente : " + n3 + " > " + n2 + " > " + n1);
			}
			else if (n3 >= n2)
			{
				System.out.println("Ordem crescente : " + n2 + " > " + n3 + " > " + n1);
			}
		}
		else if (n2 >= n1 && n2 >= n3) 
		{
			if (n1 >= n3)
			{
				System.out.println("Ordem crescente : " + n3 + " > " + n1 + " > " + n2);
			}
			else if (n3 >= n1)
			{
				System.out.println("Ordem crescente : " + n1 + " > " + n3 + " > " + n2);
			}
			
		}
		else if (n3 >= n1 && n3 >= n2)
		{
			if (n1 >= n2)
			{
				System.out.println("Ordem crescente : " + n2 + " > " + n1 + " > " + n3);
			}
			else if (n2 >= n1)
			{
				System.out.println("Ordem crescente : " + n1 + " > " + n2 + " > " + n3);
			}
		}
			
	}

}
