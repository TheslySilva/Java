import java.util.Scanner;

public class Quadrante{
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double x, y;
		x= 1;
		y= 1;
		while (!(x==0 || y ==0)){
		System.out.println("Digite os valores das coordenadas X e Y : ");
		x=  entrada.nextDouble();
		y= entrada.nextDouble();
			if (x>0 && y >0){
			System.out.println("Quadrante Q1");
		}else if(x<0 && y>0){
			System.out.println("Quadrante Q2");
		}else if(x<0 && y<0){
			System.out.println("Quadrante Q3");
		}else if(x>0 && y<0){
			System.out.println("Quadrante Q4");
		}
		}
	}
}