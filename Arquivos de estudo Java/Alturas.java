
import java.util.Scanner;

public class Alturas {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//variaveis
		
		int quant;
		int i;
		double somaAltura=0;
		double idadeQuant, alturaMedia,idadeP;
		String quem;
		
		//Tamanho das arrays
		
		System.out.print("Quantas pessoas serao digitadas? ");
		quant = entrada.nextInt();
		System.out.println("");
		
		//arrays
		
		String[] nome = new String[quant];
		int[] idade = new int[quant];
		double[] altura = new double[quant];
		
		//loop dados
		
		for (i = 0; i < quant; i++) {
			System.out.println("Dados da " + (i+1)+ "\u00b0 pessoa : ");
			System.out.print("Nome : ");
			nome[i] = entrada.next();
			System.out.print("Idade : ");
			idade[i] = entrada.nextInt();
			System.out.print("Altura : ");
			altura[i] = entrada.nextDouble();
			System.out.println("");
		}
		
		// loop soma altura
		
		for (i = 0; i < quant; i++) {
			somaAltura = somaAltura+altura[i];
		}
		
		//loop porcentagem de idade menores que 16
		
		idadeQuant=0;
		for (i=0;i<quant;i++){
			if (idade[i]<16){
				idadeQuant++;
				
			}
		}
		idadeP=(idadeQuant*100)/quant;
			
		//Saida
		
		alturaMedia= somaAltura/quant;
		System.out.printf("Altura media : %.2f %n",alturaMedia);
		System.out.println("Pessoas com menos de 16 anos : "+idadeP+"%");
		System.out.print("Nomes :");
		
		//nomes
		
		for (i=0;i<quant;i++){
			if (idade[i]<16){
				System.out.print(nome[i] +" ");
			}
		}
	}
}