package exercicios;

import java.util.Scanner;

public class LeituradeValoresPositivosInteiros {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int maior = Integer.MIN_VALUE;
	    int menor = Integer.MAX_VALUE;
	    while (true) {
	      System.out.print("Digite um valor: ");
	      int valor = scanner.nextInt();
	      if (valor < 0) {
	        break;
	      }
	      if (valor > maior) {
	        maior = valor;
	      }
	      if (valor < menor) {
	        menor = valor;
	      }
	    }
	    System.out.println("O maior valor é " + maior);
	    System.out.println("O menor valor é " + menor);
	    scanner.close();

	}

}
