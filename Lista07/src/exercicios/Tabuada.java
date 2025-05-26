package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero para saber a tabuada do mesmo:");
		
		int numero = sc.nextInt();
		
		System.out.println("A tabuada do numero informado é:" + numero + " x ");
		
		for(int multi = 0;   multi <= 10;  multi ++) {
		
		System.out.println(numero + " x "+ multi + " = " + (numero * multi));
	}
sc.close();
}
}