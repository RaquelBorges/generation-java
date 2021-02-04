package aulaPolimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo (String nome, int idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public void correr()
	{
		int velocidade = 300;

		for(int i =0; i<4; i++)
		{
			try {
				Thread.currentThread();
				Thread.sleep(velocidade);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
			System.out.printf("pocotó... ");
		}
	}
	
	@Override
	public void emitirSom ()
	{
		System.out.println("\nIhhhhh...Pruuuuu...");
	}
	
	@Override
	public String imprimirTipo ()
	{
		String tipo = "Cavalo";
		return tipo;
	}

}
