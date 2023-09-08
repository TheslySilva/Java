
import java.util.Scanner;

public class SomaImpares {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
int i,z,x,y,soma;
		y=0;
		x=0;
		System.out.print("Digite dois numeros : ");
		x= entrada.nextInt();
		y= entrada.nextInt();
		
		if (x>y){
			z= x;
			x=y;
			y=z;
		}
		
		soma= 0;
		
		for(i=x+1;i<=y-1;i++){
			if (i%2!=0){
				soma=soma + i;
			}
		}
		System.out.print("A soma dos numeros impares sao : "+ soma);
	}
}