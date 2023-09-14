
import java.util.Scanner;

public class NumerosPares {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,quant,i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n= entrada.nextInt();
		System.out.println("");
		int[] numeros= new int[n];
		
		for (i=0;i<n;i++){
			System.out.print("Digite um numero : ");
			numeros[i]=entrada.nextInt();
			System.out.println("");
		}
		System.out.print("NUMEROS PARES :");
		quant= 0;
		for(i=0;i<n;i++){
			if (numeros[i]%2 ==0){
			System.out.print(numeros[i]+" ");
				quant++;	
			}
		}
		System.out.println("");
		System.out.println("QUANTIDADE DE PARES = "+quant);
	}
}
