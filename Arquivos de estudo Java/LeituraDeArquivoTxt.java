
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Main {
	
	public static void main(String[] args) {
		
		File file= new File("/storage/emulated/0/Android/media/com.sparseway.igneous/Projects/test/src/arquivo.txt");
		Scanner sc = null;
		
		try{
			sc = new Scanner (file);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}
		
		catch (IOException e){
			System.out.println("Erro : Arquivo ou Diretorio nao encontrado! ");
		}
		
		finally{
			
			if(sc != null){
				sc.close();
			}
		}
	}
}