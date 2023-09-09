
import java.util.Scanner;

public class DentroOuFora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		int i;
		int dentro;
		int fora;
		System.out.print("Quantos numeros voce vai digitar? : ");
		a = entrada.nextInt();
		System.out.println("");
		dentro = 0;
		fora = 0;
		for (i = 1; i <= a; i++) {
			System.out.print("Digite um numero : ");
			b = entrada.nextInt();
			if (b > 10 && b < 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println("");
		System.out.println("Resultado :\n ");
		
		System.out.println("Dentro : " + dentro);
		System.out.print("Fora : " + fora);
	}
}