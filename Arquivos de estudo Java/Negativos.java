
import java.util.Scanner;

public class Negativos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i;
		
		//array
		
		int[] vetor= new int[9];
		
		//adicionando valores aos indices
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n= entrada.nextInt();
		System.out.println("");
		
		for (i=0 ; i<n; i++){
			System.out.print("Digite um numero : ");
			vetor[i]= entrada.nextInt();
		}
		
		//verificando valores negativo
		
		System.out.println("");
		System.out.println("NUMEROS NEGATIVOS : ");
		System.out.println("");
		for (i=0;i<n; i++){
			if (vetor[i]<0)
			System.out.println("indice : "+i+ " = "+vetor[i]);
			
		}
	}
}