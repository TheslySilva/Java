
import java.util.Scanner;

public class SomaVetores {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,soma;
		
		System.out.print("Quantos valores tera em cada vetor? ");
		n= entrada.nextInt();
		int[] vetor1=new int[n];
		int[] vetor2=new int[n];
		int[] vetor3= new int[n];
		
		System.out.println("");
		System.out.println("Digite os valores do vetor A :");
		
		for (i=0;i<n;i++){
		vetor1[i]=entrada.nextInt();	
		}
		System.out.println("");
		System.out.println("Digite os valores do vetor B :");
		for (i=0;i<n;i++){
			vetor2[i]= entrada.nextInt();
		}
		System.out.println("");
		System.out.println("VETOR RESULTANTE :");
		for (i=0;i<n;i++){
			vetor3[i]= vetor1[i]+vetor2[i];
			System.out.println(vetor3[i]);
		}
	}
}