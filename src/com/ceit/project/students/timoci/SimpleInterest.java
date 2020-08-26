package com.ceit.project.students.timoci;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p;
		float r;
		float t;
		float si;
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal($)");
		p=sc.nextInt();
		
		System.out.println("Enter Rate($)");
		r=sc.nextFloat();
		
		System.out.println("Enter Time (months)");
		t=sc.nextFloat();
		
		si = (p*r*t)/100;
		
		System.out.println("The simple interest is : " + si);
	}

}
