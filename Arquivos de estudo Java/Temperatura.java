import java.util.Scanner;
public class MeuProjeto {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? : ");
		String escala= entrada.nextLine();
		
		
		if (escala.equals("F")){
			System.out.print("Digite a temperatura em Fahrenheit : ");
			float fahrenheit= entrada.nextInt();
			float resultado=(float)Math.round((5.0/9.0)*(fahrenheit-32)*100.0)/100f;
			System.out.print("Temperatura equivalente em Celsius : "+ resultado);
			
		}else if(escala.equals("C")){
			System.out.print("Digite a temperatura em Celsius : ");
			double celsius= entrada.nextDouble();
			double resultado =celsius * (9.0 / 5.0)+32;
			System.out.print("Temperatura equivalente em Fahrenheit : "+ resultado);
		}else{
			System.out.print(" Escala invalida!\n É permitido apenas C ou F");
		}
		
	}
}