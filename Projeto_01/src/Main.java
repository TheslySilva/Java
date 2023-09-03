import java.util.Scanner;
public class MeuProjeto {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Quantos anos voce tem?");
		int idade= entrada.nextInt();
	if (idade >=18){
			System.out.println("Voce é de maior");
			
		}else{
			System.out.println("Voce é menor de idade");
		}
	}
}