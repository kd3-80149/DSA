package com.sunbeam;

import java.util.Scanner;

public class PriorityOperator {
	public static int priorityOperator(char operator)
	{
		switch(operator)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
		    return 3;
		    default :
		    	System.out.println("invalid operator ");
		}
		
		return operator;
	}

	public static void main(String[] args) {
		char operator='^';
		int priority=priorityOperator(operator);
System.out.println("Priority of "+operator+ " is "+priority);
	}

}
