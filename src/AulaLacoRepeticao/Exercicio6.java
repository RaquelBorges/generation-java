package aulaLacoRepeticao;

import java.util.Scanner;

/* 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int num; 
		double soma=0, cont=0;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.printf("Entre com um n�mero inteiro: ");
			num = scan.nextInt();
			
			if (num%3 == 0 && num !=0)
			{
				soma += num;
				cont++;
			}
		}
		while(num !=0);
		
		System.out.println("M�dia dos n�meros digitados que s�o multiplos de 3:  "+ (soma/cont));
	}
}
