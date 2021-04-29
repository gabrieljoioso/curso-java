package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file); // instanciando o scanner para ler o arquivo
			while (sc.hasNextLine()) { // teste para testar se ainda há uma nova linha no arquivo
				System.out.println(sc.nextLine()); // lê essa proxima linha
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally { // será fechado independente se deu certo o try ou não.
			if (sc != null) {
				sc.close();
			}
		}
	}
}
