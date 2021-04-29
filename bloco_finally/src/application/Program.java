/* Exception --> Bloco Finally ---> Executa independentemente de ter ocorrido ou não uma exception
 * Fechar arquivo, fechar conexão com banco de dados, etc...
*/
package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\olamundo.txt"); //instanciação do objeto com o caminho do arquivo.
		Scanner sc = null;
		try {
			sc = new Scanner(file); //scanner apontando para o arquivo, lendo a partir de arquivos.
			while (sc.hasNextLine()) { // Percorrer o arquivo com sc.hasNextLine
				System.out.println(sc.nextLine()); // Imprime
			}
		}
		catch (FileNotFoundException e) { // Exception caso o arquivo não exista
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally { // Independente de dar certo ou não, é necessário executar o finally.
			if (sc != null) { 
				sc.close();
			}
			System.out.println("Finally block executed!");
		}
	}
}
