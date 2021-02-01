package aulaLacoRepeticao;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int idade=0, menor21=0, maior50=0;
		Scanner scan = new Scanner(System.in);
		
		while(idade != -99)
		{
			System.out.printf("Insira sua idade: ");
			idade = scan.nextInt();
			
			if(idade<21 && idade>0)
			{
				menor21++;
			}
			else if (idade>50)
			{
				maior50++;
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + menor21 + "\nTotal de pessoas com mais de 50 anos: " +maior50);
	}

}
