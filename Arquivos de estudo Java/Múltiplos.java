import java.util.Scanner;
public class MeuProjeto {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int valor1, valor2 , resultado;
		System.out.print("Digite um numero : ");
		valor1= entrada.nextInt();
		System.out.print("Digite outro numero : ");
		valor2= entrada.nextInt();
		resultado= valor1 % valor2;
		
		if (resultado==0){
			System.out.print("Sao Multiplos");
		}else{
			System.out.print("Nao sao Multiplos");
		}
	}
}