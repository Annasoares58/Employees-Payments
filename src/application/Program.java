package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		Integer quantity = sc.nextInt();
		for(int i=0; i<quantity; i++) {
			System.out.println("*Employee #" + (i+1) + " data*");
			sc.nextLine();
			System.out.print("Outsourced (y/n)? ");
			String outEmp = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();	
			if(outEmp.equalsIgnoreCase("y")) {
				System.out.print("Additional charge: ");
				Double addCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));	
			}else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("-------------------------------");
		System.out.println("*Payments*");
		for(Employee employee : emp) {
			System.out.println(employee.getName() + " - R$" + employee.payment());
		}
		sc.close();
	}
}
