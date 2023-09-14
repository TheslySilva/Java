
import java.util.Scanner;

public class AbaixoDaMedia {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,x;
		double soma,media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n= entrada.nextInt();
		
		double[] numeros= new double[n];
		
		for (i=0;i<n;i++){
			System.out.print("Digite um numero : ");
			numeros[i]=entrada.nextDouble();
		}
		soma=0;
		x=0;
		for (i=0;i<n;i++){
			soma=soma +  numeros[i];
			x++;
		}
		media=soma/x;
		System.out.println("");
		System.out.printf("MEDIA DO VETOR = %.3f %n",media);
		System.out.print("ELEMENTOS ABAIXO DA MEDIA : ");
		
		for (i=0;i<n;i++){
			if (numeros[i]<media){
				System.out.print(numeros[i]+" ");
			}
		}
	}
}