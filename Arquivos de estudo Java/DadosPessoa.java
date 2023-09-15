
import java.util.Scanner;

public class DadosPessoa {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		int i;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = entrada.nextInt();
		System.out.println("");
		
		int m = 0;
		int h = 0;
		double soma = 0;
		String[] generos = new String[n];
		Double[] altura = new Double[n];
		
		System.out.println("");
		
		for (i = 0; i < n; i++) {
			
			System.out.print("Altura da " + (i + 1) + "\u00b0 pessoa : ");
			altura[i] = entrada.nextDouble();
			System.out.print("Genero da " + (i + 1) + "\u00b0 pessoa : ");
			generos[i] = entrada.next();
			
			System.out.println("");
			
			if (generos[i].equals("F")) {
				m++;
				soma= soma + altura[i];
			} else if (generos[i].equals("M")) {
				h++;
			}
		}
		
		double alturas = altura[0];
		double menorAlt = 0;
		double maiorAlt = 0;
		
		
		for (i = 0; i < n; i++) {
			
			
			if (altura[i] > alturas) {
				maiorAlt = altura[i];
			}
			if (altura[i] < alturas) {
				menorAlt = altura[i];
			}
		}
		
		double media = soma / m;
		
		
		System.out.printf("Menor altura = %.2f %n", menorAlt);
		System.out.printf("Maior altura = %.2f %n", maiorAlt);
		System.out.printf("Media de altura das mulheres = %.2f %n", media);
		System.out.println("Numero de homens = "+h);
	}
}