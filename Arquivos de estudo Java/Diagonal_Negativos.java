
import java.util.Scanner;

public class DiagonalNegativos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,j,x;
		
		System.out.print("Qual a ordem da matriz? ");
		n= entrada.nextInt();
		int[][] num= new int[n][n];
		
		System.out.println();
		
		for (i=0;i<n;i++){
			
			for (j=0;j<n;j++){
				
				System.out.print("Elemento ["+i+","+j+"] : ");
				num[i][j]= entrada.nextInt();
				
			}
		}
		
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL : ");
		
		for (i=0;i<n;i++){
			
				System.out.print(num[i][i]+" ");
		}
		
		
		x=0;
		
		for (i=0;i<n;i++){
			
			for (j=0;j<n;j++){
				
				if(num[i][j]<0){
					x++;
				}
				
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = "+x);
		
		entrada.close();
	}
}