// Abstract class.
// Garantir herença total --> apenas subclasses não abstratas podem ser instancidas, mas nunca a superclasse abstrata.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.00));
		list.add(new SavingsAccount(1003, "Bob", 1500.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 2000.0, 400.00));
		
		double sum = 0.0;
		for (Account acc : list) { // para cada Account acc na minha list faça soma de todos os saldos.
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) { // para cada Account acc na minha list deposite 10.0 em cada conta.
			acc.deposit(10.0);
		}
		for (Account acc : list) { // para cada Account acc na minha list imprima o balance.
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	
	}
}
