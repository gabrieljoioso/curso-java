// Exception --> Pilha de chamadas de m�todos (strack trace) ---> Imprime o rastreamento do stack.

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of program");

	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) { // Tipo de exce��o e apelido. Esta exce��o ocorre quando informamos uma posi��o nulla no Array.
			System.out.println("Invalid position!"); 
			e.printStackTrace(); // imprime o rastreamento do stack, sequencia de chamadas que gerou a exce��o.
			sc.next();
		
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
