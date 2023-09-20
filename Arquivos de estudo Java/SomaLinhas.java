
import java.util.Scanner;

public class SomaLinhas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i,l,c,x;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		l= entrada.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		c= entrada.nextInt();
		
		System.out.println();
		
		double[][] matriz= new double[l][c];
		double[] vetor= new  double[l];
		
		for (i=0;i<l;i++){
			
		
			double soma=0;
				
		
			System.out.println("Digite os elementos da "+(i+1)+"° linha :");
			
			System.out.println();
			
			for (x=0;x<c;x++){
				
			
				System.out.print("Elemento ["+i+" "+x+"] : ");
				matriz[i][x]= entrada.nextDouble();
				soma= soma+ matriz[i][x];
			}
			
			System.out.println();
			
			vetor[i]= soma;
			soma=0;
		}
		
		System.out.println();
		
		System.out.println("VETOR GERADO : ");
		
		System.out.println();
		
		for (i=0;i<l;i++){
			System.out.println("Elemento ["+i+"] : "+vetor[i]);
		}
	}
}