
import java.util.Scanner;

public class SomaMatrizes {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i,x,l,c;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		l= entrada.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		c= entrada.nextInt();
		
		int[][] m1= new int[l][c];
		int[][] m2= new int[l][c];
		int[][] m3= new int[l][c];
		
		System.out.println();
		System.out.println("Digite  os valores da matriz A :");
		System.out.println();
		
		for(i=0;i<l;i++){
			
			for (x=0;x<c;x++){
				
				System.out.print("Elemento ["+i+","+x+"] : ");
				m1[i][x]= entrada.nextInt();
				
			}
		}
		
		System.out.println();
		System.out.println("Digite os valores da matriz B :");
		System.out.println();
		
		for (i=0;i<l;i++){
			
			for (x=0;x<c;x++){
				
				System.out.print("Elemento ["+i+","+x+"] : ");
				m2[i][x]= entrada.nextInt();
				
			}
		}
		System.out.println();
		System.out.println("MATRIZ SOMA : ");
		System.out.println();
		
		for (i=0;i<l;i++){
			
			for (x=0;x<c;x++){
				
				m3[i][x]= m1[i][x]+ m2[i][x];
				
				System.out.print(m3[i][x]+" ");
			}
			System.out.println();
		}
	}
}