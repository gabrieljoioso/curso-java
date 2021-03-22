package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department department; // associação com a classe/objeto Department
	private List<HourContract> contracts = new ArrayList<>(); //Varios contratos --> Lista. Associação com HourContract em seguida instancia já na declaração.
	
	
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	

	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) { // Para cada contrato c na lista de contratos faz o teste para ver se é do ano é mes e acrescenta na soma.
			cal.setTime(c.getDate()); //Para cada contrato c, seta a data do contrato e define como a data do calendario.
			int c_year = cal.get(Calendar.YEAR); 
			int c_month = 1 + cal.get(Calendar.MONTH); //Mês do Calendar começa em 0 então acrescente 1 antes.
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}		
}
