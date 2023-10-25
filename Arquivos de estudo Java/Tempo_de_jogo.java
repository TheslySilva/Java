import java.util.Scanner;
public class MeuProjeto {
	
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Hora inicial : ");
		int inicial= entrada.nextInt();
		
		System.out.print("Hora final : ");
		int final= entrada.nextInt();
		
		if(inicial <= final ){
			
		int resultado = final-inicial ;
		
			if(resultado ==0){
				
				System.out.print("O JOGO DUROU "+24+ " HORA(S)");
				
			}else{
				
				System.out.print("O JOGO DUROU "+resultado+ " HORA(S)");
			}
			
		}else if(inicial> final){
			
			int resultado=( 24-inicial )+final;
			
			System.out.print("O JOGO DUROU "+resultado+ " HORA(S)");
		}
	}
}