package aulaPolimorfismo;

public class Preguica extends Animal {
	
	public Preguica (String nome, int idade) 
	{
		super(nome, idade);
		
	}
	
	@Override
	public void correr()
	{
		int velocidade = 900;

		for(int i =0; i<4; i++)
		{
			try {
				Thread.currentThread();
				Thread.sleep(velocidade);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf("nheee... ");
		}
	}
	
	@Override
	public void emitirSom ()
	{
		System.out.println("\nNhiiii...Nhiii...!!");
	}
	
	@Override
	public String imprimirTipo ()
	{
		String tipo = "Bicho Preguiça";
		return tipo;
	}

}
