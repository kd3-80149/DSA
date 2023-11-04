package com.sunbeam;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. ADDEMPLOYEE\n2. DISPLAY\n3. SEARCH\n4. DELETE\n5. UPDATE");
			System.out.println("ENTER CHOICE : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Name : ");
				String name = sc.next();
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				System.out.println("Enter Salary");
				double sal = sc.nextDouble();
				Employee e = new Employee(name, id, sal);
				emp.addEmp(e);
				break;
			case 2:
				emp.empDisplay();
				break;
			case 3:
				System.out.println("Enter name to be searched : ");
				String nam = sc.next();
				emp.linearSearch(nam);
				break;
			case 4:
				System.out.println("Enter employee id to be deleted");
				int id1 = sc.nextInt();
				emp.deleteEmpid(id1);
				break;
			case 5:
				System.out.println("Enter salary  to be updated : ");
				sal = sc.nextDouble();
				emp.updateEmpSalary(sal, sc);

				break;
			}

		} while (choice != 0);

	}

}
