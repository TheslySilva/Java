
import java.util.Scanner;

public class MeuProjeto {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int id;
		int contador;
		int a;
		int b;
		int c;
		a = 0;
		b = 0;
		c = 0;
		contador = 0;
		System.out.println("Codigos dos produtos : \n ");
		System.out.println(" 1 - Alcool. \n 2 - Gasolina. \n 3 - Diesel. \n 4 - Para parar. \n ");
		while (contador != 4) {
			System.out.print("Informe o codigo do produto : ");
			id = entrada.nextInt();
			if (id <= 3) {
				switch (id) {
					case 1: 
					a++;
					break;
					
					case 2: 
					b++;
					break;
					
					case 3: 
					c++;
					break;
					
				}
			} else if (id == 4) {
				contador = 4;
				System.out.println("");
				System.out.println("Obrigado!");
			}else{
				System.out.println("");
				System.out.println("O Id fornecido é invalido!");
				System.out.println("Tente Novamente!");
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("Alcool : "+a);
		System.out.println("Gasolina : "+b);
		System.out.println("Diesel : "+c);
	}
}