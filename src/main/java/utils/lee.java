package utils;

import java.util.Scanner;

public class lee {

	public static int Entero() {
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
		} while(valid);
		return x;
	}
	
	public static double Double() {
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
	
	public static String String() {
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
	
	public static void Print(String f) {
		System.out.println(f);
	}
}
