package exercicios;

public class ConversaoGrau {

	public static void main(String[] args) {
		  for (int celsius = 10; celsius <= 100; celsius += 10) {
		      double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
		      System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit");
		    }

	}

}
