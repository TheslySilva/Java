import java.util.Scanner;

public class NegativoMatriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i,l,c,x;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		l= entrada.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		c= entrada.nextInt();
		
		System.out.println();
		
		int[][] matriz= new int[l][c];
		
		for(i=0;i<l;i++){
			for(x=0;x<c;x++){
			System.out.print("Elemento ["+i+","+x+"] : ");
				matriz[i][x]= entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("VALORES NEGATIVOS : ");
		System.out.println();
		
		for(i=0;i<l;i++){
			for(x=0;x<c;x++){
					if (matriz[i][x]<0){
					System.out.println("Elemento na posicao ["+i+","+x+"] : "+matriz[i][x]);
				}
			}
		}
	}
}