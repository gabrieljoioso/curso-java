/* bloco try que decalara um ou mais recursos, 
e garante que esses recursos serão fechados ao final do bloco */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine(); // Lê uma linha do arquivo e retorna null se estiver no final.
			
			while (line != null) { // enquanto line for diferente de null
				System.out.println(line);
				line = br.readLine();			
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
