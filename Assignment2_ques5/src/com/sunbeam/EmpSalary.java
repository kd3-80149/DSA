//Write a function to sort employees by their salary.
package com.sunbeam;

import java.util.Arrays;

public class EmpSalary {
	public static void EmpSalarySort(Employee[] emp, int N) {
		for (int i = 0; i <= N - 1; i++) {
			for (int j = 0; j <= N - 1; j++) {
				if (emp[i].getSalary() > emp[j].getSalary()) {
					Employee temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[5];
		emp[0] = new Employee(45000.0);
		emp[1] = new Employee(30000.0);
		emp[2] = new Employee(7000.0);
		emp[3] = new Employee(6000.0);
		emp[4] = new Employee(35000.0);
		System.out.println("Before sorting salary " + Arrays.toString(emp));
		EmpSalarySort(emp, emp.length);
		System.out.println("After sorting salary " + Arrays.toString(emp));

	}

}
