
import java.util.Scanner;

public class ValidacaoDeNotas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1;
		double nota2;
		double soma;
		int contador = 0;
		System.out.print("Digite a primeira nota : ");
		nota1 = entrada.nextDouble();
		while (contador <= 1) {
			if (nota1 < 0.11|| nota1 > 10) {
				System.out.print(" Valor Invalido! Digite novamente : ");
				nota1 = entrada.nextDouble();
			} else {
				contador++;
			}
		}
		contador = 0;
		System.out.print("Digite a segunda nota : ");
		nota2 = entrada.nextDouble();
		while (contador <= 1) {
			if (nota2 < 0.11 || nota2 > 10) {
				System.out.print("Valor Invalido! Digite novamente : ");
				nota2 = entrada.nextDouble();
			} else {
				contador++;
			}
		}
		soma = (nota1 + nota2) / 2;
		System.out.println("Media : " + soma);
	}
}