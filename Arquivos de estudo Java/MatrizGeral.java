
import java.util.Scanner;

public class MatrizGeral {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		int x;
		int o;
		int l;
		int c;
		int soma = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		o = entrada.nextInt();
		
		int[][] matriz = new int[o][o];
		
		System.out.println();
		
		for (i = 0; i < o; i++) {
			for (x = 0; x < o; x++) {
				
				System.out.print("Elemento [" + i + "," + x + "] : ");
				matriz[i][x] = entrada.nextInt();
				
				if (matriz[i][x] > 0) {
					soma = soma + matriz[i][x];
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println("SOMA DOS POSITIVOS : " + soma);
		System.out.println();
		
		System.out.print("Escolha uma linha : ");
		l = entrada.nextInt();
		
		System.out.print("LINHA ESCOLHIDA : ");
		
		for (x = 0; x < o; x++) {
			
			System.out.print(matriz[l][x] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Escolha uma coluna : ");
		c = entrada.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA : ");
		
		for (i = 0; i < o; i++) {
			
			System.out.print(matriz[i][c] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL : ");
		
		for (i = 0; i < o; i++) {
			
			System.out.print(matriz[i][i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA : ");
		
		System.out.println();
		
		int n = 0;
		for (i = 0; i < o; i++) {
			for (x = 0; x < o; x++) {
				if (matriz[i][x] < 0) {
					
					matriz[i][x] =(int) Math.pow(matriz[i][x], 2);
				}
				
				System.out.print(matriz[i][x] + " ");
			}
			
			System.out.println();
		}
	}
}