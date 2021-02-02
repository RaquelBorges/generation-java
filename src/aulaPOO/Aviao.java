package aulaPOO;

public class Aviao {
	
	public static void main(String[] args) {
		
		Exercicio2Aviao voos[] = new Exercicio2Aviao[4];
		
		voos[0] = new Exercicio2Aviao (543, "Natal", "15:35");
		voos[1] = new Exercicio2Aviao (387, "Porto Alegre", "17:15");
		voos[2] = new Exercicio2Aviao (956, "Porto Seguro", "14:55");
		voos[3] = new Exercicio2Aviao (882, "Rio de Janeiro", "16:20");
		
		for(int i=0; i<voos.length; i++)
		{
			voos[i].informaVoos();
		}
		
	}

}
