import java.util.Scanner;
public class Lanchonete {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		//entrada
		System.out.print("Codigo do produto comprado : ");
		int codigo= entrada.nextInt();
		System.out.print("Quantidade comprada : ");
		int quantidade= entrada.nextInt();
		//produtos
		switch (codigo){
			case 1: 
			double valor1= 5.00;
			double resultado1= valor1*quantidade;
			System.out.print("Valor a pagar : "+ resultado1);
			
			break;
			
			case 2:
			double valor2 = 3.50;
			double resultado2= valor2 * quantidade;
			System.out.print("Valor a pagar : "+ resultado2);
			
			break;
			
			case 3:
			double valor3= 4.80;
			double resultado3= valor3* quantidade;
			System.out.print("Valor a pagar : "+resultado3);
			
			break;
			
			case 4:
			double valor4= 8.90;
			double resultado4= Math.round((valor4 * quantidade )*100.0)/100.0;
			System.out.print("Valor a pagar : "+resultado4);
			
			break;
			
			case 5:
			double valor5= 7.32;
			double resultado5= valor5 * quantidade;
			System.out.print("Valor a pagar : "+ resultado5);
			
		}
		
	}
}