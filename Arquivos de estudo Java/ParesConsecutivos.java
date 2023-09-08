
import java.util.Scanner;

public class ParesConsecutivos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int soma;
		int contador = 0;
		num = 1;
		while (num != 0) {
			System.out.print("Digite um numero : ");
			num = entrada.nextInt();
			if (num % 2 != 0) {
				num++;
			}
			if (num != 0) {
				soma = num * 5 + 20;
				System.out.println("A soma é : " + soma);
			}
		}
	}
}