import java.util.Scanner;
public class MeuProjeto{
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int num1,num2;
		
		num1=0;
		num2=0;
		
		System.out.println("Digite dois numeros : ");
		num1= entrada.nextInt();
		num2= entrada.nextInt();
		if (num1<num2){
			System.out.println("CRESCENTE!");
			}else if(num1>num2){
				System.out.println("DECRESCENTE!");
			}else{
			System.out.print("IGUAL!");
		}	
		
		
		while (num1!=num2){
			
		System.out.println("Digite outros dois numeros : ");
		num1= entrada.nextInt();
		num2= entrada.nextInt();
		
		if (num1<num2){
				System.out.println("CRESCENTE!");
			}else if (num1>num2){
				System.out.println("DECRESCENTE!");
			}else{
				System.out.print("IGUAL!");
			}	
		}
	}
}