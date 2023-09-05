import java.util.Scanner;
public class Operadora {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos : ");
		int usado= entrada.nextInt();
		int min= 100;
		if (usado <=100){
			
			System.out.print("Valor a pagar : R$ 50,00");
		}else{
		int conta = (usado-min)*2 +50;
		System.out.println("Valor a pagar : R$ " + conta);
			}
	}
}