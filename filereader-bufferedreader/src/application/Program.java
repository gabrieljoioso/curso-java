/* FileReader é uma stream de leitura de caracteres a partir de arquivos 
 * BufferedReader (mais rapido)
 */ 

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // instanciado a partir do file reader, deixa a leitura mais rapida
			
			String line = br.readLine(); // Lê uma linha do arquivo e retorna null se estiver no final.
			while (line != null) { // enquanto line for diferente de null
				System.out.println(line);
				line = br.readLine();			
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null ) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
