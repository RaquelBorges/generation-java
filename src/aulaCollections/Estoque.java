package aulaCollections;

public class Estoque {
	
	private String produto;
	private int qntd;
	
	public Estoque (String produto, int qntd)
	{
		this.produto = produto;
		this.qntd = qntd;
	}

	public Estoque() 
	{
		
	}

	public String getProduto() {
		return this.produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	
	public String toString()
	{
		return produto + " - " + qntd;
	}
	
	public int mudarEstoque (int qntd)
	{
		this.qntd += qntd;
		return this.qntd;
	}
	
}
