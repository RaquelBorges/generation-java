package JavaAula1;

import java.util.Scanner;

/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias. */

public class Exercicio2 {
	
	public static void main (String args[])
	{
		int idadeDias, idadeMeses, idadeAnos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira seus dias de vida: ");
		idadeDias = ler.nextInt();
		
		idadeAnos = idadeDias / 365;
		idadeMeses = (idadeDias%365) / 30;
		idadeDias = (idadeDias%365) % 30;
		
		System.out.println("Você tem " + idadeAnos + " anos " + idadeMeses + " meses e " + idadeDias + "dias de idade");	
	}
}
