package AulaLacoRepeticao;

import java.util.Scanner;

// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class Exercicio2 {
	
	public static void main (String args[]){
		
		int i, num, impar=0, par=0;
		Scanner scan = new Scanner(System.in);
		
		for (i=1; i<=10; i++) 
		{
			System.out.printf("Entre com um número: ");
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
		System.out.println("\nNúmeros pares: " + par + "\nNúmeros ímpares: " + impar);
	}
}
