package com.ceit.project.students.mesake;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
	
		System.out.println("Hello Mesake");
	
		float p,r,t,si;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principle");
		
		p=sc.nextFloat();
		
		System.out.println("Enter Interest Rate");
		r=sc.nextFloat();
		
		System.out.println("Enter Time");
		t=sc.nextFloat();
		
		si=(p*r*t)/100;
		
		System.out.println("The Simple Interest is:"+si);
		
		
		

	}

}

  
