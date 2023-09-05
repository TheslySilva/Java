import java.util.Scanner;
public class Terreno {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.print("Digite a largura do terreno: ");
		float largura= entrada.nextFloat();
		System.out.print("Digite o comprimento do terreno: ");
		float  comprimento= entrada.nextFloat();
		System.out.print("Digite o valor do metro quadrado: ");
		float mQuadrado= entrada.nextFloat();
		
		float area= largura * comprimento;
		float preco= area * mQuadrado;
		
		System.out.println("Area do terreno = "+ area);
		System.out.print("Preco do terreno = "+ preco);
		
		
	}
}