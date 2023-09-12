
import java.util.Scanner;

public class Experiencia {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade;
		int r= 0;
		int s = 0;
		int c = 0;
		int casos;
		int i;
		double total;
		double percentualR=0;
		double percentualS=0;
		double percentualC=0;
		
		String rato = "R";
		String sapo = "S";
		String coelho = "C";
		String qual;
		quantidade = 0;
		total = 0;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		casos = entrada.nextInt();
		System.out.println("");
		System.out.println("Cobaias : \n ");
		System.out.println("Sapos   [S]");
		System.out.println("Ratos   [R]");
		System.out.println("Coelhos [C] \n ");
		
		for (i = 1; i <= casos; i++) {
			System.out.println("");
			System.out.print("Tipo de cobaia : ");
			qual = entrada.next();
			System.out.print("Quantidade de cobaias : ");
			quantidade = entrada.nextInt();
			total = total + quantidade;
			
			if (qual.equals(sapo)) {
				s = quantidade;
			} else if (qual.equals(rato)) {
				r = quantidade;
			} else if (qual.equals(coelho)) {
				c = quantidade;
			}
		}
		
		if (s != 0) {
			percentualS =( s * 100.0)/ total;
		}  
		if (r != 0) {
			percentualR =(r * 100.0) / total;
		} 
		if (c != 0) {
			percentualC = (c * 100.0) / total;
		}
		
		System.out.println("");
		System.out.println("RELATORIO FINAL :\n ");
		System.out.println("Total  : " + total + " cobaias");
		System.out.println("Total  : " + r + " ratos");
		System.out.println("Total  : " + s + " sapos");
		System.out.println("Total  : " + c + " coelhos \n ");
		
		System.out.printf("Percentual de Ratos : %.2f %n ",(percentualR));
		System.out.printf("Percentual de Sapos : %.2f %n " ,( percentualS));
		System.out.printf("Percentual de Coelhos : %.2f %n ",(percentualC));
	}
}