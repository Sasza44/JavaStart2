package ua.meta.atipikin;

public class Second {

	public static void main(String[] args) {
		// Сторони трикутника
		double a = 45;
		double b = 67;
		double c = 57;
		
		// півпериметр
		double p = (a + b + c) / 2;
		
		// площа
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(s);
		
	}

}
