package aulaPOO;

import java.util.Scanner;

public class Produto {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int op;
				
		Exercicio3Produto produtos[] = new Exercicio3Produto[3];
		
		produtos[0] = new Exercicio3Produto(1, "Samsung", "Galaxy s20", 3300.00f);
		produtos[1] = new Exercicio3Produto(2, "Xiaomi", "Redmi Note 9", 1584.99f);
		produtos[2] = new Exercicio3Produto(3, "Apple", "Iphone 11", 4699.00f);
		
		for(int i=0; i<produtos.length; i++)
		{
			produtos[i].imprimeTabela();
		}
						
			System.out.println("Qual item gostaria de comprar?");
			op = scan.nextInt();
			
			switch(op)
			{
			
				case 1: 
					
					System.out.println("Voc� escolheu a op��o " + op);
					produtos[0].imprimeTabela();
					System.out.println("\nDeseja parcelar esse valor? \n1.Sim\n2.N�o");
					op = scan.nextInt();
					while(op >=1 || op <=2)
					{		
						if(op == 1)
						{
								System.out.println("� poss�vel dividir at� 10x sem juros, em quantas parcelas deseja?");
								op = scan.nextInt();
								if (op>=1 || op<=10)
								{
									produtos[0].divideValor(op);
								}
								else
								{
									System.out.println("\nVoc� digitou um n�mero de parcelas inv�lida");
								}
							}
								
						else if (op == 2)
						{
							System.out.println("\nVoc� escolheu pagamento a vista com 5% de desconto");
							produtos[0].concedeDesconto(op);
							
						}
						else 
						{
							System.out.println("\n Voc� digitou uma op��o inv�lida!!");
						} 
					}
					break;
						
				case 2: 
				
					System.out.println("Voc� escolheu a op��o " + op);
					produtos[1].imprimeTabela();
					System.out.println("\nDeseja parcelar esse valor? \n1.Sim\n2.N�o");
					op = scan.nextInt();
					
						if(op == 1)
						{
								System.out.println("� poss�vel dividir at� 10x sem juros, em quantas parcelas deseja?");
								op = scan.nextInt();
								if (op>=1 || op<=10)
								{
									produtos[1].divideValor(op);
								}
								else
								{
									System.out.println("Voc� digitou um n�mero de parcelas inv�lida");
								}
						}
						else if (op == 2)
						{
							System.out.println("Voc� escolheu pagamento a vista com 5% de desconto");
							produtos[1].concedeDesconto(op);
							
						}
						else 
						{
							System.out.println("\n Voc� digitou uma op��o inv�lida!!");
						} 
					break;
					
				case 3: 

					System.out.println("Voc� escolheu a op��o " + op);
					produtos[2].imprimeTabela();
					System.out.println("\nDeseja parcelar esse valor? \n1.Sim\n2.N�o");
					op = scan.nextInt();
					
						if(op == 1)
						{
								System.out.println("� poss�vel dividir at� 10x sem juros, em quantas parcelas deseja?");
								op = scan.nextInt();
								if (op>=1 || op<=10)
								{
									produtos[2].divideValor(op);
								}
								else
								{
									System.out.println("Voc� digitou um n�mero de parcelas inv�lida");
								}
							
						}
					
						else if (op == 2)
						{
							System.out.println("Voc� escolheu pagamento a vista com 5% de desconto");
							produtos[2].concedeDesconto(op);
							
						}
						else 
						{
							System.out.println("\n Voc� digitou uma op��o inv�lida!!");
						} 
						break;
				
				default:
					System.out.println("Voc� digitou uma op��o inv�lida!");
						
			}		
		
		System.out.println("\nObrigada por comprar conosco!!");

	}
}


		

