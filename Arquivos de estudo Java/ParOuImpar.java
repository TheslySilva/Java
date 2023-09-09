
import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor;
		int i;
		int contador;
		System.out.print("Quantos numeros vai digitar?  ");
		contador = entrada.nextInt();
		for (i = 1; i <= contador; i++) {
			System.out.print("Digite um numero : ");
			valor = entrada.nextInt();
			if (valor % 2 == 0) {
				if (valor > 0) {
					System.out.println("Par Positivo");
				} else {
					System.out.print("Par negativo");
				}
			} else if (valor % 2 != 0) {
				if (valor > 0) {
					System.out.print("Impar Positivo");
				} else {
					System.out.print("Impar Negativo");
				}
			}
		}
	}
}