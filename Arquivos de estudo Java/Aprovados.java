
import java.util.Scanner;

public class Aprovados {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n,i,x,y;
		
	
		System.out.print("Quantas alunos serao digitados? ");
		n=entrada.nextInt();
		System.out.println("");
		
		String[] nomes= new String[n];
		double[] notas1= new double[n];
		double[] notas2= new double[n];
		
		
		for(i=0;i<n;i++){
			System.out.println("Dados do "+(i+1)+"° aluno :");
			System.out.println("");
			System.out.print("Nome : ");
			nomes[i]= entrada.next();
			System.out.print("Primeira nota :");
			notas1[i]= entrada.nextDouble();
			System.out.print("Segunda nota :");
			notas2[i]= entrada.nextDouble();
			System.out.println("");
		}
		double soma=0;
		
		System.out.print("Alunos aprovados : ");
		for (i=0;i<n;i++){
			soma=notas1[i]+notas2[i];
			double media=soma/2;
			if(media>=6){
			System.out.print(nomes[i]+" ");
				}
		}
		
	}
}