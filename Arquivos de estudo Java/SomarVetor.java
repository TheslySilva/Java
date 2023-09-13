
import java.util.Scanner;

public class SomarVetor {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int  n,i;
		double soma,media;
		//
		System.out.print("Quantos numeros voce vai digitar? ");
		n= entrada.nextInt();
		System.out.println("");
		//array
		int[]vetor= new int[n];
		//
		for (i=0;i<n;i++){
			System.out.print("Digite um numero : ");
			vetor[i]= entrada.nextInt();
		}
			
		soma=0;
		System.out.println("");
		System.out.println("Valores :");
		System.out.println("");
		for (i=0;i<n;i++){
			System.out.println("INDICE  => "+i+" = "+vetor[i]);
			soma = vetor[i]+soma;
		}
		System.out.println("");
		media= soma/n;
		System.out.println("SOMA = " + soma);
		System.out.printf("MEDIA = %.2f %n" ,media);
	}
}