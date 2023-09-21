
import java.util.Scanner;

public class AcimaDiagonal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i,x,o;
		
		System.out.print("Qual a ordem da matriz? ");
		o= entrada.nextInt();
		
		int[][] matriz= new int[o][o];
		
		System.out.println();
		
		for(i=0;i<o;i++){
			
			for (x=0;x<o;x++){
				
				System.out.print("Elemento ["+i+","+x+"] : ");
				matriz[i][x]= entrada.nextInt();
				
			}
			System.out.println();
		}
		int soma=0;
		for(i=0;i<o;i++){
			
			
			for (x=i+1;x<o;x++){
				soma= soma+ matriz[i][x];
			}
			
		}
		System.out.println("Soma dos elementos acima da diagonal : "+ soma);
	}
}