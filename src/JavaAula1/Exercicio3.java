package javaAula1;

import java.util.Scanner;

/* 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

public class Exercicio3 {
	
	public static void main (String args[])
	{
		int horas, minutos, segundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o tempo de dura��o do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600) / 60;
		segundos = (segundos%3600) % 60;
		
		System.out.println("O evento tem dura��o total de " + horas + " hora(s) " + minutos + " minuto(s) e " + segundos + " segundo(s)");
	}

}
