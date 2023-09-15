
import java.util.Scanner;

public class Comerciante {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		int i;
		
		System.out.print("Quantos dados de produtos serao digitados? ");
		n = entrada.nextInt();
		System.out.println("");
		
		double[] compra = new double[n];
		double[] venda = new double[n];
		String[] nome = new String[n];
		
		for (i = 0; i < n; i++) {
			
			System.out.println("Produto " + (i + 1) + ":");
			System.out.print("Nome : ");
			nome[i] = entrada.next();
			System.out.print("Preco de compra : ");
			compra[i] = entrada.nextDouble();
			System.out.print("Preco de venda : ");
			venda[i] = entrada.nextDouble();
			System.out.println("");
		}
		
		int maior = 0;
		int meio = 0;
		int menor = 0;
		double somaC = 0;
		double somaV = 0;
		double lucro = 0;
		
		for (i = 0; i < n; i++) {
			
			somaC = somaC + compra[i];
			somaV = somaV + venda[i];
			double valor = compra[i];
			double valor2 = venda[i];
			double por10 = (valor * 10.0) / 100.0;
			double por20 = (valor * 20.0) / 100.0;
			double res1 = valor2 - valor;
			lucro = lucro + res1;
			
			if (res1 < por10) {
				menor++;
			} else if (res1 >= por10 && res1 < por20) {
				meio++;
			} else if (res1 >= por20) {
				maior++;
			}
		}
		
		System.out.println("RELATORIO : ");
		System.out.println("");
		System.out.println("Lucro abaixo de 10% : " + menor);
		System.out.println("Lucro entre 10% e 20% : " + meio);
		System.out.println("Lucro acima de 20% : " + maior);
		System.out.printf("Valor total de compra : %.2f %n", somaC);
		System.out.printf("Valor total de venda : %.2f %n", somaV);
		System.out.printf("Lucro total : %.2f %n", lucro);
	}
}