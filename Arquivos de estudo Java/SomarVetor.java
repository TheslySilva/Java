
import java.util.Scanner;

public class SomarVetor {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int  n,i;
		double soma,media;
		//array
		double[]vetor= new double[5];
		//
		System.out.print("Quantos numeros voce vai digitar? ");
		n= entrada.nextInt();
		System.out.println("");
		for (i=0;i<n;i++){
			System.out.print("Digite um numero : ");
			vetor[i]= entrada.nextInt();
		}
			
		soma=0;
		System.out.println("");
		System.out.print("VALORES = ");
		for (i=0;i<n;i++){
			System.out.print(vetor[i]+" ");
			soma = vetor[i]+soma;
		}
		System.out.println("");
		media= soma/n;
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = "+media);
	}
}