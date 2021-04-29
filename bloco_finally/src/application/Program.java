/* Exception --> Bloco Finally ---> Executa independentemente de ter ocorrido ou n�o uma exception
 * Fechar arquivo, fechar conex�o com banco de dados, etc...
*/
package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\olamundo.txt"); //instancia��o do objeto com o caminho do arquivo.
		Scanner sc = null;
		try {
			sc = new Scanner(file); //scanner apontando para o arquivo, lendo a partir de arquivos.
			while (sc.hasNextLine()) { // Percorrer o arquivo com sc.hasNextLine
				System.out.println(sc.nextLine()); // Imprime
			}
		}
		catch (FileNotFoundException e) { // Exception caso o arquivo n�o exista
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally { // Independente de dar certo ou n�o, � necess�rio executar o finally.
			if (sc != null) { 
				sc.close();
			}
			System.out.println("Finally block executed!");
		}
	}
}
