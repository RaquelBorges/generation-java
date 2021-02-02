package aulaPOO;

import java.text.NumberFormat;

/* 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console. */

public class Exercicio3Produto {
	
	public int codigo;
	private String marca;
	private String modelo;
	private float valor;
	
	public Exercicio3Produto(int codigo, String marca, String modelo, float valor)
	{
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String formataValor()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String formatoValor = nf.format(valor);
		return formatoValor;
	}
	
	public void imprimeTabela()
	{
		System.out.println(codigo + "- Marca: " + marca + "\nModelo: " + modelo + "\nPreço: " + this.formataValor());
		System.out.println("*****************************************");
	}
	
	public void divideValor(int parcelas)
	{
		valor = valor/parcelas;
		System.out.println("\nValor parcelado: " + parcelas + "x de " + this.formataValor());
	}
	
	public void concedeDesconto(float desconto)
	{
		valor = (valor*95)/100;
		System.out.println("\nValor a vista: " + this.formataValor());
	}

}
