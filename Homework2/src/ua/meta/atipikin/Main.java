package ua.meta.atipikin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Write 5 figures");
		x = sc.nextInt();
		
		int x1 = x / 10000;
		int x2 = (x - x1 * 10000) / 1000;
		int x3 = (x - x1 * 10000 - x2 * 1000) / 100;
		int x4 = (x - x1 * 10000 - x2 * 1000 - x3 * 100) / 10;
		int x5 = (x - x1 * 10000 - x2 * 1000 - x3 * 100 - x4 * 10);
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
	}

}
