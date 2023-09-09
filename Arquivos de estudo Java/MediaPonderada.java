
import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int casos,i;
		double x,y,z,valor;
		System.out.print("Quantos casos voce vai digitar ? ");
		casos= entrada.nextInt();
		x=0;
		y=0;
		z=0;
		for (i=1; i<=casos; i++){
			System.out.println("Digite os numeros :");
			x= entrada.nextDouble();
			y= entrada.nextDouble();
			z= entrada.nextDouble();
			valor=Math.ceil(x*2+y*3+z*5)/10.0;
			System.out.println("MEDIA : "+ valor);
		}
		
	}
}