package AulaLacoRepeticao;

import java.util.Scanner;

/* Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int num, soma=0;
		Scanner scan = new Scanner (System.in);
		
		do 
		{
			System.out.printf("Entre com um número: ");
			num = scan.nextInt();
			soma += num;
		}
		while (num !=0);
		
		System.out.println("\nA soma dos números digitados é: " + soma);
	}

}
