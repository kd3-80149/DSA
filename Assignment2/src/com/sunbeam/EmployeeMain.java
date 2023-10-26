package com.sunbeam;

import java.util.Scanner;

public class EmployeeMain {

	public static int SearchId(Employee[] emp, int size, int key) {
		for (int i = 0; i < size; i++) {
			if (emp[i].getEmpid() == key)
				return i;
		}
		return -1;
	}

	public static int SearchName(Employee[] emp, int size, String key) {
		for (int i = 0; i < size; i++) {
			if (emp[i].getEmpName().equals(key))
				return i;
		}
		return -1;
	}

	public static int SearchSalary(Employee[] emp, int size, Double key) {
		for (int i = 0; i < size; i++) {
			if (emp[i].getSalary() == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		Scanner sc = new Scanner(System.in);
		emp[0] = new Employee(1, "Anu", 50000.0);
		emp[1] = new Employee(2, "Priya", 65000.0);
		emp[2] = new Employee(3, "Ritu", 75000.0);
		emp[3] = new Employee(4, "Sita", 85000.0);
		System.out.println("Enter id to be search :");
		int id = sc.nextInt();

		int index = SearchId(emp, emp.length, id);

		if (index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		System.out.println("\nEnter name to be search :");
		String name = sc.next();

		int ename = SearchName(emp, emp.length, name);

		if (ename != -1)
			System.out.println("Key is found at index " + ename);
		else
			System.out.println("Key is not found");

		System.out.println("\nEnter Salary to be search :");
		Double salary = sc.nextDouble();

		int esal = SearchSalary(emp, emp.length, salary);

		if (esal != -1)
			System.out.println("Key is found at index " + esal);
		else
			System.out.println("Key is not found");

	}
}
