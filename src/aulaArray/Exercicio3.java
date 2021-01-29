package aulaArray;

import java.util.Scanner;

/* 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

public class Exercicio3 {

	public static void main(String[] args) {
		
		int n1[][] = new int[4][6], n2[][] = new int[4][6], m1[][] = new int[4][6], m2[][] = new int[4][6];
		int i,j;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<4; i++) 
		{
			for(j=0; j<6; j++)
			{
				System.out.printf("Entre com o %do. número da %da. linha da matriz N1: ", (j+1), (i+1));
				n1[i][j] =  scan.nextInt();
			}
		}
		
		System.out.println("\n");
		
		for(i=0; i<4; i++) 
		{
			for(j=0; j<6; j++)
			{
				System.out.printf("Entre com o %do. número da %da. linha da matriz N2: ", (j+1), (i+1));
				n2[i][j] =  scan.nextInt();
			}
		}
		
		System.out.println("\n");

		for(i=0; i<4; i++) 
		{
			for(j=0; j<6; j++)
			{
				m1[i][j] = n1[i][j] + n2[i][j]; 
				System.out.printf("Matriz M1[%d][%d] = %d\n", i, j, m1[i][j]);
			}
		}
		System.out.println("\n");
		
		for(i=0; i<4; i++) 
		{
			for(j=0; j<6; j++)
			{
				m2[i][j] = n1[i][j] - n2[i][j]; 
				System.out.printf("Matriz M2[%d][%d] = %d\n", i, j, m2[i][j]);
			}
		}		
	}
}
