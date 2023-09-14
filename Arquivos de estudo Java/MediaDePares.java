
import java.util.Scanner;

public class MediaDePares {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,x;
		double soma,media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n= entrada.nextInt();
		System.out.println("");
		
		int[] numeros= new int[n];
		
		for (i=0;i<n;i++){
		System.out.print("Digite um numero : ");
			numeros[i]=entrada.nextInt();	
		}
		
		soma=0;
		x=0;
		
		for (i=0;i<n;i++){
			if(numeros[i]%2 ==0){
				soma=soma+numeros[i];
				x++;
			}
		}
		
		media=soma/x;
		System.out.println("");
		if(soma!=0){
		System.out.println("");
		System.out.printf("MEDIA DOS PARES = %.1f %n",media);
			}else{
			System.out.println("NENHUM NUMERO PAR ");
		}
	}
}