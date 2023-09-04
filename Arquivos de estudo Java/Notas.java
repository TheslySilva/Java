import java.util.Scanner;
public class MeuProjeto {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		//entrada
		System.out.print("Digite sua Primeira nota : ");
		float nota1= entrada.nextFloat();
		System.out.print("Digite sua Segunda nota : ");
		float nota2= entrada.nextFloat();
		System.out.print("Digite sua Terceira nota : ");
		float nota3= entrada.nextFloat();
		System.out.print("Digite sua Quarta nota : ");
		float nota4= entrada.nextFloat();
		//Calculos
		float soma= nota1 + nota2 + nota3 + nota4;
		double media= soma / 4;
		
		// mensagem 
		System.out.println("Nota final : "+ media);
		//Reprovado ou Aprovado
		if (media >= 6){
			System.out.print("APROVADO!");
		}else{
			System.out.print("REPROVADO!");
		}
		
	}
}