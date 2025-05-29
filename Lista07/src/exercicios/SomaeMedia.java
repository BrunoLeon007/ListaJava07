package exercicios;

public class SomaeMedia {

	public static void main(String[] args) {
		 int soma = 0;
		    int count = 0;
		    for (int i = 50; i <= 70; i++) {
		      if (i % 2 == 0) {
		        soma += i;
		        count++;
		      }
		    }
		    double media = (double) soma / count;
		    System.out.println("A soma é " + soma);
		    System.out.println("A média é " + media);

	}

}
