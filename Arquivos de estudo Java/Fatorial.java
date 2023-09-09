import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		int n,i,x,fat;
		
		System.out.print("Digite o valor de X = ");
		n= entrada.nextInt();
		
		fat=1;
		for (i=1; i<=n;i++){
			fat= fat*i;
		}
		System.out.print("FATORIAL : " + fat);
	}
}