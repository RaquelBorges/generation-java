package AulaLacoRepeticao;

import java.util.Scanner;

// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

public class Exercicio2 {
	
	public static void main (String args[]){
		
		int i, num, impar=0, par=0;
		Scanner scan = new Scanner(System.in);
		
		for (i=1; i<=10; i++) 
		{
			System.out.printf("Entre com um n�mero: ");
			num = scan.nextInt();
			
			if (num%2 == 0) 
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("\nN�meros pares: " + par + "\nN�meros �mpares: " + impar);
	}
}
