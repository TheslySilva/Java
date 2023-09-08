
import java.util.Scanner;

public class MeuProjeto {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int soma;
		int contador;
		contador = 0;
		numero = 0;
		
		System.out.print("Digitar a tabuada para qual valor ? : ");
		numero = entrada.nextInt();
		for (contador = 0; contador <= 10; contador++) {
			soma = numero * contador;
			System.out.println(numero + " x " + contador + " = " + soma);
		}
	}
}