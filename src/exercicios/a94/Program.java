package exercicios.a94;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Employee> listEmp = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("");
			System.out.println("Employee #"+i+" :");
			System.out.println("ID :");
			int id=input.nextInt();
			while(hasId(listEmp, id)) {
				System.out.println("This id already exist!");
				System.out.println("Enter the other id");
				id=input.nextInt();
			}
			System.out.println("Name :");
			input.nextLine();
			String name=input.nextLine();
			System.out.println("Salary :");
			double salary=input.nextDouble();
			
			listEmp.add(new Employee(id, name, salary));
			
		}
		
		System.out.println("Enter the employee id that will be increase:");
		int id=input.nextInt();
		Employee emp = listEmp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage:");
			int percent = input.nextInt();
			emp.increaseSalary(percent);	
		}
		
		System.out.println("List of employees :");
		for (Employee obj: listEmp) {
			System.out.println(obj.toString());
		}
		
		input.close();
	}

	public static boolean hasId(List<Employee> listEmp, int id) {
		Employee emp = listEmp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null; //devolve true ou false
	}
}