package aulaPolimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, int idade) 
	{
		super(nome, idade);
	}
	
	@Override
	public void correr()
	{
		int velocidade = 600;

		for(int i =0; i<4; i++)
		{
			try {
				Thread.currentThread();
				Thread.sleep(velocidade);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf("tec... ");

		}
	}
	
	@Override
	public void emitirSom ()
	{
		System.out.println("\nAuuuuu...Auuuuu...AuAu!!");
	}
	
	@Override
	public String imprimirTipo ()
	{
		String tipo = "Cachorro";
		return tipo;
	}
}
