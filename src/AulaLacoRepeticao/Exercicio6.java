package aulaLacoRepeticao;

import java.util.Scanner;

/* 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int num; 
		double soma=0, cont=0;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.printf("Entre com um número inteiro: ");
			num = scan.nextInt();
			
			if (num%3 == 0 && num !=0)
			{
				soma += num;
				cont++;
			}
		}
		while(num !=0);
		
		System.out.println("Média dos números digitados que são multiplos de 3:  "+ (soma/cont));
	}
}
