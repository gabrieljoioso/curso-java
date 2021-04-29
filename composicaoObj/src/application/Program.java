// Exercicio 1 de composição
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName)); //Os 3 atributos e mais um atributo do tipo departamento que é a composição de objetos em Worker. 
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) { 		// esse for vai repetir varias vezes até instanciar todos os contratos e associar eles com o trabalhador.
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); //entrando com um Date após chamar o SimpleDateFormat(formato que o usuario vai digitar)
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); // instanciei o contrato
			worker.addContract(contract); //faz o contrato ser associado com o trabalhador
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); // gera um substring de 2 digitos e o Integer.parseInt converte(formata) para inteiro.
		int year = Integer.parseInt(monthAndYear.substring(3)); // vai cortar da posição 3 em diante (YYYY)
		System.out.println("Name: " + worker.getName()); // obtem o nome do worker
		System.out.println("Department: " + worker.getDepartment().getName()); // composição de objetos --> objeto worker acessando o outro objeto(Department) que está associado a ele e depois acessa o nome com getName.
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month))); // imprimir quanto o worker ganhou no mês e ano informados.
		
		sc.close();
	}

}
