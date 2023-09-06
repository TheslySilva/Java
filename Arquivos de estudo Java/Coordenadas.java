import java.util.Scanner;
public class Coordenadas {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double valorX,valorY,resultado;
		System.out.print("Valor de X : ");
	            valorX= entrada.nextDouble();
		System.out.print("Valor de Y : ");
		valorY= entrada.nextDouble();
		
		if (valorX >0 && valorY >0){
			System.out.print("Q1");
		}else if(valorX <0 && valorY >0){
			System.out.print("Q2");
		}else if(valorX<0 && valorY <0){
			System.out.print("Q3");
		}else if(valorX>0 && valorY<0){
			System.out.print("Q4");
		}else{
			System.out.print("Origem");
		}
	}
}