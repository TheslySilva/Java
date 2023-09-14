
import java.util.Scanner;

public class MaiorPosicao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,posicao;
		double x;
		System.out.print("Quantos numeros voce vai digitar? ");
		n=entrada.nextInt();
		double[] numeros = new double [n];
		System.out.println("");
		
		for (i=0;i<n;i++){
			System.out.print("Digite um numero : ");
			numeros[i]= entrada.nextDouble();
		}
		x=0;
		posicao=0;
		for (i=0;i<n;i++){
			
			if(numeros[i] >x){
				x=numeros[i];
				posicao=i;	
			}
		}
		System.out.println("");
		System.out.println("O MAIOR VALOR = "+x);
		System.out.print("POSICAO DO MAIOR VALOR = "+ posicao);
	}
}