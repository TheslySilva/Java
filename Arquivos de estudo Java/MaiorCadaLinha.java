
import java.util.Scanner;

public class MaiorCadaLinha {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i,x,o,n,m;
		
				System.out.print("Qual a ordem da matriz? ");
		o= entrada.nextInt();
		int[][] matriz= new int[o][o];
		System.out.println();
		
		for (i=0;i<o;i++){
			
			for (x=0;x<o;x++){
				
				System.out.print("Elemento ["+i+","+x+"] :");
				matriz[i][x]= entrada.nextInt();
				
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("MAIOR ELEMENTO DE CADA LINHA :");
		System.out.println();
		
		m=matriz[0][0];
		
		for (i=0;i<o;i++){
			
			for (x=0;x<o;x++){
				
			if (matriz[i][x]>m){
					
					m= matriz[i][x];
					
				}	
					
			}
			System.out.println(m);
			m=matriz[0][0];
		}
	}
}