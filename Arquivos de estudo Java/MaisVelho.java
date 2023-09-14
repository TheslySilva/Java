
import java.util.Scanner;

public class MaisVelho {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,y;
		String nome;
		System.out.print("Quantas pessoas voce vai digitar? ");
		n=entrada.nextInt();
		
		int[] idades=new int[n];
		String[] nomes= new String[n];
		
		y=0;
		nome = "";
		
		for (i=0;i<n;i++){
			System.out.println("Dados da "+(i+1)+"° pessoa :");
			System.out.print("Nome : ");
			nomes[i]= entrada.next();
			System.out.print("Idade : ");
			idades[i]= entrada.nextInt();
			
			if (idades[i]>=y){
				y=idades[i];
				nome= nomes[i];
				
			}
		}
		
		System.out.println("PESSOA MAIS VELHA : "+nome);
	}
}