import java.util.Scanner;
public class Troco {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.print("Digite o valor do Produto : ");
		int p= entrada.nextInt();
		System.out.print("Quantidade comprada : ");
		int v= entrada.nextInt();
		System.out.print("Dinheiro entregue : ");
		int d= entrada.nextInt();
		
		
		
		if (d >= p *v){
			int troco= d-p * v;
			System.out.print("O troco é : R$ " + troco);
		}else{
			int troco= p*v -d;
			System.out.println("DINHEIRO INSULFICIENTE!");
			System.out.print("FALTA R$ "+ troco);
		}
		
	}
}