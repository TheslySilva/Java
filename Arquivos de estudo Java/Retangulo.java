import java.util.Scanner;
public class Retangulo {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float area,altura,base,perimetro;
		double conta1, conta2,conta3,diagonal;
		System.out.print("Base do retangulo: ");
		base= entrada.nextFloat();
		System.out.print("Altura do retangulo: ");
		altura= entrada.nextFloat();
		
		area= base * altura;
		System.out.println("AREA = " +area);
		
		perimetro = 2 * base + 2 * altura;
		System.out.println("PERIMETRO = "+ perimetro);
		conta1=  Math.pow(base,2);
		conta2= Math.pow(altura,2);
		conta3= conta1+conta2;
		diagonal= Math.sqrt(conta3);
		System.out.println("DIAGONAL = "+ diagonal);
	}
}