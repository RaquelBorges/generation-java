package aulaHeranca;

public class AdministradorTeste {

	public static void main(String[] args) {
		
		Administrador admin1 = new Administrador();
		
		admin1.setNome("Raquel");
		admin1.setTelefone("999-9999");
		admin1.setAjudaCusto(850);
		
		admin1.imprimeValor();
		
		
	}
}
