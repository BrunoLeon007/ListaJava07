package exercicios;

import java.util.Scanner;

public class TotalSomatorio {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    double soma = 0;
		    for (int numero = 1; numero <= 10; numero++) {
		      System.out.print("Digite o valor " + numero + ": ");
		      double valor = scanner.nextDouble();
		      soma += valor;
		    }
		    double media = soma / 10;
		    System.out.println("O somatório é " + soma);
		    System.out.println("A média é " + media);
		    scanner.close();

	}

}
