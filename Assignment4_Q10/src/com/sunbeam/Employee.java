//10. Implement menudriven program to maintain linked list of employees and provide below operations.
//	i. Add employee (Perfrom any add operation)
//	ii. Display all employees
//	iii. Search employee by name
//	iv. Delete employee by empid
//	v. Update salary of employee

package com.sunbeam;

import java.util.Scanner;

public class Employee {
	class Node {
		private Employee e1;
		private Node next;

		public Node(Employee e) {
			this.e1 = e;
			next = null;
		}
	}

	private Node head;
	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		head = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isEmpty() {
		return head == null;

	}

	public void addEmp(Employee emp) {
		Node newnode = new Node(emp);
		if (isEmpty()) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void empDisplay() {
		if (isEmpty())
			System.out.println("List is empty ");
		Node trav = head;
		System.out.println("List :");
		while (trav != null) {
			System.out.println(" " + trav.e1.toString());
			trav = trav.next;
		}
		System.out.println("");
	}

	public void linearSearch(String key) {
		if (isEmpty())
			System.out.println("List is empty ");
		Node trav = head;
		while (trav != null) {
			if (key.equals(trav.e1.getName())) {
				System.out.println(trav.e1.toString() + " ");
				return;
			}
			trav = trav.next;

		}

	}

	public void deleteEmpid(int id) {
		if (isEmpty()) {
			System.out.println("List is empty ");
		} // for single node
		else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			Node prev = trav;
			while (trav != null) {
				if (trav.e1.getId() == id) {
					prev.next = trav.next;
				} else {
					prev = trav;
				}
				trav = trav.next;
			}
		}
		System.out.println("Record is deleted.. ");

	}

	public void updateEmpSalary(double sal, Scanner sc) {
		if (isEmpty())
			System.out.println("List is empty ");
		Node trav = head;
		Node prev = trav;
		while (trav != null) {
			if (trav.e1.getSalary() == sal) {
				// sc.nextDouble();
				System.out.println("Enter new salary :");
				double salary = sc.nextDouble();
				trav.e1.setSalary(salary);
				System.out.println("Record changed \n:" + trav.e1.toString());
				return;
			} else {
				System.out.println("Record not found ");
			}
			trav = trav.next;
		}
		System.out.println("Record is updated ..");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
