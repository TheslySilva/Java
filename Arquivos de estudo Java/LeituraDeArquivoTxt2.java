
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
	
	public static void main(String[] args) {
		
		String caminho = "/storage/emulated/0/Android/media/com.sparseway.igneous/Projects/test/src/arquivo.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			
			while (linha != null){
				System.out.println(linha);
				linha = br.readLine();
			}
			
		}
		catch (IOException e) {
			
			System.out.println("Erro: Arquivo ou Diretorio nao encontrado!" );
		}
		
	}
}