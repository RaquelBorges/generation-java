package aulaHeranca;

public class FornecedorTeste {
	
	public static void main(String[] args) {
		
		Fornecedor fornecedores[] = new Fornecedor[2];
		
		fornecedores[0] = new Fornecedor("Julia","Rua 132, 12","999-9999", 1100.00f, 500.00f);
		fornecedores[1] = new Fornecedor("Bruno","Rua 540, 88b","999-9999", 100.00f, 2500.00f);

		for(int i=0; i<fornecedores.length; i++)
		{
			fornecedores[i].imprimeInfos();
			fornecedores[i].obterSaldo();
			System.out.println("------------------------------");
		}


	}

}
