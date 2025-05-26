package exercicios;

public class SomatoriodeValores {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int par = 0; par <=500; par++) {
			if(par % 2 ==0) {
				soma += par;
			}
		}
System.out.println("A soma dos numeros pares de 0 a 500 é:"+ soma);
	}

}
