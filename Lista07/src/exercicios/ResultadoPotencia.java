package exercicios;

public class ResultadoPotencia {

	public static void main(String[] args) {
		  int potencia = 3;
		    int resultado = 1;
		    for (int numero = 0; numero <= 15; numero++) {
		      System.out.println(potencia + " elevado a " + numero + " é " + resultado);
		      resultado *= potencia;
		    }

	}

}
