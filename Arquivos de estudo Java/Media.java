
import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		double b = 0;
		double c = 0 ;
		double d = 0;
		System.out.println("Digite as idades : ");
		a = entrada.nextInt();
		if (a >= 0) {
			while (a >= 0) {
				
				if (a > 0) {
					b = a + b;
					c++;
				}
				a = entrada.nextInt();
			}
			d = b ;
			System.out.printf("Media :  %.2f %n",  (d/ c));
		} else {
			System.out.print("IMPOSSIVEL CALCULAR!");
		}
	}
}