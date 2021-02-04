package aulaPolimorfismo;

import java.util.Scanner;

public class testeAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Zazu",3);
		Cavalo horse = new Cavalo("Jorge",8);
		Preguica sloth = new Preguica("Ragnar", 1);
		
		Animal animal= null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha um animal: \n1. Cachorro\n2. Cavalo\n3. Bicho Preguiça");
		int op = scan.nextInt();
		
		switch (op)
		{
		case 1: animal= dog; break;
		case 2: animal= horse; break;
		case 3: animal= sloth; break;
		default: System.out.println("valor inválido");
		}
		
		System.out.println("Chamando " + animal.imprimirTipo());
		
		if(animal != null)
		{
			animal.imprimirInfo();
			animal.correr();
			System.out.println();
			animal.emitirSom();
		}
		
		
		
		
	}

}
