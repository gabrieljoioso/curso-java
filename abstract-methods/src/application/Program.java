// Abstract methods.
// Metodos que não possuem implementação. Se a classe possuir um metodo abstrato, sua classe também sera abstrata.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();	//sempre use o tipo generico, pois queremos polimorfismo, aceitará todos os tipos das subclasses.
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next()); // Palavra digitada será convertida para o tipo de objeto Color.
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height)); // Inserindo o rectangle na list com os argumentos.
				}
			
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius)); // Inserindo o Circle na list com os argumentos.
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) { // para cada Shape shape na list faça:
			System.out.println(String.format("%.2f", shape.area())); //polimorfismo
		}
		
		sc.close();
	}

}
