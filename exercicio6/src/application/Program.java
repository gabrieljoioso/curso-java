package application;

import java.util.Locale;
import java.util.Scanner;

import java.text.ParseException;

import entities.Rent;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent r[] = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			r[room] = new Rent(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: \n");
		for (int i=0; i<10; i++) {
			if (r[i] != null) {
				System.out.println(i + ": " + r[i]);
			}
			
			
		}
		
		
		sc.close();
	}

}
