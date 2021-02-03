package aulaHeranca;

public class Empregado extends Pessoa{
	
	int codigoSetor;
	float salarioBase;
	float percentualImpostos;
	
	public Empregado ()
	{
		
	}

	public Empregado (String nome, int codigoSetor, float salarioBase, float percentualImpostos) 
	{
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.percentualImpostos = percentualImpostos;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getPercentualImpostos() {
		return percentualImpostos;
	}

	public void setPercentualImpostos(float percentualImpostos) {
		this.percentualImpostos = percentualImpostos;
	}
	
	public float calcularSalario()
	{
		float salario = salarioBase - ((salarioBase * percentualImpostos)/100);
		System.out.println("Nome: " + getNome() + "\nSetor: " + getCodigoSetor() + "\nSalário líquido: R$ " + salario);
		return salario;
	}

}
