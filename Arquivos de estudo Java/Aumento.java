import java.util.Scanner;
public class AumentoSalario {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Digite o salario da pessoa : ");
		int salario= entrada.nextInt();
		if (salario<=1000){
			int porcentagem= (salario *20)/100;
			int resultado= salario+porcentagem;
			
			System.out.println("Novo salario = R$ " + resultado);
			System.out.println("Aumento = R$ "+porcentagem);
			System.out.println("Porcentagem = 20% ");
			
		}else if(salario>=1000 && salario<=3000){
			int porcentagem= (salario *15)/100;
			int resultado= salario+porcentagem;
			
			System.out.println("Novo salario = R$ " + resultado);
			System.out.println("Aumento = R$ "+porcentagem);
			System.out.println("Porcentagem = 15% ");
			
		}else if(salario>=3000 && salario<=8000){
			int porcentagem= (salario *10)/100;
			int resultado= salario+porcentagem;
			
			System.out.println("Novo salario = R$ " + resultado);
			System.out.println("Aumento = R$ "+porcentagem);
			System.out.println("Porcentagem = 10% ");
			
		}else{
			int porcentagem= (salario *5)/100;
			int resultado= salario+porcentagem;
			
			System.out.println("Novo salario = R$ " + resultado);
			System.out.println("Aumento = R$ "+porcentagem);
			System.out.println("Porcentagem = 5% ");
		}
		
	}
}