package AulaLacoRepeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
G1 - o número de pessoas calmas; G2 - o número de mulheres nervosas; G3 - o número de homens agressivos; G4 - o número de outros calmos;
G5 - o número de pessoas nervosas com mais de 40 anos; G6 - o número de pessoas calmas com menos de 18 anos.*/

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int i=1,idade,sexo,humor,g1=0, g2=0, g3=0, g4=0, g5=0, g6=0;
		Scanner scan = new Scanner(System.in);
		
		while (i <= 150)
		{
			System.out.println("\nQual a sua idade?");
			idade = scan.nextInt();
			
			System.out.println("\nQual o seu sexo?\n1. Feminino\n2. Masculino\n3. Outros");
			sexo = scan.nextInt();
			
			System.out.println("\nComo está seu humor?\n1. Calmo(a)\n2. Nervoso(a)\n3. Agressivo(a)");
			humor = scan.nextInt();
			
			i++;
			
			switch(humor)
			{
			case 1:
				g1++;
				if (idade<18 && idade>0)
				{
					g6++;
				}
				if (sexo == 3)
				{
					g4++;
				}
				break;
				
			case 2:
				if(sexo == 1)
				{
					g2++;
				}
				if(idade > 40)
				{
					g5++;
				}
				break;
			
			case 3:
				if (sexo == 2)
				{
					g3++;
				}
				break;
			}
		}
		System.out.printf("Número de pessoas calmas: " + g1);
		System.out.printf("\nNúmero de mulheres nervosas: " + g2);
		System.out.printf("\nNúmero de homens agressivos: " + g3);
		System.out.printf("\nNúmero de outros calmos: " + g4);
		System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: " + g5);
		System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: " + g6);
	}
}
