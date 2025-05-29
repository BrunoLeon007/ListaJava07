package exercicios;

import java.util.Scanner;

public class CalculoTotalArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double areatotal = 0;
	    while (true) {
	      System.out.print("Digite o nome do cômodo: ");
	      String nome = sc.next();
	      System.out.print("Digite a largura do cômodo: ");
	      double largura = sc.nextDouble();
	      System.out.print("Digite o comprimento do cômodo: ");
	      double comprimento = sc.nextDouble();
	      double area = largura * comprimento;
	      System.out.println("A área do " + nome + " é " + area);
	      areatotal += area;
	      System.out.print("Deseja continuar? (SIM/NAO): ");
	      String resposta = sc.next().toUpperCase();
	      if (resposta.equals("NAO")) {
	        break;

	      }
	      }
	    }
	}


