package aulaPOO;

import java.text.NumberFormat;

public class Exercicio1Clientes {
	
	private int codigoCliente;
	private String nome;
	private double limiteCompra;
	
	public Exercicio1Clientes(int codigoCliente, String nome, double limiteCompra)
	{
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		this.limiteCompra = limiteCompra;
	}
	
	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getLimiteCompra() {
		return limiteCompra;
	}

	public void setLimiteCompra(double limiteCompra) {
		this.limiteCompra = limiteCompra;
	}
	
	public void imprimeInfos()
	{
		System.out.println("Código do cliente: " + codigoCliente + "\nNome: " + nome + "\nTem limite de compra de R$ " + limiteCompra + "\n");
	}
	

}
