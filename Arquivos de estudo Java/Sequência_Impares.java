
import java.util.Scanner;

public class SequenciaImpares {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int i;
		System.out.print("Digite um numero : ");
		num = entrada.nextInt();
		
		for(i = 1; i <=num; i+=2) {
			System.out.println(i);
		}
	}
}