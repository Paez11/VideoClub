package utils;

import java.util.Scanner;

public class utils {

	public static int leeEntero() {
		Scanner s=new Scanner(System.in);
		int x=-1;
		boolean valid=true;
		do {
			try {
				x=s.nextInt();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Incorrecto!!");
				s.next();
			}
		} while (valid);

		return x;
	}
	
	public static double leeDouble() {
		Scanner s=new Scanner(System.in);
		double x=-1;
		boolean valid=true;
		do {
			try {
				x=s.nextDouble();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Incorrecto!!");
				s.next();
			}
		} while (valid);

		return x;
	}
	
	public static String leeString() {
		Scanner s=new Scanner(System.in);
		String x=null;
		boolean valid=true;
		do {
			try {
				x=s.next();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Incorrecto!!");
				s.next();
			}
		} while (valid);
		
		
		
		return x;
	}
	
	public static void print(String f) {
		System.out.println(f);
	}
}
