package aulaCondicional;

import java.util.Scanner;

// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class Exercicio1 {
	
	public static void main (String args[])
	{
		int n1, n2, n3, maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 >= n2 && n1 >= n3)
		{
			maior = n1;
			
			if (n1 == n2 && n1 != n3)
			{
				System.out.println("O primeiro e o segundo n�mero s�o iguais e correspodem ao maior valor digitado. N1 e N2 = " + maior);
			}
			else if (n1 == n3 && n1 != n2)
			{
				System.out.println("O primeiro e o terceiro n�mero s�o iguais e correspondem ao maior valor digitado. N1 e N3 = " + maior);
			}
			else if (n1 == n2 && n1 == n3)
			{
				System.out.println("Voc� digitou os 3 n�meros iguais. Maior valor = " + maior);
			}
			else
			{
				System.out.println("O primeiro n�mero corresponde ao maior valor digitado. N1 = " + maior);
			}
		}
		
		else if (n2 > n1 && n2 >= n3)
		{
			maior = n2;
			if (n2 == n3)
			{
				System.out.println("O segundo e o terceiro n�mero s�o iguais e correspondem ao maior valor digitado. N2 e N3 = " + maior);
			}
			else
			{
				System.out.println("O segundo n�mero corresponde ao maior valor digitado. N2 = " + maior);
			}
		}
		
		else if(n3 > n1 && n3 > n2)
		{
			maior = n3;
			System.out.println("O terceiro n�mero corresponde ao maior valor digitado. N3 = " + maior);
		}
	}

}
