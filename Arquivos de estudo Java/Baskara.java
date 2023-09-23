import java.util.Scanner;
public class Baskara {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		//variaveis
		float a,b,c;
		double delta,x1,x2;
		//entrada
		System.out.print("Coeficiente A : ");
		a= entrada.nextFloat();
		System.out.print("Coeficiente B : ");
		b= entrada.nextFloat();
		System.out.print("Coeficiente C : ");
		c = entrada.nextFloat();
		
		delta= Math.pow(b,2) - 4 * a *c;
		
		//condicoes
		if (a==0 || delta <0){
			
			System.out.print("Esta equacao nao possui raizes reais");
			
		}else{
			
			x1=(-b + Math.sqrt(delta))/(2*a);
			x2=(-b - Math.sqrt(delta))/(2*a);
			
			//Resultado
			System.out.println("X1 = "+ x1);
			System.out.println("X2 = "+ x2);
		}
	}
}