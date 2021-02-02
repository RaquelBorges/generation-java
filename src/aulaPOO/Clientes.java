package aulaPOO;

public class Clientes {
	
	public static void main(String[] args) {
		
		Exercicio1Clientes clientes[] = new Exercicio1Clientes[5];
		
		clientes[0] = new Exercicio1Clientes (10, "Luiza", 450);
		clientes[1] = new Exercicio1Clientes (21, "Julia", 800);
		clientes[2] = new Exercicio1Clientes (32, "Renato", 1100);
		clientes[3] = new Exercicio1Clientes (43, "Rafael", 300);
		clientes[4] = new Exercicio1Clientes (54, "Raquel", 750);
		
		for (int i = 0; i<clientes.length; i++)
		{
			clientes[i].imprimeInfos();
			System.out.println("********************************");
		}
		
	}

}
