package aulaHeranca;

public class Administrador extends Pessoa {
	
	float ajudaCusto;
	
	public Administrador ()
	{
		
	}
	
	public Administrador (String nome, String telefone, float ajudaCusto)
	{
		super(nome, telefone);
		this.ajudaCusto = ajudaCusto;
	}

	public float getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(float ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
	public void imprimeValor()
	{
		System.out.println(getNome() + ", a sua ajuda de custo é de R$ " + ajudaCusto);
	}

}
