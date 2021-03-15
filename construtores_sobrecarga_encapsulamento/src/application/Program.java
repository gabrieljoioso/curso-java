// Contrutores, palavra this.; sobrecarga e ancapsulamento.
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product(); // Construtor padrão, caso queira utilizar.

		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price); // "Product" é o tipo(que é a classe Product) e "product" é a var. Então a var
															   // é do tipo Product. Todos os tipos são do tipo Object.
		
		product.setName("Computer"); // Atualizar o name do produto pelo metodo set.
		System.out.print("Updated name: " + product.getName()); // recebendo o valor de name pelo metodo get.
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice()); // recebendo o valor de name pelo metodo get.
		
		
		System.out.println();
		System.out.println("Product data: " + product); // chamando o metodo toString em Product.

		System.out.println();
		System.out.print("Enther the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); // Faz a atualização da quantidade dentro do objeto product.

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be romoved from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}

}