package com.dk;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		float p, r, t, si;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle");
		p = sc.nextFloat();

		System.out.println("Enter Rate");
		r = sc.nextFloat();

		System.out.println("Enter Time");
		t = sc.nextFloat();

		si = (p * r * t) / 100;

		System.out.println("The Simple Interest is:" + si);

	}

}
