package exercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {    						// enquanto o ID digitado existe na lista, significa que o ID digitado já existe(não pode);
				System.out.println("ID already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine(); 					// limpar o buffer de entrada para que o sc.nextLine não consuma o enter do nextInt anterior.
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp); // add a instância emp na lista.
		}
		
		System.out.print("Enter the employee id taht will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); // estou buscando na lista a aprimeira ocorrencia de um funcionario que tenha o ID igual ao idsalary(que foi digitado).
		 
		if (emp == null) {
			 System.out.println("this id not exist!");
		 }
		 else {
			 System.out.println("Enter the percentage: ");
			 double percent = sc.nextDouble();
			 emp.increaseSalary(percent);
		 }
		
		System.out.println();
		System.out.println("List of employess:");
		for (Employee e : list) {
			System.out.println(e);
		}
		 
		 
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
