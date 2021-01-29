package aulaArray;

import java.util.Scanner;

/* 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal. */

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int mat[][] = new int[3][3], i,j, soma=0, diag=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.printf("Entre com o %do. número da %da. linha da matriz: ", (j+1), (i+1));
				mat[i][j] = scan.nextInt();
			}
		}
		
		for (i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				soma = soma + mat[i][j];
				
				if (i == j)
				{
					diag = diag + mat[i][j];
				}
			}
		}
		System.out.println("\nA soma dos valores da matriz é = " + soma + "\nA soma da diagonal principal é = " + diag);
		
	}
}
