package aulaPOO;

public class Exercicio2Aviao {
	
	private int nVoo;
	private String destino;
	private String horaPartida;
	
	public Exercicio2Aviao(int nVoo, String destino, String horaPartida) 
	{
		this.nVoo = nVoo;
		this.destino = destino;
		this.horaPartida = horaPartida;
	}

	public int getnVoo() {
		return nVoo;
	}

	public void setnVoo(int nVoo) {
		this.nVoo = nVoo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}
	
	public void informaVoos()
	{
		System.out.println("********************************************");
		System.out.println("Voo número " + nVoo + " com destino a " + destino + "\n\tPatida as: " + horaPartida + "\n");
	}

}
