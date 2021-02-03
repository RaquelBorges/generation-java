package aulaHeranca;

public class EmpregadoTeste {
	
	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado();
		
		empregado1.setNome("Renan");
		empregado1.setCodigoSetor(233);
		empregado1.setSalarioBase(2500.00f);
		empregado1.setPercentualImpostos(8);
				
		empregado1.calcularSalario();
		
	}

}
