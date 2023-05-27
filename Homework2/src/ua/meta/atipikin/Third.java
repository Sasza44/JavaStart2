package ua.meta.atipikin;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("write r");
		r = sc.nextDouble();
		
		// довжина кола
		double l = 2 * 3.14159 * r;
		System.out.println(l);
	}

}
