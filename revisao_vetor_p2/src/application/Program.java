package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; // cria a variavel vect no stack e aponta para um vetor de 3 elementos no Heap.
		
		for (int i=0; i<vect.length; i++) { //vect.length � o tamanho do vetor. * Melhor do que usar "n" da variavel.
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); // instanciar novo produto com nome e pre�o e fazer a posi��o i do vetor apontar nas aloca��es do vetor(0, 1, 2).
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice(); // acessa os dados do vetor onde tem as posi��es do vetor apontando para name e price. Neste caso ele pega o get.Price(pre�o).
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();
	}

}
