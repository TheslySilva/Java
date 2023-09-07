import java.util.Scanner;

public class MeuProjeto {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int senha, correta;
		
		correta= 2022;
		System.out.print("Digite sua senha : ");
		senha = entrada.nextInt();
		while (senha != correta){
			System.out.print("Senha incorreta! Tente novamente : ");
			senha = entrada.nextInt();
		}
		if (senha == correta){
			System.out.print("Acesso permitido!");
		}
	}
}