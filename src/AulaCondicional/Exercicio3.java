package aulaCondicional;

import java.util.Scanner;

/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto */

public class Exercicio3 {
	
	public static void main (String args[])
	{
		int idade;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira sua idade: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("Você está na categoria Infantil");
		}
		
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println("Você está na categoria Juvenil");

		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("Você está na categoria Adulto");
		}
		else 
		{
			System.out.println("Desculpe, você não se enquadra em nenhuma categoria.");
		}
		
	}

}
