package javaAula1;

import java.util.Scanner;

/* 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente. */

public class Exercicio5 {
	
	public static void main (String args[])
	{
		double n1,n2,n3,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		n1 = ler.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		n2 = ler.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		n3 = ler.nextDouble();
		
		media = ((n1*2) + (n2*3) + (n3*5))/10;
		System.out.println("A média do aluno foi " + media);
		
		ler.close();		
	}

}
