package exercicios;

public class SerieFibonacci {

	public static void main(String[] args) {
	    int primeironumero = 1;
	    int segundonumero = 1;
	    System.out.println(primeironumero);
	    System.out.println(segundonumero);
	    for (int sequencia = 3; sequencia <= 15; sequencia++) {
	      int proximo = primeironumero + segundonumero;
	      System.out.println(proximo);
	      primeironumero = segundonumero;
	      segundonumero = proximo;
	    }

	}

}
