package utils;

import java.util.Scanner;

public class utils {

	public static int leeEntero() {
		int x=-1;
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextInt();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	public static double leeDouble() {
		double x=-1;
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextDouble();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	public static String leeString() {
		String x="";
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.next();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	public static void print(String f) {
		System.out.println(f);
	}
}
