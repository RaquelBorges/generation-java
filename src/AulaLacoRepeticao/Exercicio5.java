package AulaLacoRepeticao;

import java.util.Scanner;

/* Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE) */

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int num, soma=0;
		Scanner scan = new Scanner (System.in);
		
		do 
		{
			System.out.printf("Entre com um n�mero: ");
			num = scan.nextInt();
			soma += num;
		}
		while (num !=0);
		
		System.out.println("\nA soma dos n�meros digitados �: " + soma);
	}

}
